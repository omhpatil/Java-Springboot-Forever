package CORE_JAVA.Basics;

public class Operators {
    public static void main(String[] args) {

        // -------- ARITHMETIC OPERATORS --------
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // -------- UNARY OPERATORS --------
        int x = 5;
        System.out.println("x++ = " + (x++)); // prints 5, then x=6
        System.out.println("++x = " + (++x)); // x=7, prints 7
        System.out.println("-x = " + (-x));   // -7
        boolean flag = true;
        System.out.println("!flag = " + (!flag)); // false

        // -------- RELATIONAL OPERATORS --------
        int p = 10, q = 20;
        System.out.println("p == q? " + (p == q)); // false
        System.out.println("p != q? " + (p != q)); // true
        System.out.println("p > q? " + (p > q));   // false
        System.out.println("p < q? " + (p < q));   // true
        System.out.println("p >= 10? " + (p >= 10)); // true

        // -------- LOGICAL OPERATORS --------
        boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2 = " + (cond1 && cond2)); // false
        System.out.println("cond1 || cond2 = " + (cond1 || cond2)); // true
        System.out.println("!(cond1) = " + (!cond1));               // false

        // -------- ASSIGNMENT OPERATORS --------
        int num = 50;
        num += 10; // num = num + 10
        System.out.println("num += 10 -> " + num);
        num *= 2;  // num = num * 2
        System.out.println("num *= 2 -> " + num);

        // -------- TERNARY OPERATOR --------
        int age = 20;
        String eligibility = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age check: " + eligibility);

        // -------- BITWISE OPERATORS --------
        int m = 5; // 0101
        int n = 3; // 0011
        System.out.println("m & n = " + (m & n)); // 1 (0001)
        System.out.println("m | n = " + (m | n)); // 7 (0111)
        System.out.println("m ^ n = " + (m ^ n)); // 6 (0110)
        System.out.println("~m = " + (~m));       // -6 (inverted bits)
        System.out.println("m << 1 = " + (m << 1)); // 10 (1010)
        System.out.println("m >> 1 = " + (m >> 1)); // 2  (0010)
    }
}






//Types of Operators in Java
//| Category                 | Description                          | Examples                         |                                |        |
//        | ------------------------ | ------------------------------------ | -------------------------------- | ------------------------------ | ------ |
//        | **Arithmetic Operators** | Perform mathematical calculations    | `+`, `-`, `*`, `/`, `%`          |                                |        |
//        | **Unary Operators**      | Operate on a single operand          | `+`, `-`, `++`, `--`, `!`        |                                |        |
//        | **Relational Operators** | Compare two values                   | `==`, `!=`, `>`, `<`, `>=`, `<=` |                                |        |
//        | **Logical Operators**    | Combine multiple boolean expressions | `&&`, `                          |                                | `, `!` |
//        | **Assignment Operators** | Assign values to variables           | `=`, `+=`, `-=`, `*=`, `/=`      |                                |        |
//        | **Ternary Operator**     | Short-hand if-else                   | `condition ? value1 : value2`    |                                |        |
//        | **Bitwise Operators**    | Work on bits of integers             | `&`, `                           | `, `^`, `~`, `<<`, `>>`, `>>>` |        |
