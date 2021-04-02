package org.example;

import org.example.leetcode.pageeleven.CoinChangeII518;
import org.example.leetcode.pageeleven.FibonacciNumber509;
import org.example.leetcode.pageeleven.ReverseStringII541;
import org.junit.Test;

public class PageElevenTest {
    @Test
    public void reverseStringIITest() {
        ReverseStringII541 reverseStringII = new ReverseStringII541();

        System.out.println(reverseStringII.reverseStr("abcdefghijk", 4));
    }

    @Test
    public void fibonacciNumber509Test() {
        FibonacciNumber509 fibonacciNumber = new FibonacciNumber509();
        System.out.println(fibonacciNumber.fib(4));
    }

    @Test
    public void coinChangeII518Test() {
        CoinChangeII518 coinChangeII = new CoinChangeII518();
        int[] coins = {1, 2, 5};

        System.out.println(coinChangeII.change(5, coins));
        System.out.println(coinChangeII.change(3, new int[]{2}));

        System.out.println(coinChangeII.change2(5, coins));
        System.out.println(coinChangeII.change2(3, new int[]{2}));
    }
}
