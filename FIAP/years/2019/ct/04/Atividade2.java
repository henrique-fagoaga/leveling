import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		System.out.println("PROGRAMA QUADRADO V2");
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira 3 números.");
		System.out.print("Número 1: ");
		int n1 = scan.nextInt();
		System.out.print("Número 2: ");
		int n2 = scan.nextInt();
		System.out.print("Número 3: ");
		int n3 = scan.nextInt();
		
		int sum = n1+n2+n3;
		int result = sum*sum;
		
		System.out.printf("(%d + %d + %d) ^ 2 = %d", n1, n2, n3, result);
		
		scan.close();
	}
}
