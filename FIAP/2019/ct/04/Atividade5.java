import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		System.out.println("PROGRAMA ABASTECIMENTO");
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o pre�o do combust�vel(p/litro):");
		double valor = scan.nextDouble();
		System.out.println("Insira o valor em R$ a abastecer:");
		double abastecer = scan.nextDouble();
		
		double quantidade_gasolina = abastecer/valor;
		System.out.printf("Com R$ %.2f � poss�vel comprar %.2f litro(s) de gasosa.", abastecer, quantidade_gasolina);
		
		scan.close();
	}

}
