public class TestScientificCalculator {
    public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();

        int i1 = 2;
        double d1 = 3.0, d2 = 2.0;
        byte b1 = 3, b2 = 2;
        String s1 = "3.0", s2 = "2.0";
        
        System.out.println(String.format("#1 sqrt(int): %.2f", calculator.sqrt(i1)));
        System.out.println(String.format("#2 sqrt(double): %.2f", calculator.sqrt(d1)));
        System.out.println(String.format("#3 sqrt(String): %.2f", calculator.sqrt(s1)));
        System.out.println(String.format("#4 pow(byte, byte): %.2f", calculator.pow(b1, b2)));
        System.out.println(String.format("#5 pow(String, String): %.2f", calculator.pow(s1, s2)));
        System.out.println(String.format("#6 pow(int, int): %.2f", calculator.pow(i1, d2)));
    }
}
