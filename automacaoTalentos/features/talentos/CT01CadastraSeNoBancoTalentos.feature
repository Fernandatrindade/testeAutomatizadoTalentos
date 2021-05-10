#@smokeTest
#@CadastroDoLogin
Feature: Realiza o cadastro na pagina nayaracorporation

  Background:
    Given Acessar "urlBancoTalents"

  Scenario Outline: Realiza o Login na pagina
    Given Clicar no botão cadastre-se em nosso banco de talentos
    When Clicar em Registre-se
    And Preencher email "<email>"
    And Preencher cpf "<cpf>"
    And Preencher senha "<senha>"
    And Preenhcer o repetir senha "<repetir>"
    And Clicar no checkbox
    And Clicar no botão Cadastrar
    Then O sistema vai para a página de registros "<cpf>"


    Examples:
      | email                      | cpf            | senha  | repetir |
      | thithiJesus50@teste.com.br | 881.798.830-86 | fer123 | fer123  |

