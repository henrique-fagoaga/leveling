Algoritmo "Programa Abastecimento"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Se��o de Declara��es das vari�veis 
price, value, result: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Insira o preco do combustivel: ")
leia(price)

escreva("Insira o quanto de dinheiro deseja abastecer: ")
leia(value)

result <- value/price
escreva("A quantidade de combustivel (Litro) que sera abastecido: ", result:2:2)

Fimalgoritmo