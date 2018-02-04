package gadgets.shrewd.core.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class focused on the Words.reverse() function.
 */
public class Words_ReverseTest {

    @Test
    public void return_empty_string_with_absent_input() {
        assertEquals("NULL input should return empty string",
                "", Words.reverse(null));
        assertEquals("Empty string input should return empty string",
                "", Words.reverse(""));
        assertEquals("Whitespace only input should return empty string",
                "", Words.reverse("   "));
    }
}
