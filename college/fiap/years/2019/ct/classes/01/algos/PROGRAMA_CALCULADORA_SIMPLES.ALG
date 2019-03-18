Algoritmo "Programa Calculadora Simples"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Seção de Declarações das variáveis 
operador: caractere
n1, n2: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Insira numero 1: ")
leia(n1)

escreva("Insira numero 2: ")
leia(n2)

escreva("Insira o operador: ")
leia(operador)

se (operador = "+") entao
  escreva(n1, " + ", n2, " = ", n1+n2)
  fimalgoritmo
fimse

se (operador = "-") entao
  escreva(n1, " - ", n2, " = ", n1-n2)
  fimalgoritmo
fimse

se (operador = "*") entao
  escreva(n1, " * ", n2, " = ", n1*n2)
  fimalgoritmo
fimse

se (operador = "/") entao
  escreva(n1, " / ", n2, " = ", n1/n2)
  fimalgoritmo
fimse

escreva("Operador invalido!")
Fimalgoritmo