package CORE_JAVA.Basics;

public class Variables {

    // Instance variable (belongs to object)
    String name = "Om Patil";

    // Static variable (belongs to class)
    static String course = "Java Programming";

    public void displayDetails() {
        // Local variable (inside method)
        int age = 22;  // must be initialized before use

        System.out.println("Local Variable (age): " + age);
        System.out.println("Instance Variable (name): " + name);
        System.out.println("Static Variable (course): " + course);
    }

    public static void main(String[] args) {

        // Create first object
        Variables student1 = new Variables();
        student1.displayDetails();

        // Create second object
        Variables student2 = new Variables();
        student2.name = "Aditya";  // change instance variable for this object

        // Static variable is shared among all objects
        Variables.course = "Spring Boot Development";

        System.out.println("\n--- After Modifications ---");
        student1.displayDetails();
        student2.displayDetails();
    }
}

//| Type                                 | Where Declared                        | Lifetime                           | Access                         |
//        | ------------------------------------ | ------------------------------------- | ---------------------------------- | ------------------------------ |
//        | **Local Variable**                   | Inside a method or block              | Only inside that method/block      | Must be initialized before use |
//        | **Instance Variable (Non-static)**   | Inside a class but outside any method | Exists as long as object exists    | Accessed using object          |
//        | **Static Variable (Class Variable)** | Declared with `static` keyword        | Exists as long as the program runs | Shared among all objects       |
