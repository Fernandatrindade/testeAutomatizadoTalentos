#@smokeTest
@fichaDeCadastro
Feature: Realiza o Login na pagina

  Background:
    Given Acessar "urlBancoTalents"

  Scenario Outline: Realiza o cadastro no banco de talentos
    Given Clicar no botão cadastre-se em nosso banco de talentos
    When Preencher o e-mail ou o cpf para logar no sistema "<email>"
    And Preecher senha "<senha>"
    And Clicar em Logar
    And Preencher o telefone "<any>""
    And Preencher o primeiro email "<email>"
    And Preencher novamente o mesmo email "<email>"




    Examples:
      | email                         | telefone    | senha  | repetir |
      | fernandatrindade@teste.com.br | 34998923899 | fer123 | fer123  |