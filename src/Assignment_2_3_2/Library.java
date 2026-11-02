package Assignment_2_3_2;

import java.util.ArrayList;


public class Library {
    // Private instance's variables:
    private ArrayList<Book> books = new ArrayList<>();

    // Methods:
    public void addBook(Book book) {
        this.books.add(book);
        System.out.println(book.getTitle() + " was added to the library");
    }

    public void displayBooks() {
        System.out.println("Displaying all books: ");
        for (int i = 0; i < this.books.size(); i++) {
            Book book = books.get(i);
            System.out.printf((i + 1) + ". Title: " + book.getTitle() + " | ");
            System.out.printf((i + 1) + ". Author: " + book.getAuthor() + " | ");
            System.out.println((i + 1) + ". Year: " + book.getPublicationYear() );
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Displaying all books by " + author + ": ");
        boolean exist = false;
        // This is like for book in books
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.printf("Title: " + book.getTitle() + " | ");
                System.out.printf("Author: " + book.getAuthor() + " | ");
                System.out.println("Year: " + book.getPublicationYear());
                exist = true;
            }
        }

        if (!exist) {
            System.out.println("No books found.");
        }
    }

    // Task 2 methods:
    public Book borrowBook(String title) {
        // Normal index loop, not for-each, because we remove from the list
        for (int i = 0; i < this.books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                this.books.remove(i);
                System.out.println(title + " was borrowed from the library");
                // Return right away so the loop stops after removing
                return book;
            }
        }

        System.out.println(title + " is not available.");
        return null;
    }

    public void returnBook(Book book) {
        // borrowBook returns null if the book wasn't found
        if (book == null) {
            System.out.println("There is no book to return.");
            return;
        }

        this.books.add(book);
        System.out.println(book.getTitle() + " was returned to the library");
    }
}