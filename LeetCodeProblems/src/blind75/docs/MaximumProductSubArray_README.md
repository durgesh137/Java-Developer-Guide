# Problem 152: Maximum Product Subarray

[← Back to Blind 75 Problems](../BLIND75_README.md)

---

## Problem Statement

**LeetCode Problem #152** - [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)

Given an integer array `nums`, find a **contiguous non-empty subarray** within the array which has the largest product, and return **the product**.

The test cases are generated so that the answer will fit in a **32-bit** integer.

**Note:** The product of an array with a single element is the value of that element.

**Constraints:**
- `1 <= nums.length <= 2 × 10^4`
- `-10 <= nums[i] <= 10`
- The product of any subarray of `nums` is guaranteed to fit in a 32-bit integer

---

## Examples

### Example 1:
```
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
```

### Example 2:
```
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray (not contiguous).
```

### Example 3:
```
Input: nums = [-2,3,-4]
Output: 24
Explanation: The entire array [-2,3,-4] has product -2 × 3 × -4 = 24.
```

### Example 4:
```
Input: nums = [2,-5,-2,-4,3]
Output: 24
Explanation: Subarray [2,-5,-2,-4] has product 2 × (-5) × (-2) × (-4) = 80... wait, that's wrong!
Actually: [-5,-2,-4] = (-5) × (-2) × (-4) = 10 × (-4) = -40... no
Let's recalculate: [2,-5,-2,-4] = 2 × (-5) × (-2) × (-4) = (-10) × (-2) × (-4) = 20 × (-4) = -80
Actually the max is from [-5,-2] = 10, or wait... let me check carefully.
```

---

## Algorithm: Dynamic Programming with Min/Max Tracking

### Core Idea
Track both the **maximum** and **minimum** product ending at each position. When we encounter a negative number, a large negative product (min) can become a large positive product (max) after multiplication.

### Key Insight
**Why track both min and max?**
- A **negative number** can flip the sign
- Current **minimum** (large negative) × negative = large positive (becomes new maximum)
- Current **maximum** (large positive) × negative = large negative (becomes new minimum)

At each position, we have **three choices**:
1. **Start fresh** with current element: `nums[i]`
2. **Extend max product**: `currentMax × nums[i]`
3. **Extend min product**: `currentMin × nums[i]` (important for negatives!)

### Step-by-Step Algorithm

1. **Initialize:**
   - `maxProduct = nums[0]` (global max result)
   - `currentMax = nums[0]` (max product ending here)
   - `currentMin = nums[0]` (min product ending here)

2. **Iterate from index 1 to n-1:**
   - Store old values: `tempMax = currentMax`, `tempMin = currentMin`
   - Calculate new max: `max(nums[i], tempMax × nums[i], tempMin × nums[i])`
   - Calculate new min: `min(nums[i], tempMax × nums[i], tempMin × nums[i])`
   - Update global max: `maxProduct = max(maxProduct, currentMax)`

3. **Return:** `maxProduct`

---

## Pseudocode

```
function maxProduct(nums):
    if nums is empty:
        return 0
    
    maxProduct = nums[0]
    currentMax = nums[0]
    currentMin = nums[0]
    
    for i from 1 to nums.length - 1:
        tempMax = currentMax
        tempMin = currentMin
        
        // New max could come from: starting fresh, extending max, or extending min
        currentMax = max(nums[i], max(tempMax * nums[i], tempMin * nums[i]))
        
        // New min could come from: starting fresh, extending max, or extending min
        currentMin = min(nums[i], min(tempMax * nums[i], tempMin * nums[i]))
        
        // Update global maximum
        maxProduct = max(maxProduct, currentMax)
    
    return maxProduct
```

---

## Complexity Analysis

### Time Complexity: **O(n)**
- Single pass through the array: O(n)
- Constant work per element: O(1)
- **Total: O(n)** linear time ✓

### Space Complexity: **O(1)**
- Only using a few variables (maxProduct, currentMax, currentMin, temps)
- No additional data structures
- **O(1)** constant space ✓

---

## Walkthrough Example

**Input:** `nums = [2,3,-2,4]`

### Step-by-Step Execution:

