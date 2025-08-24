import java.util.Scanner;

class Student {
    int rollNo;
    String name, course;
    int m1, m2, m3;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter Marks in 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    int totalMarks() {
        return m1 + m2 + m3;
    }

    double averageMarks() {
        return totalMarks() / 3.0;
    }

    void display() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Total: " + totalMarks());
        System.out.println("Average: " + averageMarks());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.acceptDetails();
        s.display();
    }
}
