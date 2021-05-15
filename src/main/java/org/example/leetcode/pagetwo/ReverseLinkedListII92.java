package org.example.leetcode.pagetwo;

//92. 反转链表 II
//        给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
//
//
//        示例 1：
//
//
//        输入：head = [1,2,3,4,5], left = 2, right = 4
//        输出：[1,4,3,2,5]
//        示例 2：
//
//        输入：head = [5], left = 1, right = 1
//        输出：[5]

import org.example.models.ListNode;

public class ReverseLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        int i = 0;
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        ListNode pre = null;
        ListNode precessor = null;
        ListNode successor = null;


        while (cur != null) {
            if (left == i + 1) {
                precessor = cur;
                successor = cur.next;
            }

            if (left <= i && right >= i) {
                while (left <= i && right >= i) {
                    ListNode temp = cur.next;
                    cur.next = pre;
                    pre = cur;
                    cur = temp;
                    i++;
                }

                precessor.next = pre;
                successor.next = cur;
                break;
            }
            else {
                i++;
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
