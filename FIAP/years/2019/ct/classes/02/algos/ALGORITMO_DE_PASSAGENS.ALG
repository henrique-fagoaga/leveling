Algoritmo "Algoritmo de Passagens"
// Disciplina  : Computational Thinking
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 19/03/2019
Var
   // Seção de Declarações das variáveis
   destino, regiao, idaVolta: caractere
   valor: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Insira a região da viagem")
   leia(regiao)

   se ((regiao = "sudeste") ou (regiao = "sul")) ou nao((regiao = "nordeste") ou (regiao = "norte") ou (regiao = "centro-oeste")) entao
      escreval("Região não atendida pela companhia aérea")
   senao
      escreval("Deseja ida e volta? (S)im ou (N)ão")
      leia(idaVolta)

      se (idaVolta <> "S") e (idaVolta <> "N") entao
         escreval("Valor inválido. Insira 'S' ou 'N'")
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

         escreval("Valor da passagem é de R$", valor)
      fimse
   fimse

Fimalgoritmo