import java.util.Scanner;

class AreaCalculator {
    int area(int side) {                 // square
        return side * side;
    }
    int area(int l, int b) {             // rectangle
        return l * b;
    }
    double area(double radius) {         // circle
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();

        System.out.print("Enter side of square: ");
        int s = sc.nextInt();
        System.out.println("Square Area = " + ac.area(s));

        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt(), b = sc.nextInt();
        System.out.println("Rectangle Area = " + ac.area(l, b));

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Circle Area = " + ac.area(r));
    }
}
