package blind75.easy;

import blind75.LinkedListUtils;
import blind75.ListNode;
import samples.Display;

/**
 * 21. Merge Two Sorted Lists
 * Easy
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 * Constraints:
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        System.out.println("21. Merge Two Sorted Lists");
        Display.printTestCase(1);
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.print("Input: list1 = ");
        LinkedListUtils.printList(list1);
        System.out.print("Input list2 = " );
        LinkedListUtils.printList(list2);
        ListNode mergedList = mergeTwoLists(list1, list2);
        System.out.println("Output: Merged List = ");
        LinkedListUtils.printList(mergedList); // Expected output: [1,1,2,3,4,4]

    }

    /**
     * Merges two sorted linked lists into one sorted linked list.
     * @param list1
     * @param list2
     * @return
     */
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
}
