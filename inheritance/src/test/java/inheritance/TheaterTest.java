package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test
    public void testTheaterDefaultConstructor() {
        Theater theater = new Theater();
        assertEquals("",theater.getName());
        assertEquals(0,theater.getStars());
        assertEquals(new ArrayList<>(),theater.getMovies());
        assertEquals(new ArrayList<>(),theater.getReviews());

    }

    @Test
    public void testTheaterConstructor() {
        Theater theater = new Theater();
        assertEquals("",theater.getName());
        assertEquals(0,theater.getStars());
        assertEquals(new ArrayList<>(),theater.getMovies());
        assertEquals(new ArrayList<>(),theater.getReviews());

    }

    @Test
    public void testAddReview() {
        Theater theater = new Theater("AMC Pike",new ArrayList<>(),4,new ArrayList<>());
        Review review1 = new Review("Jane Doe","Great seats!",4,theater,"Avengers");
        Review review2 = new Review("John Doe","Popcorn sucks",3,theater,"Avengers");
        Review review3 = new Review("Sam Doe","Love this theater!",5,theater,"Aladdin");
        theater.addReview(review1);
        theater.addReview(review2);
        theater.addReview(review3);
        assertEquals(4,theater.getStars());
    }


    @Test
    public void testTheatertoString() {
        Theater theater = new Theater("AMC Pike",new ArrayList<>(),4,new ArrayList<>());
        Review review1 = new Review("Jane Doe","Great seats!",4,theater,"Avengers");
        Review review2 = new Review("John Doe","Popcorn sucks",3,theater,"Avengers");
        Review review3 = new Review("Sam Doe","Love this theater!",5,theater,"Aladdin");
        theater.addReview(review1);
        theater.addReview(review2);
        theater.addReview(review3);
        theater.addMovie("Avengers");
        theater.addMovie("Bad Moms");
        theater.addMovie("Aladdin");

        assertEquals("Theater Name: AMC Pike\n" +
                "\n" +
                "Movies:\n" +
                "Avengers\n" +
                "Bad Moms\n" +
                "Aladdin\n" +
                "\n" +
                "Reviews: \n" +
                "Author: Jane Doe\n" +
                "Movie: Avengers\n" +
                "# of Stars: 4\n" +
                "Body: Great seats!\n" +
                "\n" +
                "Author: John Doe\n" +
                "Movie: Avengers\n" +
                "# of Stars: 3\n" +
                "Body: Popcorn sucks\n" +
                "\n" +
                "Author: Sam Doe\n" +
                "Movie: Aladdin\n" +
                "# of Stars: 5\n" +
                "Body: Love this theater!\n",theater.toString());
    }

    @Test
    public void testTheaterAddMovies(){
        Theater theater = new Theater("AMC Pike",new ArrayList<>(),4,new ArrayList<>());
        theater.addMovie("Avengers");
        theater.addMovie("Bad Moms");
        theater.addMovie("Aladdin");
        assertTrue(theater.getMovies().contains("Aladdin"));

    }

    @Test
    public void testTheaterRemoveMovies() throws IllegalAccessException {
        Theater theater = new Theater("AMC Pike",new ArrayList<>(),4,new ArrayList<>());
        theater.addMovie("Avengers");
        theater.addMovie("Bad Moms");
        theater.addMovie("Aladdin");

        theater.removeMovie("Aladdin");
        assertFalse(theater.getMovies().contains("Aladdin"));

    }

    @Test (expected = IllegalAccessException.class)
    public void testTheaterRemoveMoviesNotIncluded() throws IllegalAccessException {
        Theater theater = new Theater("AMC Pike",new ArrayList<>(),4,new ArrayList<>());
        theater.addMovie("Avengers");
        theater.addMovie("Bad Moms");

        theater.removeMovie("Aladdin");

    }

}
