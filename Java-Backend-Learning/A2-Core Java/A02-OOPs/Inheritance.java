package CORE_JAVA.OOPs;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited from Animal
        d.bark(); // own method
    }
}


// When one class acquires the properties and methods of another class using the extends keyword.
// It promotes code reusability.