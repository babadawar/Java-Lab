import java.util.Scanner;

class BankAccount {
    int accNo;
    String holderName;
    double balance;

    void openAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Holder Name: ");
        holderName = sc.nextLine();
        balance = 0.0;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.openAccount();
        b.deposit(2000);
        b.withdraw(500);
        b.displayBalance();
    }
}
