package library.transactions;

import library.books.Book;
import library.members.Student;
import library.members.Faculty;
import java.util.ArrayList;

public class Issue {
    private ArrayList<String> issuedBooks = new ArrayList<>();

    // Issue to Student
    public void issueBook(Book book, Student student) {
        issuedBooks.add(book.getTitle() + " -> issued to Student: " + student.getName());
        System.out.println("Book issued to student successfully!");
    }

    // Issue to Faculty
    public void issueBook(Book book, Faculty faculty) {
        issuedBooks.add(book.getTitle() + " -> issued to Faculty: " + faculty.getName());
        System.out.println("Book issued to faculty successfully!");
    }

    public void displayIssuedBooks() {
        System.out.println("\n--- Issued Books ---");
        for (String record : issuedBooks) {
            System.out.println(record);
        }
    }
}
