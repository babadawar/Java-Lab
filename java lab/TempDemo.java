import java.util.Scanner;

interface TemperatureConverter {
    double cToF(double c);
    double fToC(double f);
}

class Converter implements TemperatureConverter {
    public double cToF(double c) { return (c * 9/5) + 32; }
    public double fToC(double f) { return (f - 32) * 5/9; }
}

public class TempDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Celsius: ");
            double c = Double.parseDouble(sc.nextLine());
            Converter con = new Converter();
            System.out.println("Fahrenheit: " + con.cToF(c));
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input!");
        }
    }
}
