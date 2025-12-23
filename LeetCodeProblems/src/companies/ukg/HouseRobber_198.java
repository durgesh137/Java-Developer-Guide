package companies.ukg;

/**
 * 198. House Robber
 * https://leetcode.com/problems/house-robber/description/
 * Medium
 * Companies
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 *
 *
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * Example 2:
 *
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class HouseRobber_198 {
    public static void main(String[] args) {
        HouseRobber_198 obj = new HouseRobber_198();
        int[] nums = {2,7,9,3,1};
        System.out.println("Actual: "+obj.rob(nums));
        System.out.println("Expected: 12");
        nums = new int[]{3,2,1,4};
        System.out.println("Actual: "+obj.rob(nums));
        System.out.println("Expected: 7");
    }

    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int prev = 0;// holds max total i-2
        int curr = 0;// holds max total till i-1
        //3,2,1,4
        for(int num : nums){
            int next = Math.max(curr, prev + num);//here next becomes i, either it picks curr(i-1) or prev + num (i-2 + current house value)
            prev = curr;//here prev becomes i-1
            curr = next;//here curr becomes i
        }
        return curr;
    }
}


/**
 * Interview discussion link-
 * https://leetcode.com/discuss/post/6890422/ukg-lead-software-engineer-sde-3-intervi-bjzg/
 * https://leetcode.com/discuss/post/5711973/ukg-senior-software-engineer-noida-by-an-484w/
 */