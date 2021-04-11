package org.example;

import org.example.leetcode.pagefifteen.BestTimeToBuyAndSellStockWithTransactionFee714;
import org.example.leetcode.pagefifteen.DesignLinkedList707;
import org.example.leetcode.pagefifteen.MinCostClimbingStairs746;
import org.example.leetcode.pagefifteen.MonotoneIncreasingDigits738;
import org.example.models.ListNode;
import org.junit.Test;

public class PageFifteenTest {

    @Test
    public void designLinkedList707Test() {
        DesignLinkedList707 linkedList = new DesignLinkedList707();

        linkedList.addAtHead(1);
        ListNode result = linkedList.head;
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("--------------------------");


        linkedList.addAtTail(3);

        result = linkedList.head;
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("--------------------------");

        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3

        result = linkedList.head;
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("--------------------------");

        System.out.println(linkedList.get(1));            //返回2


        System.out.println("--------------------------");
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        result = linkedList.head;
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("--------------------------");

        System.out.println(linkedList.get(1));            //返回3

        System.out.println("--------------------------");

        linkedList.addAtTail(3);
        result = linkedList.head;
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("--------------------------");

        linkedList.addAtTail(4);
        linkedList.addAtIndex(0, 3);
        result = linkedList.head;
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("--------------------------");
    }

    @Test
    public void monotoneIncreasingDigits738Test() {
        MonotoneIncreasingDigits738 monotoneIncreasingDigits = new MonotoneIncreasingDigits738();
        System.out.println(monotoneIncreasingDigits.monotoneIncreasingDigits(1234));
    }

    @Test
    public void bestTimeToBuyAndSellStockWithTransactionFee714Test() {
        BestTimeToBuyAndSellStockWithTransactionFee714 bestTimeToBuyAndSellStockWithTransactionFee = new BestTimeToBuyAndSellStockWithTransactionFee714();
        int[] prices = {2,2,1,1,5,5,3,1,5,4};
        System.out.println(bestTimeToBuyAndSellStockWithTransactionFee.maxProfit2(prices, 2));

        prices = new int[]{4,5,2,4,3,3,1,2,5,4};
        System.out.println(bestTimeToBuyAndSellStockWithTransactionFee.maxProfit2(prices, 1));

        prices = new int[]{1, 3, 2, 8, 4, 9};
        System.out.println(bestTimeToBuyAndSellStockWithTransactionFee.maxProfit2(prices, 2));

    }

    @Test
    public void minCostClimbingStairs746Test() {
        MinCostClimbingStairs746 minCostClimbingStairs = new MinCostClimbingStairs746();
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(cost));
    }
}
