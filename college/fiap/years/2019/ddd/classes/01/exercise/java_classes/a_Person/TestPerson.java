public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Foo", 10, "tester");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getOccupation());

        person.setName("Bar");
        person.setAge(30);
        person.setOccupation("hacker");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getOccupation());

        person.sayOccupation();
        person.presentYourself();
        person.doFrontSquats();
    }
}
