package university.results;

import university.exams.Exam;

public class Result {
    private Exam exam;

    public Result(Exam exam) {
        this.exam = exam;
    }

    public String calculateGrade() {
        double avg = exam.averageMarks();
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public void displayResult() {
        System.out.println("Result for " + exam.getStudent().getName() +
                           " (Roll No: " + exam.getStudent().getRollNo() + ")");
        System.out.println("Total Marks: " + exam.totalMarks());
        System.out.println("Average Marks: " + exam.averageMarks());
        System.out.println("Grade: " + calculateGrade());
    }
}
