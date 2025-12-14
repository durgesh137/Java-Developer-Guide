package blind75.medium;

import samples.Display;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode Problem 128: Longest Consecutive Sequence
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Display.printTestCase(1);
        Display.printArray(nums);
        System.out.println("Length of Longest Consecutive Sequence: " + longestConsecutive(nums));
        Display.printTestCase(2);
        nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        Display.printArray(nums);
        System.out.println("Length of Longest Consecutive Sequence: " + longestConsecutive(nums));

    }

    private static int longestConsecutive(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }
        /** 100, 4, 200, 1, 3, 2
         * 100 longestStreak = 1
         * 4, 3 present, 5 not present
         * 200 longestStreak = 1
         * 1
         */
        //lets find the longest consecutive sequence
        int longestStreak = 0;
        for (int num : uniqueSet) {
            if (!uniqueSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                //lets continue the streak till we find the next consecutive number
                while (uniqueSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;

    }
}
