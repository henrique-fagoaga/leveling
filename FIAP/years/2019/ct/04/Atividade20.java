import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a região da viagem:");
        String regiao = scan.next();

        if ((regiao.equals("sudeste") || regiao.equals("sul")) || !(regiao.equals("nordeste") || regiao.equals("norte") || regiao.equals("centro-oeste"))) {
            System.out.println("Região não atendida pela companhia aérea");
        } else {
            System.out.println("Deseja ida e volta? (S)im ou (N)ão");
            String idaVolta = scan.next();

            if (!(idaVolta.equals("S") || idaVolta.equals("N"))) {
                System.out.println("Valor inválido. Insira S ou N");
            } else {
                int valor;

                if (idaVolta.equals("S")) {
                    if (regiao.equals("norte")) {
                        valor = 180;
                    } else if (regiao.equals("nordeste")) {
                        valor = 375;
                    } else {
                        valor = 1007;
                    }
                } else {
                    if (regiao.equals("norte")) {
                        valor = 100;
                    } else if (regiao.equals("nordeste")) {
                        valor = 205;
                    } else {
                        valor = 548;
                    }
                }

                System.out.println("Valor da passagem é de: " + valor);
            }
        }
    }
}
