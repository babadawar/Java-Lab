class Calculator {
    int calculate(int a) {          // square
        return a * a;
    }
    int calculate(int a, int b) {   // product
        return a * b;
    }
    float calculate(float x) {      // cube
        return x * x * x;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Square(6) = " + c.calculate(6));
        System.out.println("Product(7, 8) = " + c.calculate(7, 8));
        System.out.println("Cube(2.5f) = " + c.calculate(2.5f));
    }
}
