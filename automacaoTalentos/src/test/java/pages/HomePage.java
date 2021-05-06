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
     * Clicar no link Guia Médico
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @Given("^Clicar no Login")
    public void clicarNoLogin() throws Exception {
        esperarPagina();
        esperarImplicita();
        clicar(homeMap.txtLogin);
        GerarEvidenciasUtils.takeScreenshot("Clicar no Login");
    }
}