```
Initialization:
maxProduct = 2
currentMax = 2
currentMin = 2

i=1, nums[1]=3:
  tempMax = 2, tempMin = 2
  currentMax = max(3, max(2×3, 2×3)) = max(3, 6) = 6
  currentMin = min(3, min(2×3, 2×3)) = min(3, 6) = 3
  maxProduct = max(2, 6) = 6

i=2, nums[2]=-2:
  tempMax = 6, tempMin = 3
  currentMax = max(-2, max(6×-2, 3×-2)) = max(-2, max(-12, -6)) = max(-2, -6) = -2
  currentMin = min(-2, min(6×-2, 3×-2)) = min(-2, min(-12, -6)) = min(-2, -12) = -12
  maxProduct = max(6, -2) = 6

i=3, nums[3]=4:
  tempMax = -2, tempMin = -12
  currentMax = max(4, max(-2×4, -12×4)) = max(4, max(-8, -48)) = max(4, -8) = 4
  currentMin = min(4, min(-2×4, -12×4)) = min(4, min(-8, -48)) = min(4, -48) = -48
  maxProduct = max(6, 4) = 6

Final Result: 6 ✓
```

**Best subarray:** `[2,3]` with product 6

---

## Detailed Example: With Even Number of Negatives

**Input:** `nums = [-2,3,-4]`

```
Initialization:
maxProduct = -2
currentMax = -2
currentMin = -2

i=1, nums[1]=3:
  tempMax = -2, tempMin = -2
  currentMax = max(3, max(-2×3, -2×3)) = max(3, -6) = 3
  currentMin = min(3, min(-2×3, -2×3)) = min(3, -6) = -6
  maxProduct = max(-2, 3) = 3

i=2, nums[2]=-4:
  tempMax = 3, tempMin = -6
  currentMax = max(-4, max(3×-4, -6×-4)) = max(-4, max(-12, 24)) = max(-4, 24) = 24
  currentMin = min(-4, min(3×-4, -6×-4)) = min(-4, min(-12, 24)) = min(-4, -12) = -12
  maxProduct = max(3, 24) = 24

Final Result: 24 ✓
```

**Best subarray:** Entire array `[-2,3,-4]` with product 24

**Key observation:** The minimum product at i=1 was -6 (`[-2,3]`). When multiplied by -4, it became 24 (maximum)!

---

## Why Track Both Min and Max?

### The Negative Number Problem

**Consider:** `nums = [2, -5, -2]`

Without tracking min:
- i=1: max = max(-5, 2×-5) = max(-5, -10) = -5
- i=2: max = max(-2, -5×-2) = max(-2, 10) = 10 ✓

With min tracking:
- i=1: max=-5, min=max(-5, 2×-5, 2×-5)=-10
- i=2: max=max(-2, -5×-2, **-10×-2**) = max(-2, 10, **20**) = **20** ✓✓

**The minimum product -10 at position 1 becomes the maximum 20 when multiplied by -2!**

### Visual Representation

```
Array: [2,  -5,  -2,   4]
       ↓    ↓    ↓    ↓
Max:   2   -5   20   80
Min:   2  -10   -4  -80

Explanation:
Position 0: max=2, min=2
Position 1: -5 is max, 2×-5=-10 is min
Position 2: -10×-2=20 is max!, -5×-2=10, so 20 wins
Position 3: 20×4=80 is max
```

---

## Why This Works

1. **Handles Negatives:**
   - Negative numbers flip the sign
   - Large negative (min) × negative = large positive (new max)
   - Large positive (max) × negative = large negative (new min)

2. **Three Choices at Each Position:**
   - Start fresh (ignore previous products)
   - Extend maximum product
   - Extend minimum product (crucial for negatives!)

3. **DP Optimal Substructure:**
   - Max product ending at position i depends on max/min at position i-1
   - We build solution incrementally

4. **Global Maximum:**
   - Track the best result seen so far
   - Final answer is the global maximum

---

## Edge Cases Handled

