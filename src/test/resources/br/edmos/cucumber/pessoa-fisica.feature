#language: pt
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@cadastro-pessoa-fisica
Funcionalidade: Gerenciamento de dados de Pessoa Física
  I want to use this template for my feature file

  @validarCPF
  Esquema do Cenário: O operador deseja validar o CPF de uma Pessoa Física
    Dado Operador precisa garantir que o CPF é válido 
    Quando informar o <CPF>
    Então Confirma que CPF é <válido>
    Exemplos:
	  	|CPF           |válido     |
	  	|"00000000000" |"inválido" |
	  	|"11111111111" |"inválido" |
	  	|"22222222222" |"inválido" |
	  	|"33333333333" |"inválido" |
	  	|"44444444444" |"inválido" |
	  	|"55555555555" |"inválido" |
	  	|"66666666666" |"inválido" |
	  	|"77777777777" |"inválido" |
	  	|"88888888888" |"inválido" |
	  	|"99999999999" |"inválido" |
	  	|"05408328716" |"válido"   |
	    |"05408328717" |"inválido" |
	    
    @cadastrarNovaPessoa
    Esquema do Cenário: Cadastrar o CPF, primeiro nome e sobrenome de uma Pessoa Física 
    Dado Que o usuário informou o <CPF>
    E Que o usuário informou o <primeiro nome>
    E Que o usuário informou o <sobrenome> da Pessoa
    Quando o <CPF> da Pessoa não existir no cadastro
    E que o <CPF> é um CPF <válido>
    Então Realiza o cadastro da Pessoa 
    Exemplos:
	  	|primeiro nome|sobrenome|CPF           |válido     |
	  	|"Eduardo"    |"Ramos"  |"00000000000" |"inválido" |
	  	|"Eduardo"    |"Ramos"  |"05408328716" |"válido"   |
	  	
  	@atualizarDadosPessoa
  	Cenário: 
  	