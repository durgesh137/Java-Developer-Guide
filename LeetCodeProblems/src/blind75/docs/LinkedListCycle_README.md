# 141. Linked List Cycle

## Problem Statement
Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. **Note that `pos` is not passed as a parameter.**

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

## Examples

### Example 1:
```
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
```

### Example 2:
```
Input: head = [1,2], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
```

### Example 3:
```
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
```

## Constraints
- The number of the nodes in the list is in the range `[0, 10^4]`
- `-10^5 <= Node.val <= 10^5`
- `pos` is `-1` or a valid index in the linked-list

## Follow-up
Can you solve it using **O(1)** (i.e. constant) memory?

## Approach: Floyd's Cycle Detection Algorithm (Tortoise and Hare)

### Algorithm
1. **Initialize two pointers**: `slow` and `fast`, both starting at the head
2. **Move pointers at different speeds**:
   - `slow` moves one step at a time
   - `fast` moves two steps at a time
3. **Check for meeting point**:
   - If `fast` reaches the end (`null`), there's no cycle
   - If `slow` and `fast` meet at any point, there's a cycle

### Why It Works
- **No Cycle**: Fast pointer will reach the end first
- **With Cycle**: Fast pointer will eventually catch up to slow pointer inside the cycle
- **Analogy**: Like two runners on a circular track - the faster runner will eventually lap the slower one

### Key Insights
1. **Two-pointer technique** with different speeds
2. **Meeting point guarantees cycle** - If they meet, they must be in a cycle
3. **O(1) space complexity** - Only uses two pointers, no extra data structures
4. **Handles edge cases**: Empty list, single node, self-loop

## Complexity Analysis

### Time Complexity: O(n)
- **Without cycle**: Fast pointer reaches end in O(n/2) = O(n) steps
- **With cycle**: 
  - Fast pointer enters cycle first
  - Once both are in cycle, they meet within one cycle length
  - Total: O(n) where n is number of nodes

### Space Complexity: O(1)
- Only uses two pointer variables
- No additional data structures (HashSet, etc.)
- Meets the follow-up requirement

## Alternative Approaches

### Approach 1: Hash Set (Not O(1) Space)
```java
public boolean hasCycle(ListNode head) {
    Set<ListNode> visited = new HashSet<>();
    ListNode current = head;
    
    while (current != null) {
        if (visited.contains(current)) {
            return true;
        }
        visited.add(current);
        current = current.next;
    }
    return false;
}
```
- **Time Complexity**: O(n)
- **Space Complexity**: O(n) - Uses HashSet
- **Trade-off**: Easier to understand but uses extra memory

### Approach 2: Modify List (Destructive)
- Mark visited nodes by modifying their values
- Not recommended as it modifies the input
- Space: O(1), but alters the original list

## Pattern Used
- **Two-Pointer Pattern (Fast & Slow)**: [Pattern001_TwoPointerPattern.java](../patterns/Pattern001_TwoPointerPatten.java)
- Also known as **Floyd's Cycle Detection** or **Tortoise and Hare Algorithm**

## Related Problems
- [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) - Find where cycle begins
- [Happy Number](https://leetcode.com/problems/happy-number/) - Uses similar cycle detection
- [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) - Array version of cycle detection

## Implementation Notes

### Edge Cases Handled
1. **Empty list** (`head == null`) → return false
2. **Single node, no cycle** → return false
3. **Single node with self-loop** → return true
4. **Two nodes, no cycle** → return false

### Visual Representation
```
Cycle Detection:
3 -> 2 -> 0 -> -4
     ^__________|

Step-by-step:
1. slow = 3, fast = 3
2. slow = 2, fast = 0
3. slow = 0, fast = 2  (fast entered cycle)
4. slow = -4, fast = -4 (MEET! Cycle detected)
```

## Tags
`Linked List` `Two Pointers` `Fast & Slow Pointers` `Floyd's Algorithm` `Blind 75` `Easy`

