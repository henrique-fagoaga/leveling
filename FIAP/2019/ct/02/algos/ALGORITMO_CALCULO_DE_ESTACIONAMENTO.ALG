Algoritmo "Algoritmo Calculo de Estacionamento"
// Disciplina  : Computational Thinking
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Saium Teoi
// Data atual  : 19/03/2019
Var
// Seção de Declarações das variáveis 
tipoVeiculo: caractere
tempoPermanencia: inteiro
valorPagar, adicionalMinuto: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Insira o tipo do veiculo (moto ou carro):")
leia(tipoVeiculo)

se (tipoVeiculo <> "moto") e (tipoVeiculo <> "carro") entao
  escreval("Veículo inválido")
senao
   escreval("Insira o tempo que ficou estacionado (>=0):")
   leia(tempoPermanencia)
   
   se (tempoPermanencia < 0) entao
     escreval("Tempo inválido")
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
      
      escreval("O valor a pagar é de R$", valorPagar)
   fimse
fimse


Fimalgoritmo