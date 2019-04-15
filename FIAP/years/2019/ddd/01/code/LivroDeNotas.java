public class LivroDeNotas
{
	 private String nome;

	 public LivroDeNotas(String nome) {
		 this.nome = nome;
	 }

	 public void exibirMensagem()
	 {
		 System.out.println("Você "+ this.nome +" é o escolhido para sair da Matrix!");
	 }
	 public void facaSuaEscolha(String choice)
	 {
	     if(choice.equals("vermelha"))
	     {
	    	 System.out.println("Follow me.");
	     }
	     else
	     {
             System.out.println("Keep working for the rest of your miserable life");
	     }
	 }
}
