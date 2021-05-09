#@smokeTest
#@login
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
    And Preencher o telefone "<telefone>"
    And Preecnher o email "<email>"
    And Preecnher o secundo email "<email>"
    And Preencher o nome completo "<nome>"
    And Selecionar um genero "<genero>"
    And Prencher a data de Nascimento "<nascimento>"
    And Selecionar um estado civil "<civil>"
    And Selecionar uma senioridade "<senioridade>"

    Examples:
      | email                      | cpf            | senha  | repetir | telefone  | nome           | genero    | nascimento | civil    | senioridade |
      | thithiJesus50@teste.com.br | 881.798.830-86 | fer123 | fer123  | 998922889 | Thiago Jessuas | Masculino | 17/05/1992 | Solteiro | Operacional |