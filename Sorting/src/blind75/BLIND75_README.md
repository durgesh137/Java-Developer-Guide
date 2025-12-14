# Blind 75 Problems

A curated collection of 75 must-do LeetCode problems for technical interview preparation, categorized by topic.

---

## Table of Contents

1. [Array Problems](#array-problems)
2. [String Problems](#string-problems)
3. [Linked List Problems](#linked-list-problems)
4. [Tree Problems](#tree-problems)
5. [Dynamic Programming Problems](#dynamic-programming-problems)
6. [Graph Problems](#graph-problems)

---

## Array Problems

### [Problem 1: Two Sum](docs/TwoSum_README.md)
**Difficulty:** Easy  
**Topics:** Array, Hash Table

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

**Solution Approach:** Hash Map (One-Pass)  
**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### [Problem 15: 3Sum](docs/ThreeSum_README.md)
**Difficulty:** Medium  
**Topics:** Array, Two Pointers, Sorting

Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that they sum to zero. The solution set must not contain duplicate triplets.

**Solution Approach:** Sort + Two Pointers  
**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

### [Problem 128: Longest Consecutive Sequence](docs/LongestConsecutiveSequence_README.md)
**Difficulty:** Medium  
**Topics:** Array, Hash Table, Union Find

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence. You must write an algorithm that runs in O(n) time.

**Solution Approach:** Hash Set with Smart Iteration  
**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

## String Problems

### [Problem 3: Longest Substring Without Repeating Characters](docs/LongestSubstringWithoutRepeatingChars_README.md)
**Difficulty:** Medium  
**Topics:** String, Sliding Window, Hash Table

Given a string `s`, find the length of the longest substring without repeating characters.

**Solution Approach:** Sliding Window with Character Index Array  
**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### [Problem 5: Longest Palindromic Substring](docs/LongestPalindromeSubstring_README.md)
**Difficulty:** Medium  
**Topics:** String, Two Pointers, Dynamic Programming

Given a string `s`, return the longest palindromic substring in `s`.

**Solution Approach:** Expand Around Center  
**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

## Linked List Problems

### [Problem 19: Remove Nth Node From End of List](docs/RemoveNthNodeFromEndOfList_README.md)
**Difficulty:** Medium  
**Topics:** Linked List, Two Pointers, Dummy Node

Given the head of a linked list, remove the nth node from the end of the list and return its head.

**Solution Approach:** Two-Pointer with Gap (n+1 steps ahead)  
**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### [Problem 141: Linked List Cycle](docs/LinkedListCycle_README.md)
**Difficulty:** Easy  
**Topics:** Linked List, Two Pointers, Fast & Slow Pointers

Given the head of a linked list, determine if the linked list has a cycle in it.

**Solution Approach:** Floyd's Cycle Detection (Tortoise and Hare)  
**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### [Problem 143: Reorder List](docs/ReorderList_README.md)
**Difficulty:** Medium  
**Topics:** Linked List, Two Pointers, Reversal

Reorder a linked list from L₀→L₁→…→Ln to L₀→Ln→L₁→Ln-1→L₂→Ln-2→…

**Solution Approach:** Find Middle + Reverse Second Half + Merge  
**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### [Problem 206: Reverse Linked List](docs/ReverseLinkedList_README.md)
**Difficulty:** Easy  
**Topics:** Linked List, Two Pointers, Recursion

Given the head of a singly linked list, reverse the list and return the reversed list.

**Solution Approach:** Iterative (3 pointers) or Recursive  
**Time Complexity:** O(n)  
**Space Complexity:** O(1) iterative, O(n) recursive

---

## Related Resources

- [Core Concepts & Techniques](concepts/README.md) 🔍
- [Sorting Module README](../../../Sorting-README.md)
- [Patterns Library](../patterns/PATTERNS_README.md)
- [Problem Solutions](../problems/)

---

## Progress Tracker

- [x] Two Sum (1)
- [x] Longest Substring Without Repeating Characters (3)
- [x] Longest Palindromic Substring (5)
- [x] 3Sum (15)
- [x] Remove Nth Node From End of List (19)
- [x] Longest Consecutive Sequence (128)
- [x] Word Break (139)
- [x] Linked List Cycle (141)
- [x] Reorder List (143)
- [x] Maximum Product Subarray (152)
- [x] Reverse Linked List (206)
- [x] Missing Number (268)
- [x] Palindromic Substrings (647)
- [ ] Best Time to Buy and Sell Stock (121)
- [ ] Contains Duplicate (217)
- [ ] Product of Array Except Self (238)
- [ ] Maximum Subarray (53)
- [ ] Find Minimum in Rotated Sorted Array (153)
- [ ] Search in Rotated Sorted Array (33)
- [ ] Container With Most Water (11)

---

*Note: This is part of the Blind 75 LeetCode problems collection - essential problems for coding interview preparation.*

