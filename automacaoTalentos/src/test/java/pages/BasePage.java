package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;
import core.Element;
import sun.security.util.Password;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class BasePage {
    String SUCESSO = "";

    /**
     * Clica em um elemento
     *
     * @param element Elemento
     * @throws Exception Se nao encontrar o elemento ou nao conseguir clicar
     */
    protected void clicar(Element element) throws Exception {
        Driver.wait(element);
        element.click();
    }

    /**
     * Clica em um elemento
     *
     * @param xpath         Xpath do elemento a ser criado
     * @param maxTentativas Máximos de tentativas para realizar o click
     * @throws Exception Se nao encontrar o elemento ou nao conseguir clicar
     */
    protected void clicarRecriandoElemento(String xpath, Integer maxTentativas) throws Exception {
        Integer tentativa = 0;

        while (tentativa < maxTentativas) {
            try {
                new Element("xpath", xpath).click();
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println("STALE");
            }
            tentativa++;
        }
    }

    /**
     * Clica em um elemento
     *
     * @param element Elemento
     * @throws Exception Se nao encontrar o elemento ou nao conseguir clicar
     */
    protected void clicarEnter(Element element) throws Exception {
        Driver.wait(element);
        element.sendKey(Keys.ENTER);
    }

    /**
     * Preenche um campo
     *
     * @param element Elemento (campo)
     * @param texto   Texto que sera preenchido
     * @throws Exception Se nao encontrar o campo ou nao conseguir preencher
     */
    protected void preencher(Element element, String texto) throws Exception {
        Driver.wait(element);
        element.clear();
        element.sendKeys(texto);
    }
    /**
     * Preenche um campo senha
     *
     * @param element Elemento (campo)
     * @param texto   Texto que sera preenchido
     * @throws Exception Se nao encontrar o campo ou nao conseguir preencher
     */


    /**
     * Preenche um campo devagar
     *
     * @param element Elemento (campo)
     * @param texto   Texto que sera preenchido
     * @throws Exception Se nao encontrar o campo ou nao conseguir preencher
     */

    protected void preencherSlow(Element element, String texto) throws Exception {
        Driver.wait(element);
        element.clear();
        for (int i = 0; i < texto.length(); i++) {
            element.sendKeys(texto.substring(i, i + 1));
            Thread.sleep(100);
        }

    }

    /**
     * Preenche um campo devagar
     *
     * @param element Elemento (campo)
     * @param texto   Texto que sera preenchido
     * @throws Exception Se nao encontrar o campo ou nao conseguir preencher
     */

    protected void clear(Element element, String texto) throws Exception {
        Driver.wait(element);
        element.clear();
    }

    /**
     * Preenche um campo
     *
     * @param element Elemento (campo)
     * @param texto   Texto que sera preenchido
     * @throws Exception Se nao encontrar o campo ou nao conseguir preencher
     */
    protected void sendKeys(Element element, String texto) throws Exception {
        Driver.wait(element);
        element.sendKeys(texto);
    }

    /**
     * Seleciona uma opcao de um combobox por visibleText
     *
     * @param element ComboBox
     * @param opcao   Opcao que sera selecionada
     * @throws Exception Se nao encontrar o combobox ou nao conseguir selecionar
     */
    protected void selecionarPorTexto(Element element, String opcao) throws Exception {
        Driver.wait(element);
        element.selectByVisibleText(opcao);
    }

    /**
     * Seleciona uma opcao de um combobox por index
     *
     * @param element ComboBox
     * @param index   Opcao que sera selecionada
     * @throws Exception Se nao encontrar o combobox ou nao conseguir selecionar
     */
    protected void selecionarPorIndex(Element element, String index) throws Exception {
        Driver.wait(element);
        element.selectByIndex(index);
    }

    /**
     * Acessa uma url
     *
     * @param url Url
     */
    protected void acessar(String url) {
        Driver.driver.navigate().to(url);
        Driver.driver.manage().window().maximize();
    }

    /**
     * Recarrega a pagina
     */
    protected void reloadPage() {
        Driver.driver.navigate().refresh();
    }

    /**
     * Espera uma pagina carregar
     */
    protected void esperarPagina() throws Exception {
        new WebDriverWait(Driver.driver, 40).until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
        Thread.sleep(2000);
    }

    /**
     * Faz o hover para um elemento
     *
     * @param element Elemento
     */
    protected void hover(Element element) {
        Driver.wait(element);
        Driver.actionHover(element);
    }

    /**
     * Espera um elemento estar clicavel na tela
     */
    protected void esperarImplicita() {
        Driver.esperaImplicita();
    }

    /**
     * Espera um elemento estar clicavel na tela
     *
     * @param element Elemento
     */
    protected void esperarElemento(Element element) {
        Driver.wait(element);
    }

    /**
     * Espera um elemento estar visivel na tela
     *
     * @param element Elemento
     * @throws InterruptedException Se nao encontrar o elemento
     */
    protected void esperaVisibilityOf(Element element) throws InterruptedException {
        Driver.visibilityOf(element);
    }

    /**
     * Espera um elemento estar clicavel na tela
     *
     * @param element Elemento
     * @throws InterruptedException Se nao encontrar o elemento
     */
    protected void esperaExplicta(Element element) throws InterruptedException {
        Driver.esperaExplicta(element);
    }

    /**
     * Muda de frame
     *
     * @param numero Numero do frame
     */
    protected void mudarFrame(Integer numero) {
        Driver.driver.switchTo().frame(numero);
    }

    /**
     * Da scroll para um elemento
     *
     * @param element Elemento
     */
    protected void scrollToElement(Element element) {
        Driver.scrollToElement(element);
    }

    /**
     * Realiza um clique via JavaScript
     *
     * @param element Elemento
     */
    protected void jsClickToElement(Element element) {
        Driver.jsClickToElement(element);
    }

    /**
     * Retorna o valor do elemento
     *
     * @param element Elemento
     * @return texto Valor do elemento
     */
    protected String retornaValor(Element element) throws Exception {
        esperarElemento(element);
        String texto = element.getText();
        return texto;
    }
    /**
     * Retorna o valor do elemento
     *
     * @param element Elemento
     * @return texto Valor do elemento
     */
    protected String retornaValue(Element element) throws Exception {
        esperarElemento(element);
        String texto = element.makeWebElement().getAttribute("value");
        return texto;
    }

    /**
     * Validar existencia de elemento
     *
     * @param element Elemento
     */
    protected void validaExistenciaElemento(Element element) throws Exception {
        esperarElemento(element);
        Assert.assertEquals(true, element.isDisplayed());
    }

    /**
     * Copia e cola conteudo
     *
     * @param conteudo Conteudo
     */
    protected void copiarColar(String conteudo) throws Exception {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(conteudo);
        clipboard.setContents(stringSelection, stringSelection);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    protected String assertValueText(Element element, String expected) throws Exception {
        esperarElemento(element);
        String actual = element.getText();
        Assert.assertEquals(actual, expected);
        return SUCESSO;
    }

    /**
     * Move o foco para o elemento e clica no mesmo
     *
     * @param element Elemento
     */
    protected void moveToElement(Element element) throws Exception {
        Actions actions = new Actions(Driver.driver);
        actions.moveToElement(element.makeWebElement()).click().perform();
    }

    /**
     * Fazer a extração de quantos elementos
     *
     * @param element Elemento
     * @return
     */
    protected int getElementsSize(Element element) throws Exception {
        Driver.wait(element);
        int size = element.getElementsSize();
        return size;


    }
}
