import java.util.Scanner;
import university.students.Student;
import university.exams.Exam;
import university.results.Result;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student creation
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        Student student = new Student(name, rollNo);

        // Marks input
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Exam & Result
        Exam exam = new Exam(student, marks);
        Result result = new Result(exam);

        // Display
        student.displayInfo();
        result.displayResult();

        sc.close();
    }
}
