$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/talentos/CT01CadastraSeNoBancoTalentos.feature");
formatter.feature({
  "name": "Realiza o Login na pagina",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Realiza o Login na pagina",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Clicar no botão cadastre-se em nosso banco de talentos",
  "keyword": "Given "
});
formatter.step({
  "name": "Clicar em Registre-se",
  "keyword": "When "
});
formatter.step({
  "name": "Preecher email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Preecher cpf \"\u003ccpf\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Preecher senha \"\u003csenha\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Preenhcer o repetir senha \"\u003crepetir\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Clicar no checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "Clicar no botão Cadastrar",
  "keyword": "And "
});
formatter.step({
  "name": "O sistema vai para a página de registros \"\u003ccpf\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "cpf",
        "senha",
        "repetir"
      ]
    },
    {
      "cells": [
        "thithiJesus40@teste.com.br",
        "143.490.610-88",
        "fer123",
        "fer123"
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
  "name": "Realiza o Login na pagina",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
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
  "name": "Clicar em Registre-se",
  "keyword": "When "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosPageLogin.registraSe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preecher email \"thithiJesus40@teste.com.br\"",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosPageLogin.preecherEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preecher cpf \"143.490.610-88\"",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosPageLogin.preecherCpf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preecher senha \"fer123\"",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosPageLogin.preecherSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preenhcer o repetir senha \"fer123\"",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosPageLogin.preecherRepetirSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicar no checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosPageLogin.clicarNoCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicar no botão Cadastrar",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosPageLogin.clicarNoBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "O sistema vai para a página de registros \"143.490.610-88\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosPageLogin.oSistemaCarregaPaginaRegistro(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@placeholder\u003d\u0027CPF\u0027]\"}\n  (Session info: chrome\u003d90.0.4430.93)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-4NTM1BC\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\sankhya\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:50331}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d2fa0c5440216ad66ff71e226605b2a3\n*** Element info: {Using\u003dxpath, value\u003d//input[@placeholder\u003d\u0027CPF\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat core.Element.makeWebElement(Element.java:71)\r\n\tat core.Driver.wait(Driver.java:65)\r\n\tat pages.BasePage.esperarElemento(BasePage.java:203)\r\n\tat pages.CadastraSeNoBancoTalentosPageLogin.oSistemaCarregaPaginaRegistro(CadastraSeNoBancoTalentosPageLogin.java:124)\r\n\tat ✽.O sistema vai para a página de registros \"143.490.610-88\"(features/talentos/CT01CadastraSeNoBancoTalentos.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});