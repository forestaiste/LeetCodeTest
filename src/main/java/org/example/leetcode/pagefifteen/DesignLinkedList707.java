package org.example.leetcode.pagefifteen;

import org.example.models.ListNode;

public class DesignLinkedList707 {

    public ListNode head;

    public DesignLinkedList707() {
        head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode cur = head;
        int i = 0;
        while(cur != null) {
            if (index == i++) {
                return cur.val;
            }

            cur = cur.next;
        }

        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;


        while (cur.next != null) cur = cur.next;

        cur.next = node;

        head = dummy.next;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode cur = head;
        int i = 0;

        if (index <= 0) {
            addAtHead(val);
        }

        while(cur != null) {
            if (i++ == index - 1) {
                ListNode node = new ListNode(val);
                node.next = cur.next;
                cur.next = node;
            }

            cur = cur.next;
        }
     }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = head;
        ListNode pre = dummy;
        int i = 0;
        while (cur != null) {
            if (i++ == index)  {
                pre.next = cur.next;
            }
            pre = pre.next;
            cur = cur.next;
        }

        head = dummy.next;
    }
}
