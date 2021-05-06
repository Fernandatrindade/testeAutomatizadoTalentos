package pages;

import config.PropertiesFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uimaps.LoginMap;

public class LoginPage extends BasePage {

    LoginMap loguinMap = new LoginMap();
    PropertiesFile propertiesFile = new PropertiesFile();

    LoginMap loginMap = new LoginMap();


    /**
     * Digitar o email para acessar
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @When("Preecher email \"(.*)\"$")
    public void preecherEmail(String email) throws Exception{
        esperarPagina();
        esperarImplicita();
        preencher(loginMap.txtEmail, email);


    }
    /**
     * Digitar a senha para acessar
     *
     * @throws Exception Se nao conseguir achar um elemento
     */

    @And("Preecher senha \"(.*)\"$")
    public void preecherSenha(String senha) throws Exception{
        esperarPagina();
        esperarImplicita();
        preencher(loginMap.txtSenha, senha);
    }

    @And("Clicar no botão Login")
    public void clicarNoBotaoLogin() throws Exception{
        esperarPagina();
        esperarImplicita();
        clicar(loginMap.btnLogin);
    }

    @Then("o sistema vai para a página de registros")
    public void o_sistema_vai_para_a_página_de_registros() {

    }

}

