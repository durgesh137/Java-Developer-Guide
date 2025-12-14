package blind75.medium;

import samples.Display;

/**
 * 3. Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without duplicate characters.
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 *
 * CONCEPT USED: char as Array Index
 * For detailed explanation, see: concepts/char_as_array_index_explained.md
 */
public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        System.out.println("Longest Substring Without Repeating Characters");
        System.out.println("=".repeat(60));

        Display.printTestCase(1);
        String s = "abcabcbb";
        System.out.println("INPUT: " + s);
        System.out.println("OUTPUT: " + lengthOfLongestSubstring(s)); // Output: 3
        System.out.println("Explanation: Longest substring is 'abc' with length 3\n");

        Display.printTestCase(2);
        s = "bbbbb";
        System.out.println("INPUT: " + s);
        System.out.println("OUTPUT: " + lengthOfLongestSubstring(s)); // Output: 1
        System.out.println("Explanation: Longest substring is 'b' with length 1\n");

        Display.printTestCase(3);
        s = "pwwkew";
        System.out.println("INPUT: " + s);
        System.out.println("OUTPUT: " + lengthOfLongestSubstring(s)); // Output: 3
        System.out.println("Explanation: Longest substring is 'wke' or 'kew' with length 3\n");

        // Additional test case to demonstrate char-to-index conversion
        Display.printTestCase(4);
        System.out.println("=== Understanding char as array index ===");
        System.out.println("Character 'a' has ASCII value: " + (int)'a' + " (used as index[97])");
        System.out.println("Character 'b' has ASCII value: " + (int)'b' + " (used as index[98])");
        System.out.println("Character 'A' has ASCII value: " + (int)'A' + " (used as index[65])");
        System.out.println("Character '0' has ASCII value: " + (int)'0' + " (used as index[48])");
        System.out.println("Character ' ' has ASCII value: " + (int)' ' + " (used as index[32])");
        System.out.println("\nThis is why we use int[128] to cover all ASCII characters (0-127)");
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;

        // Array to store the last seen position of each character
        // Size 128 covers all ASCII characters (0-127)
        int[] index = new int[128];

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            /*
             * KEY CONCEPT: How char is used as array index?
             *
             * In Java, 'char' is a 16-bit numeric type representing Unicode characters.
             * When used in a numeric context, Java automatically converts char to int using its ASCII/Unicode value.
             *
             * Examples of implicit char to int conversion:
             * - 'a' → 97
             * - 'b' → 98
             * - 'A' → 65
             * - '0' → 48
             * - ' ' (space) → 32
             *
             * So when we write: index[currentChar]
             * Java actually does: index[(int)currentChar]
             *
             * Example: If currentChar = 'a', then index['a'] = index[97]
             * This allows us to use the character itself as a direct index into the array!
             */

            // Move start pointer if current character was seen before in the current window
            start = Math.max(index[currentChar], start);

            // Calculate the length of current substring (end - start + 1)
            maxLength = Math.max(maxLength, end - start + 1);

            // Store the next position where this character should be considered from
            // We store (end + 1) because if we see this char again, we want to start after this position
            index[currentChar] = end + 1;
        }
        return maxLength;
    }

}
