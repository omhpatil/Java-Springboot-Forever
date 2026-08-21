package CORE_JAVA.Exception_Handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}

