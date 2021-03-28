package org.example;

import org.example.leetcode.pageeleven.FibonacciNumber509;
import org.example.leetcode.pageeleven.ReverseStringII541;
import org.junit.Test;

public class PageElevenTest {
    @Test
    public void ReverseStringIITest() {
        ReverseStringII541 reverseStringII = new ReverseStringII541();

        System.out.println(reverseStringII.reverseStr("abcdefghijk", 4));
    }

    @Test
    public void FibonacciNumber509Test() {
        FibonacciNumber509 fibonacciNumber = new FibonacciNumber509();
        System.out.println(fibonacciNumber.fib(4));
    }
}
