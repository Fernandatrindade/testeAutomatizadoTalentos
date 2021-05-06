package pages;

import core.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.GerarEvidenciasUtils;

public class Hooks {

    private String expectedResult = "Teste executado com sucesso";
    private String result = "";
    private String scenarioName = "";

    /**
     * Metodo que executa antes do teste
     *
     * @param scenario Scenario do cucumber
     * @throws Exception
     */
    @Before
    public void beforeTest(Scenario scenario) throws Exception {
        Driver.startDriver();
        scenarioName = scenario.getName();
        result = expectedResult;
        GerarEvidenciasUtils.iniciarGerador(scenarioName);
        printTestInfo(scenarioName);
    }

    /**
     * Metodo que executa depois do teste
     *
     * @param scenario Scenario do cucumber
     * @throws Exception
     */
    @After
    public void afterTest(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            GerarEvidenciasUtils.takeScreenshot("erro");
            result = "Erro na execucao do teste";
        }
        Driver.driver.quit();
        GerarEvidenciasUtils.salvarEvidenciaDocumento(scenarioName, result, expectedResult, "");
    }

    /**
     * Imprime o cabecalho da execucao do Caso de teste
     *
     * @param testCase Caso de Teste que deve ser impresso.
     */
    private void printTestInfo(String testCase) {
        System.out.println("====> Caso de Teste: " + testCase);
    }
}
