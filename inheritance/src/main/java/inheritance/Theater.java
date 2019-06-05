package inheritance;

import java.util.ArrayList;

public class Theater {

    private String name;
    private ArrayList<String> movies;
    private int stars ;
    private ArrayList<Review> reviews;

    public Theater(){
        name = "";
        movies = new ArrayList<>();
        stars = 0;
        reviews = new ArrayList<>();
    }

    public Theater(String name, ArrayList<String> movies,int stars,ArrayList<Review> reviews) {
        this.name = name;
        this.movies = movies;
        this.stars = stars;
        this.reviews = reviews;
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

    @Override
    public String toString() {

        StringBuilder movieList = new StringBuilder();
        for (String movie: movies){
            movieList.append("\n").append(movie);
        }

        return String.format("Theater Name: %s\nMovies:%s",name,movieList);
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
}
