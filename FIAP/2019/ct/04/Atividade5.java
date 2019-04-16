import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		System.out.println("PROGRAMA ABASTECIMENTO");
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o preço do combustível(p/litro):");
		double valor = scan.nextDouble();
		System.out.println("Insira o valor em R$ a abastecer:");
		double abastecer = scan.nextDouble();
		
		double quantidade_gasolina = abastecer/valor;
		System.out.printf("Com R$ %.2f é possível comprar %.2f litro(s) de gasosa.", abastecer, quantidade_gasolina);
		
		scan.close();
	}

}
