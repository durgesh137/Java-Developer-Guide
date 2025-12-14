package blind75.medium;

import samples.Display;

/**
 * 152. Maximum Product Subarray
 * Medium
 * Given an integer array nums, find a subarray that has the largest product, and return the product.
 * here subarray is a contiguous non-empty sequence of elements within an array.
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 *
 * Note that the product of an array with a single element is the value of that element.
 *
 * Example 1:
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 *
 * Example 2:
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 *
 *
 * Constraints:
 * 1 <= nums.length <= 2 * 104
 * -10 <= nums[i] <= 10
 * The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
 */
public class MaximumProductSubArray {
    public static void main(String[] args) {
        System.out.println("Maximum Product Subarray:");

        Display.printTestCase(1);
        int[] nums = {2,3,-2,4};
        System.out.print("Input: ");
        Display.printArray(nums);
        System.out.println("Output: " + maxProduct(nums));
        System.out.println("Expected: 6 (subarray [2,3])");
        System.out.println();

        Display.printTestCase(2);
        int[] nums2 = {-2,0,-1};
        System.out.print("Input: ");
        Display.printArray(nums2);
        System.out.println("Output: " + maxProduct(nums2));
        System.out.println("Expected: 0");
        System.out.println();

        Display.printTestCase(3);
        int[] nums3 = {-2,3,-4};
        System.out.print("Input: ");
        Display.printArray(nums3);
        System.out.println("Output: " + maxProduct(nums3));
        System.out.println("Expected: 24 (entire array: -2 * 3 * -4)");
        System.out.println();

        Display.printTestCase(4);
        int[] nums4 = {2,-5,-2,-4,3};
        System.out.print("Input: ");
        Display.printArray(nums4);
        System.out.println("Output: " + maxProduct(nums4));
        System.out.println("Expected: 24 (subarray [-5,-2,-4] or [2,-5,-2,-4])");
    }

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Store old values before updating
            int tempMax = currentMax;
            int tempMin = currentMin;

            // Calculate new max: either start fresh with nums[i],
            // or continue with previous max/min multiplied by nums[i]
            // (min * negative can become max)
            currentMax = Math.max(nums[i], Math.max(tempMax * nums[i], tempMin * nums[i]));
            currentMin = Math.min(nums[i], Math.min(tempMax * nums[i], tempMin * nums[i]));

            maxProduct = Math.max(maxProduct, currentMax);
        }
        return maxProduct;
    }
}
