import java.util.Scanner;

public class Atividade19 {
	public static void main(String[] args) {
        System.out.println("ALGORITMO EMPRÉSTIMO");
		Scanner scan = new Scanner(System.in);

	    System.out.println("Insira seu salário:");
		double salario = scan.nextDouble();

	    System.out.println("Digite o valor da prestação:");
		double prestacao = scan.nextDouble();

		if (prestacao > (salario * .3)) {
		    System.out.println("Valor não aprovado.");
		} else {
		    System.out.println("Valor aprovado.");
		}

		scan.close();
	}
}
