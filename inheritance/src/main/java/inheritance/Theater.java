package inheritance;

import java.util.ArrayList;

public class Theater extends Reviewable{

    private String name;
    private ArrayList<String> movies;
    private int stars ;

    public Theater(){
        super();
        name = "";
        movies = new ArrayList<>();
        stars = 0;
    }

    public Theater(String name, ArrayList<String> movies,int stars,ArrayList<Review> reviews) {
        super(reviews);
        this.name = name;
        this.movies = movies;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void addMovie(String movie){
        movies.add(movie);
    }

    public void removeMovie(String movie) throws IllegalAccessException {
        if(!movies.remove(movie)) throw new IllegalAccessException("movie is not there for removal");
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
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

        StringBuilder movieList = new StringBuilder();
        for (String movie: movies){
            movieList.append("\n").append(movie);
        }

        return String.format("Theater Name: %s\nMovies:%s\nReviews: %s",name,movieList,reviewList);
    }
}
