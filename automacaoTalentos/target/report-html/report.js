$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/talentos/CT03FichaDeCadastroCurriculo.feature");
formatter.feature({
  "name": "Realiza o Login na pagina",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fichaDeCadastro"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Realiza o cadastro no banco de talentos",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Clicar no botão cadastre-se em nosso banco de talentos",
  "keyword": "Given "
});
formatter.step({
  "name": "Preencher o e-mail ou o cpf para logar no sistema \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Preencher senha \"\u003csenha\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Clicar em Logar",
  "keyword": "And "
});
formatter.step({
  "name": "Preencher o telefone \"\u003ctelefone\u003e\"\"",
  "keyword": "And "
});
formatter.step({
  "name": "Preencher o primeiro email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Preencher novamente o mesmo email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Preencher o nome completo \"\u003cnome\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Preencher a data de Nascimento \"\u003cnascimento\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Clicar em salvar e ir para a proxima etapa",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "senha",
        "telefone",
        "nome",
        "genero",
        "nascimento"
      ]
    },
    {
      "cells": [
        "thithiJesus50@teste.com.br",
        "fer123",
        "34998923899",
        "Fernanda Rodrigues",
        "Feminino",
        "12/05/1992"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Acessar \"urlBancoTalents\"",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage.acessarUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Realiza o cadastro no banco de talentos",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@fichaDeCadastro"
    }
  ]
});
formatter.step({
  "name": "Clicar no botão cadastre-se em nosso banco de talentos",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage.clicarNobtnCadastreSe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher o e-mail ou o cpf para logar no sistema \"thithiJesus50@teste.com.br\"",
  "keyword": "When "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.preencherEmailOuCpf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher senha \"fer123\"",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.preencherSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicar em Logar",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.clicarNoBtnLogar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher o telefone \"34998923899\"\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherTelefone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher o primeiro email \"thithiJesus50@teste.com.br\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherPrimeiroEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher novamente o mesmo email \"thithiJesus50@teste.com.br\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherSecindEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher o nome completo \"Fernanda Rodrigues\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherNomeCompleto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher a data de Nascimento \"12/05/1992\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherNascimento(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicar em salvar e ir para a proxima etapa",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.clicarSalvar()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\" //button[@class\u003d\u0027IconLauncher__BaseLauncher-asxrs3-0 IconLauncher__CircleLauncher-asxrs3-2 bFybow reagan--widget-loaded undefined\u0027]\"}\n  (Session info: chrome\u003d90.0.4430.93)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-4NTM1BC\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\sankhya\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:49793}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 20ebf4ffc68f6c135e0ea2f9ac7a2160\n*** Element info: {Using\u003dxpath, value\u003d //button[@class\u003d\u0027IconLauncher__BaseLauncher-asxrs3-0 IconLauncher__CircleLauncher-asxrs3-2 bFybow reagan--widget-loaded undefined\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat core.Element.makeWebElement(Element.java:71)\r\n\tat core.Driver.wait(Driver.java:65)\r\n\tat pages.BasePage.clicar(BasePage.java:30)\r\n\tat pages.FichaDeCadastroCurriculoPage.clicarSalvar(FichaDeCadastroCurriculoPage.java:117)\r\n\tat ✽.Clicar em salvar e ir para a proxima etapa(features/talentos/CT03FichaDeCadastroCurriculo.feature:19)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});