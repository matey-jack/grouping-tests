package de.is24.playground;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by CHeeren on 25.07.2014.
 */

    // This class represents a normal test suite containing some test classes that
    // contain successful tests and also some failing ones.
    // Goal is to exclude the failing ones and let them run in a "repair lane"

    @RunWith(Categories.class)
    @Categories.ExcludeCategory(RedCat.class)
    @Suite.SuiteClasses({
            RedCatTest.class,
            GreenCatTest.class,
            GreenAndRedCatTest.class
    })

    public class StandardTestSuite {
    }
