package pages;

import uimaps.FichaDeCadastroCurriculoMap;

public class FichaDeCadastroCurriculoPage extends BasePage{

    FichaDeCadastroCurriculoMap fichaDeCadastroMap = new FichaDeCadastroCurriculoMap();

public  void preencherTelefone (String telefone) throws Exception {
    esperarPagina();
    esperarImplicita();
    preencher(fichaDeCadastroMap.txtTelefone, telefone);

}
}
