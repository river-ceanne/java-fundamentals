package inheritance;

import java.util.ArrayList;

public class Restaurant {
    //Create a class to represent a Restaurant.
    // Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
    //Implement a Restaurant constructor.
    //Test that your Restaurant constructor is behaving reasonably.
    //Implement a reasonable toString method for Restaurants.
    //Write a test to create an instance of Restaurant and ensure that its toString is working properly.
    private String name;
    private int stars;
    private int priceCategory;
    private ArrayList<Review> reviews;

    public Restaurant(){}

    public Restaurant(String name, int stars, int priceCategory, ArrayList<Review> reviews){
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
