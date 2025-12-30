package problemset.slidingwindow;

/**
 * 3. Longest Substring Without Repeating Characters
 * Medium
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 10^4
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringWithoutRepeatingChars_3 {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingChars_3 obj = new LongestSubstringWithoutRepeatingChars_3();

        String s1 = "abcabcbb";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + obj.lengthOfLongestSubstring(s1)); // Output: 3

        String s2 = "bbbbb";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + obj.lengthOfLongestSubstring(s2)); // Output: 1

        String s3 = "pwwkew";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + obj.lengthOfLongestSubstring(s3)); // Output: 3
    }


    public int lengthOfLongestSubstring(String s) {
        if(null == s || s.length() == 0)
            return 0;

        int maxLength = 0;
        int start = 0; // start index of current window
        //cover 128 ascii characters, 0-> not seen, last index + 1
        int lastSeen[] = new int[128];
        //idea should be update count of each character within ascii [], if found

        //"abcabcbb"
        for(int i = 0; i < s.length(); i++){
            int asciiValue = s.charAt(i);
            // move start past previous occurrence if inside window
            start = Math.max(start, lastSeen[asciiValue]);
            maxLength = Math.max(maxLength, i - start + 1);
            lastSeen[asciiValue] = i+1;
        }
        return maxLength;
    }
}
