package blind75.medium;

import blind75.ListNode;
import static blind75.LinkedListUtils.*;

/**
 * 143. Reorder List
 * Medium
 * You are given the head of a singly linked-list. The list can be represented as:
 *
 * L0 → L1 → … → Ln - 1 → Ln
 * Reorder the list to be on the following form:
 *
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 *
 * Constraints:
 * The number of nodes in the list is in the range [1, 5 * 104].
 * 1 <= Node.val <= 1000
 */
public class ReorderList {
    public static void main(String[] args) {
        System.out.println("Reorder List:");
        System.out.println("=".repeat(50));

        // Test case 1: Even length list
        printTestCase(1, "Even length list");
        ListNode head1 = createList(new int[]{1, 2, 3, 4});
        System.out.print("Input:    ");
        printList(head1);
        reorderList(head1);
        System.out.print("Output:   ");
        printList(head1);
        System.out.println("Expected: [1 -> 4 -> 2 -> 3]");

        // Test case 2: Odd length list
        printTestCase(2, "Odd length list");
        ListNode head2 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.print("Input:    ");
        printList(head2);
        reorderList(head2);
        System.out.print("Output:   ");
        printList(head2);
        System.out.println("Expected: [1 -> 5 -> 2 -> 4 -> 3]");

        // Test case 3: Single node
        printTestCase(3, "Single node");
        ListNode head3 = createList(new int[]{1});
        System.out.print("Input:    ");
        printList(head3);
        reorderList(head3);
        System.out.print("Output:   ");
        printList(head3);
        System.out.println("Expected: [1]");

        // Test case 4: Two nodes
        printTestCase(4, "Two nodes");
        ListNode head4 = createList(new int[]{1, 2});
        System.out.print("Input:    ");
        printList(head4);
        reorderList(head4);
        System.out.print("Output:   ");
        printList(head4);
        System.out.println("Expected: [1 -> 2]");

        // Test case 5: Larger list
        printTestCase(5, "Larger list");
        ListNode head5 = createList(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.print("Input:    ");
        printList(head5);
        reorderList(head5);
        System.out.print("Output:   ");
        printList(head5);
        System.out.println("Expected: [1 -> 7 -> 2 -> 6 -> 3 -> 5 -> 4]");

        System.out.println("\n" + "=".repeat(50));
    }

    /**
     * Reorders the linked list by interleaving nodes from the first and second half.
     *
     * Algorithm:
     * 1. Find the middle of the list using slow and fast pointers
     * 2. Reverse the second half of the list
     * 3. Merge the first half and reversed second half alternately
     *
     * Example: [1,2,3,4,5] → [1,5,2,4,3]
     * Step 1: Split into [1,2,3] and [4,5]
     * Step 2: Reverse second half to [5,4]
     * Step 3: Merge: 1→5→2→4→3
     *
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(1) - only uses pointers, in-place modification
     *
     * @param head the head of the linked list to reorder
     */
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the linked list using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // Step 3: Merge the two halves alternately
        ListNode first = head;
        ListNode second = prev;
        while (second.next != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
