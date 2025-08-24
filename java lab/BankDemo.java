import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance = 0;
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else throw new ArithmeticException("Insufficient balance!");
    }
    public double getBalance() { return balance; }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount acc = new SavingsAccount();
        try {
            acc.deposit(1000);
            System.out.println("Balance: " + acc.getBalance());
            System.out.print("Enter withdraw amount: ");
            double amt = Double.parseDouble(sc.nextLine());
            acc.withdraw(amt);
            System.out.println("Remaining Balance: " + acc.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
