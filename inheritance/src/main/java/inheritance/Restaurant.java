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

    public Restaurant(){
        this.name = "";
        this.stars = 0; //# of stars
        this.priceCategory = 0; //# of dollar signs
        this.reviews = new ArrayList<>();
    }

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

    public void addReview(Review review){
        this.reviews.add(review);
        int sum = 0;
        for (Review val: this.reviews) {
            sum += val.getStars();
        }
        this.setStars(sum / this.reviews.size());
    }

    @Override
    public String toString() {

        StringBuilder priceCat = new StringBuilder();
        for(int i = 0; i < this.getPriceCategory(); i++){
            priceCat.append("$");
        }


        return String.format("Restaurant Name: %s\n" +
                "# of Stars: %d\n" +
                "Price Category: %s" ,this.name,this.stars,priceCat.toString(),this.reviews);
    }
}
