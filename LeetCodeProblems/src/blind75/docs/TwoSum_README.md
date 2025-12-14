# Problem 1: Two Sum

[← Back to Blind 75 Problems](../BLIND75_README.md)

---

## Problem Statement

**LeetCode Problem #1** - [Two Sum](https://leetcode.com/problems/two-sum/)

Given an array of integers `nums` and an integer `target`, return **indices** of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

**Constraints:**
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

---

## Examples

### Example 1:
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9
```

### Example 2:
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
Explanation: nums[1] + nums[2] = 2 + 4 = 6
```

### Example 3:
```
Input: nums = [3,3], target = 6
Output: [0,1]
Explanation: nums[0] + nums[1] = 3 + 3 = 6
```

### Example 4 (Negative Numbers):
```
Input: nums = [-5,3,10,-2,8], target = 5
Output: [0,4]
Explanation: nums[0] + nums[4] = -5 + 10 = 5
```

### Example 5 (Two Negatives):
```
Input: nums = [-1,-2,-3,-4,-5], target = -8
Output: [2,4]
Explanation: nums[2] + nums[4] = -3 + (-5) = -8
```

---

## Algorithm: Hash Map (One-Pass)

### Core Idea
Use a **HashMap** to store previously seen numbers and their indices, allowing O(1) lookup for the complement of the current number.

### Key Insight
For each number `nums[i]`, we need to find if `complement = target - nums[i]` exists in the array before index `i`. By storing numbers as we iterate, we can check this in constant time.

### Step-by-Step Algorithm

1. **Create HashMap:** Initialize an empty HashMap to store `<number, index>` pairs

2. **Iterate through array:** For each element at index `i`:
   - Calculate `complement = target - nums[i]`
   - Check if `complement` exists in the HashMap
   - If **YES**: Return `[map.get(complement), i]`
   - If **NO**: Store `nums[i]` with its index in the HashMap

3. **Return Result:** Return the pair of indices found

---

## Pseudocode

```
function twoSum(nums, target):
    map = new HashMap()
    
    for i from 0 to nums.length - 1:
        complement = target - nums[i]
        
        if complement exists in map:
            return [map.get(complement), i]
        
        map.put(nums[i], i)
    
    return [-1, -1]  // no solution found (won't happen per constraints)
```

---

## Complexity Analysis

### Time Complexity: **O(n)**
- Single pass through the array: O(n)
- HashMap operations (get, put): O(1) average
- Overall: **O(n)**

### Space Complexity: **O(n)**
- HashMap stores at most n elements: O(n)

---

## Walkthrough Example

**Input:** `nums = [2, 7, 11, 15], target = 9`

**Step-by-Step Execution:**

| i | nums[i] | complement | map before | complement in map? | Action | Result |
|---|---------|------------|------------|-------------------|--------|--------|
| 0 | 2       | 9 - 2 = 7  | {}         | No                | Add 2→0 | map={2:0} |
| 1 | 7       | 9 - 7 = 2  | {2:0}      | **Yes** (index 0) | **Return [0,1]** | **[0,1]** |

**Output:** `[0, 1]`

---

## Walkthrough with Negative Numbers

**Input:** `nums = [-5, 3, 10, -2, 8], target = 5`

**Step-by-Step Execution:**

| i | nums[i] | complement | map before | complement in map? | Action | Result |
|---|---------|------------|------------|-------------------|--------|--------|
| 0 | -5      | 5 - (-5) = 10 | {}      | No                | Add -5→0 | map={-5:0} |
| 1 | 3       | 5 - 3 = 2     | {-5:0}  | No                | Add 3→1  | map={-5:0, 3:1} |
| 2 | 10      | 5 - 10 = -5   | {-5:0, 3:1} | **Yes** (index 0) | **Return [0,2]** | **[0,2]** |

**Output:** `[0, 2]`  
**Verification:** `nums[0] + nums[2] = -5 + 10 = 5` ✓

---

## Why This Works

1. **Single Pass Efficiency:** We only need to iterate through the array once, checking for complements as we go

2. **O(1) Lookup:** HashMap provides constant-time lookup, making it faster than nested loops

3. **Handles All Cases:** Works for:
   - Positive numbers
   - Negative numbers  
   - Mix of positive and negative
   - Zero values
   - Large values (up to 10^9)

4. **No Duplicates Issue:** Since we store numbers as we iterate and check before storing, we naturally avoid using the same element twice

---

## Alternative Approaches

### Approach 1: Brute Force (Not Optimal)
```java
// Two nested loops
for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
            return new int[]{i, j};
        }
    }
}
```
- **Time:** O(n²) ❌ (Too slow)
- **Space:** O(1) ✓

### Approach 2: Sort + Two Pointer (Changes indices)
- Sort array with indices: O(n log n)
- Use two pointers: O(n)
- **Total:** O(n log n) ❌ (Slower than HashMap)
- **Issue:** Sorting changes original indices, requires extra tracking

### Approach 3: HashMap One-Pass (Optimal) ✓
- Current implementation
- **Time:** O(n) ✓
- **Space:** O(n) ✓

---

## Edge Cases Handled

✅ **Minimum array size:** `nums = [3,3], target = 6` → `[0,1]`  
✅ **Negative numbers:** `nums = [-1,-2,-3,-4,-5], target = -8` → `[2,4]`  
✅ **Mix positive/negative:** `nums = [-5,3,10,-2,8], target = 5` → `[0,4]`  
✅ **Zero values:** `nums = [0,4,3,0], target = 4` → `[0,1]`  
✅ **Large values:** `nums = [-1000000000, 1000000100], target = 100` → `[0,1]`  
✅ **Complement is larger:** `nums = [-100,105,-50,150], target = 5` → `[0,1]`

---

## Code Implementation

See: [`TwoSum.java`](../TwoSum.java)

**Key Method:**
```java
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
    return new int[]{-1, -1};
}
```

---

## Related Problems

- **167. Two Sum II - Input Array Is Sorted** (Two Pointer approach works better)
- **15. 3Sum** (Extension with triplets)
- **18. 4Sum** (Further extension)
- **454. 4Sum II** (HashMap for multiple arrays)

---

## Tags
`Array` `Hash Table` `Blind 75` `Easy` `O(n) Time` `HashMap`

---

[← Back to Blind 75 Problems](../BLIND75_README.md) | [Next Problem →](../BLIND75_README.md)

