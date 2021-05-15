package org.example.leetcode.pagetwo;

//86. 分隔链表
//        给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
//
//        你应当 保留 两个分区中每个节点的初始相对位置。
//
//
//
//        示例 1：
//
//
//        输入：head = [1,4,3,2,5,2], x = 3
//        输出：[1,2,2,4,3,5]
//        示例 2：
//
//        输入：head = [2,1], x = 2
//        输出：[1,2]

import org.example.models.ListNode;
public class PartitionList86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode pre = null;
        ListNode cur = dummy;

        while (cur != null && cur.next != null) {
            if (cur.next.val >= x && pre == null) {
                pre = cur;
            }

            if (cur.next.val < x && pre != null) {
                ListNode move = cur.next;
                cur.next = cur.next.next;

                move.next = pre.next;
                pre.next = move;
                pre = move;
            }
            else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }

    public ListNode partition1(ListNode head, int x) {
        if (head == null)
            return null;

        ListNode small = new ListNode();
        ListNode smallHead = small;
        ListNode big = new ListNode();
        ListNode bigHead = big;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            }
            else {
                big.next = head;
                big = big.next;
            }

            head = head.next;
        }

        big.next = null;
        small.next = bigHead.next;
        return smallHead.next;
    }
}
