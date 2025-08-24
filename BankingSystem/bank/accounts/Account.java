package bank.accounts;

import bank.customers.Customer;

public abstract class Account {
    protected Customer customer;
    protected double balance;

    public Account(Customer customer, double initialBalance) {
        this.customer = customer;
        this.balance = initialBalance;
    }

    public abstract void displayAccountType();

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
