@smokeTest

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
      | email                | cpf            | senha  | repetir |
      | Jesus01@teste.com.br | 990.599.260-05 | fer123 | fer123  |


  Scenario Outline: Realiza o Login na pagina
    Given Clicar no botão cadastre-se em nosso banco de talentos
    When Preencher o e-mail ou o cpf para logar no sistema "<email>"
    And Preencher senha "<senha>"
    And Clicar em Logar
    Then O sistema vai para a página de registros "<cpf>"

    Examples:
      | email                | cpf            | senha  |
      | Jesus01@teste.com.br | 990.599.260-05 | fer123 |

  Scenario Outline: Realiza o cadastro no banco de talentos
    Given Clicar no botão cadastre-se em nosso banco de talentos
    When Preencher o e-mail ou o cpf para logar no sistema "<email>"
    And Preencher senha "<senha>"
    And Clicar em Logar
    And Preencher o telefone "<telefone>""
    And Preencher o primeiro email "<email>"
    And Preencher novamente o mesmo email "<email>"
    And Preencher o nome completo "<nome>"
    And Selecionar um genero "<genero>"
    And Preencher a data de Nascimento "<nascimento>"
    And Clicar em salvar e ir para a proxima etapa





    Examples:
      | email                | senha  | telefone    | nome               | genero   | nascimento |
      | Jesus01@teste.com.br | fer123 | 34998923899 | Fernanda Rodrigues | Feminino | 12/05/1992 |