public class Fish {
    private String specimen;
    private String color;
    private String livingRegion;

    public String getSpecimen() {
        return this.specimen;
    }

    public void setSpecimen(String specimen) {
        this.specimen = specimen;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    public void wink() {
        System.out.println("Joke, I can't wink :(");
    }

    public void swimBackwards() {
        System.out.println("I'd like to not do this, I can drown if I do. D:");
    }

    public void mimicMagikarp() {
        System.out.println("*flop flop*");
    }
}
