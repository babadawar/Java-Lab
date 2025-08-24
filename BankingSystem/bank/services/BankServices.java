package bank.services;

import bank.accounts.Account;

public class BankServices {
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void checkBalance(Account account) {
        account.displayBalance();
    }
}
