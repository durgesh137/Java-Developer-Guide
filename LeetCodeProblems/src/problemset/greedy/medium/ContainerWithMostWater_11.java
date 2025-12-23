package problemset.greedy.medium;

/**
 * 11. Container With Most Water
 * Medium
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case,
 * the max area of water (blue section) the container can contain is 49.
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 *
 *
 * Constraints:
 *
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */
public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        System.out.println("Container With Most Water");
        int arr[] = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater_11 obj = new ContainerWithMostWater_11();
        int result = obj.maxArea(arr);
        System.out.println("Max Area: " + result);
        System.out.println("Expected: 49");
    }

    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
            return 0;
        // for max width lets use two pointer approach
        int left =0, right = height.length -1;
        int maxArea = 0;
        while(left < right){
            int maxHeight = Math.min(height[left], height [right]);
            int width = right - left;
            int area = maxHeight * width;
            maxArea = Math.max(maxArea, area);
            //lets move the pointer which has less height
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    /**
     * Understanding-
     * lets discuss this problem don't provide code here idea is get maximum width so gap between two elements should maximum at the same time maximum height such that if max heights are found then lower value should be used for height. therefore ensure width is max and height as well, then get the result as product of both.
     * It is based on greedy algo hence at each index, I need to look for both max height and max width if possible.
     * how should I approach it get max width and height at each element
     *
     * Approach-
     * Area = width * height = (r - l) * min(height[l], height[r]).
     * Want the maximum area over all pairs (l < r).
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
}
