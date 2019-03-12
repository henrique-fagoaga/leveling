Algoritmo "Programa Menor Numero"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Seção de Declarações das variáveis 
n1, n2, n3, n4, menor, menor2: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Insira numero 1: ")
leia(n1)

escreva("Insira numero 2: ")
leia(n2)

escreva("Insira numero 3: ")
leia(n3)

escreva("Insira numero 4: ")
leia(n4)


menor <- n1

se nao((menor < n2) e (menor < n3) e (menor < n4)) entao
  menor <- n2
  se nao ((menor < n3) e (menor < n4)) entao
    menor <- n3
    se nao (menor < n4) entao
      menor <- n4
    fimse
  fimse
fimse



se (n1 < n2) entao
  menor <- n1
senao
  menor <- n2
fimse

se (n3 < n4) entao
  menor2 <- n3
entao
  menor2 <- n4
fimse

se (menor2 < menor) entao
  menor <- menor2
fimse

escreval(menor)

Fimalgoritmo