Algoritmo "Algoritmo de Passagens"
// Disciplina  : Computational Thinking
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Teoi
// Data atual  : 19/03/2019
Var
   // Se��o de Declara��es das vari�veis
   destino, regiao, idaVolta: caractere
   valor: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Insira a regi�o da viagem")
   leia(regiao)

   se ((regiao = "sudeste") ou (regiao = "sul")) ou nao((regiao = "nordeste") ou (regiao = "norte") ou (regiao = "centro-oeste")) entao
      escreval("Regi�o n�o atendida pela companhia a�rea")
   senao
      escreval("Deseja ida e volta? (S)im ou (N)�o")
      leia(idaVolta)

      se (idaVolta <> "S") e (idaVolta <> "N") entao
         escreval("Valor inv�lido. Insira 'S' ou 'N'")
      senao
         se (idaVolta = "S") entao
            se (regiao = "norte") entao
               valor <- 180
            senao
               se (regiao = "nordeste") entao
                  valor <- 375
               senao
                  valor <- 1007
               fimse
            fimse
         senao
            se (regiao = "norte") entao
               valor <- 100
            senao
               se (regiao = "nordeste") entao
                  valor <- 205
               senao
                  valor <- 548
               fimse
            fimse
         fimse

         escreval("Valor da passagem � de R$", valor)
      fimse
   fimse

Fimalgoritmo