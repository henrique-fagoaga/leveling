Algoritmo "Algoritmo do Programa de Empr�stimo"
// Disciplina  : Computational Thinking
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Teoi
// Data atual  : 19/03/2019
Var
// Se��o de Declara��es das vari�veis 
salarioBruto, valorPrestacao: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Insira o seu salario bruto:")
leia(salarioBruto)

se (salarioBruto < 0) entao
  escreval("Sal�rio bruto inv�lido")
senao
   escreval("Insira o valor da prestacao desejada")
   leia(valorPrestacao)
   
   se (valorPrestacao < 0) entao
     escreval("Valor da presta��o inv�lida")
   senao
      se (valorPrestacao > salarioBruto*3/10) entao
        escreval("N�o autorizado")
      senao
        escreval("Autorizado")
      fimse
   fimse
fimse

Fimalgoritmo