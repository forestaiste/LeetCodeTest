package org.example.leetcode.pageone;

import org.example.models.ListNode;

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        ListNode dummy = new ListNode();
        ListNode node = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            }
            else {
                node.next = l2;
                l2 = l2.next;
            }

            node = node.next;
        }

        node.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node13 = new ListNode(4);
        ListNode node12 = new ListNode(2, node13);
        ListNode node11 = new ListNode(1, node12);

        ListNode node25 = new ListNode(6);
        ListNode node24 = new ListNode(5, node25);
        ListNode node23 = new ListNode(4, node24);
        ListNode node22 = new ListNode(3, node23);
        ListNode node21 = new ListNode(1, node22);

        MergeTwoSortedLists21 mergeTwoSortedLists = new MergeTwoSortedLists21();
        mergeTwoSortedLists.mergeTwoLists(node11, node21);
    }
}
