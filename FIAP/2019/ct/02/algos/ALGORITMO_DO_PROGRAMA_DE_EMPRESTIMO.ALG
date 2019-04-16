Algoritmo "Algoritmo do Programa de Empréstimo"
// Disciplina  : Computational Thinking
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 19/03/2019
Var
// Seção de Declarações das variáveis 
salarioBruto, valorPrestacao: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Insira o seu salario bruto:")
leia(salarioBruto)

se (salarioBruto < 0) entao
  escreval("Salário bruto inválido")
senao
   escreval("Insira o valor da prestacao desejada")
   leia(valorPrestacao)
   
   se (valorPrestacao < 0) entao
     escreval("Valor da prestação inválida")
   senao
      se (valorPrestacao > salarioBruto*3/10) entao
        escreval("Não autorizado")
      senao
        escreval("Autorizado")
      fimse
   fimse
fimse

Fimalgoritmo