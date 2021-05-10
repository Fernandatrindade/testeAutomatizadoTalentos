package pages;

import config.PropertiesFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uimaps.FichaDeCadastroCurriculoMap;
import utils.GerarEvidenciasUtils;

import java.util.ArrayList;

public class FichaDeCadastroCurriculoPage extends BasePage {

    FichaDeCadastroCurriculoMap fichaDeCadastroMap = new FichaDeCadastroCurriculoMap();


    /**
     * Preencher o telefone
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @When("Preencher o telefone \"(.*)\"$")
    public void preencherTelefone(String telefone) throws Exception {
        esperarPagina();
        esperarImplicita();
        preencher(fichaDeCadastroMap.txtTelefone, telefone);
        GerarEvidenciasUtils.takeScreenshot("Preencher o telefone");

    }

    /**
     * Preencher o email
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Preencher o primeiro email \"(.*)\"$")
    public void preencherPrimeiroEmail(String email) throws Exception {
        esperarPagina();
        esperarImplicita();
        preencher(fichaDeCadastroMap.txtEmail, email);
        GerarEvidenciasUtils.takeScreenshot("Preencher o email");
    }

    /**
     * Preencher o segundo email
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Preencher novamente o mesmo email \"(.*)\"$")
    public void preencherSecindEmail(String secondEmail) throws Exception {
        esperarPagina();
        esperarImplicita();
        preencher(fichaDeCadastroMap.txtSecondEmail, secondEmail);
        GerarEvidenciasUtils.takeScreenshot("Preencher o email novamente");
    }

    /**
     * Preencher o nome completo
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Preencher o nome completo \"(.*)\"$")
    public void preencherNomeCompleto(String nome) throws Exception {
        esperarPagina();
        esperarImplicita();
        esperarElemento(fichaDeCadastroMap.txtNome);
        scrollToElement(fichaDeCadastroMap.txtNome);
        preencher(fichaDeCadastroMap.txtNome, nome);
        GerarEvidenciasUtils.takeScreenshot("Preencher o nome completo");
    }

    /**
     * Selecionar o genero
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("^Selecionar um genero \"(.*)\"$")
    public void selecionarUmGenero(String genero) throws Exception {
        esperarPagina();
        esperarElemento(fichaDeCadastroMap.txtGeneroDrop);
        scrollToElement(fichaDeCadastroMap.txtGeneroDrop);
        clicar(fichaDeCadastroMap.txtGeneroDrop);
        String txtGeneroDrop  = retornaValue(fichaDeCadastroMap.txtGenero);
        String generos  = retornaValue(fichaDeCadastroMap.txtGenero);
        System.out.println(generos + txtGeneroDrop);
        esperarElemento(fichaDeCadastroMap.txtGenero);
        scrollToElement(fichaDeCadastroMap.txtGenero);
        preencher(fichaDeCadastroMap.txtGenero,genero );
        GerarEvidenciasUtils.takeScreenshot("Selecionar um genero");
    }

    /**
     * Preencher a data de Nascimento
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Preencher a data de Nascimento \"(.*)\"$")
    public void preencherNascimento(String nascimento) throws Exception {
        esperarPagina();
        esperarImplicita();
        preencher(fichaDeCadastroMap.txtDataNacimento, nascimento);
        GerarEvidenciasUtils.takeScreenshot("Preencher a data de nascimento");
    }

    /**
     * Clicar em salvar e ir para a proxima etapa
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Clicar em salvar e ir para a proxima etapa")
    public void clicarSalvar() throws Exception {
        esperarPagina();
        esperarElemento(fichaDeCadastroMap.btnSalvar);
        scrollToElement(fichaDeCadastroMap.btnSalvar);
        clicar(fichaDeCadastroMap.btnChatClose);
        clicar(fichaDeCadastroMap.btnChatClose2);
        clicar(fichaDeCadastroMap.btnSalvar);
        GerarEvidenciasUtils.takeScreenshot("Clicar em salvar e ir para a proxima etapa");
    }

}
