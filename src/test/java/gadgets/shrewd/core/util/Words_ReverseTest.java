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

    @Test
    public void return_single_worded_sentence() {
        assertEquals("Failed to return original string",
                "sAmplE", Words.reverse("sAmplE  "));
    }

    @Test
    public void reverse_a_simple_sentence() {
        assertEquals("Failed to reverse a three word (odd numbered) sentence",
                "!gadgets shrewd, Hello",
                Words.reverse("Hello, shrewd gadgets!"));

        assertEquals("Failed to reverse a four word (even numbered) sentence",
                "!gadgets shrewd, again Hello",
                Words.reverse("Hello again, shrewd gadgets!"));
    }

    @Test
    public void reverse_a_longer_sentence() {
        String gba = "Fourscore and seven years ago our fathers brought forth, on this continent, a new nation, " +
                "conceived in liberty, and dedicated to the proposition that all men are created equal.";

        String rev = ".equal created are men all that proposition the to dedicated and, liberty in conceived, " +
                "nation new a, continent this on, forth brought fathers our ago years seven and Fourscore";
        assertEquals("Failed to reverse the Gettysburg Address",
                rev, Words.reverse(gba));
    }
}
