package demo;

import demo1.Book;

public class User extends Book {
int uid;
    // Constructor
    public User(String title, String author,int uid) {
        super(title, author);
        this.uid=uid;
    }

    public void updateBookAuthor(String newAuthor) {
        // Accessing the protected field 'author' from the superclass 'Book'
        this.author = newAuthor;
    }

    public void display() {
        // Accessing the public method 'displayBookInfo' from the superclass 'Book'
        displayBookInfo();
    }

    public static void main(String[] args) {
        // Create a new User instance
        User user = new User("Nineteen Eighty-Four-1984", "George Orwell",01);

        // Access public field
        System.out.println("Book Title: " + user.title);
//
////        // Access protected field (through inheritance)
        	System.out.println("Book Author (before update): " + user.author);
//
        // Access public method
        user.display();
//
        // Access protected method (through inheritance)
        user.updateBookAuthor("Orwell");

        // Display updated book info
        System.out.println("Book Author (after update): " + user.author);
        user.display();
    }
}

