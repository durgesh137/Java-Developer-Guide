package com.javacore.dsa.common.linkedlist;

public class RemoveNthNodeFromEndLL {
    static void main(String[] args) {
        ListNode head = LinkedListUtils.getSinglyLinkedList();
        LinkedListUtils.printSinglyLinkedList(head);
        int n = 7;
        ListNode result = removeNthFromEndTwoPass(head, n);
        LinkedListUtils.printSinglyLinkedList(result);
    }

    public static ListNode removeNthFromEndTwoPass(ListNode head, int n) {
        if(head == null)
            return null;
        int length = length(head);
        //here head node needs to be deleted
        if(length == n)return head.next;
        //n is before LL, hence no change
        if(n > length) return head;
        int N = 0;
        ListNode prev = null, temp = head;
        //stopping loop where temp is node to be deleted
        while(N < length - n){
            prev = temp;
            temp = temp.next;
            N++;
        }
        //temp is node to delete
        prev.next = temp.next;
        return head;
    }

    private static int length(ListNode head){
        int count =0;
        ListNode temp = head;
        while(temp!= null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static ListNode removeNthFromEndOnePass(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        //first move fjast n+1 steps
        for(int i=0; i<=n; i++){
            fast = fast.next;
        }
        //now move at one step at a time
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        //here node next of slow needs to be deleted
        slow.next = slow.next.next;
        return dummy.next;
    }
}
