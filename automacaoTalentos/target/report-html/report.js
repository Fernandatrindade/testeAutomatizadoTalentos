$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/talentos/CT04SmokeTeste.feature");
formatter.feature({
  "name": "Feature que realiza o teste de Smoke",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smokeTest"
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
  "name": "Preencher email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Preencher cpf \"\u003ccpf\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Preencher senha \"\u003csenha\u003e\"",
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
        "rolland1462@uorak.com",
        "990.599.260-05",
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
      "name": "@smokeTest"
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
  "location": "CadastraSeNoBancoTalentosLoginPage.registraSe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher email \"rolland1462@uorak.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.preecherEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher cpf \"990.599.260-05\"",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.preecherCpf(String)"
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
  "name": "Preenhcer o repetir senha \"fer123\"",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.preecherRepetirSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicar no checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.clicarNoCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicar no botão Cadastrar",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.clicarNoBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "O sistema vai para a página de registros \"990.599.260-05\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.oSistemaCarregaPaginaRegistro(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
        "senha"
      ]
    },
    {
      "cells": [
        "rolland1462@uorak.com",
        "990.599.260-05",
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
      "name": "@smokeTest"
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
  "name": "Preencher o e-mail ou o cpf para logar no sistema \"rolland1462@uorak.com\"",
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
  "name": "O sistema vai para a página de registros \"990.599.260-05\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.oSistemaCarregaPaginaRegistro(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "Selecionar um genero \"\u003cgenero\u003e\"",
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
        "rolland1462@uorak.com",
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
      "name": "@smokeTest"
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
  "name": "Preencher o e-mail ou o cpf para logar no sistema \"rolland1462@uorak.com\"",
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
  "name": "Preencher o primeiro email \"rolland1462@uorak.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherPrimeiroEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher novamente o mesmo email \"rolland1462@uorak.com\"",
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
  "name": "Selecionar um genero \"Feminino\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.selecionarUmGenero(String)"
});
formatter.result({
  "error_message": "exceptions.ElementException: Ocorreu um erro ao executar uma acao no elemento: xpath //*[@id\u003d\u0027gender\u0027]/span\nelement click intercepted: Element is not clickable at point (188, 651)\n  (Session info: chrome\u003d90.0.4430.93)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-4NTM1BC\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\sankhya\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:52665}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a5389d696a9f0d68c0f747121cb2f8e0\r\n\tat core.Element.click(Element.java:87)\r\n\tat pages.BasePage.clicar(BasePage.java:31)\r\n\tat pages.FichaDeCadastroCurriculoPage.selecionarUmGenero(FichaDeCadastroCurriculoPage.java:83)\r\n\tat ✽.Selecionar um genero \"Feminino\"(features/talentos/CT04SmokeTeste.feature:45)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Preencher a data de Nascimento \"12/05/1992\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherNascimento(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Clicar em salvar e ir para a proxima etapa",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.clicarSalvar()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});