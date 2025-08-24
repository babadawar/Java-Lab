import java.util.InputMismatchException;
import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;
    Circle(double r) { radius = r; }
    public double area() { return Math.PI * radius * radius; }
    public double perimeter() { return 2 * Math.PI * radius; }
}

class Rectangle implements Shape {
    double length, breadth;
    Rectangle(double l, double b) { length = l; breadth = b; }
    public double area() { return length * breadth; }
    public double perimeter() { return 2 * (length + breadth); }
}

class Triangle implements Shape {
    double a, b, c;
    Triangle(double x, double y, double z) { a = x; b = y; c = z; }
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double perimeter() { return a + b + c; }
}

public class ShapesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter radius of circle: ");
            double r = Double.parseDouble(sc.nextLine());
            Shape c = new Circle(r);
            System.out.println("Circle Area = " + c.area());
            System.out.println("Circle Perimeter = " + c.perimeter());
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input!");
        }
    }
}
