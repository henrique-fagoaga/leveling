Algoritmo "Programa Cotacao"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Seção de Declarações das variáveis 
usd, brl, result: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Insira o valor do dolar: ")
leia(usd)

escreva("Insira o valor que possui em R$: ")
leia(brl)

result <- usd*brl
escreva("Seu valor em reais valem USSD ", result:2:2)

Fimalgoritmo