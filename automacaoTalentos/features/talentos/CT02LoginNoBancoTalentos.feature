#@smokeTest
#@logar
Feature: Realiza o Login na pagina

  Background:
    Given Acessar "urlBancoTalents"

  Scenario Outline: Realiza o Login na pagina
    Given Clicar no botão cadastre-se em nosso banco de talentos
    When Preencher o e-mail ou o cpf para logar no sistema "<email>"
    And Preecher senha "<senha>"
    And Clicar em Logar
    Then O sistema vai para a página de registros "<cpf>"

    Examples:
      | email                         | cpf            | senha  |
      | fernandatrindade@teste.com.br | 382.524.340-02 | fer123 |