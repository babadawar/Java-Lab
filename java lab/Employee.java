import java.util.Scanner;

class Employee {
    int empID;
    String name;
    double basic;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }

    double hra() { return 0.2 * basic; }
    double da() { return 0.1 * basic; }
    double gross() { return basic + hra() + da(); }

    void printSlip() {
        System.out.println("\n--- Salary Slip ---");
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra());
        System.out.println("DA: " + da());
        System.out.println("Gross Salary: " + gross());
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.accept();
        e.printSlip();
    }
}
