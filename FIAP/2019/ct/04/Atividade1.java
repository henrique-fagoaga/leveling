import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		System.out.println("PROGRAMA QUADRADO");
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o número para elevar a dois:");
		int num = scan.nextInt();
		int result = num*num;
		
		System.out.printf("%d^2 = %d", num, result);
		scan.close();
	}
}
