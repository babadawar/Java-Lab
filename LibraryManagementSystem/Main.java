import library.books.*;
import library.members.*;
import library.transactions.*;

public class Main {
    public static void main(String[] args) {
        // Create Books
        Book b1 = new ReferenceBook("Java Handbook", "James Gosling", "REF123", "Programming");
        Book b2 = new TextBook("Database Systems", "C.J. Date", "TXT456", "DBMS");

        // Create Members
        Student s1 = new Student("Alice", 101);
        Faculty f1 = new Faculty("Dr. Smith", "Computer Science");

        // Issue Transactions
        Issue issue = new Issue();
        issue.issueBook(b1, s1);
        issue.issueBook(b2, f1);

        // Display issued books
        issue.displayIssuedBooks();
    }
}
