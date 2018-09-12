public class Main {

    public static void main(String[] args) {

        // call method chaining
        PersonMethodChaining person = new PersonMethodChaining();
        person.setName("Caya Cinta").setHeight(170).setAge(30).setWeight(60).introduce();

        // call normal method withod chaining
        System.out.println("---------------------------------");
        PersonWithoutChaining personWithout = new PersonWithoutChaining();
        personWithout.setName("Rembulan Malam");
        personWithout.setAge(25);
        personWithout.setHeight(155);
        personWithout.setWeight(50);
        personWithout.introduce();
    }
}
