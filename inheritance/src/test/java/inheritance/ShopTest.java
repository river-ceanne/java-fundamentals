package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    @Test
    public void testTheaterDefaultConstructor() {
        Shop shop = new Shop();
        assertEquals("",shop.getName());
        assertEquals(0,shop.getStars());
        assertEquals(new ArrayList<>(),shop.getReviews());
        assertEquals("",shop.getDescription());
        assertEquals(0,shop.getDollarSigns());

    }
}
