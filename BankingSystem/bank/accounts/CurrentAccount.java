package bank.accounts;

import bank.customers.Customer;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Customer customer, double initialBalance, double overdraftLimit) {
        super(customer, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Exceeded overdraft limit or invalid amount.");
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("Current Account | Overdraft Limit: " + overdraftLimit);
    }
}
