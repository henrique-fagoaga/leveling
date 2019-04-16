import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o preço uniário:");
        double vUnitario = scan.nextDouble();

        System.out.println("Informe o país de origem (1-Brasil, 2-México, 3-Outros):");
        int origem = scan.nextInt();

        System.out.println("Informe o meio de transporte (T-Terrestre, F-Fluvial, A-Aéreo):");
        String meio = scan.next();

        System.out.println("A carga é perigosa? (S-Sim, N-Não):");
        String perigosa = scan.next();

        if (!(origem == 1 || origem == 2 || origem == 3)) {
            System.out.println("Origem inválido");
        } else {
            if (!(meio.equals("T") || meio.equals("F") || meio.equals("A"))) {
                System.out.println("Meio de transporte inválido");
            } else {
                if (!(perigosa.equals("S") || perigosa.equals("N"))) {
                    System.out.println("Opção tipo de carga inválida");
                } else {
                    double percDesconto = 0.0;
                    if (vUnitario <= 100) {
                        percDesconto = 5.0;
                    } else {
                        percDesconto = 20.0;
                    }
                    double vImposto = vUnitario * (percDesconto / 100);
                    System.out.println(percDesconto / 100);
                    System.out.println(vImposto);

                    double vTransporte = 0.0;
                    if (perigosa.equals("S")) {
                        switch(origem) {
                            case 1:
                                vTransporte = 21.00;
                                break;
                            case 2:
                                vTransporte = 27.00;
                                break;
                            case 3:
                                vTransporte = 50.00;
                                break;
                        }
                    } else {
                        switch(origem) {
                            case 1:
                                vTransporte = 21.00;
                                break;
                            case 2:
                                vTransporte = 25.00;
                                break;
                            case 3:
                                vTransporte = 40.00;
                                break;
                        }
                    }

                    double vSeguro = 0.0;
                    if (origem == 2 || meio.equals("A")) {
                        vSeguro = vUnitario / 2;
                    }

                    double vTotal = vUnitario + vImposto + vTransporte + vSeguro;
                    System.out.printf("Preço final: %.2f + %.2f + %.2f + %.2f = %.2f", vUnitario, vImposto, vTransporte, vSeguro, vTotal);
                }
            }
        }
    }
}
