package CORE_JAVA.OOPs;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s = new Circle(); // parent ref → child object
        s.draw(); // calls Circle's method (runtime polymorphism)
    }
}



// Means many forms — same method name behaves differently based on the object or context.

// It’s of two types:
// 1. Compile-time (Method Overloading)
// 2. Runtime (Method Overriding)