import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        System.out.println("Insira 2 números:");
        Scanner scan = new Scanner(System.in);

        int value1 = scan.nextInt();
        int value2 = scan.nextInt();

        System.out.println("Insira um operador (*/+-):");
        String operador = scan.next();

        String msg = "%d %s %d = %.2f";
        if (operador.equals("+")) {
            System.out.println(String.format(msg, value1, operador, value2, (double) value1+value2));
        } else if (operador.equals("-")) {
            System.out.println(String.format(msg, value1, operador, value2, (double) value1-value2));
        } else if (operador.equals("*")) {
            System.out.println(String.format(msg, value1, operador, value2, (double) value1*value2));
        } else if (operador.equals("/")) {
            System.out.println(String.format(msg, value1, operador, value2, (double) value1/value2));
        } else {
            System.out.println("Operador inválido");
        }
    }
}
