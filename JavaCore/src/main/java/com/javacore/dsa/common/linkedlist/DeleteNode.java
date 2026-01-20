package com.javacore.dsa.common.linkedlist;

import static com.javacore.dsa.common.linkedlist.LinkedListUtils.getSecondNode;
import static com.javacore.dsa.common.linkedlist.LinkedListUtils.getSinglyLinkedList;
import static com.javacore.dsa.common.linkedlist.LinkedListUtils.printSinglyLinkedList;

/**
 * Delete Node in LinkedList
 */
public class DeleteNode {
    static void main(String[] args) {
        System.out.println("Delete Nth node within singly linked list...");
        ListNode head = getSinglyLinkedList();
        printSinglyLinkedList(head);
        deleteNthNode(getSecondNode(head));
        printSinglyLinkedList(head);
    }

    /**
     * Here head node is not given.
     * Further given node is not the last node
     * @param nodeToDelete
     * to be deleted
     */
    public static void deleteNthNode(ListNode nodeToDelete) {
        if(nodeToDelete.next == null) return;
        //replace here value of nodeToDelete with value of node next of nodeToDelete
        nodeToDelete.val = nodeToDelete.next.val;
        //now make next of nodeToDelete as next node of next of nodeToDelete
        nodeToDelete.next = nodeToDelete.next.next;
    }
}
