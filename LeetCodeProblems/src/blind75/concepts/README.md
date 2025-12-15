# Blind 75 - Core Concepts & Techniques

This folder contains detailed explanations of fundamental programming concepts and techniques used across Blind 75 problems.

---

## 📚 Concepts Library

### Data Structures & Language Features

1. **[char as Array Index](./char_as_array_index_explained.md)**
   - Understanding how `char` is a numeric type in Java
   - ASCII value mapping to array indices
   - Why `int[128]` is used for character tracking
   - O(1) lookup efficiency
   - **Used in:** Problem 3 (Longest Substring Without Repeating Characters)

### Algorithmic Patterns

2. **Two Pointer Technique**
   - Using two pointers to traverse arrays efficiently
   - Opposite direction pointers (start and end)
   - Same direction pointers (slow and fast)
   - Optimal for sorted arrays and finding pairs/triplets
   - **Used in:** Problem 15 (3Sum), Problem 1 (Two Sum variant)

3. **Floyd's Cycle Detection (Fast & Slow Pointers)**
   - Two pointers moving at different speeds
   - Slow pointer moves 1 step, fast pointer moves 2 steps
   - If they meet, a cycle exists
   - O(1) space complexity for cycle detection
   - **Used in:** Problem 141 (Linked List Cycle), Problem 143 (Reorder List - Step 1)

4. **Two Pointers with Gap**
   - Two pointers maintaining a fixed gap/distance
   - Used for finding nth element from end in linked lists
   - Enables single-pass solution without knowing length
   - Combined with dummy node for edge case handling
   - **Used in:** Problem 19 (Remove Nth Node From End of List)

### Data Structure Techniques

5. **Dummy Node Pattern**
   - Creates a dummy/sentinel node before the head
   - Simplifies edge cases (removing head, empty list, merging)
   - Provides consistent pointer manipulation
   - Returns `dummy.next` as the new head
   - **Used in:** Problem 19 (Remove Nth Node From End of List), Problem 21 (Merge Two Sorted Lists)

6. **Linked List Reversal**
   - **Iterative:** Three pointers (prev, curr, next) - O(1) space
   - **Recursive:** Unwind stack and reverse links - O(n) space
   - Standard pattern used in many linked list problems
   - Foundation technique for list manipulation
   - **Used in:** Problem 206 (Reverse Linked List), Problem 143 (Reorder List - Step 2)

7. **Merge/Weave Pattern**
   - Alternately interleave nodes from two lists
   - Requires careful pointer manipulation
   - Common in list rearrangement problems
   - **Used in:** Problem 143 (Reorder List - Step 3)

---

## Why Concepts Matter

These concept guides provide deep dives into:
- ✅ **Low-level understanding** of how techniques work
- ✅ **Efficiency analysis** - Why certain approaches are faster
- ✅ **Common pitfalls** - What to avoid
- ✅ **Practical examples** - Visual walkthroughs
- ✅ **Related problems** - Where else to apply the concept

---

## How to Use

1. **While solving problems:** If you encounter an unfamiliar technique, check this folder
2. **For review:** Read through concepts to strengthen fundamentals
3. **Before interviews:** Quick reference for key optimization techniques

---

## Upcoming Concepts

Future additions will cover:
- Two Pointer technique variations
- Sliding Window pattern
- HashMap vs Array for tracking
- Bit manipulation tricks
- Binary Search on answer space
- Dynamic Programming memoization
- Graph traversal techniques

---

[← Back to Blind 75 Problems](../BLIND75_README.md)

