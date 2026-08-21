package CORE_JAVA.Constructors;

class Student {
    String name;
    int age;

    Student() {
        this("Om", 25);   // calls parameterized constructor
        System.out.println("Default constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor: " + name + ", " + age);
    }
}

public class This_keyword {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
