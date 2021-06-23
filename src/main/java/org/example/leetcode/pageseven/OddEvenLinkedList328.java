package org.example.leetcode.pageseven;

//328. 奇偶链表
//        给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
//
//        请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
//
//        示例 1:
//
//        输入: 1->2->3->4->5->NULL
//        输出: 1->3->5->2->4->NULL
//        示例 2:
//
//        输入: 2->1->3->5->6->4->7->NULL
//        输出: 2->3->6->7->1->5->4->NULL
//        说明:
//
//        应当保持奇数节点和偶数节点的相对顺序。
//        链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。

import org.example.models.ListNode;

public class OddEvenLinkedList328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;

        ListNode odd = head;
        ListNode even = head.next;

        if (even == null)
            return head;

        ListNode evenHead = even;
        ListNode node = even.next;
        int i = 1;
        while (node != null) {
            if (i % 2 == 1) {
                odd.next = node;
                odd = odd.next;
            }
            else {
                even.next = node;
                even = even.next;
            }
            i++;
            node = node.next;
        }
        even.next = null;
        odd.next = evenHead;

        return head;
    }
}
