package pages;

import config.PropertiesFile;
import cucumber.api.java.en.Given;
import uimaps.HomeMap;
import utils.GerarEvidenciasUtils;

public class HomePage extends BasePage {

    HomeMap homeMap = new HomeMap();
    PropertiesFile propertiesFile = new PropertiesFile();

    /**
     * Acessa uma url
     *
     * @param url Url
     */
    @Given("^Acessar \"(.*)\"$")
    public void acessarUrl(String url) throws Exception {

        System.out.println("Acessando " + url);
        if (PropertiesFile.readPropertiesFile(url) != null) {
            url = PropertiesFile.readPropertiesFile(url);
        }
        acessar(url);
        esperarPagina();
        esperarImplicita();
    }

    /**
     * Clicar no botão Cadastre-se em nosso banco de talentos
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @Given("^Clicar no botão cadastre-se em nosso banco de talentos")
    public void clicarNobtnCadastreSe() throws Exception {
        esperarPagina();
        esperarImplicita();
        clicar(homeMap.btnLogin);
        GerarEvidenciasUtils.takeScreenshot("Cadastre-se em nosso banco de talentos");
    }
}

