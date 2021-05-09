package uimaps;

import core.Element;
import cucumber.api.java.es.E;

public class FichaDeCadastroCurriculoMap {

    public Element txtCpf = new Element("xpath", "//input[@placeholder='CPF']");
    public Element txtTelefone = new Element("xpath", "//input[@id='contacts']");
    public Element txtEmail = new Element("xpath", "//input[@id='email']");
    public Element txtSecondEmail = new Element("xpath", "//input[@id='name']");
    public Element txtNome = new Element("xpath", "//input[@id='name']");
    public Element txtGenero = new Element("xpath", "//div[@id='gender']/div[@class='sc-qrIAp cNXFas']");
    public Element txtDataNacimento = new Element("xpath", "(//input[@strictparsing='true'])[1]");
    public Element txtEstadosCivil = new Element("xpath", "(//*[@name='maritalStatus'])[1]");
    public Element txtSenioridade = new Element("xpath", "(//*[@name='maritalStatus'])[1]");



}
