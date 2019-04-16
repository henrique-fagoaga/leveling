Algoritmo "Algoritmo Funcionario Dependente"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Kaio Teoi
// Data atual  : 19/03/2019
Var
   // Seção de Declarações das variáveis
   nome: caractere
   sal, nsal: real
   dep: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Insira o nome do funcionario:")
   leia(nome)

   escreval("Insira o salario do funcionario:")
   leia(sal)

   se (sal < 998) entao
      escreval("Salário deve ser maior que salário mínimo R$ 998,00")
   senao
      escreval("Insira a quantidade de dependentes:")
      leia(dep)
      se (dep < 0) entao
         escreval("Número de dependentes inválido")
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

         escreval("Novo salário de ", nome," é de R$", nsal)
      fimse
   fimse
Fimalgoritmo