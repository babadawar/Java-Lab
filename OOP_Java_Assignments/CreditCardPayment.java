class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
    boolean validate() {
        System.out.println("Credit Card validated.");
        return true;
    }
}
