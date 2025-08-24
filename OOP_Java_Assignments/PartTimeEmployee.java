class PartTimeEmployee extends Employee {
    private double hourlyRate, hours;
    public PartTimeEmployee(double hourlyRate, double hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    double calculateSalary() {
        return hourlyRate * hours;
    }
    void generatePayslip() {
        System.out.println("Part Time Employee Salary: " + calculateSalary());
    }
}
