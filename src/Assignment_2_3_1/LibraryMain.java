package Assignment_2_3_1;

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

        System.out.println(); // blank line, like in the example output

        // Display by  by author
        library.findBooksByAuthor("Jane Doe");
    }
}
