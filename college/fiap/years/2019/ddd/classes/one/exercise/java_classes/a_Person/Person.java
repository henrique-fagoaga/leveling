public class Person {
    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void sayOccupation() {
        System.out.println("I'm a " + this.occupation);
    }

    public void presentYourself() {
        System.out.printf("Hi! My name's %s and I'm %d years old, my occupation is %s.\n", this.name, this.age, this.occupation);
    }

    public void doFrontSquats() {
        System.out.println("*sigh sigh* why the f*** I have to do squats? STOP THIS!");
    }
}
