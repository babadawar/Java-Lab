package library.members;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Student: " + name + " | Roll No: " + rollNo);
    }
}
