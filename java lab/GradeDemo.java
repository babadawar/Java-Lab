import java.util.*;

interface Grading {
    String calculateGrade(int marks);
}

class Student implements Grading {
    public String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }
}

public class GradeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            Student s = new Student();
            System.out.println("Grade: " + s.calculateGrade(marks));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter numeric marks.");
        }
    }
}
