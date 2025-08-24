interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

class SimpleCalculator implements Calculator {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero!");
        return a / b;
    }
}

public class CalcDemo {
    public static void main(String[] args) {
        Calculator c = new SimpleCalculator();
        try {
            System.out.println("Divide 10/0: " + c.divide(10, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
