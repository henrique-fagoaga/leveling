Algoritmo "Programa Abastecimento"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Seção de Declarações das variáveis 
price, value, result: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Insira o preco do combustivel: ")
leia(price)

escreva("Insira o quanto de dinheiro deseja abastecer: ")
leia(value)

result <- value/price
escreva("A quantidade de combustivel (Litro) que sera abastecido: ", result:2:2)

Fimalgoritmo