package de.is24.playground;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by CHeeren on 25.07.2014.
 */

    // This class is a test suite which includes all failing tests
    // of category "RedCat"

    @RunWith(Categories.class)
    @Categories.IncludeCategory(RedCat.class)
    @Suite.SuiteClasses({
            RedCatTests.class,
            GreenCatTests.class,
            GreenAndRedCatTests.class
    })

    public class RedTestSuite {
    }
