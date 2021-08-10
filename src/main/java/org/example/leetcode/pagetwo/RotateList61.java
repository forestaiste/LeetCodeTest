package org.example.leetcode.pagetwo;

//
//61. 旋转链表
//        给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
//
//        示例 1:
//
//        输入: 1->2->3->4->5->NULL, k = 2
//        输出: 4->5->1->2->3->NULL
//        解释:
//        向右旋转 1 步: 5->1->2->3->4->NULL
//        向右旋转 2 步: 4->5->1->2->3->NULL
//        示例 2:
//
//        输入: 0->1->2->NULL, k = 4
//        输出: 2->0->1->NULL
//        解释:
//        向右旋转 1 步: 2->0->1->NULL
//        向右旋转 2 步: 1->2->0->NULL
//        向右旋转 3 步: 0->1->2->NULL
//        向右旋转 4 步: 2->0->1->NULL

import org.example.models.ListNode;

public class RotateList61 {
    public ListNode rotateRight0(ListNode head, int k) {
        if (head == null)
            return null;

        if (head.next == null)
            return head;

        ListNode dummy = new ListNode(-1);

        dummy.next = head;
        ListNode front = head;
        ListNode tail = head;

        for (int i = 0; i < k; i++) {
            front = front.next;

            if (front == null) {
                front = head;

                for (int j = 0; j < k % (i + 1); j++) {
                    front = front.next;
                }
                break;
            }
        }

        while(front.next != null) {
            front = front.next;
            tail = tail.next;
        }

        front.next = dummy.next;
        dummy.next = tail.next;
        tail.next = null;

        return dummy.next;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        int n = 1;
        ListNode iter = head;
        while (iter.next != null) {
            iter = iter.next;
            n++;
        }
        int add = n - k % n;
        if (add == n) {
            return head;
        }
        iter.next = head;
        while (add-- > 0) {
            iter = iter.next;
        }
        ListNode ret = iter.next;
        iter.next = null;
        return ret;
    }

    public static void main(String[] args) {
        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        RotateList61 rotateList = new RotateList61();
        ListNode result = rotateList.rotateRight(first, 2);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);

        System.out.println("---------------------------");

        ListNode thirdI = new ListNode(2, null);
        ListNode secondI = new ListNode(1, thirdI);
        ListNode firstI = new ListNode(0, secondI);

        result = rotateList.rotateRight(firstI, 4);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);

        System.out.println("---------------------------");
    }
}
