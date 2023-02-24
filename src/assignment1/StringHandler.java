package assignment1;

import java.util.Arrays;

public class StringHandler {

    /**
     * 
     * @param str
     * @return a string where all characters 'c' is replaced by the character 's'
     * Case insensitive.
     */
    public String stringManipulation(String str) {

        return str.replace("c", "s");
    }

    /**
     * 
     * @param str
     * @return the length of str
     * If the input str is null or "" you must return 0
     * 
     */
    public int stringLength(String str) {

        String alphabeat = "abcdefghijklmnopgrstuvxyzæå";

        if (str.contains(alphabeat)) {
            return str.length();
        } else return 0;

    }

    /**
     * 
     * @param arr
     * @return the cumulative length of all strings in arr
     * e.g. if arr is ["hi","hello","hej"] the method should return 10
     */
    public int stringArrayLength(String[] arr) {

        int cumulativeLength = 0;
        String cumulativeLengthOfStringsInArray = "";

        for (int i = 0; i < arr.length; i++) {
            cumulativeLengthOfStringsInArray += arr.toString().charAt(i);
        }
        for (int i = 0; i < cumulativeLengthOfStringsInArray.length(); i++) {
            cumulativeLength ++;
        }

        return cumulativeLength;
    }

    /**
     * 
     * @param str
     * @return reverse the characters in the String str
     * e.g. "Hello" -> "olleH"
     */
    public String stringReverse(String str) {

        char batman;
        String binSuperman = "";

        for (int i = 0; i < str.length(); i++) {
            batman = str.charAt(i);
            binSuperman = batman + binSuperman;
        }
            return binSuperman;
    }

    /**
     * 
     * @param str any string
     * @param c the character to count
     * @return how many occurences of the character c in the String str
     * The method should not be case sensitive.
     * e.g. parameters: "Change comes through passion", 'g' should return 2
     */
    public int charCount(String str, char c) {

        int occurences = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                occurences++;
            }

        }
        return occurences;
    }

    /**
     * Returns a string that contains exactly the amount of chars c, as stated by the given amount. So if amount => 4 and
     * char => c then the return value must be "cccc". If amount => 3 and c => X then the return value must be "XXX".
     *
     * @param amount The amount of chars in the return string
     * @param c      The chars the return string must consist of
     * @return The string created using the given parameters.
     */
    public String stringOfChars(int amount, char c) {
        //TODO Delete line below, and implement this method
        throw new UnsupportedOperationException();
    }


}
