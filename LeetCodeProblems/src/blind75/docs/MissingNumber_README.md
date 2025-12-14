# Problem 268: Missing Number

[← Back to Blind 75 Problems](../BLIND75_README.md)

---

## Problem Statement

**LeetCode Problem #268** - [Missing Number](https://leetcode.com/problems/missing-number/)

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the **only number** in the range that is missing from the array.

**Constraints:**
- `n == nums.length`
- `1 <= n <= 10^4`
- `0 <= nums[i] <= n`
- All the numbers of `nums` are **unique**

**Follow-up:** Could you implement a solution using only **O(1)** extra space complexity and **O(n)** runtime complexity?

---

## Examples

### Example 1:
```
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
2 is the missing number since it does not appear in nums.
```

### Example 2:
```
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
2 is the missing number since it does not appear in nums.
```

### Example 3:
```
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
8 is the missing number since it does not appear in nums.
```

### Example 4:
```
Input: nums = [0]
Output: 1
Explanation: n = 1, range is [0,1]. 1 is missing.
```

---

## Algorithm: Mathematical Sum Formula

### Core Idea
Calculate the **expected sum** of all numbers from 0 to n using the mathematical formula, then subtract the **actual sum** of the array. The difference is the missing number.

### Key Insight
The sum of first n natural numbers (including 0) follows the formula: **Sum = n × (n + 1) / 2**

Since we know what the sum should be and what it actually is, the difference reveals the missing number.

### Why This Works

**Mathematical Foundation:**
```
Expected sum of [0, 1, 2, ..., n] = 0 + 1 + 2 + ... + n = n(n+1)/2
Actual sum = sum of all elements in nums
Missing number = Expected sum - Actual sum
```

**Example:** `nums = [3,0,1]`
```
n = 3
Expected sum = 3 × 4 / 2 = 6  (for [0,1,2,3])
Actual sum = 3 + 0 + 1 = 4
Missing = 6 - 4 = 2 ✓
```

### Step-by-Step Algorithm

1. **Calculate n:** `n = nums.length` (array has n elements, range is [0, n])

2. **Calculate Expected Sum:** `expectedSum = n × (n + 1) / 2`

3. **Calculate Actual Sum:** 
   - Initialize `actualSum = 0`
   - Iterate through array: `actualSum += nums[i]`

4. **Return Difference:** `return expectedSum - actualSum`

---

## Pseudocode

```
function missingNumber(nums):
    n = nums.length
    
    // Sum of numbers from 0 to n
    expectedSum = n * (n + 1) / 2
    
    // Sum of numbers in the array
    actualSum = 0
    for num in nums:
        actualSum += num
    
    // The difference is the missing number
    return expectedSum - actualSum
```

---

## Complexity Analysis

### Time Complexity: **O(n)**
- Single pass through array to calculate actualSum: O(n)
- All other operations: O(1)
- **Total: O(n)** linear time ✓

### Space Complexity: **O(1)**
- Only using a few variables (n, expectedSum, actualSum)
- No additional data structures
- **O(1)** constant space ✓

**✅ Meets follow-up requirements: O(n) time, O(1) space**

---

## Walkthrough Example

**Input:** `nums = [3,0,1]`

### Step-by-Step Execution:

```
Step 1: Calculate n
n = nums.length = 3

Step 2: Calculate Expected Sum
expectedSum = n × (n + 1) / 2
            = 3 × (3 + 1) / 2
            = 3 × 4 / 2
            = 12 / 2
            = 6

Step 3: Calculate Actual Sum
actualSum = 0
i=0: actualSum += nums[0] = 3  → actualSum = 3
i=1: actualSum += nums[1] = 0  → actualSum = 3
i=2: actualSum += nums[2] = 1  → actualSum = 4

Final actualSum = 4

Step 4: Calculate Missing Number
missingNumber = expectedSum - actualSum
              = 6 - 4
              = 2 ✓
```

**Verification:** Range [0,3] has numbers {0,1,2,3}. Array has {0,1,3}. Missing: 2 ✓

