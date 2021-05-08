package core;

import java.util.concurrent.TimeUnit;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;

public class Driver {

    public static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;

    /**
     * Inicia o driver
     *
     * @throws Exception Se nao encontrar o driver
     */
    public static void startDriver() throws Exception {
        String userDir = System.getProperty("user.dir");
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        String browser = System.getProperty("browser");

        switch (browser) {
            case "chrome":
                chromeOptions();

                break;
            case "firefox":
                firefoxOptions();

                break;
            case "headless":
                headlessOptions();
                break;
        }

        wait = new WebDriverWait(driver, 60);
        action = new Actions(driver);
    }

    /**
     * Espera um elemento estar clicavel
     *
     * @param element Elemento
     */
    public static void wait(Element element) {
        wait.until(ExpectedConditions.elementToBeClickable(element.makeWebElement()));
    }

    /**
     * Espera um elemento estar visivel
     *
     * @param element Elemento
     * @throws NoSuchElementException Se nao encontrar o elemento
     */
    public static void visibilityOf(Element element) throws NoSuchElementException {
        try {
            wait = new WebDriverWait(driver, 30);
            wait.ignoring(NoSuchElementException.class);
            wait.ignoring(exceptions.ElementException.class);
            wait.ignoring(StaleElementReferenceException.class);
            wait.ignoring(TimeoutException.class);
            wait.until(ExpectedConditions.visibilityOf(element.makeWebElement()));
        } catch (NoSuchElementException e) {
            System.out.println("ELEMENTO NÃO ENCONTRADO  " + element.getValue());
            throw new java.util.NoSuchElementException();
        }
    }

    /**
     * Espera um elemento estar visivel
     *
     * @param element Elemento
     * @throws InterruptedException Se nao encontrar o elemento
     */
    public static void esperaExplicta(Element element) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) element.makeWebElement()));
        Thread.sleep(1000);
    }

    /**
     * Espera um elemento estar visivel
     *
     * @throws InterruptedException Se nao encontrar o elemento
     */
    public static void esperaImplicita() {
        Driver.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }


    /**
     * Faz um hover para um elemento
     *
     * @param element Elemento
     */
    public static void actionHover(Element element) {
        action.moveToElement(element.makeWebElement()).build().perform();
    }

    /**
     * Faz scroll para um elemento
     *
     * @param element Elemento
     */
    public static void scrollToElement(Element element) {
        ((JavascriptExecutor) Driver.driver).executeScript("arguments[0].scrollIntoView();", element.makeWebElement());
    }

    /**
     * Realiza um clique no elemento
     *
     * @param element Elemento
     */
    public static void jsClickToElement(Element element) {
        ((JavascriptExecutor) Driver.driver).executeScript("arguments[0].click();", element.makeWebElement());
    }

    /**
     * Realiza a seleção do browser language
     * Se o argumento não foi definido, automaticamente a browser language é setada para pt-BR
     *
     */
    public static String selectLanguage() {
        String selectedLanguage = System.getProperty("language") != null ? System.getProperty("language") : "pt-BR";
        return selectedLanguage;
    }

    /**
     * ChromeOptions para utilizar seus respectivos metodos
     */
    private static ChromeOptions chromeOptions() {
        String language = selectLanguage();
        ChromeOptions chromeOptions = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("intl.accept_languages", language);
        chromeOptions.setExperimentalOption("prefs", prefs);
        chromeOptions.addArguments("--ignore-certificate-errors", "--lang=" + language);
        driver = new ChromeDriver(chromeOptions);
        return chromeOptions;
    }

    /**
     * FirefoxOptions para utilizar seus respectivos metodos
     */
    private static FirefoxOptions firefoxOptions() {
        String language = selectLanguage();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--ignore-certificate-errors");
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("intl.accept_languages", language);
        firefoxOptions.setProfile(firefoxProfile);
        driver = new FirefoxDriver(firefoxOptions);
        return firefoxOptions;
    }


    /**
     * headlessOptions para utilizar seus respectivos metodos
     */
    private static ChromeOptions headlessOptions() {
        String language = selectLanguage();
        ChromeOptions headless = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("intl.accept_languages", language);
        headless.setExperimentalOption("prefs", prefs);
        headless.addArguments("--ignore-certificate-errors", "--lang=" + language, "--headless");
        driver = new ChromeDriver(headless);
        return headless;
    }


}
