class Clothing extends Product {
    private String name;
    private double price;
    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }
    double calculateDiscount() {
        return price * 0.20;
    }
    void displayProductDetails() {
        System.out.println("Clothing: " + name + ", Price: " + price);
    }
}
