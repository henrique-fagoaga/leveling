Algoritmo "Algoritmo Dígito Verificador"
// Disciplina  : Computational Thinking
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 19/03/2019
Var
   // Seção de Declarações das variáveis
   d1, d2, d3, digVerificador, numConta, numContaInverso, numContaSomado: inteiro


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Insira o número da conta:")
   leia(numConta)

   se (numConta >= 100) e (numConta <= 999) entao
      d1 <- (numConta % 10) * 100
      d2 <- (numConta/10 % 10) * 10
      d3 <- (numConta/100 % 10)
      numContaInverso <- d1 + d2 + d3

      numContaSomado <- numConta + numContaInverso

      d1 <- (numContaSomado % 10)
      d2 <- (numContaSomado/10 % 10)
      d3 <- (numContaSomado/100 % 10)

      digVerificador <- (d1 + (d2*2) + (d3*3)) % 10

      escreva("Dígito verificado da conta", numConta," é", digVerificador)
   senao
      escreval("Número da conta inválido. Deve conter 3 dígitos (sem zero a esquerda)!")
   fimse

Fimalgoritmo