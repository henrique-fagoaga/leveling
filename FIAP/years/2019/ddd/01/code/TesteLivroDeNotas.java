import java.util.Scanner;

public class TesteLivroDeNotas {
	public static void main(String[] args)
	{
		 Scanner leitor = new Scanner (System.in);
         LivroDeNotas morpheu = new LivroDeNotas("Neo");
         
         morpheu.exibirMensagem();
         System.out.println("Você deseja a pílula azul ou vermelha?");
         
         String choice = leitor.nextLine();
         morpheu.facaSuaEscolha(choice);
         leitor.close();
	}
}
