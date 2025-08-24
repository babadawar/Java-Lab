import java.util.Scanner;

class Book {
    String title, author, publisher;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
        System.out.print("Enter Publisher: ");
        publisher = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(title + " by " + author + ", " + publisher + ", Rs." + price);
    }

    boolean search(String t) {
        return title.equalsIgnoreCase(t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
        b1.input();
        b1.display();
        System.out.print("Search Book by Title: ");
        String s = sc.next();
        if (b1.search(s)) System.out.println("Book Found!");
        else System.out.println("Not Found!");
    }
}
