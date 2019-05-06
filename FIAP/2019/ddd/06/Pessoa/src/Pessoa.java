class Pessoa {
 public static void ler(int ...paginas){
   int qtdPaginas = paginas.length;
   if(qtdPaginas == 0){
     System.out.println("não vou ler agora");
   } else if(qtdPaginas == 1){
     System.out.printf("lendo %d página(s)\n",paginas[0]);
   } else if(qtdPaginas == 2){
     System.out.printf("lendo %d página(s) do capítulo %d\n", paginas[1], paginas[0]);
   } else {
     System.out.println("Não vou ler tudo isso!");
   }
 }
}
