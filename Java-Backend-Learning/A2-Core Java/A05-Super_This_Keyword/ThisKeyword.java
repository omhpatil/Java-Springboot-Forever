package CORE_JAVA.Super_This_Keyword;

class Student {
    String name;
    int age;

    // Constructor 1
    Student() {
        this("Om", 22); // calls Constructor 2
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s = new Student(); // calls default constructor
        s.display();
    }
}
