import java.util.Scanner;

public class Atividade13 {
	public static void main(String[] args) {
        System.out.println("ALGORITMO CRESCENTE");
		Scanner scan = new Scanner(System.in);

	    System.out.println("Digite três números:");
        System.out.println("Primeiro número:");
		int n1 = scan.nextInt();
        System.out.println("Segundo número:");
		int n2 = scan.nextInt();
        System.out.println("Terceiro número:");
		int n3 = scan.nextInt();

		int m1, m2, m3;
        m1 = n1;

        if (n1 > n2) {
          m1 = n1;
          m2 = n2;
        } else {
          m1 = n2;
          m2 = n1;
        }

        if(n3 > m1) {
          m3 = m2;
          m2 = m1;
          m1 = n3;
        } else {
            if (n3 > m2) {
                m3 = m2;
                m2 = n3;
            } else {
                m3 = n3;
            }
        }

	    System.out.printf("%d > %d > %d\n", m1, m2, m3);
		scan.close();
	}
}
