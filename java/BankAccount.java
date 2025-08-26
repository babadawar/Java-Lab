class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountNumber, String accountHolder, double openingBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance or invalid amount.");
        }
    }

    void displayBalance() {
        System.out.println("Account: " + accountNumber + " | Holder: " + accountHolder + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("IUST001", "Dawar", 2000);
        acc.displayBalance();
        acc.deposit(1500);
        acc.withdraw(1000);
        acc.displayBalance();
    }
}
