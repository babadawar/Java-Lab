class Electronics extends Product {
    private String name;
    private double price;
    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }
    double calculateDiscount() {
        return price * 0.10;
    }
    void displayProductDetails() {
        System.out.println("Electronics: " + name + ", Price: " + price);
    }
}
