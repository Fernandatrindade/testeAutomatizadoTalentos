package pages;

import config.PropertiesFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uimaps.FichaDeCadastroCurriculoMap;

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
    }
    /**
     * Preencher o nome completo
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Preencher o nome completo \"(.*)\"$")
    public void preencherNomeCompleto(String nome) throws Exception {
        esperarPagina();
        esperarElemento(fichaDeCadastroMap.txtNome);
        scrollToElement(fichaDeCadastroMap.txtNome);
        preencher(fichaDeCadastroMap.txtNome, nome);
    }
    /**
     * Selecionar o genero
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Selecionar um genero \"(.*)\"$")
    public void selecionarUmGenero(String genero) throws Exception {
        esperarPagina();
        esperarImplicita();
        selecionarPorTexto(fichaDeCadastroMap.txtGenero, genero);
    }
    /**
     * Preencher a data de Nascimento
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Prencher a data de Nascimento \"(.*)\"$")
    public void preecherNascimento(String nacsimento) throws Exception {
        esperarPagina();
        esperarImplicita();
        selecionarPorTexto(fichaDeCadastroMap.txtDataNacimento, nacsimento);
    }
    /**
     * Selecionar o estado civil
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Selecionar um estado civil \"(.*)\"$")
    public void selecionarOEstadoCivil(String genero) throws Exception {
        esperarPagina();
        esperarImplicita();
        selecionarPorTexto(fichaDeCadastroMap.txtEstadosCivil, genero);
    }
    /**
     * Selecionar uma Senioridade
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Selecionar uma senioridade \"(.*)\"$")
    public void selecionarUmaSenioridade(String senioridade) throws Exception {
        esperarPagina();
        esperarImplicita();
        selecionarPorTexto(fichaDeCadastroMap.txtSenioridade, senioridade);
    }
}
