package library.books;

public class ReferenceBook extends Book {
    private String subject;

    public ReferenceBook(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Reference Book: " + title + " | Author: " + author + " | Subject: " + subject);
    }
}
