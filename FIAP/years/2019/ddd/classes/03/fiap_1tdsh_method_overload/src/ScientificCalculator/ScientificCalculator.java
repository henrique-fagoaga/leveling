class ScientificCalculator {
    public double sqrt(int i) {
        return Math.sqrt(i);
    }

    public double sqrt(double d) {
        return Math.sqrt(d);
    }

    public double sqrt(String s) {
        return Math.sqrt(Double.parseDouble(s));
    }

    public double pow(byte b1, byte b2) {
        return Math.pow(b1, b2);
    }

    public double pow(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return Math.pow(d1, d2);
    }

    public double pow(int i1, double d2) {
        return Math.pow(i1, d2);
    }
}
