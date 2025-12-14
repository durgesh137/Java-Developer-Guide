# Problem 128: Longest Consecutive Sequence

[← Back to Blind 75 Problems](../BLIND75_README.md)

---

## Problem Statement

**LeetCode Problem #128** - [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

**Constraint:** You must write an algorithm that runs in **O(n)** time.

---

## Examples

### Example 1:
```
Input: nums = [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive sequence is [1, 2, 3, 4]. Therefore its length is 4.
```

### Example 2:
```
Input: nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
Output: 9
Explanation: The longest consecutive sequence is [0, 1, 2, 3, 4, 5, 6, 7, 8]. Therefore its length is 9.
```

### Example 3:
```
Input: nums = []
Output: 0
```

---

## Algorithm: Hash Set with Smart Iteration

### Core Idea
Use a **HashSet** for O(1) lookups and only start counting sequences from the **beginning** of each sequence to avoid redundant work.

### Key Insight
For a number to be the start of a consecutive sequence, the number `n-1` should NOT exist in the set. This ensures we only count each sequence once.

### Step-by-Step Algorithm

1. **Build HashSet:** Add all numbers to a HashSet for O(1) lookup time
   
2. **Iterate through unique numbers:** For each number in the set:
   - Check if `num - 1` exists in the set
   - If **NO** (this is the start of a sequence):
     - Initialize `currentNum = num` and `currentStreak = 1`
     - Keep checking if `currentNum + 1` exists
     - Increment `currentNum` and `currentStreak` while consecutive numbers exist
     - Update `longestStreak` with max of current and longest streak
   - If **YES** (not the start), skip it (will be counted from its sequence start)

3. **Return Result:** Return the `longestStreak` found

---

## Pseudocode

```
function longestConsecutive(nums):
    if nums is empty:
        return 0
    
    uniqueSet = new HashSet(nums)
    longestStreak = 0
    
    for num in uniqueSet:
        // Only start counting from sequence beginning
        if (num - 1) not in uniqueSet:
            currentNum = num
            currentStreak = 1
            
            // Count consecutive sequence
            while (currentNum + 1) in uniqueSet:
                currentNum += 1
                currentStreak += 1
            
            longestStreak = max(longestStreak, currentStreak)
    
    return longestStreak
```

---

## Complexity Analysis

### Time Complexity: **O(n)**
- Building HashSet: O(n)
- Iterating through numbers: O(n)
- Inner while loop: Although nested, each number is visited at most twice (once in outer loop, once in inner loop)
- Overall: O(n) + O(n) = **O(n)**

### Space Complexity: **O(n)**
- HashSet stores all unique numbers: O(n)

---

## Walkthrough Example

**Input:** `[100, 4, 200, 1, 3, 2]`

**Step 1:** Build HashSet
```
uniqueSet = {100, 4, 200, 1, 3, 2}
```

**Step 2:** Iterate through each number

| num | num-1 exists? | Action | Sequence Found | currentStreak | longestStreak |
|-----|---------------|--------|----------------|---------------|---------------|
| 100 | No (99 ✗)     | Start  | 100            | 1             | 1             |
| 4   | Yes (3 ✓)     | Skip   | -              | -             | 1             |
| 200 | No (199 ✗)    | Start  | 200            | 1             | 1             |
| 1   | No (0 ✗)      | Start  | 1→2→3→4        | 4             | **4**         |
| 3   | Yes (2 ✓)     | Skip   | -              | -             | 4             |
| 2   | Yes (1 ✓)     | Skip   | -              | -             | 4             |

**Step 3:** Return Result = **4**

---

## Why This Works

1. **Efficiency:** By checking if `num - 1` exists, we ensure each sequence is counted only once from its starting point
   
2. **No Redundancy:** Numbers in the middle of sequences are skipped during iteration, preventing duplicate counting
   
3. **O(n) Time:** Despite the nested while loop, each number is visited at most twice total across all iterations

---

## Alternative Approaches

### Approach 1: Sorting (Not Meeting Constraint)
- Sort array: O(n log n)
- Linear scan to find longest sequence: O(n)
- **Total:** O(n log n) ❌ (Violates O(n) requirement)

### Approach 2: Union-Find
- Build union-find structure: O(n)
- Union consecutive elements: O(n)
- Find largest component: O(n)
- **Total:** O(n) ✓ (More complex implementation)

---

## Pattern Recognition

**Pattern Used:** Hash Set for O(1) Lookup + Smart Iteration Strategy

**Related Patterns:**
- [Hash Table Pattern](../../patterns/PATTERNS_README.md)
- [Set-based Problems](../../patterns/PATTERNS_README.md)

**Similar Problems:**
- Binary Tree Longest Consecutive Sequence
- Consecutive Numbers Sum
- Longest Consecutive Sequence II

---

## Code Implementation

See: [`LongestConsecutiveSequence.java`](../LongestConsecutiveSequence.java)

---

## Tags
`Array` `Hash Table` `Union Find` `Blind 75` `Medium` `O(n) Time`

---

[← Back to Blind 75 Problems](../BLIND75_README.md) | [View Pattern Library](../../patterns/PATTERNS_README.md)

