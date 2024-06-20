package demo1;
public class Book {
    // Public field: accessible from anywhere
    public String title;

    // Protected field: accessible within the same package and subclasses
    protected String author;

    // Constructor
    public Book(String t, String a) {
       title = t;
       author = a;
    }

    // Public method: accessible from anywhere
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Protected method: accessible within the same package and subclasses
    protected void updateAuthor(String author) {
        this.author = author;
    }
}