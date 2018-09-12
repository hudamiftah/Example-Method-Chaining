public class PersonMethodChaining {
    private String name;
    private int age;
    private int weight;
    private int height;

    // In addition to having the side-effect of setting the attributes in question,
    // the setters return "this" (the current Person object) to allow for further chained method calls.

    public PersonMethodChaining setName(String name) {
        this.name = name;
        return this;
    }

    public PersonMethodChaining setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonMethodChaining setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public PersonMethodChaining setHeight(int height) {
        this.height = height;
        return this;
    }

    public void introduce() {
        System.out.println("Hello, " +
                "my name is " + name + ".\n" +
                "I am " + age + " years old.\n" +
                "My height is " + height + " meter.\n" +
                "And my weight is " + weight + " kg");
    }

}
