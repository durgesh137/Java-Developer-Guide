package blind75.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode Problem 1: Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * Constraints:
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        // Test Case 1: Basic positive numbers
        System.out.println("Test Case 1: Basic positive numbers");
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = ts.twoSum(nums1, target1);
        System.out.println("Input: nums = [2,7,11,15], target = 9");
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Explanation: nums[" + result1[0] + "] + nums[" + result1[1] + "] = " +
                           nums1[result1[0]] + " + " + nums1[result1[1]] + " = " + target1);
        System.out.println();

        // Test Case 2: Two negative numbers sum to positive
        System.out.println("Test Case 2: Two negative numbers sum to positive");
        int[] nums2 = {-1, -2, -3, -4, -5};
        int target2 = -8;
        int[] result2 = ts.twoSum(nums2, target2);
        System.out.println("Input: nums = [-1,-2,-3,-4,-5], target = -8");
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");
        System.out.println("Explanation: nums[" + result2[0] + "] + nums[" + result2[1] + "] = " +
                           nums2[result2[0]] + " + " + nums2[result2[1]] + " = " + target2);
        System.out.println();

        // Test Case 3: Negative + Positive = Positive
        System.out.println("Test Case 3: Negative + Positive = Positive");
        int[] nums3 = {-5, 3, 10, -2, 8};
        int target3 = 5;
        int[] result3 = ts.twoSum(nums3, target3);
        System.out.println("Input: nums = [-5,3,10,-2,8], target = 5");
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
        System.out.println("Explanation: nums[" + result3[0] + "] + nums[" + result3[1] + "] = " +
                           nums3[result3[0]] + " + " + nums3[result3[1]] + " = " + target3);
        System.out.println();

        // Test Case 4: Large negative + Small negative = Positive (edge case)
        System.out.println("Test Case 4: Two negatives that can sum to positive");
        int[] nums4 = {-100, 105, -50, 150};
        int target4 = 5;
        int[] result4 = ts.twoSum(nums4, target4);
        System.out.println("Input: nums = [-100,105,-50,150], target = 5");
        System.out.println("Output: [" + result4[0] + ", " + result4[1] + "]");
        System.out.println("Explanation: nums[" + result4[0] + "] + nums[" + result4[1] + "] = " +
                           nums4[result4[0]] + " + " + nums4[result4[1]] + " = " + target4);
        System.out.println();

        // Test Case 5: Negative + Large Positive = Positive
        System.out.println("Test Case 5: Negative + Large Positive = Positive");
        int[] nums5 = {-1000000000, 1000000100, 50, -75};
        int target5 = 100;
        int[] result5 = ts.twoSum(nums5, target5);
        System.out.println("Input: nums = [-1000000000,1000000100,50,-75], target = 100");
        System.out.println("Output: [" + result5[0] + ", " + result5[1] + "]");
        System.out.println("Explanation: nums[" + result5[0] + "] + nums[" + result5[1] + "] = " +
                           nums5[result5[0]] + " + " + nums5[result5[1]] + " = " + target5);
        System.out.println();

        // Test Case 6: Zero + Positive = Positive
        System.out.println("Test Case 6: Zero + Positive = Positive");
        int[] nums6 = {0, 4, 3, 0};
        int target6 = 4;
        int[] result6 = ts.twoSum(nums6, target6);
        System.out.println("Input: nums = [0,4,3,0], target = 4");
        System.out.println("Output: [" + result6[0] + ", " + result6[1] + "]");
        System.out.println("Explanation: nums[" + result6[0] + "] + nums[" + result6[1] + "] = " +
                           nums6[result6[0]] + " + " + nums6[result6[1]] + " = " + target6);
        System.out.println();
    }

    public int[] twoSum(int[] nums, int target) {
        return withExtraSpace(nums, target);

    }

    private int[] withExtraSpace(int[] nums, int target) {
        Map<Integer,Integer> numWithIndexMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int numNeeded = target - nums[i];
            if(numWithIndexMap.containsKey(numNeeded)){
                return new int[]{numWithIndexMap.get(numNeeded), i};
            } else {
                numWithIndexMap.put(nums[i], i);
            }
        }
        return new int[]{-1, -1}; // return invalid indices if no solution found
    }
}
