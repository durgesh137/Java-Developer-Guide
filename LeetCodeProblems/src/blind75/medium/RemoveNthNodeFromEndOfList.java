package blind75.medium;

import blind75.ListNode;
import static blind75.LinkedListUtils.*;

/**
 * 19. Remove Nth Node From End of List
 * Medium
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 * Constraints:
 * The number of nodes in the list is sz.
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 *
 * Follow up: Could you do this in one pass?
 */
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        System.out.println("Remove Nth Node From End Of List:");
        System.out.println("=".repeat(50));

        // Test case 1: Remove 2nd from end
        printTestCase(1, "Remove 2nd node from end");
        ListNode head1 = createList(new int[]{1, 2, 3, 4, 5});
        int n1 = 2;
        System.out.print("Input:    ");
        printList(head1);
        System.out.println("n = " + n1);
        ListNode result1 = removeNthFromEnd(head1, n1);
        System.out.print("Output:   ");
        printList(result1);
        System.out.println("Expected: [1 -> 2 -> 3 -> 5]");

        // Test case 2: Remove only node
        printTestCase(2, "Remove only node");
        ListNode head2 = createList(new int[]{1});
        int n2 = 1;
        System.out.print("Input:    ");
        printList(head2);
        System.out.println("n = " + n2);
        ListNode result2 = removeNthFromEnd(head2, n2);
        System.out.print("Output:   ");
        printList(result2);
        System.out.println("Expected: []");

        // Test case 3: Remove head node
        printTestCase(3, "Remove head node (from end means first)");
        ListNode head3 = createList(new int[]{1, 2});
        int n3 = 2;
        System.out.print("Input:    ");
        printList(head3);
        System.out.println("n = " + n3);
        ListNode result3 = removeNthFromEnd(head3, n3);
        System.out.print("Output:   ");
        printList(result3);
        System.out.println("Expected: [2]");

        // Test case 4: Remove last node
        printTestCase(4, "Remove last node");
        ListNode head4 = createList(new int[]{1, 2, 3});
        int n4 = 1;
        System.out.print("Input:    ");
        printList(head4);
        System.out.println("n = " + n4);
        ListNode result4 = removeNthFromEnd(head4, n4);
        System.out.print("Output:   ");
        printList(result4);
        System.out.println("Expected: [1 -> 2]");

        // Test case 5: Remove middle node
        printTestCase(5, "Remove middle node (4th from end)");
        ListNode head5 = createList(new int[]{1, 2, 3, 4, 5, 6, 7});
        int n5 = 4;
        System.out.print("Input:    ");
        printList(head5);
        System.out.println("n = " + n5);
        ListNode result5 = removeNthFromEnd(head5, n5);
        System.out.print("Output:   ");
        printList(result5);
        System.out.println("Expected: [1 -> 2 -> 3 -> 5 -> 6 -> 7]");

        System.out.println("\n" + "=".repeat(50));
    }

    /**
     * Removes the nth node from the end of the list using two-pointer technique.
     * Uses a dummy node to handle edge cases like removing the head.
     *
     * Algorithm:
     * 1. Create a dummy node pointing to head (handles edge case of removing head)
     * 2. Initialize two pointers (first and second) at dummy
     * 3. Move first pointer n+1 steps ahead
     * 4. Move both pointers until first reaches the end
     * 5. second.next is now the node to remove, so skip it
     *
     * Time Complexity: O(L) where L is the length of the list - single pass solution
     * Space Complexity: O(1) - only uses two pointers
     *
     * @param head the head of the linked list
     * @param n the position from the end (1-indexed)
     * @return the head of the modified list
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        // Remove the nth node from end
        second.next = second.next.next;

        return dummy.next;
    }
}
