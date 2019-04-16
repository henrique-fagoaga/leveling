public class WineExpert {
    private int yearsOfExperience;
    private String specializedRegion;
    private String name;

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecializedRegion() {
        return this.specializedRegion;
    }

    public void setSpecializedRegion(String specializedRegion) {
        this.specializedRegion = specializedRegion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tasteWine() {
        System.out.println("Hmm, pleasant flavour with a light aftertaste of apple");
    }

    public void smellWine() {
        System.out.println("Splendid scent of the spring harvest");
    }

    public void blame() {
        System.out.println("What an unpleasant taste for my trained tongue!");
    }
}
