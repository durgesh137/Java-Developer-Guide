package blind75.easy;

import blind75.ListNode;
import static blind75.LinkedListUtils.*;

/**
 * 206. Reverse Linked List
 * Easy
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Constraints:
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 *
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println("Reverse Linked List:");
        System.out.println("=".repeat(50));

        // Test Iterative Solution
        System.out.println("ITERATIVE SOLUTION:");
        System.out.println("-".repeat(50));

        // Test case 1: Normal list
        printTestCase(1, "Normal list (iterative)");
        ListNode head1 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.print("Input:    ");
        printList(head1);
        ListNode result1 = reverseListIterative(head1);
        System.out.print("Output:   ");
        printList(result1);
        System.out.println("Expected: [5 -> 4 -> 3 -> 2 -> 1]");

        // Test case 2: Two nodes
        printTestCase(2, "Two nodes (iterative)");
        ListNode head2 = createList(new int[]{1, 2});
        System.out.print("Input:    ");
        printList(head2);
        ListNode result2 = reverseListIterative(head2);
        System.out.print("Output:   ");
        printList(result2);
        System.out.println("Expected: [2 -> 1]");

        // Test case 3: Empty list
        printTestCase(3, "Empty list (iterative)");
        ListNode head3 = null;
        System.out.print("Input:    ");
        printList(head3);
        ListNode result3 = reverseListIterative(head3);
        System.out.print("Output:   ");
        printList(result3);
        System.out.println("Expected: []");

        System.out.println("\n" + "=".repeat(50));
        System.out.println("RECURSIVE SOLUTION:");
        System.out.println("-".repeat(50));

        // Test case 4: Normal list (recursive)
        printTestCase(4, "Normal list (recursive)");
        ListNode head4 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.print("Input:    ");
        printList(head4);
        ListNode result4 = reverseListRecursive(head4);
        System.out.print("Output:   ");
        printList(result4);
        System.out.println("Expected: [5 -> 4 -> 3 -> 2 -> 1]");

        // Test case 5: Single node (recursive)
        printTestCase(5, "Single node (recursive)");
        ListNode head5 = createList(new int[]{1});
        System.out.print("Input:    ");
        printList(head5);
        ListNode result5 = reverseListRecursive(head5);
        System.out.print("Output:   ");
        printList(result5);
        System.out.println("Expected: [1]");

        // Test case 6: Larger list (recursive)
        printTestCase(6, "Larger list (recursive)");
        ListNode head6 = createList(new int[]{10, 20, 30, 40, 50, 60});
        System.out.print("Input:    ");
        printList(head6);
        ListNode result6 = reverseListRecursive(head6);
        System.out.print("Output:   ");
        printList(result6);
        System.out.println("Expected: [60 -> 50 -> 40 -> 30 -> 20 -> 10]");

        System.out.println("\n" + "=".repeat(50));
    }

    /**
     * Reverses a linked list iteratively using three pointers.
     *
     * Algorithm:
     * 1. Use three pointers: prev (null), current (head), next (temp storage)
     * 2. Iterate through the list
     * 3. For each node: save next, reverse pointer, move forward
     * 4. Return prev (new head)
     *
     * Example: 1→2→3→null becomes 3→2→1→null
     *
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(1) - only uses three pointer variables
     *
     * @param head the head of the linked list
     * @return the new head of the reversed list
     */
    public static ListNode reverseListIterative(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next;  // Save next node
            current.next = prev;               // Reverse the pointer
            prev = current;                    // Move prev forward
            current = nextTemp;                // Move current forward
        }

        return prev;  // prev is the new head
    }

    /**
     * Reverses a linked list recursively.
     *
     * Algorithm:
     * 1. Base case: if head is null or single node, return head
     * 2. Recursively reverse the rest of the list
     * 3. Set head.next.next = head (reverse the link)
     * 4. Set head.next = null (avoid cycle)
     * 5. Return the new head from recursion
     *
     * Example: 1→2→3→null
     * - Recurse to end: get newHead = 3
     * - At node 2: 2.next.next = 2 → creates 3→2
     * - At node 1: 1.next.next = 1 → creates 2→1
     * Result: 3→2→1→null
     *
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(n) due to recursion stack
     *
     * @param head the head of the linked list
     * @return the new head of the reversed list
     */
    public static ListNode reverseListRecursive(ListNode head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list
        ListNode newHead = reverseListRecursive(head.next);

        // Reverse the link: head.next should point back to head
        head.next.next = head;

        // Set current node's next to null to avoid cycle
        head.next = null;

        return newHead;  // Return the new head (tail of original list)
    }

    /**
     * Alias for iterative solution (default implementation).
     *
     * @param head the head of the linked list
     * @return the new head of the reversed list
     */
    public static ListNode reverseList(ListNode head) {
        return reverseListIterative(head);
    }
}
