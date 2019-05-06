import java.util.Scanner;

public class TesteBlocoDeNotas {
	public static void main(String[] args) {
		BlocoDeNotas blocoDeNotas = new BlocoDeNotas();
		Scanner leitor = new Scanner(System.in);
		String menu = 
			"1-Inserir"
			+"\n2-Exibir"
			+"\n3-Apagar tudo"
			+"\n4-Localizar e substituir caracter"
			+"\n5-Localizar e substituir palavras"
			+"\n6-Mostrar quantidade de caracteres"
			+"\n7-Verificar se texto existe no conteudo"
			+"\n8-Exibir tudo em maiusculo"
			+"\n9-Exibir tudo em minusculo"
			+"\n0-Sair";
		int op;
		do {
			System.out.println(menu);
			op = leitor.nextInt();
			switch (op) {
			case 1:
				System.out.println("Qual conteúdo deseja inserir?");
				String textoInserir = leitor.next();
				blocoDeNotas.inserir(textoInserir);
				break;
			case 2:
				blocoDeNotas.exibir();
				break;
			case 3:
				blocoDeNotas.apagarTudo();
				break;
			case 4:
				System.out.println("Qual o caractere a substituir?");
				char existente = leitor.next().charAt(0);
				System.out.println("Qual o caractere novo?");
				char novo = leitor.next().charAt(0);
				blocoDeNotas.localizarSubstituir(existente, novo);
				break;
			case 5:
				System.out.println("Qual a palavra a substituir?");
				String existente2 = leitor.next();
				System.out.println("Qual a palavra nova?");
				String novo2 = leitor.next();
				blocoDeNotas.localizarSubstituir(existente2, novo2);
				break;
			case 6:
				System.out.println(blocoDeNotas.tamanho());
				break;
			case 7:
				System.out.println("Qual o conteúdo que deseja checar se existe no conteúdo?");
				String pesquisar = leitor.next();
				boolean existe = blocoDeNotas.possui(pesquisar);
				if (existe) {
					System.out.println("Conteúdo encontrado!");
				} else {
					System.out.println("Conteúdo não encontrado!");
				}
				break;
			case 8:
				System.out.println(blocoDeNotas.alterarCase("maiusculas"));
				break;
			case 9:
				System.out.println(blocoDeNotas.alterarCase("minusculas"));
				break;
			case 0:
				System.out.println("Até mais");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (op != 0);
		leitor.close();
	}
}
