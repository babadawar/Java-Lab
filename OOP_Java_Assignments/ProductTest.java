public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 80000);
        Product p2 = new Clothing("T-Shirt", 1500);
        Product p3 = new Grocery("Rice", 600);
        Product[] products = { p1, p2, p3 };
        for (Product p : products) {
            p.displayProductDetails();
            System.out.println("Discount: " + p.calculateDiscount());
        }
    }
}
