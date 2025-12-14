# 143. Reorder List

## Problem Statement
You are given the head of a singly linked-list. The list can be represented as:

```
L₀ → L₁ → … → Ln-1 → Ln
```

Reorder the list to be on the following form:

```
L₀ → Ln → L₁ → Ln-1 → L₂ → Ln-2 → …
```

You may **not** modify the values in the list's nodes. Only nodes themselves may be changed.

## Examples

### Example 1:
```
Input: head = [1,2,3,4]
Output: [1,4,2,3]
Explanation: Interleave first half [1,2] with reversed second half [4,3]
```

### Example 2:
```
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
Explanation: Interleave first half [1,2,3] with reversed second half [5,4]
```

## Constraints
- The number of nodes in the list is in the range `[1, 5 * 10⁴]`
- `1 <= Node.val <= 1000`

## Approach: Three-Step Solution (Find Middle + Reverse + Merge)

### Algorithm
This problem combines three classic linked list patterns:

1. **Find the middle** using slow and fast pointers (Floyd's algorithm)
2. **Reverse** the second half of the list
3. **Merge** the first half and reversed second half alternately

### Visual Walkthrough

#### Example: [1 → 2 → 3 → 4 → 5]

**Step 1: Find the Middle**
```
Initial: 1 → 2 → 3 → 4 → 5
         ↑
       slow, fast

After moving pointers:
1 → 2 → 3 → 4 → 5
         ↑
       slow (middle)

First half: 1 → 2 → 3
Second half: 3 → 4 → 5
```

**Step 2: Reverse Second Half**
```
Before: 3 → 4 → 5 → null
After:  5 → 4 → 3 → null
```

**Step 3: Merge Alternately**
```
First:  1 → 2 → 3
Second: 5 → 4 → 3

Merge step by step:
1. 1 → 5, 5 → 2
2. 2 → 4, 4 → 3
3. 3 (end)

Result: 1 → 5 → 2 → 4 → 3
```

### Detailed Step-by-Step

#### Step 1: Find Middle Using Slow-Fast Pointers
```java
ListNode slow = head;
ListNode fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;        // Move 1 step
    fast = fast.next.next;   // Move 2 steps
}
// slow is now at the middle
```

**Why this works:**
- Fast pointer moves twice as fast as slow
- When fast reaches end, slow is at middle
- For odd length: slow points to middle node
- For even length: slow points to start of second half

#### Step 2: Reverse Second Half
```java
ListNode prev = null;
ListNode curr = slow;
while (curr != null) {
    ListNode nextTemp = curr.next;
    curr.next = prev;
    prev = curr;
    curr = nextTemp;
}
// prev is now the head of reversed second half
```

#### Step 3: Merge Two Halves
```java
ListNode first = head;
ListNode second = prev;  // Reversed second half
while (second.next != null) {
    ListNode temp1 = first.next;
    ListNode temp2 = second.next;
    
    first.next = second;   // Link first to second
    second.next = temp1;   // Link second to next of first
    
    first = temp1;         // Move first forward
    second = temp2;        // Move second forward
}
```

**Why `second.next != null`?**
- Prevents adding an extra null node
- Handles both odd and even length lists
- For odd length: middle node stays in first half

### Key Insights

1. **Three independent operations**: Each step is a classic pattern
   - Finding middle: Two-pointer technique
   - Reversing list: Standard reversal algorithm
   - Merging: Alternating pointer manipulation

2. **In-place modification**: No extra space needed
   - Only rearranges pointers
   - Original nodes are reused

3. **Handles edge cases naturally**:
   - Single node: Condition check returns immediately
   - Two nodes: No reordering needed
   - Odd/even length: Merge condition handles both

## Complexity Analysis

### Time Complexity: O(n)
- **Step 1** (Find middle): O(n/2) = O(n)
- **Step 2** (Reverse): O(n/2) = O(n)
- **Step 3** (Merge): O(n/2) = O(n)
- **Total**: O(n) + O(n) + O(n) = O(n)

Each node is visited at most twice.

### Space Complexity: O(1)
- Only uses a constant number of pointers
- No additional data structures
- In-place modification

## Edge Cases Handled

### 1. Single Node
```
Input: [1]
Output: [1]
Check: head.next == null returns immediately
```

### 2. Two Nodes
```
Input: [1,2]
Output: [1,2]
No reordering needed, merge loop doesn't execute
```

### 3. Odd Length List
```
Input: [1,2,3,4,5]
Output: [1,5,2,4,3]
Middle node stays in first half
```

### 4. Even Length List
```
Input: [1,2,3,4]
Output: [1,4,2,3]
Perfect split between halves
```

## Common Patterns Used

### Pattern 1: Fast-Slow Pointer (Floyd's)
```java
// Find middle of linked list
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
```
**Used in:** Cycle detection, finding middle

### Pattern 2: Reverse Linked List
```java
// Standard iterative reversal
while (curr != null) {
    ListNode next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}
```
**Used in:** Many linked list problems

### Pattern 3: Merge/Weave Lists
```java
// Alternate between two lists
while (second.next != null) {
    temp1 = first.next;
    temp2 = second.next;
    first.next = second;
    second.next = temp1;
    // Move forward
}
```
**Used in:** Merge operations, rearrangements

## Alternative Approaches

### Approach 1: Using Extra Space (Stack/Array)
```java
public void reorderList(ListNode head) {
    List<ListNode> nodes = new ArrayList<>();
    ListNode curr = head;
    while (curr != null) {
        nodes.add(curr);
        curr = curr.next;
    }
    
    int i = 0, j = nodes.size() - 1;
    while (i < j) {
        nodes.get(i).next = nodes.get(j);
        i++;
        if (i == j) break;
        nodes.get(j).next = nodes.get(i);
        j--;
    }
    nodes.get(i).next = null;
}
```
- **Time**: O(n)
- **Space**: O(n) for array
- **Trade-off**: Simpler logic but uses extra space

### Approach 2: Recursive
```java
// Possible but complex and uses O(n) stack space
```
- Not recommended for this problem

## Patterns Referenced
- **Two-Pointer Pattern (Fast & Slow)**: [Pattern001_TwoPointerPattern.java](../patterns/Pattern001_TwoPointerPatten.java)
- **Linked List Reversal**: Standard pattern
- **Merge Pattern**: Alternating nodes

## Related Problems
- [Linked List Cycle](LinkedListCycle_README.md) - Fast-slow pointer
- [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) - Step 2 of this problem
- [Middle of Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) - Step 1 of this problem
- [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) - Similar technique

## Implementation Notes

### Why Not Modify Values?
Problem specifically states: "You may not modify the values in the list's nodes"
- Must rearrange actual node pointers
- Tests proper understanding of pointer manipulation

### Merge Loop Condition
```java
while (second.next != null)  // Not while (second != null)
```
**Reason:**
- Odd length: Middle node in first half, no pair for it
- Even length: Stops when both halves exhausted
- Prevents null pointer exception

### Middle Node Position
For odd length list [1,2,3,4,5]:
- Slow ends at node 3
- First half: 1→2→3
- Second half: 4→5 (reversed to 5→4)
- Result: 1→5→2→4→3 (node 3 has no pair)

## Tags
`Linked List` `Two Pointers` `Fast & Slow Pointers` `Reversal` `Merge` `Blind 75` `Medium`

