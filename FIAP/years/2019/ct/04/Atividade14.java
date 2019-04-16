import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		System.out.println("Insira primeiro numero:");
        int valor1 = scan.nextInt();

		System.out.println("Insira segundo numero:");
        int valor2 = scan.nextInt();

		System.out.println("Insira terceiro numero:");
        int valor3 = scan.nextInt();

		System.out.println("Insira quarto numero:");
        int valor4 = scan.nextInt();

        int menor = valor1;

        if (menor > valor2 || menor > valor3 || menor > valor4)
            menor = valor2;

            if (menor > valor3 || menor > valor4)
                menor = valor3;

                if (menor > valor4)
                    menor = valor4;

        System.out.println("Menor número: " + menor);
    }
}
