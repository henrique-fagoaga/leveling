import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		System.out.println("PROGRAMA APURAÇÃO");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos votos candidato A recebeu:");
		int candidato_a = scan.nextInt();
		System.out.println("Quantos votos candidato B recebeu:");
		int candidato_b = scan.nextInt();
		System.out.println("Quantos votos candidato C recebeu:");
		int candidato_c = scan.nextInt();
		System.out.println("Quantos votos em branco:");
		int branco = scan.nextInt();
		System.out.println("Quantos votos em nulo:");
		int nulo = scan.nextInt();
		
		int eleitores = candidato_a + candidato_b + candidato_c + branco + nulo;
		
		System.out.printf("%.2f %s de votos candidato A\n", (double) candidato_a/eleitores*100, "%");
		System.out.printf("%.2f %s de votos candidato B\n", (double) candidato_b/eleitores*100, "%");
		System.out.printf("%.2f %s de votos candidato C\n", (double) candidato_c/eleitores*100, "%");
		System.out.printf("%.2f %s de votos brancos\n", (double) branco/eleitores*100, "%");
		System.out.printf("%.2f %s de votos nulos\n", (double) nulo/eleitores*100, "%");

		scan.close();
	}
}
