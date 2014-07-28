package de.is24.playground;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

/**
 * Created by CHeeren on 25.07.2014.
 */

// This class contains some failing and some successful tests.
// To separate the bad ones, the categorisation takes place on method level.
public class GreenAndRedCatTests {

    @Before
    public void setUp() throws Exception {

    }

    // Category is assigned to a single method
    @Category(RedCat.class)
    @Test
    public void testRed1() throws Exception {
        assertEquals("This test will fail", false, true);
    }
    @Category(RedCat.class)
    @Test
    public void testRed2() throws Exception {
        assertEquals("This test will fail", false, true);
    }
    @Category(RedCat.class)
    @Test
    public void testRed3() throws Exception {assertEquals("This test will fail", false, true);
    }

    @Test
    public void testGreen1() throws Exception {
        assertEquals("This test will succeed", true, true);
    }

    @Test
    public void testGreen2() throws Exception {
        assertEquals("This test will succeed", true, true);
    }

    @Test
    public void testGreen3() throws Exception {
        assertEquals("This test will succeed", true, true);
    }
}
