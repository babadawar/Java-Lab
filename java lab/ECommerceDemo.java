interface Checkout {
    void processPayment(double amount);
}

class OnlineCart implements Checkout {
    public void processPayment(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive!");
        System.out.println("Payment of " + amount + " processed successfully.");
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        try {
            Checkout cart = new OnlineCart();
            cart.processPayment(-200); // will throw exception
        } catch (Exception e) {
            System.out.println("Payment error: " + e.getMessage());
        }
    }
}
