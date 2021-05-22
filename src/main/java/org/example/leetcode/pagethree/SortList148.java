package org.example.leetcode.pagethree;

//148. 排序链表
//        给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
//
//        进阶：
//
//        你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
//
//
//        示例 1：
//
//
//        输入：head = [4,2,1,3]
//        输出：[1,2,3,4]
//        示例 2：
//
//
//        输入：head = [-1,5,3,4,0]
//        输出：[-1,0,3,4,5]
//        示例 3：
//
//        输入：head = []
//        输出：[]

import org.example.models.ListNode;

import java.util.List;

public class SortList148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left != null ? left : right;
        return res.next;
    }

    public ListNode sortList2(ListNode head) {
        return sortList(head, null);
    }

    public ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) {
            return null;
        }
        if (head.next == tail) {
            head.next = null;
            return head;
        }
        ListNode slow = head, fast = head;
        while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);
        ListNode sorted = merge(list1, list2);
        return sorted;
    }

    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead, temp1 = head1, temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 != null) {
            temp.next = temp1;
        } else if (temp2 != null) {
            temp.next = temp2;
        }
        return dummyHead.next;
    }

    public ListNode sortList1(ListNode head) {
        if (head == null)
            return null;

        ListNode dummy = new ListNode(0, head);
        ListNode pre = head;

        ListNode cur = head.next;

        while (cur != null) {
            if (cur.val < pre.val) {
                ListNode insertPos = dummy;
                while (insertPos.next != null && insertPos.next.val < cur.val) {
                    insertPos = insertPos.next;
                }

                if (insertPos != cur) {
                    ListNode unsortedSuccessor = cur.next;
                    ListNode sortedSuccessor = insertPos.next;
                    insertPos.next = cur;
                    cur.next = sortedSuccessor;
                    pre.next = unsortedSuccessor;

                    cur = pre;
                }
            }

            pre = cur;
            cur = cur.next;
        }

        return dummy.next;
    }
}
