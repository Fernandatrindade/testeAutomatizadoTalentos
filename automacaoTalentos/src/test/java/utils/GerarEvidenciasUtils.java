package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;

import core.Driver;

public class GerarEvidenciasUtils {

    private static int indexEvid = 1;
    String time = "";
    static String evidencePath = "";
    private static XWPFDocument doc;
    private static FileOutputStream out;
    private static String templateName = "templateCT.docx";

    /**
     * Gera um documento docx que pega o output de
     * imagens e coloca no documento.
     *
     * @param caso              Nome do caso na planilha
     * @param resultadoFinal    Resultado final da planilha
     * @param resultadoEsperado Resultado esperado da planilha
     * @param tempoExecucao     Tempo de execucao do script
     * @throws Exception Em caso de nao gerar o documento
     */
    public static void salvarEvidenciaDocumento(String caso, String resultadoFinal, String resultadoEsperado,
                                                String tempoExecucao) throws Exception {
        try {
            // Pega data do sistema
            String time = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
            // Busca o caminho referente ao caso (o caminho vai ate "evidence")
            String caminho = buscarCaminhoPorCaso(caso);
            // Pega o caminho antes do evidence, a pasta onde vai ser salvo o documento
            String caminhoSalvarDoc = caminho.split("images")[0] + "\\";
            // Busca as imagens no caminho
            ArrayList<String> listaImagens = buscarImgs(caminho);
            // Ordena as imagens
            listaImagens = ordenar(listaImagens);
            // Cria um arquivo com as propriedades do modelo(doc)
            File file = new File(System.getProperty("user.dir") + "/data/" + templateName);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            doc = new XWPFDocument(fis);
            // Cria um novo paragrafo no doc
            XWPFParagraph p = doc.createParagraph();
            // Cria uma regiao onde pode ter propriedades e textos
            XWPFRun r1 = p.createRun();
            r1.setFontFamily("Calibri");
            r1.setFontSize(11);
            r1.setBold(true);
            r1.setText("Caso de Teste: ");
            r1.setText(caso);
            // Cria uma tabela
            // Cria a primeira linha da tabela
            XWPFTable table = doc.createTable();
            XWPFTableRow tableRowOne = table.getRow(0);
            XWPFParagraph paragraphOne = tableRowOne.getCell(0).addParagraph();
            setRun(paragraphOne.createRun(), "Calibri", 11, "Resultado Final", true);
            tableRowOne.createCell();
            paragraphOne = tableRowOne.getCell(1).addParagraph();
            setRun(paragraphOne.createRun(), "Calibri", 11, "Resultado Esperado", true);
            // Cria a segunda linha da tabela
            XWPFTableRow tableRowTwo = table.createRow();
            XWPFParagraph paragraphTwo = tableRowTwo.getCell(0).addParagraph();
            setRun(paragraphTwo.createRun(), "Calibri", 11, resultadoFinal, false);
            paragraphTwo = tableRowTwo.getCell(1).addParagraph();
            setRun(paragraphTwo.createRun(), "Calibri", 11, resultadoEsperado, false);
            paragraphTwo = doc.createParagraph();
            // Cria uma nova regiao onde sera colocado os nomes das imagens e as
            // Imagens das evidencias
            XWPFRun r = paragraphTwo.createRun();
            for (String img : listaImagens) {
                int format = XWPFDocument.PICTURE_TYPE_PNG;
                String caminhoImagem = caminho + "/" + img;
                r.addBreak();
                r.setFontFamily("Calibri");
                r.setFontSize(11);
                r.setText("Nome da Imagem: " + img);
                r.addBreak(BreakType.TEXT_WRAPPING);
                r.addPicture(new FileInputStream(caminhoImagem), format, caminhoImagem, Units.toEMU(446),
                        Units.toEMU(257));
                r.addBreak(BreakType.PAGE);
            }
            // Cria o rodape da pagina com detalhes de quando foi executado o teste
            XWPFHeaderFooterPolicy headerFooterPolicy = doc.getHeaderFooterPolicy();
            if (headerFooterPolicy == null)
                headerFooterPolicy = doc.createHeaderFooterPolicy();
            XWPFFooter footer = headerFooterPolicy.createFooter(XWPFHeaderFooterPolicy.DEFAULT);
            XWPFParagraph paragraphFooter = footer.createParagraph();
            paragraphFooter.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun runFooter = paragraphFooter.createRun();
            runFooter.setFontSize(11);
            runFooter.setFontFamily("calibri");
            runFooter.setText("Teste executado de forma automatizada em " + time);
            CTSectPr sectPr = doc.getDocument().getBody().getSectPr();
            if (sectPr == null)
                sectPr = doc.getDocument().getBody().addNewSectPr();
            // Escreve no documento
            out = new FileOutputStream(caminhoSalvarDoc + caso + ".docx");
            doc.write(out);
            System.out.println("Documento com as evidencias salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao gerar documento de evidências do caso " + caso);
        } finally {
            if (out != null) {
                out.close();
            }
            if (doc != null) {
                doc.close();
            }
        }
    }

