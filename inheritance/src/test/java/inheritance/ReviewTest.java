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
    public void testReviewConstructor() {
        Review review = new Review("John Doe","The burger was just ok",3);
        assertEquals("John Doe",review.getAuthor());
        assertEquals("The burger was just ok",review.getBody());
        assertEquals(3,review.getStars());
    }
}
