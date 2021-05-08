#@smokeTest
@login
Feature: Realiza o Login na pagina

  Background:
    Given Acessar "urlBancoTalents"

  Scenario Outline: Realiza o Login na pagina
    Given Clicar no botão cadastre-se em nosso banco de talentos
    When Clicar em Registre-se
    And Preecher email "<email>"
    And Preecher cpf "<cpf>"
    And Preecher senha "<senha>"
    And Preenhcer o repetir senha "<repetir>"
    And Clicar no checkbox
    And Clicar no botão Cadastrar
    Then O sistema vai para a página de registros "<cpf>"

    Examples:
      | email                      | cpf            | senha  | repetir |
      | thithiJesus40@teste.com.br | 143.490.610-88 | fer123 | fer123  |