Algoritmo "Algoritmo Calculo de Estacionamento"
// Disciplina  : Computational Thinking
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Saium Teoi
// Data atual  : 19/03/2019
Var
// Se��o de Declara��es das vari�veis 
tipoVeiculo: caractere
tempoPermanencia: inteiro
valorPagar, adicionalMinuto: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("Insira o tipo do veiculo (moto ou carro):")
leia(tipoVeiculo)

se (tipoVeiculo <> "moto") e (tipoVeiculo <> "carro") entao
  escreval("Ve�culo inv�lido")
senao
   escreval("Insira o tempo que ficou estacionado (>=0):")
   leia(tempoPermanencia)
   
   se (tempoPermanencia < 0) entao
     escreval("Tempo inv�lido")
   senao
      se (tempoPermanencia <= 15) entao
         valorPagar <- 0
      senao
         se (tipoVeiculo = "moto") entao
            valorPagar <- 17
            adicionalMinuto <- 10/100
         senao
            valorPagar <- 20
            adicionalMinuto <- 15/100
         fimse

         se (tempoPermanencia > 180) entao
            valorPagar <- valorPagar + ((tempoPermanencia - 180) * adicionalMinuto)
         fimse
      fimse
      
      escreval("O valor a pagar � de R$", valorPagar)
   fimse
fimse


Fimalgoritmo