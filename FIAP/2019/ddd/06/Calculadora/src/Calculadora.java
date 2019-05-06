public class Calculadora {
    public static Integer soma(Integer integer1, Integer integer2) {
        int value1 = integer1.intValue();
        int value2 = integer2.intValue();
        int result = value1 + value2;

        return Integer.valueOf(result);
    }

    public static Integer soma(Integer integer1, Integer integer2, Integer integer3) {
        int value1 = integer1.intValue();
        int value2 = integer2.intValue();
        int value3 = integer3.intValue();
        int result = value1 + value2 + value3;

        return Integer.valueOf(result);
    }
}
