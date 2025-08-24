public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(4.0);
        Shape rect = new Rectangle(3.0, 5.0);
        Shape tri = new Triangle(4.0, 6.0);
        Shape[] shapes = { circle, rect, tri };
        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}
