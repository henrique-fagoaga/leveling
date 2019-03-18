public class TestPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();

        float v1Float = 1.0f, v2Float = 2.0f;
        String v1String = "1.0", v2String = "2.0", v3String = "3.0";
        int v1Int = 1, v2Int = 2;

        printer.print(v1Float);
        printer.print(v1Float, v2Float);
        printer.print(v1Float, v2String);
        printer.print(v1String, v2Float);
        printer.print(v1String, v2String, v3String);
        printer.print(v1Int, v2Int, v3String);
    }
}
