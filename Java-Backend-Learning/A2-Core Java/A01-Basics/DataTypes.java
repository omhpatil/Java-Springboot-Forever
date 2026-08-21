package CORE_JAVA.Basics;

public class DataTypes {

    public static void main(String[] args) {

        // -------- PRIMITIVE DATA TYPES --------

        // 1. byte
        byte age = 25;
        System.out.println("byte (age): " + age);

        // 2. short
        short year = 2025;
        System.out.println("short (year): " + year);

        // 3. int
        int salary = 50000;
        System.out.println("int (salary): " + salary);

        // 4. long
        long population = 8000000000L;
        System.out.println("long (population): " + population);

        // 5. float
        float height = 5.9f;
        System.out.println("float (height): " + height);

        // 6. double
        double distance = 12345.6789;
        System.out.println("double (distance): " + distance);

        // 7. char
        char grade = 'A';
        System.out.println("char (grade): " + grade);

        // 8. boolean
        boolean isJavaFun = true;
        System.out.println("boolean (isJavaFun): " + isJavaFun);


        // -------- NON-PRIMITIVE DATA TYPES --------

        // String
        String name = "Om Patil";
        System.out.println("String (name): " + name);

        // Array
        int[] marks = {85, 90, 78, 92};
        System.out.print("Array (marks): ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        // Class (Example)
        Student student = new Student("Om", 22);
        student.display();

        // Wrapper Classes (Auto-boxing example)
        Integer num = 100; // int -> Integer
        Double price = 99.99; // double -> Double
        System.out.println("Wrapper Integer: " + num);
        System.out.println("Wrapper Double: " + price);
    }
}

// Custom Class
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void display() {
        System.out.println("Student -> Name: " + name + ", Age: " + age);
    }
}






//Primitive Data Types (8 total)
//| Type      | Size    | Example      | Range                      | Description              |
//        | --------- | ------- | ------------ | -------------------------- | ------------------------ |
//        | `byte`    | 1 byte  | 10           | -128 to 127                | Small integers           |
//        | `short`   | 2 bytes | 1000         | -32,768 to 32,767          | Medium integers          |
//        | `int`     | 4 bytes | 100000       | -2³¹ to 2³¹-1              | Most common integer type |
//        | `long`    | 8 bytes | 10000000000L | Very large integers        |                          |
//        | `float`   | 4 bytes | 3.14f        | Decimal (single precision) |                          |
//        | `double`  | 8 bytes | 3.141592653  | Decimal (double precision) |                          |
//        | `char`    | 2 bytes | 'A'          | Unicode character          |                          |
//        | `boolean` | 1 bit   | true / false | Logical values             |                          |


//Non-Primitive Data Types
//| Type        | Example                      | Description                |
//        | ----------- | ---------------------------- | -------------------------- |
//        | `String`    | `"Hello"`                    | Sequence of characters     |
//        | `Array`     | `{1,2,3}`                    | Collection of same type    |
//        | `Class`     | `Student s = new Student();` | Custom type                |
//        | `Interface` | `Runnable`                   | Abstract behavior contract |
