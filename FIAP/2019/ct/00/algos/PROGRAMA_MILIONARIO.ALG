Algoritmo "Programa Milionario"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Se��o de Declara��es das vari�veis 
salary, monthly_bills, monthly_balance, time_to_millionaire: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Insira o salario: ")
leia(salary)

escreva("Insira o valor das despesas mensais: ")
leia(monthly_bills)

monthly_balance <- salary - monthly_bills
time_to_millionaire <-  1000000  / (12*monthly_balance)

escreva("Precisaras de ", time_to_millionaire:1, " anos pra se tornar milionario")

Fimalgoritmo