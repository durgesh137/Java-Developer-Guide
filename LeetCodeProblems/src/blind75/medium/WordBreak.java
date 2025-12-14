package blind75.medium;

import samples.Display;

import java.util.List;

/**
 * 139. Word Break
 * Medium
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 * Example 1:
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code"
 *
 * Example 2:
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 * Note that you are allowed to reuse a dictionary word.
 *
 * Example 3:
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 300
 * 1 <= wordDict.length <= 1000
 * 1 <= wordDict[i].length <= 20
 * s and wordDict[i] consist of only lowercase English letters.
 * All the strings of wordDict are unique
 */
public class WordBreak {
    public static void main(String[] args) {
        System.out.println("Word Break");
        String s = "abcdefg";
        List<String> wordDict = List.of("ab", "abc", "cd", "def", "abcd");
        Display.printTestCase(1);
        System.out.println("Input: s = " + s + ", wordDict = " + wordDict);
        printResults(wordBreak(s,wordDict),s);
    }

    private static void printResults(boolean result, String s) {
        if(result) {
            System.out.println("The string \"" + s + "\" can be segmented into a space-separated sequence of one or more dictionary words.");
        } else {
            System.out.println("The string \"" + s + "\" cannot be segmented into a space-separated sequence of one or more dictionary words.");
        }

    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict) {
                int wordLength = word.length();
                // Check if the word can fit in the current substring
                if (i >= wordLength && s.substring(i - wordLength, i).equals(word)) {
                    // Update dp[i] if dp[i - wordLength] is true
                    dp[i] = dp[i] || dp[i - wordLength];
                }
            }
        }

        return dp[s.length()];

    }
}
