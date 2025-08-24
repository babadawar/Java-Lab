public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(50000);
        Employee e2 = new PartTimeEmployee(100, 50);
        Employee e3 = new Intern(10000);
        e1.generatePayslip();
        e2.generatePayslip();
        e3.generatePayslip();
    }
}
