public class BeerCan {
    private String brand;
    private double capacityInMl;
    private String type;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCapacityInMl() {
        return this.capacityInMl;
    }

    public void setCapacityInMl(double capacityInMl) {
        this.capacityInMl = capacityInMl;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void open() {
        System.out.println("*a pleasant sound*");
    }

    public void drinkContents() {
        System.out.println("*gulp gulp gulp*");
    }

    public void smash() {
        System.out.println("More compact to throw away");
    }
}
