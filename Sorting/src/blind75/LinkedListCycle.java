package blind75;

/**
 * 141. Linked List Cycle
 * Easy
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Constraints:
 * The number of the nodes in the list is in the range [0, 104].
 * -105 <= Node.val <= 105
 * pos is -1 or a valid index in the linked-list.
 *
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */

import samples.Display;

/**
* Definition for singly-linked list.
* class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        System.out.println("Linked List Cycle:");
        System.out.println("=".repeat(50));

        // Test case 1: Cycle at position 1
        Display.printTestCase(1);
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create a cycle
        printLinkedList(head, 1);
        System.out.println("Result: " + hasCycle(head));
        System.out.println("Expected: true\n");

        // Test case 2: No cycle
        Display.printTestCase(2);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        printLinkedList(head2, -1);
        System.out.println("Result: " + hasCycle(head2));
        System.out.println("Expected: false\n");

        // Test case 3: Single node, no cycle
        Display.printTestCase(3);
        ListNode head3 = new ListNode(1);
        printLinkedList(head3, -1);
        System.out.println("Result: " + hasCycle(head3));
        System.out.println("Expected: false\n");

        // Test case 4: Single node with cycle to itself
        Display.printTestCase(4);
        ListNode head4 = new ListNode(-1);
        head4.next = head4; // Create a cycle
        printLinkedList(head4, 0);
        System.out.println("Result: " + hasCycle(head4));
        System.out.println("Expected: true\n");

        // Test case 5: Empty list
        Display.printTestCase(5);
        ListNode head5 = null;
        printLinkedList(head5, -1);
        System.out.println("Result: " + hasCycle(head5));
        System.out.println("Expected: false\n");

        System.out.println("=".repeat(50));
    }

    /**
     * Prints the linked list structure with cycle information.
     * Uses Floyd's cycle detection to identify if a cycle exists and where it connects.
     *
     * @param head the head of the linked list
     * @param pos the position where cycle connects (-1 if no cycle)
     */
    public static void printLinkedList(ListNode head, int pos) {
        if (head == null) {
            System.out.println("List: []");
            System.out.println("No cycle (pos = -1)");
            return;
        }

        // Print list values
        System.out.print("List: [");
        ListNode current = head;
        int count = 0;
        int maxNodes = 10; // Limit printing to avoid infinite loop in cyclic lists

        while (current != null && count < maxNodes) {
            System.out.print(current.val);
            if (current.next != null && count < maxNodes - 1) {
                System.out.print(" -> ");
            }
            current = current.next;
            count++;
        }

        if (count >= maxNodes && current != null) {
            System.out.print(" -> ...");
        }
        System.out.println("]");

        // Print cycle information
        if (pos == -1) {
            System.out.println("No cycle (pos = -1)");
        } else {
            System.out.println("Cycle: tail connects to node at index " + pos);
        }
    }

    /**
     * Detects if a linked list has a cycle using Floyd's Cycle Detection Algorithm (Tortoise and Hare).
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param head the head of the linked list
     * @return true if cycle exists, false otherwise
     */
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    public String toString() {
        return Integer.toString(val);
    }
}
