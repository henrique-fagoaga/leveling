public class Circle {
    private int radius;

    public Circle() {
        this.setRadius(1);
    }

    public Circle(int radius) {
        this.setRadius(radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 3.14 * (this.radius * this.radius);
    }

    public void show() {
        System.out.println(String.format("This circle area is: %.2f | radius %d", this.getArea(), this.radius));
    }
}
