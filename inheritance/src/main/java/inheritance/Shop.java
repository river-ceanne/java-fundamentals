package inheritance;

import java.util.ArrayList;

public class Shop extends Reviewable{

    private String name;
    private String description;
    private int dollarSigns;
    private int stars;

    public Shop(){
        super();
        name = "";
        description = "";
        dollarSigns = 0;
        stars = 0;
    }

    public Shop(String name, String description, int dollarSigns, int stars, ArrayList<Review> reviews){
        super(reviews);
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
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
        return super.getReviews();
    }

    public void setReviews(ArrayList<Review> reviews) {
        super.setReviews(reviews);
    }

    @Override
    public void addReview(Review review) {
        super.getReviews().add(review);
        int sum = 0;
        for (Review val: super.getReviews()) {
            sum += val.getStars();
        }
        this.setStars(sum / this.getReviews().size());
    }

    @Override
    public String toString() {

        StringBuilder reviewList = new StringBuilder();
        for(Review review: super.getReviews()){
            reviewList.append("\n").append(review);
        }

        StringBuilder priceCat = new StringBuilder();
        for(int i = 0; i < this.getDollarSigns(); i++){
            priceCat.append("$");
        }

        return String.format("Shop Name: %s\n\nDescription: %s\n\nRating: %d out of 5 stars\n\nAffordability: %s\n\nReviews: %s\n",
                name,description,stars,priceCat,reviewList);

    }
}
