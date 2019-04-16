Algoritmo "Programa Ordem Crescente"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Seção de Declarações das variáveis 
n1, n2, n3, m1, m2, m3: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Insira numero 1: ")
leia(n1)

escreva("Insira numero 2: ")
leia(n2)

escreva("Insira numero 3: ")
leia(n3)

se (n1 > n2) entao
  m1 <- n1
  m2 <- n2
senao
  m1 <- n2
  m2 <- n1
fimse

se (n3 > m1) entao
  m3 <- m2
  m2 <- m1
  m1 <- n3
senao
  se (n3 > m2) entao
    m3 <- m2
    m2 <- n3
  senao
    m3 <- n3
  fimse
fimse

escreval(m3, m2, m1)

Fimalgoritmo