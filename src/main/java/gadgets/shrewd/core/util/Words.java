package gadgets.shrewd.core.util;

import java.util.Objects;

/**
 * Utility class containing static word manipulation functions.
 */
public class Words {

    /**
     * Reverses the supplied string, assumed to be a standard English sentence.
     *
     * Removes all tailing whitespace before reversal.
     *
     * @param sentence Sentence to reverse, e.g. "Hello, World!" becomes "World! Hello,"
     * @return Reversed sentence, or empty String.
     */
    public static String reverse(String sentence) {
        //Exit fast on null or empty.
        if (Objects.isNull(sentence) || sentence.isEmpty())
            return "";

        String trimmed = sentence.trim();
        return trimmed;
    }
}
