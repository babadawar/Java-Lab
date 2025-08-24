package library.members;

public class Faculty {
    private String name;
    private String department;

    public Faculty(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Faculty: " + name + " | Department: " + department);
    }
}
