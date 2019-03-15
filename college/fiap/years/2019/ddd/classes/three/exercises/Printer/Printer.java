public class Printer {
     
    public void print(float v) {
        System.out.println(String.format("#1 (float): %.2f", v));
    }

    public void print(float v1, float v2) {
        System.out.println(String.format("#2 (float, float): %.2f, %.2f", v1, v2));
    }

    public void print(float v1, String v2) {
        System.out.println(String.format("#3 (float, String): %.2f, %s", v1, v2));
    }

    public void print(String v1, float v2) {
        System.out.println(String.format("#4 (String, float): %s, %.2f", v1, v2));
    }

    public void print(String v1, String v2, String v3) {
        System.out.println(String.format("#5 (String, String, String): %s, %s, %s", v1, v2, v3));
    }

    public void print(int v1, int v2, String v3) {
        System.out.println(String.format("#6 (int, int, String): %d, %d, %s", v1, v2, v3));
    }
}
