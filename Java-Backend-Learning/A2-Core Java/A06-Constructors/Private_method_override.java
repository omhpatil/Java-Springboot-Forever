package CORE_JAVA.Constructors;

class Parent1 {
    private void display() {
        System.out.println("Parent class method");
    }
}

class Child1 extends Parent1 {
    private void display() {                            // This is a NEW method, not an override
        System.out.println("Child class method");
    }
}

public class Private_method_override {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        // p.display();                                 // Compile error: display() has private access in Parent
    }
}
