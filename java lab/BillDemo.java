import java.util.*;

interface BillCalculator {
    double calculateBill(int units);
}

class ElectricityBoard implements BillCalculator {
    public double calculateBill(int units) {
        if (units <= 100) return units * 2;
        else if (units <= 200) return (100 * 2) + (units - 100) * 3;
        else return (100 * 2) + (100 * 3) + (units - 200) * 5;
    }
}

public class BillDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter units consumed: ");
            int u = sc.nextInt();
            ElectricityBoard eb = new ElectricityBoard();
            System.out.println("Bill: Rs. " + eb.calculateBill(u));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integer units.");
        }
    }
}
