class Student {
    int rollNo;
    String name;
    int marks;

    
    Student() { this.rollNo = 0; this.name = "NA"; this.marks = 0; }
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Ayan", 86);
        Student s3 = new Student(102, "Iqra", 92);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
