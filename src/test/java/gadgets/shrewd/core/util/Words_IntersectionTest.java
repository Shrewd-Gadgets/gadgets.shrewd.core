package gadgets.shrewd.core.util;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Test class focused on exercising the Words.intersection() function.
 */
public class Words_IntersectionTest {

    @Test
    public void return_empty_string_with_absent_input() {
        assertEquals("NULL primary returns empty Optional",
                "",
                Words.intersection(null, "something"));
        assertEquals("NULL secondary returns empty Optional",
                "",
                Words.intersection("something", null));

        assertEquals("NULL primary returns empty Optional",
                "",
                Words.intersection(null, ""));
        assertEquals("NULL secondary returns empty Optional",
                "",
                Words.intersection("", null));

        assertEquals("Empty primary returns empty Optional",
                "",
                Words.intersection("", "something"));
        assertEquals("NULL secondary returns empty Optional",
                "",
                Words.intersection("something", ""));

        assertEquals("NULL strings returns empty Optional",
                "",
                Words.intersection(null, null));
        assertEquals("Empty strings returns empty Optional",
                "",
                Words.intersection("", ""));
    }

    @Test
    public void return_empty_string_for_non_intersecting_strings() {
        String primary = "NONE,";
        String secondary = "common ";
        String expected = "";

        assertEquals("The inputs should have nothing in common",
                expected, Words.intersection(primary, secondary));
    }

    @Test
    public void find_a_simple_intersection() {
        String primary = "One";
        String secondary = "Common";
        String expected = "n";

        assertEquals("Could not isolate the 'n' character",
                expected, Words.intersection(primary, secondary));
    }

    @Test
    public void find_a_complex_intersection() {
        String primary = "There are, sometimes, a gathering of Honorable Intentions.";
        String secondary = "However!  It doesn't always work.";
        String expected = " aeHIln.orst";

        assertEquals("The inputs should have nothing in common",
                expected, Words.intersection(primary, secondary));
    }

    @Test
    public void setify__return_empty_set_with_absent_string() {
        Set<Character> result = Words.setify(null);
        assertNotNull("Returned set should not be null", result);
        assertTrue("Returned set should be empty", result.isEmpty());
    }

    @Test
    public void setify__return_a_set_with_characters() {
        String input = "This is a sample string to setify.";
        Set<Character> expected = new HashSet<>(Arrays.asList(
                'T', 'h','i', 's', ' ', 'a', 's', 'm', 'p', 'l', 'e', 't',
                'r', 'n', 'g', 'o', 'f', 'y', '.'));

        assertEquals("Unable to isolate all the unique characters",
                expected, Words.setify(input));
    }
}
