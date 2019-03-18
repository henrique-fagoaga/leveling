Algoritmo "Programa Volume"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Seção de Declarações das variáveis 
height, radius, result: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Insira a altura da lata: ")
leia(height)

escreva("Insira o raio da base da lata: ")
leia(radius)

result <- pi * (radius*radius) * height
escreva("O volume cubico da lata e de: ", result:2:2)

Fimalgoritmo