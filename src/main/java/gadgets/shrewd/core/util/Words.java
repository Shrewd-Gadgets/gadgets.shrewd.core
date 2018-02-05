package gadgets.shrewd.core.util;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

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


    /**
     * Accepts two strings and returns a string containing all the characters present in
     * both strings; this includes whitespace characters.
     *
     * If the Strings have no characters an empty String is returned.
     *
     * @param primary First string used for comparison, e.g. "HELLO, world!"
     * @param secondary Second string used for comparison, e.g. "hello, WORLD!"
     * @return String containing common characters, e.g. "LO, ol!"
     */
    public static String intersection(String primary, String secondary) {
        //Exit fast if inputs are absent
        if (Objects.isNull(primary) ||
                Objects.isNull(secondary) ||
                primary.isEmpty() ||
                secondary.isEmpty()) {
            return "";
        }

        //Exit fast if the inputs match exactly
        if (primary.equals(secondary))
            return primary;

        //Sets are naturally distinct so isolate the characters from each string.
        Set<Character> prime = setify(primary);
        Set<Character> other = setify(secondary);

        //Leverage Set function to remove unique characters from primary Set
        prime.retainAll(other);

        //If all characters removed, return empty string; otherwise join the common characters.
        return prime.isEmpty() ?
                "" :
                prime.stream()
                        .map(String::valueOf)
                        .sorted(String::compareTo)
                        .collect(Collectors.joining(""));
    }

    /**
     * Transforms a String into a Set of distinct Characters.
     *
     * Package-protected for testability.
     * @param input String to transform
     * @return Distinct collection of Characters
     */
    static Set<Character> setify(String input) {
        //Ensures there is always a String to transform, avoiding null exceptions.
        return Objects.isNull(input) ?
                Collections.emptySet() :
                input.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
    }
}