---

## Detailed Example: Larger Array

**Input:** `nums = [9,6,4,2,3,5,7,0,1]`

```
n = 9
Expected sum = 9 × 10 / 2 = 45

Actual sum calculation:
9 + 6 + 4 + 2 + 3 + 5 + 7 + 0 + 1 = 37

Missing number = 45 - 37 = 8 ✓
```

**Verification:** Range [0,9] = {0,1,2,3,4,5,6,7,8,9}. Array has all except 8. ✓

---

## Mathematical Formula Derivation

### Sum of First n Natural Numbers

**Formula:** `1 + 2 + 3 + ... + n = n(n+1)/2`

**Derivation:**
```
Let S = 1 + 2 + 3 + ... + n
Write S in reverse: S = n + (n-1) + ... + 2 + 1

Add both:
2S = (1+n) + (2+n-1) + (3+n-2) + ... + (n+1)
2S = (n+1) + (n+1) + (n+1) + ... + (n+1)  [n times]
2S = n(n+1)
S = n(n+1)/2
```

**For our problem (including 0):**
```
Sum of [0,1,2,...,n] = 0 + 1 + 2 + ... + n
                     = 0 + n(n+1)/2
                     = n(n+1)/2
```

**Example verification:**
- n=3: Sum = 3×4/2 = 6 → 0+1+2+3 = 6 ✓
- n=5: Sum = 5×6/2 = 15 → 0+1+2+3+4+5 = 15 ✓

---

## Why This Works

1. **Complete Range:** The problem guarantees numbers are in range [0, n] with exactly one missing

2. **Unique Numbers:** All numbers in array are distinct, no duplicates

3. **Known Formula:** Mathematical formula gives us expected sum in O(1)

4. **Subtraction Reveals Gap:** 
   - If a number is missing, actual sum is less than expected
   - The exact difference is the missing number

5. **No Overflow (within constraints):**
   - Max n = 10^4
   - Max sum = 10^4 × 10^5 / 2 = 5 × 10^8
   - Well within int range (2^31 - 1 ≈ 2.1 × 10^9)

---

## Edge Cases Handled

✅ **Single element [0]:** `n=1`, expected=1, actual=0, missing=1 ✓  
✅ **Single element [1]:** `n=1`, expected=1, actual=1, missing=0 ✓  
✅ **Two elements [0,1]:** Missing=2 ✓  
✅ **Missing is 0:** `[1,2,3]` → expected=6, actual=6, missing=0 ✓  
✅ **Missing is n:** `[0,1,2]` → expected=6, actual=3, missing=3 ✓  
✅ **Large array (n=10^4):** Formula works efficiently ✓  
✅ **Unsorted array:** Order doesn't matter, only sum matters ✓  

---

## Alternative Approaches

### Approach 1: XOR Bit Manipulation
```java
public int missingNumber(int[] nums) {
    int xor = 0;
    int n = nums.length;
    
    // XOR all numbers from 0 to n
    for (int i = 0; i <= n; i++) {
        xor ^= i;
    }
    
    // XOR all numbers in array
    for (int num : nums) {
        xor ^= num;
    }
    
    return xor;  // All paired numbers cancel out, only missing remains
}
```
**Explanation:** XOR properties: `a ^ a = 0` and `a ^ 0 = a`
- **Time:** O(n) ✓
- **Space:** O(1) ✓
- **Pros:** No risk of overflow, elegant bit manipulation
- **Cons:** Less intuitive than math formula

### Approach 2: HashSet
```java
public int missingNumber(int[] nums) {
    Set<Integer> numSet = new HashSet<>();
    for (int num : nums) {
        numSet.add(num);
    }
    
    for (int i = 0; i <= nums.length; i++) {
        if (!numSet.contains(i)) {
            return i;
        }
    }
    return -1;
}
```
- **Time:** O(n) ✓
- **Space:** O(n) ❌ (Uses extra space)
- **Pros:** Simple and straightforward
- **Cons:** Violates O(1) space requirement

