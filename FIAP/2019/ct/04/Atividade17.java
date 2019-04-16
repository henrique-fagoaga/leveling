import java.util.Scanner;

public class Atividade17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	    System.out.println("Digite um mês do ano:");
		int mes = scan.nextInt();
		switch(mes) {
			case 1:
				System.out.printf("Mês %d - Janeiro", mes);
				break;
			case 2:
				System.out.printf("Mês %d - Fevereiro", mes);
				break;
			case 3:
				System.out.printf("Mês %d - Março", mes);
				break;
			case 4:
				System.out.printf("Mês %d - Abril", mes);
				break;
			case 5:
				System.out.printf("Mês %d - Maio", mes);
				break;
			case 6:
				System.out.printf("Mês %d - Junho", mes);
				break;
			case 7:
				System.out.printf("Mês %d - Julho", mes);
				break;				
			case 8:
				System.out.printf("Mês %d - Agosto", mes);
				break;
			case 9:
				System.out.printf("Mês %d - Setembro", mes);
				break;
			case 10:
				System.out.printf("Mês %d - Outubro", mes);
				break;
			case 11:
				System.out.printf("Mês %d - Novembro", mes);
				break;
			case 12:
				System.out.printf("Mês %d - Dezembro", mes);
				break;
            default:
                System.out.println("Mês inválido!");
                break;
		}

		scan.close();
	}
}
