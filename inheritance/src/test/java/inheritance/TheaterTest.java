package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TheaterTest {
    @Test
    public void testTheaterDefaultConstructor() {
        Theater theater = new Theater();
        assertEquals("",theater.getName());
        assertEquals(0,theater.getStars());
        assertEquals(new ArrayList<>(),theater.getMovies());
        assertEquals(new ArrayList<>(),theater.getReviews());

    }

}
