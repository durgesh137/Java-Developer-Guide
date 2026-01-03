package com.javacore.dsa.linkedlist;

public class ReverseLinkedList {
    static void main(String[] args) {
        System.out.println("Reverse the singly linked list");
        ListNode head  = LinkedListUtils.getSinglyLinkedList();
        LinkedListUtils.printSinglyLinkedList(head);
        ListNode reversed = reverseList(head);
        System.out.print("Reversed singly linked list: ");
        LinkedListUtils.printSinglyLinkedList(reversed);

    }

    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;//1. keep next node
            current.next = prev;//2. Reverse pointers prev node
            prev = current; //3. now move prev one step ahead
            current = nextNode;//4. move current to next node
        }
        return prev;
    }
}

/**
 * Key Points-
 * 1. It is based on 3-pointer approach
 * - previous node
 * - current node
 * - next node
 * 2. Keep next node first
 * 3. Now reverse the pointers
 * 4. move previous node one step head, i.e. to current
 * 5. move current node one step ahead, i.e. to next node
 */
