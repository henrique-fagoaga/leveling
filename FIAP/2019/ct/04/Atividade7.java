import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
		System.out.println("PROGRAMA VOLUME");
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a altura da lata:");
		double altura = scan.nextDouble();
		System.out.println("Informe o raio da base da lata:");
		double raio = scan.nextDouble();
		
		double volume = 3.14 * (raio*raio) * altura;
		
		System.out.printf("Volume = %.2f", volume);

		scan.close();
	}
}
