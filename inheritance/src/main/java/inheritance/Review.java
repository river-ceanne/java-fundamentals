package inheritance;

public class Review {
    // Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
    private String author;
    private String body;
    private int stars;

    public Review(){
        this.author = "";
        this.body = "";
        this.stars = 0;
    }

    public Review(String author, String body, int stars){
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public String getAuthor() {
        return author;
    }

    public int getStars() {
        return stars;
    }

    public String getBody() {
        return body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("Author: %s\n" +
                "# of Stars: %d\n" +
                "Body: %s\n",this.author,this.stars,this.body);
    }
}
