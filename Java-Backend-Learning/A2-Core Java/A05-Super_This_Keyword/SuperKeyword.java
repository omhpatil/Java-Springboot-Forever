package CORE_JAVA.Super_This_Keyword;

class Parent {
    String parentName;

    Parent(String name) {
        parentName = name;
        System.out.println("Parent constructor called");
    }

    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    String childName;

    Child(String parentName, String childName) {
        super(parentName); // call parent constructor
        this.childName = childName;
        System.out.println("Child constructor called");
    }

    void greetChild() {
        super.greet(); // call parent method
        System.out.println("Hello from Child");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child("Om's Parent", "Om");
        c.greetChild();
    }
}
