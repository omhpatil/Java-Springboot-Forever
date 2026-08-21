package CORE_JAVA.Constructors;

class Parent {
    static void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child class method");
    }
}

public class StatiC_method_overriding {
    public static void main(String[] args) {
    Parent p = new Child();
    p.display();
    }
}


// if u remove static, then child class method will get call because of method overring and this is method hiding