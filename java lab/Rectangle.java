import java.util.Scanner;

class Rectangle {
    double length, width;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    double area() { return length * width; }
    double perimeter() { return 2 * (length + width); }

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.accept();
        r.display();
    }
}
