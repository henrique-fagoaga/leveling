Algoritmo "Programa Calculadora - Escolha Caso"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Seção de Declarações das variáveis 
v1, v2: inteiro
operacao: caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Insira o valor 1:")
leia(v1)

escreval("Insira o valor 2:")
leia(v2)

escreval("Insira a operacao:")
leia(operacao)

escolha operacao
caso "+"
  escreval(v1, operacao, v2, " = ", v1+v2)
caso "-"
  escreval(v1, operacao, v2, " = ", v1-v2)
caso "*"
  escreval(v1, operacao, v2, " = ", v1*v2)
caso "/"
  escreval(v1, operacao, v2, " = ", v1/v2)
fimescolha

Fimalgoritmo