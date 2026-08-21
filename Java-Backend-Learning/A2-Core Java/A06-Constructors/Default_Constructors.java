package CORE_JAVA.Constructors;

public class Default_Constructors {

    String name;
    int age;

    Default_Constructors() {
        name = "Om";
        age = 25;
        System.out.println("Default constructor is called");
    }

    void Display() {
        System.out.println("My name is " + name + " and age is " + age);
    }

    public static void main(String[] args) {
        Default_Constructors d1 = new Default_Constructors();
        d1.Display();
    }
}
