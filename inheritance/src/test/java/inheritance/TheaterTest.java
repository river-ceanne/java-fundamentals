package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void testTheatertoString() {
        Theater theater = new Theater("AMC Pike",new ArrayList<>(),4,new ArrayList<>());
        Review review1 = new Review("Jane Doe","Great seats!",4,theater);
        Review review2 = new Review("John Doe","Popcorn sucks",3,theater);
        Review review3 = new Review("Sam Doe","Love this theater!",5,theater);
        theater.addReview(review1);
        theater.addReview(review2);
        theater.addReview(review3);
        theater.addMovie("Avengers");
        theater.addMovie("Bad Moms");
        theater.addMovie("Aladdin");


        System.out.println(theater);

    }

    @Test
    public void testTheaterAddMovies(){
        Theater theater = new Theater("AMC Pike",new ArrayList<>(),4,new ArrayList<>());
        theater.addMovie("Avengers");
        theater.addMovie("Bad Moms");
        theater.addMovie("Aladdin");
        assertTrue(theater.getMovies().contains("Aladdin"));

    }

}
