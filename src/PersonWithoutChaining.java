public class PersonWithoutChaining {
    private String name;
    private int age;
    private int weight;
    private int height;

    // Per normal Java style, the setters return void.

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void introduce() {
        System.out.println("Hello, " +
                "my name is " + name + ".\n" +
                "I am " + age + " years old.\n" +
                "My height is " + height + " meter.\n" +
                "And my weight is " + weight + " kg");
    }
}
