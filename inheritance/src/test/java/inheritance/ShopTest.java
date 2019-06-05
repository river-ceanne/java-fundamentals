package inheritance;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    @Test
    public void testShopDefaultConstructor() {
        Shop shop = new Shop();
        assertEquals("",shop.getName());
        assertEquals(0,shop.getStars());
        assertEquals("",shop.getDescription());
        assertEquals(0,shop.getDollarSigns());

    }


    @Test
    public void testShopConstructor() {
        Shop shop = new Shop("Roosevelt Field","Mall in Garden City",4,5,new ArrayList<>());
        assertEquals("Roosevelt Field",shop.getName());
        assertEquals(5,shop.getStars());
        assertEquals(new ArrayList<>(),shop.getReviews());
        assertEquals("Mall in Garden City",shop.getDescription());
        assertEquals(4,shop.getDollarSigns());

    }

    @Test
    public void testShopToString(){
        Shop shop = new Shop("Roosevelt Field","Mall in Garden City",4,0,new ArrayList<>());
        Review review1 = new Review("Bellevue Square","Great!",5,shop);
        Review review2 = new Review("Westlake Center","Kind of ok",4,shop);
        Review review3 = new Review("SouthCenter Mall","Could be better",3,shop);
        shop.addReview(review1);
        shop.addReview(review2);
        shop.addReview(review3);

        System.out.println(shop);

        assertEquals("Shop Name: Roosevelt Field\n" +
                "\n" +
                "Description: Mall in Garden City\n" +
                "\n" +
                "Rating: 4 out of 5 stars\n" +
                "\n" +
                "Affordability: $$$$\n" +
                "\n" +
                "Reviews: \n" +
                "Author: Bellevue Square\n" +
                "# of Stars: 5\n" +
                "Body: Great!\n" +
                "\n" +
                "Author: Westlake Center\n" +
                "# of Stars: 4\n" +
                "Body: Kind of ok\n" +
                "\n" +
                "Author: SouthCenter Mall\n" +
                "# of Stars: 3\n" +
                "Body: Could be better\n",shop.toString());
    }
}
