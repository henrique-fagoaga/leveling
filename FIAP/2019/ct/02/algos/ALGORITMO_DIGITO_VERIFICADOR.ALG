Algoritmo "Algoritmo D�gito Verificador"
// Disciplina  : Computational Thinking
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Teoi
// Data atual  : 19/03/2019
Var
   // Se��o de Declara��es das vari�veis
   d1, d2, d3, digVerificador, numConta, numContaInverso, numContaSomado: inteiro


Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Insira o n�mero da conta:")
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

      escreva("D�gito verificado da conta", numConta," �", digVerificador)
   senao
      escreval("N�mero da conta inv�lido. Deve conter 3 d�gitos (sem zero a esquerda)!")
   fimse

Fimalgoritmo