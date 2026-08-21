package CORE_JAVA.Constructors;

public class Parameterized_Constructor {
    String name;
    int age;

    Parameterized_Constructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called");
    }

    void Display() {
        System.out.println("My name is " + name + " and age is " + age);
    }

    public static void main(String[] args) {
        Parameterized_Constructor p1 = new Parameterized_Constructor("Om", 25);
        p1.Display();
    }
}
