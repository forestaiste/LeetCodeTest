package org.example;

import org.example.leetcode.pageeleven.*;
import org.example.models.TreeNode;
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

    @Test
    public void longestPalindromicSubsequence516Test() {
        LongestPalindromicSubsequence516 longestPalindromicSubsequence = new LongestPalindromicSubsequence516();
        System.out.println(longestPalindromicSubsequence.longestPalindromeSubseq("bbbab"));
        System.out.println(longestPalindromicSubsequence.longestPalindromeSubseq("cbbd"));
    }

    @Test
    public void findBottomLeftTreeValue513Test() {
        TreeNode rightLeft = new TreeNode(15);

        TreeNode rightRight = new TreeNode(7);

        TreeNode right = new TreeNode(20, rightLeft, rightRight);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, left, right);

        FindBottomLeftTreeValue513 findBottomLeftTreeValue = new FindBottomLeftTreeValue513();
        System.out.println(findBottomLeftTreeValue.findBottomLeftValue(root));
    }
}
