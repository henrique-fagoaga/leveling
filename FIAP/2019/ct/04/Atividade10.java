import java.util.Scanner;

public class Atividade10 {
	public static void main(String[] args) {
		System.out.println("PROGRAMA APURACAO");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos votos candidato A recebeu:");
		int candidatoA = scan.nextInt();
		System.out.println("Quantos votos candidato B recebeu:");
		int candidatoB = scan.nextInt();
		System.out.println("Quantos votos candidato C recebeu:");
		int candidatoC = scan.nextInt();
		System.out.println("Quantos votos em branco:");
		int branco = scan.nextInt();
		System.out.println("Quantos votos em nulo:");
		int nulo = scan.nextInt();
		
		int eleitores = candidatoA + candidatoB + candidatoC + branco + nulo;
		
		System.out.printf("%.2f %s de votos candidato A\n", (double) candidatoA/eleitores*100, "%");
		System.out.printf("%.2f %s de votos candidato B\n", (double) candidatoB/eleitores*100, "%");
		System.out.printf("%.2f %s de votos candidato C\n", (double) candidatoC/eleitores*100, "%");
		System.out.printf("%.2f %s de votos brancos\n", (double) branco/eleitores*100, "%");
		System.out.printf("%.2f %s de votos nulos\n", (double) nulo/eleitores*100, "%");

		scan.close();
	}
}
