public class University {
    private int alumniCapacity;
    private String name;
    private int foundationYear;

    public int getAlumniCapacity() {
        return this.alumniCapacity;
    }

    public void setAlumniCapacity(int alumniCapacity) {
        this.alumniCapacity = alumniCapacity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void attractNewStudents() {
        System.out.println("We have waffles!");
    }

    public void displayAgeOn2019() {
        int age = 2019 - this.foundationYear;
        System.out.printf("This university have %d years old", age);
    }

    public void isOpen() {
        System.out.println("It's open and receiving everyone! Let's rock the future together");
    }
}
