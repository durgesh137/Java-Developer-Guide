# 19. Remove Nth Node From End of List

## Problem Statement
Given the head of a linked list, remove the nth node from the end of the list and return its head.

## Examples

### Example 1:
```
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Explanation: Remove the 2nd node from the end (node with value 4)
```

### Example 2:
```
Input: head = [1], n = 1
Output: []
Explanation: Remove the only node
```

### Example 3:
```
Input: head = [1,2], n = 1
Output: [1]
Explanation: Remove the last node
```

## Constraints
- The number of nodes in the list is `sz`
- `1 <= sz <= 30`
- `0 <= Node.val <= 100`
- `1 <= n <= sz`

## Follow-up
Can you do this in **one pass**?

## Approach: Two-Pointer Technique with Gap

### Algorithm
1. **Create a dummy node** pointing to head
   - Handles edge case of removing the head node
   - Simplifies pointer manipulation
2. **Initialize two pointers** (first and second) at dummy
3. **Move first pointer n+1 steps ahead**
   - Creates a gap of n nodes between first and second
4. **Move both pointers** until first reaches the end (null)
   - Maintains the gap of n nodes
   - When first reaches end, second is just before the node to remove
5. **Remove the target node**: `second.next = second.next.next`
6. **Return** `dummy.next` (handles case where head was removed)

### Visual Example
```
Problem: Remove 2nd node from end (n=2)
List: [1 → 2 → 3 → 4 → 5]

Step 1: Create dummy and initialize pointers
dummy → 1 → 2 → 3 → 4 → 5 → null
  ↑
first, second

Step 2: Move first n+1=3 steps ahead
dummy → 1 → 2 → 3 → 4 → 5 → null
  ↑              ↑
second        first

Step 3: Move both until first reaches null
dummy → 1 → 2 → 3 → 4 → 5 → null
              ↑              ↑
          second          first

Step 4: Remove node (second.next = second.next.next)
dummy → 1 → 2 → 3 → 5 → null
              ↑
          second

Result: [1 → 2 → 3 → 5]
```

### Why This Works
- **Gap Maintenance**: The gap between first and second is always n nodes
- **One Pass**: We traverse the list only once
- **Proper Positioning**: When first reaches null, second is exactly at the node before the one to be removed
- **Dummy Node**: Eliminates special case handling for removing the head

### Key Insights
1. **Dummy node simplifies edge cases** - No special handling needed for head removal
2. **Gap of n+1** - Moving first n+1 steps ensures second stops at the right position
3. **Single pass solution** - Meets the follow-up requirement
4. **Two-pointer pattern** - Classic technique for linked list problems

## Complexity Analysis

### Time Complexity: O(L)
- L is the length of the linked list
- We traverse the list once with the first pointer
- Single pass solution as required by follow-up

### Space Complexity: O(1)
- Only uses constant extra space (two pointers + dummy node)
- No additional data structures needed

## Edge Cases Handled

1. **Remove only node**: List becomes empty
   ```
   Input: [1], n=1 → Output: []
   ```

2. **Remove head node**: When n equals list length
   ```
   Input: [1,2], n=2 → Output: [2]
   ```

3. **Remove last node**: When n=1
   ```
   Input: [1,2,3], n=1 → Output: [1,2]
   ```

4. **Remove middle node**: General case
   ```
   Input: [1,2,3,4,5], n=2 → Output: [1,2,3,5]
   ```

## Alternative Approaches

### Approach 1: Two-Pass Solution
```java
public ListNode removeNthFromEnd(ListNode head, int n) {
    // First pass: count length
    int length = 0;
    ListNode current = head;
    while (current != null) {
        length++;
        current = current.next;
    }
    
    // Second pass: remove (length - n)th node
    // ... implementation
}
```
- **Time**: O(L) but requires two passes
- **Space**: O(1)
- **Drawback**: Doesn't meet follow-up requirement

### Approach 2: Using Stack
```java
public ListNode removeNthFromEnd(ListNode head, int n) {
    Stack<ListNode> stack = new Stack<>();
    ListNode current = head;
    while (current != null) {
        stack.push(current);
        current = current.next;
    }
    // Pop n times to reach target
}
```
- **Time**: O(L)
- **Space**: O(L) for stack
- **Drawback**: Uses extra space

## Pattern Used
- **Two-Pointer Pattern (Fast & Slow with Gap)**: [Pattern001_TwoPointerPattern.java](../patterns/Pattern001_TwoPointerPatten.java)
- **Dummy Node Technique**: Common pattern in linked list manipulation

## Related Problems
- [Linked List Cycle](LinkedListCycle_README.md) - Two-pointer technique
- [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/) - Similar removal pattern
- [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/) - Node removal
- [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) - Linked list manipulation

## Implementation Notes

### Why Dummy Node?
Without dummy node, removing head requires special handling:
```java
if (n == length) {
    return head.next; // Special case for head
}
```

With dummy node, all cases are handled uniformly.

### Why n+1 Steps?
- Moving n steps would position second at the node to remove
- Moving n+1 steps positions second **before** the node to remove
- This allows us to do: `second.next = second.next.next`

## Tags
`Linked List` `Two Pointers` `Dummy Node` `Blind 75` `Medium`

