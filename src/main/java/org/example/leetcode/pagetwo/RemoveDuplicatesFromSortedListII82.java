package org.example.leetcode.pagetwo;

//82. 删除排序链表中的重复元素 II
//        存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
//
//        返回同样按升序排列的结果链表。
//
//
//
//        示例 1：
//
//
//        输入：head = [1,2,3,3,4,4,5]
//        输出：[1,2,5]
//        示例 2：
//
//
//        输入：head = [1,1,1,2,3]
//        输出：[2,3]

import org.example.models.ListNode;

public class RemoveDuplicatesFromSortedListII82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode cur = dummy.next;
        ListNode pre = dummy;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur.next = cur.next.next;
                }

                pre.next = cur.next;
                cur = cur.next;
            }
            else {
                pre = cur;
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
