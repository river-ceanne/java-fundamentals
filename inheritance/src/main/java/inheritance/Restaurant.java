package inheritance;

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

    public Restaurant(){}

    public Restaurant(String name,int stars,int priceCategory){
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
