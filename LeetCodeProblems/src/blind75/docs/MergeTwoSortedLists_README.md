# 21. Merge Two Sorted Lists

**Difficulty:** Easy  
**Topics:** Linked List, Two Pointers, Recursion  
**LeetCode Link:** [Problem #21](https://leetcode.com/problems/merge-two-sorted-lists/)

---

## Problem Statement

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

---

## Examples

### Example 1:
```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

### Example 2:
```
Input: list1 = [], list2 = []
Output: []
```

### Example 3:
```
Input: list1 = [], list2 = [0]
Output: [0]
```

---

## Constraints

- The number of nodes in both lists is in the range `[0, 50]`
- `-100 <= Node.val <= 100`
- Both `list1` and `list2` are sorted in **non-decreasing order**

---

## Solution Approach

### Algorithm: Iterative Two-Pointer with Dummy Node

**Strategy:**
1. Create a dummy node to serve as the start of the merged list
2. Use a current pointer to track the end of the merged list
3. Compare nodes from both lists and attach the smaller one to current
4. Move the pointer forward in the list from which the node was taken
5. After one list is exhausted, attach the remaining nodes from the other list
6. Return `dummy.next` as the head of the merged list

**Why Dummy Node?**
- Simplifies edge cases (empty lists)
- Avoids special handling for the first node
- Makes code cleaner and more maintainable

---

## Implementation

```java
public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // Create a dummy node to serve as the start of the merged list
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    // Traverse both lists and append the smaller value to the merged list
    while (list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
            current.next = list1;
            list1 = list1.next;
        } else {
            current.next = list2;
            list2 = list2.next;
        }
        current = current.next;
    }

    // If there are remaining nodes in either list, append them
    if (list1 != null) {
        current.next = list1;
    } else if (list2 != null) {
        current.next = list2;
    }

    // Return the merged list, which starts from the next of the dummy node
    return dummy.next;
}
```

---

## Complexity Analysis

| Metric | Complexity | Explanation |
|--------|-----------|-------------|
| **Time** | O(n + m) | We traverse both lists exactly once, where n and m are lengths |
| **Space** | O(1) | Only constant extra space for pointers (no new nodes created) |

---

## Key Concepts

### 1. **Dummy Node Pattern**
- Simplifies linked list operations by providing a consistent starting point
- Eliminates need for special handling of the head node
- Common pattern in many linked list problems

### 2. **Two-Pointer Technique**
- Maintain pointers for both input lists
- Compare and advance pointers based on values
- Efficient for merging sorted sequences

### 3. **In-Place Merging**
- Reuses existing nodes instead of creating new ones
- Achieves O(1) space complexity
- Simply rewires the `next` pointers

---

## Pattern Recognition

This problem demonstrates the **Two-Pointer with Dummy Node** pattern, useful for:
- Merging sorted structures
- Building new linked lists
- Problems requiring sequential comparison of two inputs

**Related Patterns:**
- Two Pointers (see: [patterns/Pattern001_TwoPointerPattern.java](../../patterns/Pattern001_TwoPointerPatten.java))
- Dummy Node Pattern (common in linked list problems)

---

## Edge Cases Handled

1. **Both lists empty**: Returns `null`
2. **One list empty**: Returns the other list
3. **Lists with duplicate values**: Maintains all duplicates
4. **Lists of different lengths**: Correctly appends remaining nodes

---

## Alternative Approach: Recursive

```java
public static ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    
    if (l1.val <= l2.val) {
        l1.next = mergeTwoListsRecursive(l1.next, l2);
        return l1;
    } else {
        l2.next = mergeTwoListsRecursive(l1, l2.next);
        return l2;
    }
}
```

**Complexity:**
- Time: O(n + m)
- Space: O(n + m) due to recursive call stack

---

## Related Problems

- [Easy] #141 - Linked List Cycle
- [Easy] #206 - Reverse Linked List
- [Medium] #19 - Remove Nth Node From End of List
- [Medium] #143 - Reorder List

---

## Tags
`#LinkedList` `#TwoPointers` `#DummyNode` `#Merge` `#Easy` `#Blind75`

