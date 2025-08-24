import java.util.Scanner;
import bank.customers.Customer;
import bank.accounts.*;
import bank.services.BankServices;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a Customer
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter customer ID: ");
        int id = sc.nextInt();
        Customer customer = new Customer(name, id);

        // Choose Account Type
        System.out.println("Choose Account Type: 1. Savings  2. Current");
        int choice = sc.nextInt();

        Account account;
        if (choice == 1) {
            account = new SavingsAccount(customer, 1000, 4.5); // default balance & rate
        } else {
            account = new CurrentAccount(customer, 1000, 500); // default overdraft limit
        }

        account.displayAccountType();
        customer.displayInfo();

        BankServices services = new BankServices();

        // Menu
        int option;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    services.deposit(account, dep);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wit = sc.nextDouble();
                    services.withdraw(account, wit);
                    break;
                case 3:
                    services.checkBalance(account);
                    break;
                case 4:
                    System.out.println("Exiting Banking System...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (option != 4);

        sc.close();
    }
}
