import java.util.Scanner;

public class Atividade11 {
	public static void main(String[] args) {
        System.out.println("ALGORITMO MAIORIDADE");
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Insira o nome:");
		String nome = scanner.next();

	    System.out.println("Insira a idade:");
		int idade = scanner.nextInt();

		if (idade >= 18)
			System.out.println(nome);
		
		scanner.close();
	}
}
