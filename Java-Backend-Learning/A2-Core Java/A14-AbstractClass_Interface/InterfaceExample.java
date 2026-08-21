package CORE_JAVA.AbstractClass_Interface;

interface Vehicle {
    void start(); // implicitly public and abstract
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.start();
    }
}
