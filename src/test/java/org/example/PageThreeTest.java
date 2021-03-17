package org.example;

import org.example.leetcode.pagethree.BestTimeToBuyAndSellStockII122;
import org.example.leetcode.pagethree.LinkedListCycleII142;
import org.example.leetcode.pagethree.PalindromePartitioning131;
import org.example.models.ListNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PageThreeTest {
    @Test
    public void linkedListCycleIITest() {
        ListNode fourth = new ListNode(-4);
        ListNode third = new ListNode(0, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(3, second);
        fourth.next = second;

        LinkedListCycleII142 linkedListCycleII = new LinkedListCycleII142();
        ListNode result = linkedListCycleII.detectCycle(first);
        System.out.println(result.val);
    }

    @Test
    public void palindromePartitioning131Test() {
        PalindromePartitioning131 palindromePartitioning = new PalindromePartitioning131();
        String r = "smiles".substring(1, 6);
        List<List<String>> results = palindromePartitioning.partition("aab");

        for (List<String> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void BestTimeToBuyAndSellStockII122Test() {
        BestTimeToBuyAndSellStockII122 bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII122();
        int[] prices = new int[]{7,1,5,3,6,4};
//        System.out.println(bestTimeToBuyAndSellStockII.maxProfit(prices));
//        prices = new int[]{1, 2, 3, 4, 5};
//        System.out.println(bestTimeToBuyAndSellStockII.maxProfit(prices));
//        prices = new int[]{7, 6, 4, 3, 1};
//        System.out.println(bestTimeToBuyAndSellStockII.maxProfit(prices));
        prices = new int[]{2, 1, 2, 0, 1};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit(prices));
    }
}
