import java.util.Scanner;

public class Extra2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o tipo de veículo (1-moto, 2-carro):");
		int veiculo = scan.nextInt();

        if (!((veiculo == 1) || (veiculo == 2))) {
            System.out.println("Tipo de veículo inválido!");
        } else {
            System.out.println("Insira o tempo que ficou estacionado (em minutos):");
            int minutos = scan.nextInt();

            if (minutos < 0) {
                System.out.println("Tempo inserido inválido, deve ser maior que 0!");
            } else {
                double valor = 0;
                if (minutos <= 15) {
                    valor = 0;
                } else {
                    double adicional = 0;

                    if(veiculo == 1) {
                        valor = 17.00;
                        adicional = 0.10;
                    } else {
                        valor = 20.00;
                        adicional = 0.15;
                    }

                    if (minutos > 180) {
                        valor += (minutos - 180) * adicional;
                    }
                }

                System.out.printf("O valor a pagar é de R$ %.2f", valor);
            }
        }

		scan.close();
	}
}
