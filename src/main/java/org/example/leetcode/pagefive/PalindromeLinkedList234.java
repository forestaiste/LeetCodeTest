package org.example.leetcode.pagefive;

//234. 回文链表
//        请判断一个链表是否为回文链表。
//
//        示例 1:
//
//        输入: 1->2
//        输出: false
//        示例 2:
//
//        输入: 1->2->2->1
//        输出: true
//        进阶：
//        你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？

import org.example.models.ListNode;

public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        ListNode cur = head;
        ListNode pre = null;
        while (fast != null && fast.next != null) {
            cur = slow;
            slow = slow.next;
            fast = fast.next.next;
            cur.next = pre;
            pre = cur;
        }

        if (fast != null)
            slow = slow.next;

        while (cur != null && slow != null) {
            if (cur.val != slow.val)
                return false;

            cur = cur.next;
            slow = slow.next;
        }

        return true;
    }
}
