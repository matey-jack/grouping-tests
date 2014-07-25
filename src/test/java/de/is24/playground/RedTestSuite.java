package de.is24.playground;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by CHeeren on 25.07.2014.
 */

    // This class is a test suite which is actually a copy of "StandardTestSuite" containing
    // the same test classes.
    // However, only the failing tests of category "RedCat" will be executed here.

    @RunWith(Categories.class)
    @Categories.IncludeCategory(RedCat.class)
    @Suite.SuiteClasses({
            RedCatTests.class,
            GreenCatTests.class,
            GreenAndRedCatTests.class
    })

    public class RedTestSuite {
    }
