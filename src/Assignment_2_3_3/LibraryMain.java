package Assignment_2_3_3;

public class LibraryMain {
    public static void main(String[] args) {
        // Create instances of objects
        Book book1 = new Book("X1", "Sam", 2132);
        Book book2 = new Book("X2", "Stefan", 231);
        Book book3 = new Book("X3", "Olga", 232);
        Library library = new Library();

        // Add the books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //Display all books
        library.displayBooks();

        System.out.println();

        // Display books by author
        library.findBooksByAuthor("Sam");

        System.out.println();

        // Task 2:
        // Borrow a book and keep the reference so it can be returned later
        Book borrowed = library.borrowBook("X2");

        // double borrow
        library.borrowBook("X2");

        // doesnt exist
        library.borrowBook("X4");

        System.out.println();

        // X2 should be gone
        library.displayBooks();

        System.out.println();

        library.returnBook(borrowed);

        System.out.println();

        // X2 should be back
        library.displayBooks();
    }
}