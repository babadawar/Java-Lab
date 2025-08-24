class FullTimeEmployee extends Employee {
    private double salary;
    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }
    double calculateSalary() {
        return salary;
    }
    void generatePayslip() {
        System.out.println("Full Time Employee Salary: " + calculateSalary());
    }
}
