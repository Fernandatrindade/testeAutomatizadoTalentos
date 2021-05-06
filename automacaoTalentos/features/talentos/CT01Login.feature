#@smokeTest
@login
Feature: Realiza o Login na pagina

  Background:
    Given Acessar "urlBancoTalents"

    Given Clicar no Login
    When Preecher email "<email>"
    And Preecher senha "<senha>"
    And Clicar no botão Login
    Then o sistema vai para a página de registros

      | email       | senha |
      | teste@teste | 123   |