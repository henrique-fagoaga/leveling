Algoritmo "Algoritmo Funcionario Dependente"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Teoi
// Data atual  : 19/03/2019
Var
   // Se��o de Declara��es das vari�veis
   nome: caractere
   sal, nsal: real
   dep: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Insira o nome do funcionario:")
   leia(nome)

   escreval("Insira o salario do funcionario:")
   leia(sal)

   se (sal < 998) entao
      escreval("Sal�rio deve ser maior que sal�rio m�nimo R$ 998,00")
   senao
      escreval("Insira a quantidade de dependentes:")
      leia(dep)
      se (dep < 0) entao
         escreval("N�mero de dependentes inv�lido")
      senao
         escolha dep
         caso 0
            nsal <- sal * 105/100
         caso 1,2,3
            nsal <- sal * 110/100
         caso 4,5,6
            nsal <- sal * 115/100
         outrocaso
            nsal <- sal * 118/100
         fimescolha

         escreval("Novo sal�rio de ", nome," � de R$", nsal)
      fimse
   fimse
Fimalgoritmo