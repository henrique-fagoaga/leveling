public class Television {
    private double sizeInInch;
    private boolean is3D;
    private boolean isSmartTv;

    public double getSizeInInch() {
        return this.sizeInInch;
    }

    public void setSizeInInch(double sizeInInch) {
        this.sizeInInch = sizeInInch;
    }

    public boolean getIs3D() {
        return this.is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public boolean getIsSmartTv() {
        return this.isSmartTv;
    }

    public void setIsSmartTv(boolean isSmartTv) {
        this.isSmartTv = isSmartTv;
    }

    public void turnOn() {
        System.out.println("*beep*");
    }

    public void turnOff() {
        System.out.println("*boop*");
    }

    public void changeChannel() {
        System.out.println("Yay! Animal Planet!");
    }
}
