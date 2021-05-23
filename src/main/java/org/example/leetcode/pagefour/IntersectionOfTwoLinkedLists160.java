package org.example.leetcode.pagefour;


//160. 相交链表
//        编写一个程序，找到两个单链表相交的起始节点。
//
//        如下面的两个链表：
//
//        在节点 c1 开始相交。
//
//        示例 1：
//
//        输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
//        输出：Reference of the node with value = 8
//        输入解释：相交节点的值为 8 （注意，如果两个链表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
//
//        示例 2：
//
//        输入：intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
//        输出：Reference of the node with value = 2
//        输入解释：相交节点的值为 2 （注意，如果两个链表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [0,9,1,2,4]，链表 B 为 [3,2,4]。在 A 中，相交节点前有 3 个节点；在 B 中，相交节点前有 1 个节点。

import org.example.models.ListNode;

public class IntersectionOfTwoLinkedLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = 0;

        ListNode node = headA;

        while (node != null) {
            m++;
            node = node.next;
        }

        int n = 0;
        node = headB;
        while (node != null) {
            n++;
            node = node.next;
        }

        if (m > n) {
            int i = m - n;
            while (i > 0) {
                i--;
                headA = headA.next;
            }
        }

        if (n > m) {
            int i = n - m;
            while (i > 0) {
                i--;
                headB = headB.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}
