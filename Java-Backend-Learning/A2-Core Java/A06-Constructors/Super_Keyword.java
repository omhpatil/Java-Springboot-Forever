package CORE_JAVA.Constructors;

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();   // calls Animal()
        System.out.println("Dog constructor");
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Dog a = new Dog();
    }
}
