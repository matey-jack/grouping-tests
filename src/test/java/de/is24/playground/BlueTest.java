package de.is24.playground;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

/**
 * Created by CHeeren on 25.07.2014.
 */

// This class contains some successful tests with category blue assigned
@Category(BlueCat.class)
public class BlueTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testBlue1() throws Exception {
        assertEquals("This test will succeed", true, true);
    }

    @Test
    public void testBlue2() throws Exception {
        assertEquals("This test will succeed", true, true);
    }

    @Test
    public void testBlue3() throws Exception {
        assertEquals("This test will succeed", true, true);
    }
}
