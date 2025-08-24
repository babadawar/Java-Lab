import java.util.Scanner;

class Circle {
    double radius;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    double area() { return Math.PI * radius * radius; }
    double circumference() { return 2 * Math.PI * radius; }

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.accept();
        c.display();
    }
}
