package core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import exceptions.ElementException;

public class Element {

    private String value;
    private String by;
    private String time = "1";

    /**
     * Determina o tempo de espera
     *
     * @param time String com o tempo em segundos de espera
     */
    public void setTimeWait(String time) {
        this.time = time;
    }

    /**
     * Retorna o atual valor do tempo de espera
     *
     * @return String com o tempo de espera
     */
    public String getTimeWait() {
        return time;
    }

    /**
     * Determina a maneira e o valor do mapeamento do elemento
     *
     * @param by    Representa a maneira utilizada para mapear o Element
     * @param value Representa o valor do mapeamento do Element
     */
    public Element(String by, String value) {
        this.by = by;
        this.value = value;
    }

    /**
     * Retorna o value do Element
     *
     * @return String com o Value
     */
    public String getValue() {
        return value;
    }

    /**
     * Retorna o by do Element
     *
     * @return String com o By
     */
    public String getBy() {
        return this.by;
    }

    /**
     * Instancia uma WebElement do Element
     *
     * @return WebElement do proprio Element
     */
    public WebElement makeWebElement() {
        switch (by) {
            case "xpath":
                return new Driver().driver.findElement(By.xpath(value));
            default:
                return null;
        }
    }

    /**
     * Clica em um elemento
     *
     * @return String vazia
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public void click() throws Exception {
        try {
            makeWebElement().click();
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Limpar um campo
     *
     * @return String vazia
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public void clear() throws Exception {
        try {
            makeWebElement().clear();
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Retorna o texto do elemento
     *
     * @return String com o texto do elemento
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public String getText() throws Exception {
        try {
            return makeWebElement().getText();
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Verifica se o elemento esta presente
     *
     * @return True caso o element esteja presente ou falso se não estiver
     */
    public Boolean isPresent() {
        try {
            makeWebElement();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Preenche o campo de texto desejado
     *
     * @param text String desejada para preencher o campo
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public void sendKeys(String text) throws Exception {
        try {
            makeWebElement().sendKeys(text);
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Preenche o campo de texto desejado
     *
     * @param enter String desejada para preencher o campo
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public void sendKey(Keys enter) throws Exception {
        try {
            makeWebElement().sendKeys(enter);
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Seleciona uma opcao de um comboBox a partir de uma opcao visivel
     *
     * @param option String com o valor usado para selecionar o comboBox
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public void selectByVisibleText(String option) throws Exception {
        try {
            Select cmbBox = new Select(makeWebElement());
            cmbBox.selectByVisibleText(option);
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Seleciona uma opcao de um comboBox a partir do indice da opcao
     *
     * @param option String com o valor usado para selecionar o comboBox
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public void selectByIndex(String option) throws Exception {
        try {
            Select cmbBox = new Select(makeWebElement());
            cmbBox.selectByIndex(Integer.parseInt(option));
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Seleciona uma opcao de um comboBox a partir do valor da opcao
     *
     * @param option String com o valor usado para selecionar o comboBox
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public void selectByValue(String option) throws Exception {
        try {
            Select cmbBox = new Select(makeWebElement());
            cmbBox.selectByValue(option);
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Retorna um atributo de um elemento
     *
     * @param attribute Atributo
     * @return Valor do atributo
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public String returnAttribute(String attribute) throws Exception {
        try {
            return makeWebElement().getAttribute(attribute);
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Retorna o tamanho de um elemento
     *
     * @return Numero de elementos encontrados
     * @throws ElementException Se nao conseguir interagir com o elemento
     */
    public Integer getElementsSize() throws Exception {
        try {
            switch (by) {
                case "xpath":
                    return new Driver().driver.findElements(By.xpath(value)).size();
                default:
                    return 0;
            }
        } catch (Exception e) {
            throw new ElementException(e, by, value);
        }
    }

    /**
     * Verifica se um elemento esta exibido na tela
     *
     * @return True caso o element esteja exibido ou falso se não estiver
     */
    public Boolean isDisplayed() {
        try {
            return makeWebElement().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    /**
     * Retorna o tamanho de um elemento
     *
     * @return Numero de elementos encontrados
     * @throws ElementException Se nao conseguir interagir com o elemento
     */

}
