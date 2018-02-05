package gadgets.shrewd.core.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite collective for the individual function tests.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        Words_ReverseTest.class,
        Words_IntersectionTest.class
})
public class WordsTestSuite {
}
