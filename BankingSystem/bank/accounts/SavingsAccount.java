package bank.accounts;

import bank.customers.Customer;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(Customer customer, double initialBalance, double interestRate) {
        super(customer, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}
