import java.util.Scanner;

public class Atividade21 {
	public static void main(String[] args) {
        System.out.println("ALGORITMO DIGITO");
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o número da conta:");
		int conta = scan.nextInt();
		if ((conta >= 100) && (conta <= 999)){
			int d1 = (conta % 10) * 100;
			int d2 = (conta/10 % 10) * 10;
			int d3 = (conta/100 % 10);

			int contaInverso = d1 + d2 + d3;
			int contaSomado = conta + contaInverso;

			d1 = (contaSomado % 10);
			d2 = (contaSomado/10 % 10);
			d3 = (contaSomado/100 % 10);

            int d4 = 0;
            if (contaSomado >= 1000)
                d4 = (contaSomado/1000 % 10);

			int digVerificador = (d1 + (d2*2) + (d3*3) + (d4*4)) % 10;
			System.out.printf("Conta: %d | Dígito verificador: %d\n", conta, digVerificador);
		}else {
			System.out.println("Conta inválida, deve conter apenas 3 dígitos.");
		}

		scan.close();
	}
}
