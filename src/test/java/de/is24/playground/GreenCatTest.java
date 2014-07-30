package de.is24.playground;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by CHeeren on 25.07.2014.
 */

// This class contains some successful tests
// Although it has "Cat" in its name, it actually doesn't contain any categories
public class GreenCatTest {

    @Before
    public void setUp() throws Exception {

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
