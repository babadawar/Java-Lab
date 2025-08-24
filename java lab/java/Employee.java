class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double hra() { return 0.20 * basicSalary; }  // 20%
    double da()  { return 0.10 * basicSalary; }  // 10%
    double grossSalary() { return basicSalary + hra() + da(); }

    void printDetails() {
        System.out.println("ID: " + empId + ", Name: " + name);
        System.out.println("Basic: " + basicSalary + ", HRA: " + hra() + ", DA: " + da());
        System.out.println("Gross: " + grossSalary());
        System.out.println("----");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Mehak", 30000);
        Employee e2 = new Employee(2, "Umar", 45000);
        Employee e3 = new Employee(3, "Sana", 60000);

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}
