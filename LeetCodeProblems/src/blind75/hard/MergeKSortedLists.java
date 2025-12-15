package blind75.hard;

import blind75.LinkedListUtils;
import blind75.ListNode;
import samples.Display;

import static blind75.easy.MergeTwoSortedLists.mergeTwoLists;

/**
 * 23. Merge k Sorted Lists
 * Hard
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 *
 * Example 1:
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * merging them into one sorted linked list:
 * 1->1->2->3->4->4->5->6

 * Example 2:
 * Input: lists = []
 * Output: []
 * Example 3:
 *
 * Input: lists = [[]]
 * Output: []
 *
 *
 * Constraints:
 * k == lists.length
 * 0 <= k <= 104
 * 0 <= lists[i].length <= 500
 * -104 <= lists[i][j] <= 104
 * lists[i] is sorted in ascending order.
 * The sum of lists[i].length will not exceed 104.
 */
public class MergeKSortedLists {
    public static void main(String[] args) {
        System.out.println("23. Merge K Sorted Lists - Category: Hard, Frequency: High");
        ListNode[] lists = getNestedLinkedListInput();
        Display.printTestCase(1, "Merge K Sorted Lists");
        System.out.println("Input:");
        LinkedListUtils.printList(lists);
        System.out.println("Output:");
        ListNode result = mergeKLists(lists);
        LinkedListUtils.printList(result);
    }

    private static ListNode[] getNestedLinkedListInput() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(6);
        ListNode[] lists = new ListNode[]{head, head2};
        return lists;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }

    private static ListNode mergeKListsHelper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        int mid = start + (end - start) / 2;
        ListNode left = mergeKListsHelper(lists, start, mid);
        ListNode right = mergeKListsHelper(lists, mid + 1, end);
        return mergeTwoLists(left, right);
    }

}
