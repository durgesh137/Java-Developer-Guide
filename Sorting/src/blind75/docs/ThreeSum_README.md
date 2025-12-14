# 15. 3Sum

## Problem Statement
Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

## Examples

### Example 1:
```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
```

### Example 2:
```
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
```

### Example 3:
```
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
```

## Constraints
- `3 <= nums.length <= 3000`
- `-10^5 <= nums[i] <= 10^5`

## Approach: Two-Pointer Technique

### Algorithm
1. **Sort the array** - This allows us to use the two-pointer technique and skip duplicates easily
2. **Fix the first element** - Iterate through the array with index `i`
3. **Skip duplicates** for the first element - If `nums[i] == nums[i-1]`, continue to next iteration
4. **Use two pointers** for remaining elements:
   - `left = i + 1` (points to element after current)
   - `right = nums.length - 1` (points to last element)
5. **Calculate sum** = `nums[i] + nums[left] + nums[right]`
6. **Three cases**:
   - If sum == 0: Add triplet to result, skip duplicates for both pointers, move both pointers
   - If sum < 0: Move left pointer right (to increase sum)
   - If sum > 0: Move right pointer left (to decrease sum)

### Key Insights
- **Sorting is crucial**: Enables two-pointer approach and easy duplicate handling
- **Duplicate handling**: Skip duplicates at all three positions to avoid duplicate triplets
- **Two-pointer optimization**: Instead of checking all pairs (O(n²)), we use sorted property to find pairs in O(n)

## Complexity Analysis

### Time Complexity: O(n²)
- Sorting: O(n log n)
- Main loop: O(n) iterations
- Each iteration: O(n) for two-pointer traversal
- Total: O(n log n) + O(n²) = O(n²)

### Space Complexity: O(1) or O(n)
- O(1) extra space if we don't count the output array
- O(n) for sorting if using Java's Arrays.sort() (uses O(log n) stack space for quicksort)

## Pattern Used
- **Two-Pointer Pattern**: [Pattern001_TwoPointerPattern.java](../patterns/Pattern001_TwoPointerPatten.java)

## Related Problems
- [Two Sum](TwoSum_README.md)
- Four Sum (4Sum)
- 3Sum Closest

## Tags
`Array` `Two Pointers` `Sorting` `Blind 75`

