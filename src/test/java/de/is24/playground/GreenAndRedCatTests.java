package de.is24.playground;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

/**
 * Created by CHeeren on 25.07.2014.
 */
public class GreenAndRedCatTests {

    @Before
    public void setUp() throws Exception {
        System.out.print("This class contains some failing and some successful tests");
    }

    // Category is assigned to a single method
    @Category(RedCat.class)
    @Test
    public void testRed1() throws Exception {
        assertEquals("This test will fail", true, false);
    }
    @Category(RedCat.class)
    @Test
    public void testRed2() throws Exception {
        assertEquals("This test will fail", true, false);
    }
    @Category(RedCat.class)
    @Test
    public void testRed3() throws Exception {
        assertEquals("This test will fail", true, false);
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
