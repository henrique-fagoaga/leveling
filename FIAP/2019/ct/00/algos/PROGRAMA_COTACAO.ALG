Algoritmo "Programa Cotacao"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Se��o de Declara��es das vari�veis 
usd, brl, result: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Insira o valor do dolar: ")
leia(usd)

escreva("Insira o valor que possui em R$: ")
leia(brl)

result <- usd*brl
escreva("Seu valor em reais valem USSD ", result:2:2)

Fimalgoritmo