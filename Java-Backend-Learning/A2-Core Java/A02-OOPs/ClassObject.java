package CORE_JAVA.OOPs;

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car c1 = new Car(); // creating object
        c1.brand = "BMW";
        c1.speed = 120;
        c1.drive(); // calling method
    }
}


// A class is a blueprint or template that defines the properties (variables) and behaviors (methods) of objects.
// An object is a real instance of a class — created using the new keyword.