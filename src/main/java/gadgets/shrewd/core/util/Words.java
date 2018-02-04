package gadgets.shrewd.core.util;

import java.util.Objects;

/**
 * Utility class containing static word manipulation functions.
 */
public class Words {

    /**
     * Reverses the supplied string, assumed to be a standard English sentence,
     * based on the boundaries of words; punctuation will also be reversed.
     *
     * Removes all leading/tailing whitespace before reversal.
     *
     * @param sentence Sentence to reverse, e.g. "Hello, World!" becomes "!World, Hello"
     * @return Reversed sentence, or empty String.
     */
    public static String reverse(String sentence) {
        //Handle absent sentence.
        sentence = Objects.isNull(sentence) ? "" : sentence.trim();

        //Exit fast if empty.
        if (sentence.isEmpty())
            return "";

        //Spilt into an array based on word boundary Regular Expression
        String[] split = sentence.trim().split("\\b");
        int len = split.length;

        //Temporary, single word holder during reversal.
        String word;
        //Iterate through list, swapping positions of words; doesn't load second array into memory.
        for (int i = 0; i < (len/2); i++) {
            //save original word
            word = split[i];

            //calculate swap position
            int swap = len - (i + 1);

            //swap word positions
            split[i] = split[swap];
            split[swap] = word;

        }

        //Reassemble sentence; internal word boundaries were preserved so don't inject a delimiter.
        return String.join("", split);
    }
}
