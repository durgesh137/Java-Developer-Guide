# Blind 75 Problems

A curated collection of 75 must-do LeetCode problems for technical interview preparation, organized by difficulty level.

---

## 📁 Package Structure

```
blind75/
├── easy/           # Easy difficulty problems (5 solved)
├── medium/         # Medium difficulty problems (9 solved)
├── hard/           # Hard difficulty problems (0 solved)
├── docs/           # Problem documentation
├── concepts/       # Core concepts and techniques
├── ListNode.java   # Common linked list node definition
└── LinkedListUtils.java  # Utility methods for linked lists
```

---

## Table of Contents

1. [Easy Problems](#easy-problems)
2. [Medium Problems](#medium-problems)
3. [Hard Problems](#hard-problems)
4. [Progress Summary](#progress-summary)

---

## Easy Problems

### [Problem 1: Two Sum](easy/TwoSum.java) | [Docs](docs/TwoSum_README.md)
**Topics:** Array, Hash Table

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

**Solution Approach:** Hash Map (One-Pass)  
**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### [Problem 141: Linked List Cycle](easy/LinkedListCycle.java) | [Docs](docs/LinkedListCycle_README.md)
**Topics:** Linked List, Two Pointers, Fast & Slow Pointers

Given the head of a linked list, determine if the linked list has a cycle in it.

**Solution Approach:** Floyd's Cycle Detection (Tortoise and Hare)  
**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### [Problem 206: Reverse Linked List](easy/ReverseLinkedList.java) | [Docs](docs/ReverseLinkedList_README.md)
**Topics:** Linked List, Two Pointers, Recursion

Given the head of a singly linked list, reverse the list and return the reversed list.

**Solution Approach:** Iterative (3 pointers) or Recursive  
**Time Complexity:** O(n) | **Space Complexity:** O(1) iterative, O(n) recursive

---

### [Problem 21: Merge Two Sorted Lists](easy/MergeTwoSortedLists.java) | [Docs](docs/MergeTwoSortedLists_README.md)
**Topics:** Linked List, Two Pointers, Dummy Node

Given the heads of two sorted linked lists, merge them into one sorted list.

**Solution Approach:** Iterative Two-Pointer with Dummy Node  
**Time Complexity:** O(n + m) | **Space Complexity:** O(1)

---

### [Problem 268: Missing Number](easy/MissingNumber.java) | [Docs](docs/MissingNumber_README.md)
**Topics:** Array, Math, Bit Manipulation

Given an array `nums` containing n distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

**Solution Approach:** XOR or Math Formula  
**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

## Medium Problems

### [Problem 3: Longest Substring Without Repeating Characters](medium/LongestSubstringWithoutRepeatingChars.java) | [Docs](docs/LongestSubstringWithoutRepeatingChars_README.md)
**Topics:** String, Sliding Window, Hash Table

Given a string `s`, find the length of the longest substring without repeating characters.

**Solution Approach:** Sliding Window with Character Index Array  
**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### [Problem 5: Longest Palindromic Substring](medium/LongestPalindromeSubstring.java) | [Docs](docs/LongestPalindromeSubstring_README.md)
**Topics:** String, Two Pointers, Dynamic Programming

Given a string `s`, return the longest palindromic substring in `s`.

**Solution Approach:** Expand Around Center  
**Time Complexity:** O(n²) | **Space Complexity:** O(1)

---

### [Problem 15: 3Sum](medium/ThreeSum.java) | [Docs](docs/ThreeSum_README.md)
**Topics:** Array, Two Pointers, Sorting

Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that they sum to zero. The solution set must not contain duplicate triplets.

**Solution Approach:** Sort + Two Pointers  
**Time Complexity:** O(n²) | **Space Complexity:** O(1)

---

### [Problem 19: Remove Nth Node From End of List](medium/RemoveNthNodeFromEndOfList.java) | [Docs](docs/RemoveNthNodeFromEndOfList_README.md)
**Topics:** Linked List, Two Pointers, Dummy Node

Given the head of a linked list, remove the nth node from the end of the list and return its head.

**Solution Approach:** Two-Pointer with Gap (n+1 steps ahead)  
**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### [Problem 128: Longest Consecutive Sequence](medium/LongestConsecutiveSequence.java) | [Docs](docs/LongestConsecutiveSequence_README.md)
**Topics:** Array, Hash Table, Union Find

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence. You must write an algorithm that runs in O(n) time.

**Solution Approach:** Hash Set with Smart Iteration  
**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### [Problem 139: Word Break](medium/WordBreak.java) | [Docs](docs/WordBreak_README.md)
**Topics:** String, Dynamic Programming, Hash Table

Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented into a space-separated sequence of dictionary words.

**Solution Approach:** Dynamic Programming  
**Time Complexity:** O(n²) | **Space Complexity:** O(n)

---

### [Problem 143: Reorder List](medium/ReorderList.java) | [Docs](docs/ReorderList_README.md)
**Topics:** Linked List, Two Pointers, Reversal

Reorder a linked list from L₀→L₁→…→Ln to L₀→Ln→L₁→Ln-1→L₂→Ln-2→…

**Solution Approach:** Find Middle + Reverse Second Half + Merge  
**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### [Problem 152: Maximum Product Subarray](medium/MaximumProductSubArray.java) | [Docs](docs/MaximumProductSubArray_README.md)
**Topics:** Array, Dynamic Programming

Given an integer array `nums`, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

**Solution Approach:** Track Min and Max Products  
**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### [Problem 647: Palindromic Substrings](medium/PalindromicSubstrings.java) | [Docs](docs/PalindromicSubstrings_README.md)
**Topics:** String, Dynamic Programming

Given a string `s`, return the number of palindromic substrings in it.

**Solution Approach:** Expand Around Center  
**Time Complexity:** O(n²) | **Space Complexity:** O(1)

---

## Hard Problems

*No hard problems completed yet*

---

## Progress Summary

### By Difficulty
| Difficulty | Solved | Total | Percentage |
|-----------|--------|-------|------------|
| Easy | 5 | ~15 | 33% |
| Medium | 9 | ~50 | 18% |
| Hard | 0 | ~10 | 0% |
| **Total** | **14** | **75** | **18.7%** |

### By Category
| Category | Solved | Problems |
|----------|--------|----------|
| Arrays | 3 | Two Sum, 3Sum, Longest Consecutive Sequence |
| Strings | 2 | Longest Substring, Palindromic Substring |
| Linked Lists | 5 | Cycle, Reverse, Merge Two Sorted Lists, Remove Nth, Reorder |
| Dynamic Programming | 4 | Word Break, Max Product, Palindromic Substrings, Missing Number |

---

## How to Use This Package

### Running Problems

Problems are organized by difficulty. Run them using the full package path:

```bash
# Easy problems
java blind75.easy.TwoSum
java blind75.easy.LinkedListCycle
java blind75.easy.ReverseLinkedList
java blind75.easy.MergeTwoSortedLists
java blind75.easy.MissingNumber

# Medium problems
java blind75.medium.ThreeSum
java blind75.medium.ReorderList
java blind75.medium.WordBreak
# ... and more
```

### Adding New Problems

When completing a new problem:

**1. Choose the correct package based on difficulty:**
- Easy: `blind75/easy/`
- Medium: `blind75/medium/`
- Hard: `blind75/hard/`

**2. Create the Java file with correct package declaration:**
```java
package blind75.easy;    // or medium or hard
```

**3. Add necessary imports:**
```java
import blind75.ListNode;              // If using linked lists
import blind75.LinkedListUtils;       // If using utility methods
// OR
import static blind75.LinkedListUtils.*;
```

**4. Update this README:**
- Add problem entry in the appropriate difficulty section
- Update Progress Summary table
- Mark as completed in Progress Tracker

---

## Related Resources

- [Core Concepts & Techniques](concepts/README.md) 🔍
- [LeetCodeProblems Module README](../../../LeetCodeProblems-README.md)
- [Patterns Library](../patterns/PATTERNS_README.md)
- [Problem Solutions](../problems/)

---

## Progress Tracker

### Completed ✅
- [x] Two Sum (1) - Easy
- [x] Longest Substring Without Repeating Characters (3) - Medium
- [x] Longest Palindromic Substring (5) - Medium
- [x] 3Sum (15) - Medium
- [x] Remove Nth Node From End of List (19) - Medium
- [x] Longest Consecutive Sequence (128) - Medium
- [x] Word Break (139) - Medium
- [x] Linked List Cycle (141) - Easy
- [x] Reorder List (143) - Medium
- [x] Maximum Product Subarray (152) - Medium
- [x] Reverse Linked List (206) - Easy
- [x] Missing Number (268) - Easy
- [x] Palindromic Substrings (647) - Medium

### Pending ⏳
- [ ] Best Time to Buy and Sell Stock (121) - Easy
- [ ] Contains Duplicate (217) - Easy
- [ ] Product of Array Except Self (238) - Medium
- [ ] Maximum Subarray (53) - Easy
- [ ] Find Minimum in Rotated Sorted Array (153) - Medium
- [ ] Search in Rotated Sorted Array (33) - Medium
- [ ] Container With Most Water (11) - Medium

---

*Note: This is part of the Blind 75 LeetCode problems collection - essential problems for coding interview preparation.*

