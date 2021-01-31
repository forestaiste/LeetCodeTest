package org.example.leetcode;

//19. 删除链表的倒数第 N 个结点
//        给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
//        进阶：你能尝试使用一趟扫描实现吗？
//
//
//
//        示例 1：
//
//
//        输入：head = [1,2,3,4,5], n = 2
//        输出：[1,2,3,5]
//        示例 2：
//
//        输入：head = [1], n = 1
//        输出：[]
//        示例 3：
//
//        输入：head = [1,2], n = 1
//        输出：[1]
//
//
//        提示：
//
//        链表中结点的数目为 sz
//        1 <= sz <= 30
//        0 <= Node.val <= 100
//        1 <= n <= sz

import org.example.models.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode virtualHead = new ListNode(0, head);
        ListNode front = head;
        ListNode tail = virtualHead;

        int i = 0;

        while (front != null) {
            front = front.next;
            if (i >= n) {
                tail = tail.next;
            }
            i++;
        }

        if (tail.next != null)
            tail.next = tail.next.next;

        return virtualHead.next;
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
