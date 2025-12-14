package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 3Sum
 * Medium
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Example 1:
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 *
 * Example 2:
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 *
 * Example 3:
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 *
 * Constraints:
 *
 * 3 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */
public class ThreeSum {

    /**
     * Finds all unique triplets in the array that sum to zero.
     * Uses two-pointer approach after sorting the array.
     *
     * @param nums the input array
     * @return list of all unique triplets that sum to zero
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to use two-pointer approach
        Arrays.sort(nums);

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointer approach for remaining elements
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, move left pointer to increase sum
                    left++;
                } else {
                    // Sum is too large, move right pointer to decrease sum
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Three Sum:");
        System.out.println("=".repeat(50));

        // Test case 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("\nTest Case 1:");
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + threeSum(nums1));
        System.out.println("Expected: [[-1, -1, 2], [-1, 0, 1]]");

        // Test case 2
        int[] nums2 = {0, 1, 1};
        System.out.println("\nTest Case 2:");
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + threeSum(nums2));
        System.out.println("Expected: []");

        // Test case 3
        int[] nums3 = {0, 0, 0};
        System.out.println("\nTest Case 3:");
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + threeSum(nums3));
        System.out.println("Expected: [[0, 0, 0]]");

        // Test case 4: All negative numbers
        int[] nums4 = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        System.out.println("\nTest Case 4:");
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("Output: " + threeSum(nums4));
        System.out.println("Expected: [[-4, -2, 6], [-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-2, -2, 4], [-2, 0, 2]]");

        // Test case 5: Single triplet
        int[] nums5 = {-2, 0, 1, 1, 2};
        System.out.println("\nTest Case 5:");
        System.out.println("Input: " + Arrays.toString(nums5));
        System.out.println("Output: " + threeSum(nums5));
        System.out.println("Expected: [[-2, 0, 2], [-2, 1, 1]]");

        // Test case 6: No solution
        int[] nums6 = {1, 2, 3};
        System.out.println("\nTest Case 6:");
        System.out.println("Input: " + Arrays.toString(nums6));
        System.out.println("Output: " + threeSum(nums6));
        System.out.println("Expected: []");

        System.out.println("\n" + "=".repeat(50));
    }
}
