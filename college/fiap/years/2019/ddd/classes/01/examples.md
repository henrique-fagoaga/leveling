# Hands On #

**Classe Morpheu**
```java
public class LivroDeNotas
{
	 private String choice;
	
	 public void exibirMensagem(String nome)
	 {
		 System.out.println("Você "+ nome +" é o escolhido para sair da Matrix!");
	 }
	 public void facaSuaEscolha()
	 {
	     if(this.choice.equals("vermelha"))
	     {
	    	 System.out.println("Siga-me.");
	     }
	     else
	     {
             System.out.println("Você irá acordar amanhâ, como se nada tivesse acontecido");
	     }
	 }
	 
	 public void setChoice (String escolha)
	 {
		 this.choice = escolha;
	 }

}
```
**Metodo Main**
```java
import java.util.Scanner;
public class TesteLivroDeNotas {
	public static void main(String[] args)
	{
		 Scanner leitor = new Scanner (System.in);
         LivroDeNotas morpheu = new LivroDeNotas();
         morpheu.exibirMensagem("Neo");
         System.out.println("Você deseja a pílula azul ou vermelha?");
         String choice = leitor.nextLine();
         System.out.println(choice);
         morpheu.setChoice(choice);
         morpheu.facaSuaEscolha();
         leitor.close();
	}
}
```
