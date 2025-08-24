import java.util.Scanner;

class Distance {
    int feet, inches;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Feet and Inches: ");
        feet = sc.nextInt();
        inches = sc.nextInt();
    }

    void toMeters() {
        double totalInches = feet * 12 + inches;
        double cm = totalInches * 2.54;
        double m = cm / 100;
        System.out.println("Meters: " + m + " , Centimeters: " + cm);
    }

    Distance add(Distance d2) {
        Distance d = new Distance();
        d.feet = this.feet + d2.feet;
        d.inches = this.inches + d2.inches;
        if (d.inches >= 12) {
            d.feet += d.inches / 12;
            d.inches %= 12;
        }
        return d;
    }

    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        d1.accept();
        d2.accept();
        d1.toMeters();
        Distance d3 = d1.add(d2);
        System.out.println("Added Distance: " + d3.feet + " feet " + d3.inches + " inches");
    }
}
