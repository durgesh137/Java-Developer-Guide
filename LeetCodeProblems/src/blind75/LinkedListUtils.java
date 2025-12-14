package blind75;

/**
 * Utility class for common linked list operations.
 * Provides helper methods for printing, creating, and manipulating linked lists.
 */
public class LinkedListUtils {

    /**
     * Prints the linked list in a readable format.
     * For cyclic lists, limits output to prevent infinite loops.
     *
     * @param head the head of the linked list
     */
    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        ListNode current = head;
        int count = 0;
        int maxNodes = 100; // Limit to prevent infinite loop in cyclic lists

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
    }

    /**
     * Prints the linked list structure with cycle information.
     * Uses Floyd's cycle detection to identify if a cycle exists and where it connects.
     *
     * @param head the head of the linked list
     * @param pos the position where cycle connects (-1 if no cycle)
     */
    public static void printLinkedListWithCycle(ListNode head, int pos) {
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
     * Creates a linked list from an array of values.
     *
     * @param values array of integer values
     * @return head of the created linked list
     */
    public static ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    /**
     * Gets the length of the linked list.
     * For cyclic lists, this will return -1 to indicate infinite length.
     *
     * @param head the head of the linked list
     * @return length of the list, or -1 if cyclic
     */
    public static int getLength(ListNode head) {
        if (head == null) {
            return 0;
        }

        // Use Floyd's algorithm to detect cycle
        ListNode slow = head;
        ListNode fast = head;

        int length = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            length++;

            if (slow == fast) {
                return -1; // Cycle detected
            }
        }

        // Count remaining nodes
        ListNode current = head;
        length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    /**
     * Converts linked list to array for easy comparison in tests.
     *
     * @param head the head of the linked list
     * @return array representation of the list
     */
    public static int[] toArray(ListNode head) {
        int length = getLength(head);
        if (length == -1 || length == 0) {
            return new int[0];
        }

        int[] result = new int[length];
        ListNode current = head;
        int index = 0;

        while (current != null && index < length) {
            result[index++] = current.val;
            current = current.next;
        }

        return result;
    }

    /**
     * Compares two linked lists for equality.
     *
     * @param head1 first linked list
     * @param head2 second linked list
     * @return true if lists are equal, false otherwise
     */
    public static boolean areEqual(ListNode head1, ListNode head2) {
        ListNode current1 = head1;
        ListNode current2 = head2;

        while (current1 != null && current2 != null) {
            if (current1.val != current2.val) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return current1 == null && current2 == null;
    }

    /**
     * Prints a formatted test case header.
     *
     * @param testNumber the test case number
     * @param description optional description of the test case
     */
    public static void printTestCase(int testNumber, String description) {
        System.out.println("\nTest Case " + testNumber + (description != null ? ": " + description : ""));
        System.out.println("-".repeat(40));
    }

    /**
     * Prints a formatted test case header.
     *
     * @param testNumber the test case number
     */
    public static void printTestCase(int testNumber) {
        printTestCase(testNumber, null);
    }
}

