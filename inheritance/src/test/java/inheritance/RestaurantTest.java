package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RestaurantTest {
    @Test
    public void testRestaurantDefaultConstructor() {
        Restaurant restaurant = new Restaurant();
        assertEquals("",restaurant.getName());
        assertEquals(0,restaurant.getStars());
        assertEquals(0,restaurant.getPriceCategory());
        assertEquals(new ArrayList<>(),restaurant.getReviews());
    }

    @Test
    public void testRestaurantConstructor() {
        Restaurant restaurant = new Restaurant("McDonalds",5,1,new ArrayList<>());
        assertEquals("McDonalds",restaurant.getName());
        assertEquals(5,restaurant.getStars());
        assertEquals(1,restaurant.getPriceCategory());
        assertEquals(new ArrayList<>(),restaurant.getReviews());
    }

    @Test
    public void testAddReview() {
        Restaurant restaurant = new Restaurant();
        Review review1 = new Review("","",5,restaurant);
        Review review2 = new Review("","",4,restaurant);
        Review review3 = new Review("","",3,restaurant);
        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant.addReview(review3);
        assertEquals(4,restaurant.getStars());
    }

    @Test
    public void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("McDonalds",5,2,new ArrayList<>());
        Review review1 = new Review("John Doe","The burger was just ok",3,restaurant);
        Review review2 = new Review("Jane Doe","The burger was just great",5,restaurant);
        Review review3 = new Review("Sarah Doe","The burger sucked",1,restaurant);
        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant.addReview(review3);

        System.out.println(restaurant);
        assertEquals("Restaurant Name: McDonalds\n" +
                "\n" +
                "# of Stars: 3\n" +
                "\n" +
                "Price Category: $$\n" +
                "\n" +
                "Reviews: \n" +
                "\n" +
                "\n" +
                "Author: John Doe\n" +
                "# of Stars: 3\n" +
                "Body: The burger was just ok\n" +
                "\n" +
                "Author: Jane Doe\n" +
                "# of Stars: 5\n" +
                "Body: The burger was just great\n" +
                "\n" +
                "Author: Sarah Doe\n" +
                "# of Stars: 1\n" +
                "Body: The burger sucked" ,restaurant.toString());
    }
}
