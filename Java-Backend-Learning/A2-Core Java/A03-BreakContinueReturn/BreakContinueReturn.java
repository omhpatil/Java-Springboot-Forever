package CORE_JAVA.BreakContinueReturn;

public class BreakContinueReturn {

    // Method to demonstrate return
    static void checkNumber(int n) {
        if (n < 0) {
            System.out.println("Negative number! Exiting method...");
            return; // exits the method immediately
        }
        System.out.println("Number is: " + n);
    }

    public static void main(String[] args) {
        System.out.println("===== break example =====");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break; // stops the loop when i == 4
            }
            System.out.println(i);
        }

        System.out.println("\n===== continue example =====");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skips this iteration when i == 3
            }
            System.out.println(i);
        }

        System.out.println("\n===== return example =====");
        checkNumber(5);   // normal number
        checkNumber(-2);  // negative number, method exits here
        checkNumber(10);  // this will still run because previous return only exited method once
    }
}

