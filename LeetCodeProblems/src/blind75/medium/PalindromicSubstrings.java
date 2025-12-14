package blind75.medium;

/**
 * 647. Palindromic Substrings
 * Given a string s, return the number of palindromic substrings in it.
 *
 * A string is a palindrome when it reads the same backward as forward.
 * A substring is a contiguous sequence of characters within the string.
 *
 *
 *
 * Example 1:
 * Input: s = "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 * Example 2:
 * Input: s = "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 *
 * Constraints:
 * 1 <= s.length <= 1000
 * s consists of lowercase English letters.
 */
public class PalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println(new PalindromicSubstrings().countSubstrings("abc")); // 3
        System.out.println(new PalindromicSubstrings().countSubstrings("aaa")); // 6

    }

    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        // There are 2n-1 centers for palindromes in a string of length n
        for (int center = 0; center < 2 * n - 1; center++) {
            // Expand around the center
            int left = center / 2;
            // If center is even, right = left; if center is odd, right = left + 1
            int right = left + center % 2;
            count += expandAroundCenter(s, left, right);
        }
        return count;
    }

    /**
     * Expands around the given center and counts all palindromic substrings found.
     *
     * @param s the input string
     * @param left the left pointer of the center
     * @param right the right pointer of the center
     * @return the count of palindromic substrings found by expanding from this center
     */
    private int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        // Expand while the characters at left and right are equal
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
