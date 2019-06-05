package inheritance;

public class Review {
    private String author;
    private String body;
    private int stars;
    private Reviewable reviewable;
    private String ext_detail;

    public Review(){
        this.author = "";
        this.body = "";
        this.stars = 0;
    }

    public Review(String author, String body, int stars, Reviewable reviewable){
        this.author = author;
        this.body = body;
        this.stars = stars;
        switch (reviewable.getClass().getTypeName()){
            case "inheritance.Restaurant":
                this.reviewable = new Restaurant();
                break;
            case "inheritance.Shop":
                this.reviewable = new Shop();
                break;
            case "inheritance.Theater":
                this.reviewable = new Theater();
                break;
        }
    }

    public Review(String author, String body, int stars, Reviewable reviewable, String movie){

        if(reviewable.getClass().getTypeName() != "inheritance.Theater"){
            throw new IllegalStateException("constructor only allowed for Reviewable extended to Theater class object");
        }

        this.author = author;
        this.body = body;
        this.stars = stars;
        this.reviewable = new Theater();
        this.ext_detail = movie;

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

    public String getExt_detail() {
        return ext_detail;
    }

    public void setExt_detail(String ext_detail) {
        this.ext_detail = ext_detail;
    }

    public Reviewable getReviewable() {
        return reviewable;
    }

    public void setReviewable(Reviewable reviewable) {
        this.reviewable = reviewable;
    }


    @Override
    public String toString() {

        if(reviewable.getClass().getTypeName() == "inheritance.Theater"){
            return String.format("Author: %s\n" +
                    "Movie: %s\n" +
                    "# of Stars: %d\n" +
                    "Body: %s\n",this.author,this.getExt_detail(),this.stars,this.body);
        }

        return String.format("Author: %s\n" +
                "# of Stars: %d\n" +
                "Body: %s\n",this.author,this.stars,this.body);

    }


}
