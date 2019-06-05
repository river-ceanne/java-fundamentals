package inheritance;

import java.util.ArrayList;

public class Restaurant extends Reviewable{

    private String name;
    private int stars;
    private int priceCategory;

    public Restaurant(){
        super();
        this.name = "";
        this.stars = 0; //# of stars
        this.priceCategory = 0; //# of dollar signs

    }

    public Restaurant(String name, int stars, int priceCategory, ArrayList<Review> reviews){
        super(reviews);
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

    public ArrayList<Review> getReviews() {
        return super.getReviews();
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
        super.setReviews(reviews);
    }

    public void addReview(Review review){
        super.getReviews().add(review);
        int sum = 0;
        for (Review val: super.getReviews()) {
            sum += val.getStars();
        }
        this.setStars(sum / this.getReviews().size());
    }

    @Override
    public String toString() {

        StringBuilder priceCat = new StringBuilder();
        for(int i = 0; i < this.getPriceCategory(); i++){
            priceCat.append("$");
        }

        StringBuilder allReviews = new StringBuilder();
        for(Review rev: this.getReviews()){
            allReviews.append("\n");
            allReviews.append(rev);
        }


        return String.format("Restaurant Name: %s\n" +
                "# of Stars: %d\n" +
                "Price Category: %s\n" +
                "Reviews: \n%s" ,this.name,this.stars,priceCat.toString(),allReviews);
    }
}
