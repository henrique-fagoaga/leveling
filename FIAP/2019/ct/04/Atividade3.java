import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		System.out.println("PROGRAMA CALCULOS");
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira 4 n�meros.");
		System.out.print("N�mero 1: ");
		int n1 = scan.nextInt();
		System.out.print("N�mero 2: ");
		int n2 = scan.nextInt();
		System.out.print("N�mero 3: ");
		int n3 = scan.nextInt();
		System.out.print("N�mero 4: ");
		int n4 = scan.nextInt();
		
		int result1 = n1*n3;
		int result2 = n2+n4;
		
		System.out.printf("%d * %d = %d\n", n1, n3, result1);
		System.out.printf("%d + %d = %d\n", n2, n4, result2);
		
		scan.close();
	}

}
