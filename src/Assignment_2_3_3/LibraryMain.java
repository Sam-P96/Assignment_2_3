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

        System.out.println();

        // Task 3:
        // X1 was never borrowed, should be true
        System.out.println("Is X1 available? " + library.isBookAvailable("X1"));

        // no X4 should be false
        System.out.println("Is X4 available? " + library.isBookAvailable("X4"));

        // Borrow X3, should be false
        Book borrowed2 = library.borrowBook("X3");
        System.out.println("Is X3 available? " + library.isBookAvailable("X3"));

        // return X3, should be true again!
        library.returnBook(borrowed2);
        System.out.println("Is X3 available? " + library.isBookAvailable("X3"));

        if (library.isBookAvailable("X2")) {
            System.out.println("X2 can be borrowed");
        } else {
            System.out.println("X2 is currently borrowed");
        }
    }
}