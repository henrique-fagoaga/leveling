import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		System.out.println("PROGRAMA PRESTAÇÃO");
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor do boleto:");
		double valor = scan.nextDouble();
		System.out.println("Informe o percentual de juros:");
		double juros = scan.nextDouble();
		System.out.println("Informe a quantidade de dias em atraso:");
		int dias = scan.nextInt();
		
		double novo_valor = valor + (valor*(juros/100))*dias;
		
		System.out.printf("Novo valor a ser pago: R$ %.2f", novo_valor);

		scan.close();
	}

}
