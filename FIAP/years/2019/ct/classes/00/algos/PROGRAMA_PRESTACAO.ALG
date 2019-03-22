Algoritmo "Programa Prestacao"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Seção de Declarações das variáveis 
value, tax, new_value: real
days: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Insira o valor do boleto: ")
leia(value)

escreva("Insira o percentual de juros: ")
leia(tax)

escreva("Insira a quantidade de dias em atraso: ")
leia(days)

new_value <- value + (value * (tax/100)) * days
escreva("O novo valor do boleto e de R$ ", new_value:2:2)

Fimalgoritmo