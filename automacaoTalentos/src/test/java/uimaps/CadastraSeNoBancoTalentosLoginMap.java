package uimaps;

import core.Element;

public class CadastraSeNoBancoTalentosLoginMap {

    public Element txtRegistre = new Element("xpath", "//*[@id='register']");
    public Element txtEmail = new Element("xpath", "//input[@name='email']");
    public Element txtSenha= new Element("xpath","(//input[@type='password'])[1]");
    public Element txtRepetirSenha= new Element("xpath","(//input[@type='password'])[2]");
    public Element btnCadastrar= new Element("xpath","//*[text()='Cadastrar']");
    public Element txtCpf= new Element("xpath","//input[@name='cpf']");
    public Element txtCheckbox = new Element("xpath", "//*/label[@class='pure-material-checkbox']/span");
    public Element txtEmailCpf = new Element("xpath", "//input[@name='user']");
    public Element btnLogar = new Element ("xpath","//*[text()='Logar']");

}