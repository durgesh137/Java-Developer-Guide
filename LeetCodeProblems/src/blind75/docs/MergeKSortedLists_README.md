# 23. Merge k Sorted Lists

**Difficulty:** Hard  
**Topics:** Linked List, Divide and Conquer, Heap (Priority Queue), Merge Sort  
**LeetCode Link:** [Problem #23](https://leetcode.com/problems/merge-k-sorted-lists/)

---

## Problem Statement

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

---

## Examples

### Example 1:
```
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6
```

### Example 2:
```
Input: lists = []
Output: []
```

### Example 3:
```
Input: lists = [[]]
Output: []
```

---

## Constraints

- `k == lists.length`
- `0 <= k <= 10^4`
- `0 <= lists[i].length <= 500`
- `-10^4 <= lists[i][j] <= 10^4`
- `lists[i]` is sorted in **ascending order**
- The sum of `lists[i].length` will not exceed `10^4`

---

## Solution Approach

### Algorithm: Divide and Conquer (Merge Sort Strategy)

**Strategy:**
1. Use divide and conquer to merge k lists efficiently
2. Recursively split the array of lists into two halves
3. Merge the two halves using the two-pointer merge technique (from Problem 21)
4. Continue until all lists are merged into one

**Why Divide and Conquer?**
- Reduces the number of comparisons compared to sequential merging
- Reuses the efficient O(n+m) merge algorithm from MergeTwoSortedLists
- Balances the merge tree for optimal performance
- Time complexity: O(N log k) where N is total nodes and k is number of lists

**Visual Representation:**
```
Round 1: [L1, L2, L3, L4, L5, L6, L7, L8]
         ↓    ↓    ↓    ↓    ↓    ↓    ↓    ↓
Round 2: [L1+L2]  [L3+L4]  [L5+L6]  [L7+L8]
         ↓         ↓         ↓         ↓
Round 3: [L1+L2+L3+L4]     [L5+L6+L7+L8]
         ↓                  ↓
Final:   [L1+L2+L3+L4+L5+L6+L7+L8]
```

---

## Implementation

```java
public static ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
        return null;
    }
    return mergeKListsHelper(lists, 0, lists.length - 1);
}

private static ListNode mergeKListsHelper(ListNode[] lists, int start, int end) {
    // Base case: only one list in this range
    if (start == end) {
        return lists[start];
    }
    
    // Divide: find the middle point
    int mid = start + (end - start) / 2;
    
    // Conquer: recursively merge left and right halves
    ListNode left = mergeKListsHelper(lists, start, mid);
    ListNode right = mergeKListsHelper(lists, mid + 1, end);
    
    // Combine: merge the two sorted lists
    return mergeTwoLists(left, right);
}
```

**Note:** This implementation reuses `mergeTwoLists()` from Problem 21 (Merge Two Sorted Lists).

---

## Complexity Analysis

| Metric | Complexity | Explanation |
|--------|-----------|-------------|
| **Time** | O(N log k) | N = total nodes, k = number of lists. Each level merges N nodes, log k levels |
| **Space** | O(log k) | Recursion stack depth for divide and conquer approach |

### Detailed Analysis:
- **Merge Operations:** log k levels (binary split of k lists)
- **Nodes per Level:** N total nodes are processed at each level
- **Total:** N × log k operations

---

## Key Concepts

### 1. **Divide and Conquer Pattern**
- Break problem into smaller subproblems
- Solve subproblems recursively
- Combine solutions to solve original problem
- Classic merge sort strategy applied to linked lists

### 2. **Recursion with Range Parameters**
- `start` and `end` define the current working range
- Base case: when `start == end`, return single list
- Recursive case: split range and merge results

### 3. **Binary Split Optimization**
- Splits k lists into two halves repeatedly
- Creates a balanced merge tree
- Much better than sequential merging (O(Nk) vs O(N log k))

### 4. **Reusing Merge Two Lists**
- Leverages the efficient two-pointer merge algorithm
- Code reuse promotes maintainability
- Each merge is O(n+m) for two lists

---

## Alternative Approaches

### Approach 1: Brute Force (Sequential Merging)
```java
// Merge lists one by one
ListNode result = lists[0];
for (int i = 1; i < lists.length; i++) {
    result = mergeTwoLists(result, lists[i]);
}
```
**Complexity:**
- Time: O(Nk) - where N is average list length, k is number of lists
- Space: O(1)
- **Problem:** Inefficient for large k

### Approach 2: Min-Heap (Priority Queue)
```java
// Add first node of each list to min-heap
// Repeatedly extract min, add to result, push next node
PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
```
**Complexity:**
- Time: O(N log k) - N insertions/deletions in heap of size k
- Space: O(k) - heap size
- **Advantage:** Intuitive approach, good for streaming data

### Approach 3: Divide and Conquer (Implemented)
**Complexity:**
- Time: O(N log k)
- Space: O(log k)
- **Advantage:** Best space complexity, reuses existing merge logic

---

## Pattern Recognition

This problem demonstrates the **Divide and Conquer** pattern, useful for:
- Merging multiple sorted structures efficiently
- Problems requiring optimal splitting strategies
- Reducing complexity from O(n²) or O(nk) to O(n log n) or O(n log k)

**Related Patterns:**
- Two Pointers (see: Problem 21 - Merge Two Sorted Lists)
- Merge Sort algorithm
- Binary divide and conquer

---

## Edge Cases Handled

1. **Empty array**: `lists = []` → Returns `null`
2. **Array with empty list**: `lists = [[]]` → Returns `null`
3. **Single list**: Returns that list directly
4. **Lists of varying lengths**: Correctly merges all nodes
5. **Duplicate values across lists**: Maintains all duplicates in order

---

## Step-by-Step Example

**Input:** `lists = [[1,4,5], [1,3,4], [2,6]]`

```
Step 1: mergeKListsHelper(0, 2)
├─ mid = 1
├─ left = mergeKListsHelper(0, 1)
│  ├─ mid = 0
│  ├─ left = lists[0] → [1,4,5]
│  ├─ right = lists[1] → [1,3,4]
│  └─ merge → [1,1,3,4,4,5]
│
└─ right = mergeKListsHelper(2, 2)
   └─ return lists[2] → [2,6]

Step 2: Merge [1,1,3,4,4,5] and [2,6]
Result: [1,1,2,3,4,4,5,6]
```

---

## Related Problems

- [Easy] #21 - Merge Two Sorted Lists (building block for this problem)
- [Medium] #148 - Sort List (merge sort on linked list)
- [Hard] #25 - Reverse Nodes in k-Group
- [Medium] #373 - Find K Pairs with Smallest Sums

---

## Tags
`#LinkedList` `#DivideAndConquer` `#MergeSort` `#Recursion` `#Hard` `#Blind75`

