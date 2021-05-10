package uimaps;

import core.Element;
import cucumber.api.java.es.E;

public class FichaDeCadastroCurriculoMap {

    public Element txtCpf = new Element("xpath", "//input[@placeholder='CPF']");
    public Element txtTelefone = new Element("xpath", "//input[@id='contacts']");
    public Element txtEmail = new Element("xpath", "//input[@id='email']");
    public Element txtSecondEmail = new Element("xpath", "//input[@id='name']");
    public Element txtNome = new Element("xpath", "//input[@id='name']");
    public Element txtGeneroDrop = new Element("xpath", "//*[@id='gender']/span");
    public Element txtGenero = new Element("xpath", "(//*[@id='gender']/div[2])[2]");

    public Element txtDataNacimento = new Element("xpath", "(//input[@strictparsing='true'])[1]");
    public Element btnSalvar = new Element("xpath", "//*[text()='Salvar dados e ir para próxima etapa']");
    public Element btnChatClose= new Element("xpath", "//*[@id='hubspot-messages-iframe-container']/iframe");
    public Element btnChatClose2= new Element("xpath", " //button[@class='IconLauncher__BaseLauncher-asxrs3-0 IconLauncher__CircleLauncher-asxrs3-2 bFybow reagan--widget-loaded undefined']");






}
