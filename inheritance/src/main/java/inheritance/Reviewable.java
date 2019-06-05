package inheritance;

import java.util.ArrayList;

public abstract class Reviewable {
    private ArrayList<Review> reviews;

    public Reviewable(){
        reviews = new ArrayList<>();
    }

    public Reviewable(ArrayList<Review> reviews){
        this.reviews = reviews;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
}
