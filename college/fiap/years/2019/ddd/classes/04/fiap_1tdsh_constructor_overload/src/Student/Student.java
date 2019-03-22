public class Student {
    private String name;
    private byte age;
    private double grade1;
    private double grade2;

    public Student(String name, double grade1, double grade2) {
        this.setName(name);
        this.setGrade1(grade1);
        this.setGrade2(grade2);
    }

    public Student(String name, byte age, double grade1, double grade2) {
        this(name, grade1, grade2);
        this.setAge(age);
    }

    public Student(String name, byte age) {
        this.setName(name);
        this.setAge(age);
    }

    public Student(byte age, double grade2) {
        this.setAge(age);
        this.setGrade2(grade2);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return this.age;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade1() {
        return this.grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade2() {
        return this.grade2;
    }
}
