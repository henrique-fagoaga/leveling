import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		System.out.println("PROGRAMA COTAÇÃO");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor do dólar:");
		double dolar = scan.nextDouble();
		System.out.println("Saldo em reais:");
		double real = scan.nextDouble();

		double result = real*dolar;
		System.out.printf("R$ %.2f = US$ %.2f", real, result);

		scan.close();
	}

}
