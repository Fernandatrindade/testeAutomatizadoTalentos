## Automação de testo do fluxo de Candidatura ao banco de dados.
E um projeto de automação que realiza o fluxo de cadastrar no banco de talentos da Nayara Corporation, para a realização da automação de teste foi utilizado a linguagem Java com o Maven (para gerenciar as dependecias), Selenium , Junit e Cucumber. O projeto de automação contempla as features abaixo para realizar o fluxo</p>

#### Feature
- [x] Cadastra se no Banco Talentos
- [x] Loguin no Banco Talentos
- [x] Ficha de Cadastro Curriculo
- [X] Smoke Teste

## Ferramenta para automação web
Selenium IDE, cucumber, InteliJ IDE, junit

## Pré condições para a execução do projeto
Java 1.8 ou versãos superiores
Navegador Chrome na versão 89.0.4389.114 (Versão oficial) 64 bits

Maven configurado no seu classpath

Para executar a suíte de testes, basta executar o seguinte comando:

```shell script
mvn clean test -Dcucumber.options="--tags @smokeTest"  -Dbrowser=chrome -Dlanguage=pt-BR
```

## Evidencias

As evidencias de teste se encontram na pasta \output
O relatorio se encontra na pasta \report-html

## Bugs e Melhorias
Os bugs e as melhorias encontradas estão no projeto [Testes Manuais Banco de talentos](https://github.com/Fernandatrindade/Testes-Manuais-Banco-de-talentos), no arquivo [**README.MD**](https://github.com/Fernandatrindade/Testes-Manuais-Banco-de-talentos#readme), foi encontrado 2 erros na automação de testes.

## Cenarios de testes
Os cenarios de testes estão no projeto [Testes Manuais Banco de talentos](https://github.com/Fernandatrindade/Testes-Manuais-Banco-de-talentos) no arquivo [**Caso de testes manuais**](https://github.com/Fernandatrindade/Testes-Manuais-Banco-de-talentos/blob/main/Casos%20de%20testes%20manuais)
