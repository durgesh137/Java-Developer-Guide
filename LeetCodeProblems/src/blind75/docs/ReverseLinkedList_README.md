# 206. Reverse Linked List

## Problem Statement
Given the head of a singly linked list, reverse the list, and return the reversed list.

## Examples

### Example 1:
```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
```

### Example 2:
```
Input: head = [1,2]
Output: [2,1]
```

### Example 3:
```
Input: head = []
Output: []
```

## Constraints
- The number of nodes in the list is in the range `[0, 5000]`
- `-5000 <= Node.val <= 5000`

## Follow-up
A linked list can be reversed either **iteratively** or **recursively**. Could you implement both?

---

## Solution 1: Iterative Approach (Recommended)

### Algorithm
Use three pointers to reverse the list in-place:

1. **Initialize pointers**:
   - `prev = null` (will become the new tail)
   - `current = head` (current node being processed)
   - `next` (temporary storage)

2. **Traverse and reverse**:
   - Save next node: `next = current.next`
   - Reverse the link: `current.next = prev`
   - Move forward: `prev = current`, `current = next`

3. **Return** `prev` as the new head

### Visual Walkthrough

#### Original List: 1 → 2 → 3 → null

**Step-by-Step:**
```
Initial:
prev = null
current = 1 → 2 → 3 → null

Step 1: Process node 1
next = 2
1.next = null (reverse)
prev = 1, current = 2
Result: null ← 1    2 → 3 → null

Step 2: Process node 2
next = 3
2.next = 1 (reverse)
prev = 2, current = 3
Result: null ← 1 ← 2    3 → null

Step 3: Process node 3
next = null
3.next = 2 (reverse)
prev = 3, current = null
Result: null ← 1 ← 2 ← 3

Return prev (3) as new head
Final: 3 → 2 → 1 → null
```

### Implementation
```java
public ListNode reverseListIterative(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    
    ListNode prev = null;
    ListNode current = head;
    
    while (current != null) {
        ListNode nextTemp = current.next;  // Save next
        current.next = prev;               // Reverse
        prev = current;                    // Move prev
        current = nextTemp;                // Move current
    }
    
    return prev;  // New head
}
```

### Complexity Analysis
- **Time Complexity:** O(n)
  - Single pass through all n nodes
  - Each node visited exactly once
- **Space Complexity:** O(1)
  - Only uses three pointer variables
  - No extra data structures

---

## Solution 2: Recursive Approach

### Algorithm
Use recursion to reverse the list:

1. **Base case**: If head is null or single node, return head
2. **Recursive case**:
   - Recursively reverse the rest of the list
   - Get the new head from recursion
   - Reverse the current link
   - Set current node's next to null

### Visual Walkthrough

#### Original List: 1 → 2 → 3 → null

**Recursion Stack:**
```
Call stack building up:
reverseList(1 → 2 → 3)
  └─ reverseList(2 → 3)
       └─ reverseList(3)
            └─ Base case: return 3

Unwinding and reversing:
At node 3: return 3 (newHead)

At node 2:
  newHead = 3
  2.next.next = 2  →  3.next = 2  →  3 → 2
  2.next = null
  return 3

At node 1:
  newHead = 3
  1.next.next = 1  →  2.next = 1  →  2 → 1
  1.next = null
  return 3

Final: 3 → 2 → 1 → null
```

### Key Insight: The Reversal Trick
```java
head.next.next = head;  // Current node's next should point back
head.next = null;        // Break the forward link
```

**Example at node 1:**
```
Before: 1 → 2 ← 3
        ↓
head.next = 2

head.next.next = head
  ↓
2.next = 1
  ↓
Result: 1 ← 2 ← 3

head.next = null
  ↓
Final: null ← 1 ← 2 ← 3
```

### Implementation
```java
public ListNode reverseListRecursive(ListNode head) {
    // Base case
    if (head == null || head.next == null) {
        return head;
    }
    
    // Recursively reverse rest
    ListNode newHead = reverseListRecursive(head.next);
    
    // Reverse current link
    head.next.next = head;
    head.next = null;
    
    return newHead;
}
```

### Complexity Analysis
- **Time Complexity:** O(n)
  - Visit each node once during recursion
- **Space Complexity:** O(n)
  - Recursion stack depth equals number of nodes
  - Each recursive call uses stack space

---

## Comparison: Iterative vs Recursive

| Aspect | Iterative | Recursive |
|--------|-----------|-----------|
| **Time** | O(n) | O(n) |
| **Space** | O(1) ✅ | O(n) ⚠️ |
| **Readability** | Moderate | More elegant |
| **Stack Overflow Risk** | None | Yes (for very large lists) |
| **Interview Preference** | Preferred | Good to know both |

### When to Use Which?

**Iterative (Recommended):**
- ✅ Production code
- ✅ Large lists (no stack overflow)
- ✅ When space is constrained
- ✅ Better performance

**Recursive (Educational):**
- ✅ Demonstrates recursion understanding
- ✅ More intuitive for some people
- ✅ Good for interviews (shows versatility)
- ⚠️ Not recommended for lists > 5000 nodes

---

## Edge Cases Handled

### 1. Empty List
```
Input: null
Output: null
Check: head == null returns immediately
```

### 2. Single Node
```
Input: [1]
Output: [1]
Check: head.next == null returns head
```

### 3. Two Nodes
```
Input: [1,2]
Output: [2,1]
Both solutions handle correctly
```

### 4. Large List
```
Input: [1,2,3,...,5000]
Output: [5000,...,3,2,1]
Iterative: ✅ No problem
Recursive: ⚠️ May cause stack overflow
```

---

## Common Mistakes to Avoid

### Mistake 1: Losing Reference to Next Node
```java
// WRONG ❌
current.next = prev;
current = current.next;  // Lost reference!

// CORRECT ✅
ListNode next = current.next;
current.next = prev;
current = next;
```

### Mistake 2: Not Handling Empty List
```java
// WRONG ❌
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    // NPE if head is null!
}

// CORRECT ✅
if (head == null) return null;
```

### Mistake 3: Recursive Cycle
```java
// WRONG ❌
head.next.next = head;
// Forgot: head.next = null;
// Creates cycle!

// CORRECT ✅
head.next.next = head;
head.next = null;  // Break forward link
```

---

## Pattern Recognition

### This Pattern Appears In:
1. **Reverse Linked List II** - Reverse portion of list
2. **Palindrome Linked List** - Reverse half and compare
3. **Reorder List** - Reverse second half
4. **Reverse Nodes in k-Group** - Reverse in chunks

### Related Techniques:
- **Three-pointer technique** (iterative)
- **Recursion with state passing**
- **In-place modification**

---

## Implementation Notes

### Why Three Pointers?
```
Need to keep track of:
1. prev: Where we came from
2. current: Where we are
3. next: Where we're going

Without all three, we lose references!
```

### Why Recursion Works
```
Each call:
1. Goes deeper until base case
2. Unwinds and fixes pointers
3. Returns the same newHead up

Key: newHead stays constant (original tail)
     Only links change as we unwind
```

---

## Practice Variations

### Level 1: Understanding
- Reverse first N nodes
- Reverse between positions m and n
- Check if reverse equals original (palindrome)

### Level 2: Application
- Reverse in groups of k
- Reverse alternate k nodes
- Reverse and compare two lists

### Level 3: Advanced
- Reverse doubly linked list
- Reverse and merge
- Reverse with constraints

---

## Tags
`Linked List` `Reversal` `Two Pointers` `Recursion` `Easy` `Blind 75` `Foundation`

