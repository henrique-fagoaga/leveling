import java.util.Scanner;

public class Atividade9 {
	public static void main(String[] args) {
		System.out.println("PROGRAMA MILION�RIO");
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o sal�rio:");
		double salario = scan.nextDouble();
		System.out.println("Informe as despesas:");
		double despesas = scan.nextDouble();
		
		int tempo = (int)(1000000 / ((salario - despesas) * 12));
		System.out.printf("%d anos para se tornar milion�rio...", tempo);
		
		scan.close();
	}
}
