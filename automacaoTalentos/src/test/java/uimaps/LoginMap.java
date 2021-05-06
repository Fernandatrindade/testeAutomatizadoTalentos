package uimaps;

import core.Element;

public class LoginMap {

    public Element txtLogin = new Element("xpath", "//*[@id='navbar']/ul/li[@class='right']");
    public Element txtEmail = new Element("xpath", "//*[@id='user-email']");
    public Element txtSenha= new Element("xpath","//*[@id='senha']");
    public Element btnLogin= new Element("xpath","//*[@id='login']");

}