    /**
     * Coloca propriedades ou textos em uma regiao
     *
     * @param run        regiao que vai ser escrita
     * @param fontFamily fonte do texto
     * @param fontSize   tamanho da fonte
     * @param text       texto a ser escrito na regiao
     * @param bold       se true texto negrito, se false texto sem negrito
     */
    private static void setRun(XWPFRun run, String fontFamily, int fontSize, String text, boolean bold) {
        run.setFontFamily(fontFamily);
        run.setFontSize(fontSize);
        run.setText(text);
        run.setBold(bold);
    }

    /**
     * Esse metodo pega as imagens da pasta e faz o slipt de '_',
     * separando o texto do numero
     *
     * @param listaImagens lista de imagens a serem ordenadas
     * @return retorna uma lista das imagens ordenadas
     */
    private static ArrayList<String> ordenar(ArrayList<String> listaImagens) {
        int tamanhoLista = listaImagens.size();
        ArrayList<String> novaLista = new ArrayList<String>();
        for (int i = 0; i < tamanhoLista + 1; i++) {
            novaLista.add("x");
        }
        for (String img : listaImagens) {
            String numImg[] = img.split("_");
            int num = Integer.parseInt(numImg[0]);
            novaLista.set(num, img);
        }
        novaLista.remove(0);
        return novaLista;
    }

    /**
     * Busca na pasta output a pasta correspondente ao caso desejado
     *
     * @param caso caso que deseja procurar a pasta
     * @return retorna uma string com o caminho da pasta evidence referente ao caso passado
     */
    private static String buscarCaminhoPorCaso(String caso) {
        ArrayList<String> listaEvidenciasPorTempo = new ArrayList<String>();
        ArrayList<String> listaCasos = new ArrayList<String>();
        // Busca a pasta do caso correspondente na pasta output e retorna uma lista de caminhos
        listaEvidenciasPorTempo = buscarCaminhoPorNome(caso, "output");
        String caminho = "";
        // Procura a pasta evidence na lista de caminhos encontrados
        for (String evidenciasPorTempo : listaEvidenciasPorTempo) {
            listaCasos = buscarCaminhoPorNome("images", evidenciasPorTempo);
        }
        // Pega sempre a primeira pasta encontrada (tudo indica que e sempre a mais recente)
        caminho = listaCasos.get(0);
        return caminho;
    }

    /**
     * Busca no caminho as pastas e subpastas que correspondem a palavra passada
     *
     * @param palavra        palavra(pasta) que deseja procurar no caminho e subpastas
     * @param caminhoInicial caminho onde iniciara as buscas pela palavra(pasta)
     * @return retorna uma lista com as pastas e subpastas que corresponde a palavra desejada
     */
    private static ArrayList<String> buscarCaminhoPorNome(String palavra, String caminhoInicial) {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            File arquivo = new File(caminhoInicial);
            lista = buscar(arquivo, palavra, lista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caminho Inválido");
        }
        return lista;
    }

    /**
     * Procura no caminho inicial por pastas e subpastas que corresponde a palavra passada
     *
     * @param arquivo arquivo de origem onde sera iniciado a busca
     * @param palavra palavra desejada na buscar
     * @param lista   passa a lista que vai ser usada para guardar os caminhos
     * @return retorna uma lista com as pastas e subpastas que corresponde a palavra desejada
     */
    private static ArrayList<String> buscar(File arquivo, String palavra, ArrayList<String> lista) {
        if (arquivo.isDirectory()) {
            File[] subPastas = arquivo.listFiles();
            for (int i = 0; i < subPastas.length; i++) {
                lista = buscar(subPastas[i], palavra, lista);
                if (arquivo.getName().equalsIgnoreCase(palavra))
                    lista.add(arquivo.getAbsolutePath());
                else if (arquivo.getName().indexOf(palavra) > -1)
                    lista.add(arquivo.getAbsolutePath());
            }
        } else if (arquivo.getName().equalsIgnoreCase(palavra))
            lista.add(arquivo.getAbsolutePath());
        else if (arquivo.getName().indexOf(palavra) > -1)
            lista.add(arquivo.getAbsolutePath());
        return lista;
    }

    /**
     * Busca as imagens em um caminho passado
     *
     * @param caminho caminho onde deseja buscar as imagens
     * @return retorna uma lista com os nomes das imagens
     */
    private static ArrayList<String> buscarImgs(String caminho) {
        File arquivo = new File(caminho);
        File[] imgs = arquivo.listFiles();
        ArrayList<String> listaImgs = new ArrayList<String>();
        for (File file : imgs) {
            if (file.isFile()) {
                listaImgs.add(file.getName());
            }
        }
        return listaImgs;
    }

    /**
     * Inicia o gerador de evidencias, index das evidencias, e seta o nome da pasta
     * de evidencias
     *
     * @param nomeCaso Nome do caso
     */
    public static void iniciarGerador(String nomeCaso) {
        indexEvid = 1;
        String time = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS").format(new Date()).replaceAll("[^0-9.]", "");
        evidencePath = System.getProperty("user.dir") + "/output/" + nomeCaso + "/images/";
    }

    /**
     * Tira foto da tela
     *
     * @param nomeImagem Nome da imagem
     * @return Foto
     * @throws IOException
     */
    public static File takeScreenshot(String nomeImagem) throws IOException {
        String path = evidencePath + indexEvid + "_" + nomeImagem + ".png";
        File screenShot = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot, new File(path));
        indexEvid++;
        return screenShot;
    }
}
