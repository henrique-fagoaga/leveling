Algoritmo "Programa Apuracao"
// Disciplina  :  [Computational Thinking]
// Professor   : Fernanda
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Kaio Teoi
// Data atual  : 12/03/2019
Var
// Se��o de Declara��es das vari�veis 
va, vb, vc, vblank, vnull, total: inteiro
pa, pb, pc, pblank, pnull: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Insira a quantidade de votos no candidato A: ")
leia(va)

escreva("Insira a quantidade de votos no candidato B: ")
leia(vb)

escreva("Insira a quantidade de votos no candidato C: ")
leia(vc)

escreva("Insira a quantidade de votos brancos: ")
leia(vblank)

escreva("Insira a quantidade de votos nulos: ")
leia(vnull)

total <- va + vb + vc + vblank + vnull
pa <- va * 100 / total
pb <- vb * 100 / total
pc <- vc * 100 / total
pblank <- vblank * 100 / total
pnull <- vnull * 100 / total

escreval("Total de eleitores: ", total)
escreval("Porcentagem de votos no candidato A: ", pa:2:2)
escreval("Porcentagem de votos no candidato B: ", pb:2:2)
escreval("Porcentagem de votos no candidato C: ", pc:2:2)
escreval("Porcentagem de votos em branco: ", pblank:2:2)
escreval("Porcentagem de votos nulos: ", pnull:2:2)

Fimalgoritmo