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
  "name": "Preecher senha \"\u003csenha\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Clicar em Logar",
  "keyword": "And "
});
formatter.step({
  "name": "Preencher o telefone \"\u003cany\u003e\"\"",
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
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "telefone",
        "senha",
        "repetir"
      ]
    },
    {
      "cells": [
        "fernandatrindade@teste.com.br",
        "34998923899",
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
  "name": "Preencher o e-mail ou o cpf para logar no sistema \"fernandatrindade@teste.com.br\"",
  "keyword": "When "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.preencherEmailOuCpf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preecher senha \"fer123\"",
  "keyword": "And "
});
formatter.match({
  "location": "CadastraSeNoBancoTalentosLoginPage.preecherSenha(String)"
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
  "name": "Preencher o telefone \"\u003cany\u003e\"\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherTelefone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher o primeiro email \"fernandatrindade@teste.com.br\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherPrimeiroEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher novamente o mesmo email \"fernandatrindade@teste.com.br\"",
  "keyword": "And "
});
formatter.match({
  "location": "FichaDeCadastroCurriculoPage.preencherSecindEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});