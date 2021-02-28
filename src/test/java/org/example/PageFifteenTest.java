package org.example;

import org.example.leetcode.pagefifteen.DesignLinkedList707;
import org.example.models.ListNode;
import org.junit.Test;

public class PageFifteenTest {

    @Test
    public void designLinkedList707Test() {
        DesignLinkedList707 linkedList = new DesignLinkedList707();

//        linkedList.addAtHead(1);
//        ListNode result = linkedList.head;
//        while (result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }
//        System.out.println("--------------------------");
//
//
//        linkedList.addAtTail(3);
//
//        result = linkedList.head;
//        while (result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }
//        System.out.println("--------------------------");
//
//        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
//
//        result = linkedList.head;
//        while (result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }
//        System.out.println("--------------------------");
//
//        System.out.println(linkedList.get(1));            //返回2
//
//
//        System.out.println("--------------------------");
//        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
//        result = linkedList.head;
//        while (result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }
//        System.out.println("--------------------------");
//
//        System.out.println(linkedList.get(1));            //返回3
//
//        System.out.println("--------------------------");

//        linkedList.addAtTail(3);
//        ListNode result = linkedList.head;
//        while (result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }
//        System.out.println("--------------------------");

        linkedList.addAtTail(4);
        linkedList.addAtIndex(0, 3);
        ListNode result = linkedList.head;
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("--------------------------");
    }
}
