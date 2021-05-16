package org.example.leetcode.pageone;


//24. 两两交换链表中的节点
//        给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
//        你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//
//
//
//        输入：head = [1,2,3,4]
//        输出：[2,1,4,3]
//        示例 2：
//
//        输入：head = []
//        输出：[]
//        示例 3：
//
//        输入：head = [1]
//        输出：[1]
//
//
//        提示：
//
//        链表中节点的数目在范围 [0, 100] 内
//        0 <= Node.val <= 100

import org.example.models.ListNode;

public class SwapNodesInPairs24 {
    public ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;

        return newHead;
    }

    public ListNode swapPairs1(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = head;
        ListNode pre = dummy;
        while (cur != null && cur.next != null) {
            ListNode successor = cur.next.next;
            pre.next = cur.next;
            pre.next.next = cur;
            cur.next = successor;

            pre = cur;
            cur = successor;
        }

        return dummy.next;
    }
}