### Approach 3: Sorting
```java
public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    
    // Check if 0 is missing
    if (nums[0] != 0) return 0;
    
    // Check if n is missing
    if (nums[nums.length - 1] != nums.length) return nums.length;
    
    // Check middle
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i-1] + 1) {
            return nums[i-1] + 1;
        }
    }
    return -1;
}
```
- **Time:** O(n log n) ❌ (Sorting dominates)
- **Space:** O(1) or O(n) depending on sort algorithm
- **Pros:** Easy to understand
- **Cons:** Slower than required

### Approach 4: Mathematical Sum Formula (Current) ✓
- **Time:** O(n) ✓
- **Space:** O(1) ✓
- **Pros:** Simple, efficient, meets all requirements
- **Cons:** Potential overflow for very large n (not an issue here)

**Recommended:** Mathematical Sum Formula or XOR (both optimal)

---

## Comparison: Sum vs XOR

| Aspect | Sum Formula | XOR |
|--------|-------------|-----|
| **Time** | O(n) ✓ | O(n) ✓ |
| **Space** | O(1) ✓ | O(1) ✓ |
| **Intuition** | Very clear | Requires bit knowledge |
| **Overflow Risk** | Possible (large n) | None |
| **Code Length** | Short | Slightly longer |
| **Best For** | General use | Large numbers, interviews |

**For this problem:** Either approach is excellent. Sum formula is more intuitive.

---

## Code Implementation

See: [`MissingNumber.java`](../MissingNumber.java)

**Key Method:**

```java
public static int missingNumber(int[] nums) {
    int n = nums.length;
    
    // Calculate expected sum using formula: n(n+1)/2
    int expectedSum = n * (n + 1) / 2;
    
    // Calculate actual sum of array elements
    int actualSum = 0;
    for (int num : nums) {
        actualSum += num;
    }
    
    // The difference is the missing number
    return expectedSum - actualSum;
}
```

---

## XOR Alternative Implementation

```java
public static int missingNumberXOR(int[] nums) {
    int xor = 0;
    int n = nums.length;
    
    // XOR with all indices [0, n]
    for (int i = 0; i <= n; i++) {
        xor ^= i;
    }
    
    // XOR with all array elements
    for (int num : nums) {
        xor ^= num;
    }
    
    // All pairs cancel out (a^a=0), only missing number remains
    return xor;
}
```

**How XOR works here:**
- XOR all numbers from 0 to n: `0^1^2^...^n`
- XOR all numbers in array: `nums[0]^nums[1]^...`
- Missing number appears only once, all others appear twice
- `a^a=0` cancels paired numbers, leaving only the missing one

---

## Related Problems

- **41. First Missing Positive** (Find missing positive integer)
- **287. Find the Duplicate Number** (Inverse problem - find duplicate)
- **448. Find All Numbers Disappeared in an Array** (Multiple missing numbers)
- **136. Single Number** (XOR technique to find unique element)
- **645. Set Mismatch** (Find missing and duplicate)

---

## Pattern Recognition

**Pattern:** Mathematical Formula / Bit Manipulation

**When to use:**
- Array contains numbers in a known range
- Need to find missing or duplicate elements
- O(1) space requirement
- Mathematical properties can simplify the problem

**Related Techniques:**
- Gauss sum formula: n(n+1)/2
- XOR properties for pairing/cancellation
- Index-based techniques

---

## Key Takeaways

1. ✅ **Sum Formula:** `n(n+1)/2` gives sum of first n natural numbers (including 0)
2. ✅ **Simple Subtraction:** Expected - Actual = Missing
3. ✅ **Optimal Complexity:** O(n) time, O(1) space
4. ✅ **Alternative:** XOR also works with no overflow risk
5. ✅ **Range Matters:** Problem constraint [0, n] makes formula applicable

---

## Tags
`Array` `Math` `Bit Manipulation` `Blind 75` `Easy` `O(n) Time` `O(1) Space`

---

[← Back to Blind 75 Problems](../BLIND75_README.md) | [Related: Find the Duplicate Number](../BLIND75_README.md)

