class Intern extends Employee {
    private double stipend;
    public Intern(double stipend) {
        this.stipend = stipend;
    }
    double calculateSalary() {
        return stipend;
    }
    void generatePayslip() {
        System.out.println("Intern Stipend: " + calculateSalary());
    }
}
