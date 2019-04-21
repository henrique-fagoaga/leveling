public class TesteCalculadora {
   public static void main(String[] args) {
       int v1 = Integer.valueOf((int) (Math.random() * 15 + 7));
       int v2 = Integer.valueOf((int) (Math.random() * 15 + 7));

       Integer result1 = Calculadora.soma(v1, v2);
       System.out.printf("Soma v1: %d\n", result1);

       int v3 = Integer.valueOf((int) (Math.random() * 15 + 7));
       int v4 = Integer.valueOf((int) (Math.random() * 15 + 7));
       int v5 = Integer.valueOf((int) (Math.random() * 15 + 7));

       Integer result2 = Calculadora.soma(v3, v4, v5);
       System.out.printf("Soma v2: %d\n", result2);
   } 
}
