class Grocery extends Product {
    private String name;
    private double price;
    public Grocery(String name, double price) {
        this.name = name;
        this.price = price;
    }
    double calculateDiscount() {
        return price * 0.05;
    }
    void displayProductDetails() {
        System.out.println("Grocery: " + name + ", Price: " + price);
    }
}
