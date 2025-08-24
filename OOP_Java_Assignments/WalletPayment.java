class WalletPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet.");
    }
    boolean validate() {
        System.out.println("Wallet validated.");
        return true;
    }
}
