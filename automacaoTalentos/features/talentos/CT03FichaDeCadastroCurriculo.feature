#@smokeTest
Feature: Realiza o Login na pagina

  Background:
    Given Acessar "urlBancoTalents"

  Scenario Outline: Realiza o cadastro no banco de talentos
    Given Clicar no botão cadastre-se em nosso banco de talentos
    When Clicar em Registre-se
    And Preecher email "<email>"
    And Preecher cpf "<cpf>"
    And Preecher senha "<senha>"
    And Preenhcer o repetir senha "<repetir>"
    And Clicar no checkbox
    And Clicar no botão Cadastrar
    Then O sistema vai para a página de registros

    Examples:
      | email                         | cpf            | senha  | repetir |
      | fernandatrindade2@teste.com.br | 382.524.340-02 | fer123 | fer123  |