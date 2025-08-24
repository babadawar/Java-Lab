package library.books;

public class TextBook extends Book {
    private String course;

    public TextBook(String title, String author, String isbn, String course) {
        super(title, author, isbn);
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("TextBook: " + title + " | Author: " + author + " | Course: " + course);
    }
}
