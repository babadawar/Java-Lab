class Rectangle {
    private double length;
    private double breadth;

    
    public void setLength(double length) { this.length = length; }
    public void setBreadth(double breadth) { this.breadth = breadth; }
    public double getLength() { return length; }
    public double getBreadth() { return breadth; }

    public double area() { return length * breadth; }
    public double perimeter() { return 2 * (length + breadth); }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5.5);
        r.setBreadth(3.0);
        System.out.println("Length: " + r.getLength() + ", Breadth: " + r.getBreadth());
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
