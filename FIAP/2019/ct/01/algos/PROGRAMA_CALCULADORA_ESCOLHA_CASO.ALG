Algoritmo "Programa Calculadora - Escolha Caso"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Se��o de Declara��es das vari�veis 
v1, v2: inteiro
operacao: caractere

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
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