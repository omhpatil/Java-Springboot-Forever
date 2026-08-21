package CORE_JAVA.OOPs;

abstract class Vehicle {
    abstract void start(); // abstract method (no body)
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}


// Showing only essential details and hiding the implementation.
// It focuses on what an object does, not how it does it.