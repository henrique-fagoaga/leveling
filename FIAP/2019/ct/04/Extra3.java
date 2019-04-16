import java.util.Scanner;

public class Extra3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira seu salário:");
		double salario = scan.nextDouble();
		if (salario > 998) {
			System.out.println("Menu de opções");
			System.out.println("1. Calcular o novo salário");
			System.out.println("2. Calcular o imposto");
			System.out.println("3. Classificação");
			System.out.println("4. Sair");
			System.out.println("Digite a opção desejada:");
			int opc = scan.nextInt();
			switch(opc) {
				case 1:				
                    double novoSalario;
					if(salario < 1008) {
                        novoSalario = salario + 240;
					} else if (salario <= 2000) {
                        novoSalario = salario + 430;
					} else if(salario <= 7000) {
                        novoSalario = salario + 500;
					} else {
                        novoSalario = salario + 630;
					}

                    System.out.printf("Salário atualizado é de R$ %.2f", novoSalario);
					break;
				case 2:
                    double percImposto = 0;
					if(salario <= 1903.98) {
                        percImposto = 0;
					} else if (salario <= 2826.65) {
                        percImposto = 7.5;
					} else if (salario <= 3751.05 ) {
                        percImposto = 15;
					} else if (salario <= 4664.68){
                        percImposto = 22.5;
					} else {
                        percImposto = 27.5;
					}

                    if (percImposto > 0) {
                        System.out.printf("Imposto: %.2f%s\n", percImposto, "%");
                    } else {
                        System.out.println("Imposto: -");
                    }
					break;
				case 3:
					if(salario <= 4000) {
						System.out.println("Analista de Programação Júnior");
					} else if (salario <= 7500.99) {
						System.out.println("Analista de Programação Pleno");
					} else if (salario <= 10000 ) {
						System.out.println("Analista de Programação Senior");
					} else {
						System.out.println("Gerente");
					}
					break;
				case 4:
					System.out.println("Saindo...");
					break;
			}
		} else {
			System.out.println("Salário deve ser maior que salário mínimo R$ 998,00.");			
		}

		scan.close();
	}
}
