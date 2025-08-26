class Book {
    String title, author;
    double price;

    Book() { this("Unknown", "Unknown", 0.0); }
    Book(String title, String author) { this(title, author, 0.0); }
    Book(String title, String author, double price) {
        this.title = title; this.author = author; this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Clean Code", "Robert C. Martin");
        Book b3 = new Book("Effective Java", "Joshua Bloch", 799.0);

        b1.display(); b2.display(); b3.display();
    }
}
