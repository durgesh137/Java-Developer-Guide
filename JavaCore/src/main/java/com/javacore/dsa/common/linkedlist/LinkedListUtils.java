package com.javacore.dsa.common.linkedlist;

public class LinkedListUtils {
    public static ListNode getSinglyLinkedList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        return head;
    }

    public static void printSinglyLinkedList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static ListNode getSecondNode(ListNode head) {
        return head.next.next;
    }
}