✅ **Single element:** `[5]` → 5  
✅ **All positive:** `[2,3,4]` → 24 (entire array)  
✅ **All negative (even count):** `[-2,-3]` → 6 (entire array)  
✅ **All negative (odd count):** `[-2,-3,-4]` → 12 (subarray [-3,-4])  
✅ **Contains zero:** `[2,0,3]` → 3 (resets product)  
✅ **Negative in middle:** `[2,3,-2,4]` → 6 (subarray [2,3])  
✅ **Large negative then positive:** `[-8,5]` → 5  
✅ **Mix of all:** `[2,-5,-2,-4,3]` → handles correctly  

---

## Common Mistakes to Avoid

### ❌ Mistake 1: Only tracking maximum
```java
// This fails for cases like [2, -5, -2]
currentMax = Math.max(nums[i], currentMax * nums[i]);
// Misses that min × negative can become max
```

### ❌ Mistake 2: Swapping before calculation
```java
if (nums[i] < 0) {
    swap(currentMax, currentMin);  // Wrong!
}
currentMax = Math.max(nums[i], currentMax * nums[i]);
// Uses swapped values, gives incorrect results
```

### ✅ Correct Approach: Calculate both with old values
```java
tempMax = currentMax;
tempMin = currentMin;
currentMax = Math.max(nums[i], Math.max(tempMax * nums[i], tempMin * nums[i]));
currentMin = Math.min(nums[i], Math.min(tempMax * nums[i], tempMin * nums[i]));
```

---

## Alternative Approaches

### Approach 1: Brute Force
```java
int maxProduct = Integer.MIN_VALUE;
for (int i = 0; i < n; i++) {
    int product = 1;
    for (int j = i; j < n; j++) {
        product *= nums[j];
        maxProduct = Math.max(maxProduct, product);
    }
}
```
- **Time:** O(n²) ❌ (Too slow)
- **Space:** O(1) ✓

### Approach 2: Forward and Backward Pass
```java
// Pass from left to right, track product (reset on 0)
// Pass from right to left, track product (reset on 0)
// Return max of both passes
```
- **Time:** O(n) ✓
- **Space:** O(1) ✓
- **Clever but less intuitive**

### Approach 3: DP with Min/Max (Current) ✓
- **Time:** O(n) ✓
- **Space:** O(1) ✓
- **Clear logic, handles all cases**

**Recommended:** Current DP approach (most intuitive and efficient)

---

## Code Implementation

See: [`MaximumProductSubArray.java`](../MaximumProductSubArray.java)

**Key Method:**

```java
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
        currentMax = Math.max(nums[i], 
                     Math.max(tempMax * nums[i], tempMin * nums[i]));
        currentMin = Math.min(nums[i], 
                     Math.min(tempMax * nums[i], tempMin * nums[i]));
        
        maxProduct = Math.max(maxProduct, currentMax);
    }
    return maxProduct;
}
```

---

## Related Problems

- **53. Maximum Subarray** (Kadane's Algorithm - similar but for sum)
- **238. Product of Array Except Self** (Product manipulation)
- **628. Maximum Product of Three Numbers** (Find three numbers)
- **1186. Maximum Subarray Sum with One Deletion** (DP with choices)
- **1749. Maximum Absolute Sum of Any Subarray** (Similar DP pattern)

---

## Pattern Recognition

**Pattern:** Dynamic Programming - Max/Min Tracking

**When to use:**
- Need to find maximum/minimum of contiguous subarray
- Operations can flip signs (multiplication, subtraction)
- Need to track both extremes (max and min)
- Building solution incrementally

**Related Patterns:**
- Kadane's Algorithm (Maximum Subarray Sum)
- DP with state tracking
- Subarray optimization problems

---

## Key Takeaways

1. ✅ **Track Both Min and Max:** Negatives can flip large negative to large positive
2. ✅ **Three Choices:** Start fresh, extend max, or extend min
3. ✅ **Use Old Values:** Store temp values before updating both max and min
4. ✅ **Global Maximum:** Track best result across all positions
5. ✅ **Handles All Cases:** Positives, negatives, zeros, mixed arrays

---

## Tags
`Array` `Dynamic Programming` `Blind 75` `Medium` `O(n) Time` `Kadane Variant`

---

[← Back to Blind 75 Problems](../BLIND75_README.md) | [Related: Maximum Subarray](../BLIND75_README.md)

