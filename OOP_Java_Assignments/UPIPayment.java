class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
    boolean validate() {
        System.out.println("UPI validated.");
        return true;
    }
}
