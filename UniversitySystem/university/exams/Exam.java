package university.exams;

import university.students.Student;

public class Exam {
    private Student student;
    private int[] marks; // marks in subjects

    public Exam(Student student, int[] marks) {
        this.student = student;
        this.marks = marks;
    }

    public Student getStudent() {
        return student;
    }

    public int totalMarks() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    public double averageMarks() {
        return (double) totalMarks() / marks.length;
    }
}
