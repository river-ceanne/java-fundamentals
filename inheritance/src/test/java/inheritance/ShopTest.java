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
        Shop shop = new Shop("Roosevelt Field","Mall in Garden City",4,5,new ArrayList<>());
        System.out.println(shop);
    }
}
