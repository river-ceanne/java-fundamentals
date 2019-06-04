package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReviewTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
