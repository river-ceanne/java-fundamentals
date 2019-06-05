package inheritance;

import java.util.ArrayList;

public class Shop extends Reviewable{

    private String name;
    private String description;
    private int dollarSigns;
    private int stars;
    private ArrayList<Review> reviews;

    public Shop(){
        name = "";
        description = "";
        dollarSigns = 0;
        stars = 0;
        reviews = new ArrayList<>();
    }

    public Shop(String name, String description, int dollarSigns, int stars, ArrayList<Review> reviews){
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
        this.reviews = reviews;
        this.stars = stars;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDollarSigns() {
        return dollarSigns;
    }

    public void setDollarSigns(int dollarSigns) {
        this.dollarSigns = dollarSigns;
    }


    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
