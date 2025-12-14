package blind75.medium;

/**
 * 5. Longest Palindromic Substring
 * Given a string s, return the longest palindromic substring in s.
 * NOTE- A palindrome is a string that reads the same backward as forward.
 *
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        System.out.println("Longest Palindromic Substring");
        System.out.println("=".repeat(60));

        String s1 = "babad";
        System.out.println("INPUT: " + s1);
        System.out.println("OUTPUT: " + longestPalindrome(s1)); // Output: "bab" or "aba"
        System.out.println();

        String s2 = "cbbd";
        System.out.println("INPUT: " + s2);
        System.out.println("OUTPUT: " + longestPalindrome(s2)); // Output: "bb"
        System.out.println();
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
