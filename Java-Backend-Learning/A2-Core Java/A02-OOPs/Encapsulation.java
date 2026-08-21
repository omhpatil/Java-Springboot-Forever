package CORE_JAVA.OOPs;

class Account {
    private double balance; // private = hidden from outside

    // setter method
    public void setBalance(double amount) {
        if (amount > 0) balance = amount;
    }

    // getter method
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000);
        System.out.println("Balance: " + acc.getBalance());
    }
}




// Wrapping data (variables) and methods (functions) together into a single unit (class) — and restricting direct access to the data.