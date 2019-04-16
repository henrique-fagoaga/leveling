import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		System.out.println("PROGRAMA TEMPERATURA");
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira a temperatura em graus Celsius:");
		double celsius = scan.nextDouble();
		double fahrenheit = (9*celsius + 160) / 5;
		
		System.out.printf("%.2f celsius = %.2f fahrenheits", celsius, fahrenheit);
		
		scan.close();
	}

}
