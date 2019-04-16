import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        System.out.println("ALGORITMO NEGATIVO");
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor maior ou igual a zero:");
        int valor = scan.nextInt();

        if (valor < 0) {
            System.out.println("Valor inválido!");
        }

        scan.close();
    }
}
