package Assignment_2_3_4;

import java.util.ArrayList;

public class Book {

    // Private instance variables:
    private String title;
    private String author;
    private int publicationYear;

    // Task 4:
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();

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

    // Task 4 methods:
    public void setRating(double rating) {
        // Only accept ratings from 0 to 5
        if (rating < 0.0 || rating > 5.0) {
            System.out.println("Rating must be between 0.0 and 5.0");
            return;
        }
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void displayRatingAndReviews() {
        System.out.println(this.title + " | Rating: " + this.rating + " | Reviews: " + this.reviews.size());
        // This is like for review in reviews
        for (String review : this.reviews) {
            System.out.println("- " + review);
        }
    }


}