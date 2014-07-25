package de.is24.playground;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

/**
 * Created by CHeeren on 25.07.2014.
 */
// This class contains some failing tests

// Category is assigned to the entire class with all containing tests
@Category(RedCat.class)
public class RedCatTests {

    @Before
    public void setUp() throws Exception {
            }

    @Test
    public void testGreen1() throws Exception {

        assertEquals("This test will succeed", true, false);
    }

    @Test
    public void testGreen2() throws Exception {

        assertEquals("This test will succeed", true, false);
    }

    @Test
    public void testGreen3() throws Exception {

        assertEquals("This test will succeed", true, false);
    }
}
