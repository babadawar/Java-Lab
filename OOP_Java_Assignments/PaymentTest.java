public class PaymentTest {
    public static void main(String[] args) {
        Payment pay1 = new CreditCardPayment();
        Payment pay2 = new UPIPayment();
        Payment pay3 = new WalletPayment();
        pay1.validate();
        pay1.pay(500);
        pay2.validate();
        pay2.pay(250);
        pay3.validate();
        pay3.pay(300);
    }
}
