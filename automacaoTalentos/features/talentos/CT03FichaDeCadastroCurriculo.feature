#@smokeTest
@fichaDeCadastro
Feature: Realiza o Login na pagina

  Background:
    Given Acessar "urlBancoTalents"

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
      | email                      | senha  | telefone    | nome               | genero   | nascimento |
      | thithiJesus50@teste.com.br | fer123 | 34998923899 | Fernanda Rodrigues | Feminino | 12/05/1992 |