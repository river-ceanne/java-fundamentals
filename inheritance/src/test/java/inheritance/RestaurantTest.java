package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RestaurantTest {
    @Test
    public void testRestaruantDefaultConstructor() {
        Restaurant restaurant = new Restaurant();
        assertEquals("",restaurant.getName());
        assertEquals(0,restaurant.getStars());
        assertEquals(0,restaurant.getPriceCategory());
        assertEquals(new ArrayList<>(),restaurant.getReviews());
    }

    @Test
    public void testRestaruantConstructor() {
        Restaurant restaurant = new Restaurant("McDonalds",5,1,new ArrayList<>());
        assertEquals("McDonalds",restaurant.getName());
        assertEquals(5,restaurant.getStars());
        assertEquals(1,restaurant.getPriceCategory());
        assertEquals(new ArrayList<>(),restaurant.getReviews());
    }

    @Test
    public void testAddReview() {
        Restaurant restaurant = new Restaurant();
        assertEquals("",restaurant.getName());
        assertEquals(0,restaurant.getStars());
        assertEquals(0,restaurant.getPriceCategory());
        assertEquals(new ArrayList<>(),restaurant.getReviews());
    }
}
