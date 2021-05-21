package org.example.leetcode.pagethree;

//143. 重排链表
//        给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
//        将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
//
//        你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//
//        示例 1:
//
//        给定链表 1->2->3->4, 重新排列为 1->4->2->3.
//        示例 2:
//
//        给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.

import org.example.models.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReorderList143 {
    public void reorderList(ListNode head) {
        if (head == null)
            return;

        List<ListNode> list = new ArrayList<>();

        ListNode node = head;

        while (node != null) {
            list.add(node);
            node = node.next;
        }

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            list.get(i).next = list.get(j);
            i++;

            if (i == j) {
                break;
            }

            list.get(j).next = list.get(i);
            j--;
        }

        list.get(i).next = null;
    }

    public void reorderList1(ListNode head) {
        if (head == null)
            return;

        int count = 0;

        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }

        count = count / 2 + count % 2;

        node = head;
        ListNode pre = null;
        while (count > 0) {
            count --;
            pre = node;
            node = node.next;
        }

        pre.next = null;

        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        node = head;
        while (node != null) {
            ListNode next = node.next;
            if (!stack.isEmpty()) {
                ListNode inserted = stack.pop();
                node.next = inserted;
                inserted.next = next;
            }
            node = next;
        }
    }
}
