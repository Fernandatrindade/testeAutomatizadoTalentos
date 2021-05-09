package pages;

import config.PropertiesFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uimaps.CadastraSeNoBancoTalentosLoginMap;
import uimaps.FichaDeCadastroCurriculoMap;
import utils.GerarEvidenciasUtils;

public class CadastraSeNoBancoTalentosLoginPage extends BasePage {

    CadastraSeNoBancoTalentosLoginMap cadastraSeNoBancoTalentosMap = new CadastraSeNoBancoTalentosLoginMap();
    FichaDeCadastroCurriculoMap fichaDeCadastroCurriculoMap = new FichaDeCadastroCurriculoMap();
    PropertiesFile propertiesFile = new PropertiesFile();


    /**
     * Clicar no botão registre-se
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @When("^Clicar em Registre-se")
    public void registraSe() throws Exception {
        esperarPagina();
        esperarImplicita();
        clicar(cadastraSeNoBancoTalentosMap.txtRegistre);
        GerarEvidenciasUtils.takeScreenshot("Clicar no botão registre-se");

    }
    /**
     * Digitar o email para acessar
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @And("Preecher email \"(.*)\"$")
    public void preecherEmail(String email) throws Exception{
        esperarPagina();
        esperarImplicita();
        preencher(cadastraSeNoBancoTalentosMap.txtEmail, email);
        GerarEvidenciasUtils.takeScreenshot("Digitar o email para acessar");
    }

     /**
     * Digitar o cpf para acessar
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @And("Preecher cpf \"(.*)\"$")
    public void preecherCpf(String cpf) throws Exception{
        esperarPagina();
        esperarImplicita();
        preencher(cadastraSeNoBancoTalentosMap.txtCpf, cpf);
        GerarEvidenciasUtils.takeScreenshot("Digitar o cpf para acessar");
    }

    /**
     * Digitar a senha para acessar
     *
     * @throws Exception Se nao conseguir achar um elemento
     * @param password
     */

    @And("Preecher senha \"(.*)\"$")
    public void preecherSenha(String password) throws Exception{
        esperarPagina();
        esperarImplicita();
        preencher(cadastraSeNoBancoTalentosMap.txtSenha, password);
        GerarEvidenciasUtils.takeScreenshot("Digital a senha para acessar");
    }
    /**
     * Repitir a senha para acessar
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @And("Preenhcer o repetir senha \"(.*)\"$")
    public void preecherRepetirSenha(String repitirSenha) throws Exception{
        esperarPagina();
        esperarImplicita();
        preencher(cadastraSeNoBancoTalentosMap.txtRepetirSenha, repitirSenha);
        GerarEvidenciasUtils.takeScreenshot("Repitir a senha para acessar");

    }
    /**
     * Clicar no checkbox Li e concordo com os termos
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Clicar no checkbox")
    public void clicarNoCheckbox() throws Exception{
        esperarPagina();
        esperarImplicita();
        clicar(cadastraSeNoBancoTalentosMap.txtCheckbox);
        GerarEvidenciasUtils.takeScreenshot("Clicar no checkbox Li e concordo com os termos");
    }
    /**
     * Clicar no botão Login
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("Clicar no botão Cadastrar")
    public void clicarNoBotaoLogin() throws Exception{
        esperarPagina();
        esperarImplicita();
        clicar(cadastraSeNoBancoTalentosMap.btnCadastrar);
        GerarEvidenciasUtils.takeScreenshot("Clicar no botão Login");
    }


    /**
     * o sistema vai para a página de registros
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @Then("O sistema vai para a página de registros \"(.*)\"$")
    public void oSistemaCarregaPaginaRegistro(String cpf) throws Exception{
        esperarPagina();
        esperarElemento(fichaDeCadastroCurriculoMap.txtCpf);
        scrollToElement(fichaDeCadastroCurriculoMap.txtCpf);
        String valueFieldCpf = retornaValue(fichaDeCadastroCurriculoMap.txtCpf);
        System.out.println(valueFieldCpf);
        Assert.assertEquals(valueFieldCpf, cpf);

        GerarEvidenciasUtils.takeScreenshot("O sistema vai para a página de registros");

    }

    /**
     * Preencher o e-mail ou o cpf para logar no sistema
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @And("Preencher o e-mail ou o cpf para logar no sistema \"(.*)\"$")
    public void preencherEmailOuCpf(String emailOuCpf) throws Exception {
        esperarPagina();
        esperarImplicita();
        preencher(cadastraSeNoBancoTalentosMap.txtEmailCpf, emailOuCpf);

        GerarEvidenciasUtils.takeScreenshot("Preencher o e-mail ou o cpf para logar no sistema");
    }

    /**
     * Preencher a senha para logar no sistema
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @And("Preencher a senha para logar no sistema \"(.*)\"$")
    public void preencherSenhaLogar(String senha) throws Exception {
        esperarPagina();
        esperarImplicita();
        preencher(cadastraSeNoBancoTalentosMap.txtSenha, senha);
        GerarEvidenciasUtils.takeScreenshot("Preencher a senha para logar no sistema");
    }
    /**
     * Clicar no botão Logar
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @And("^Clicar em Logar")
    public void clicarNoBtnLogar() throws Exception {
        esperarPagina();
        esperarImplicita();
        clicar(cadastraSeNoBancoTalentosMap.btnLogar);
        GerarEvidenciasUtils.takeScreenshot("Preencher a senha para logar no sistema");

    }
}

