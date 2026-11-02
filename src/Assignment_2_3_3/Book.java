package Assignment_2_3_3;

public class Book {

    // Private instance variables:
    private String title;
    private String author;
    private int publicationYear;

    // Constructor:
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Auto Gen Getters:
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


}
