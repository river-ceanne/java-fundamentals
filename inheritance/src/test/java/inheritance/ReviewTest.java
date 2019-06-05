package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReviewTest {
    @Test
    public void testReviewDefaultConstructor() {
        Review review = new Review();
        assertEquals("",review.getAuthor());
        assertEquals("",review.getBody());
        assertEquals(0,review.getStars());
    }

    @Test
    public void testReviewConstructorRestaurant() {
        Restaurant restaurant = new Restaurant();
        Review review = new Review("John Doe","The burger was just ok",3,restaurant);
        assertEquals("John Doe",review.getAuthor());
        assertEquals("The burger was just ok",review.getBody());
        assertEquals(3,review.getStars());
    }

    @Test (expected = IllegalStateException.class)
    public void testReviewConstructorOnlyForTheater() {
        Restaurant restaurant = new Restaurant();
        Review review = new Review("John Doe","The burger was just ok",3,restaurant,"Noodles");
    }

    @Test
    public void testReviewToString(){
        Restaurant restaurant = new Restaurant();
        Review review = new Review("John Doe","The burger was just ok",3,restaurant);
        System.out.println(review);

        assertEquals("Author: John Doe\n" +
                "# of Stars: 3\n" +
                "Body: The burger was just ok\n",review.toString());
    }
}
