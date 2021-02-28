package org.example.leetcode.pagefive;

//203. 移除链表元素
//        删除链表中等于给定值 val 的所有节点。
//
//        示例:
//
//        输入: 1->2->6->3->4->5->6, val = 6
//        输出: 1->2->3->4->5


import org.example.models.ListNode;

import java.util.List;

public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            }
            else {
                pre = cur;
            }

            cur = cur.next;
        }

        return dummy.next;
    }
}
