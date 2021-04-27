package org.example;

import org.example.leetcode.pageeleven.*;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void minimumAbsoluteDifferenceInBST530Test() {
        TreeNode rightLeftLeaf1 = new TreeNode(49);
        TreeNode rightRightLeaf1 = new TreeNode(12);
        TreeNode right1 = new TreeNode(48, rightLeftLeaf1, rightRightLeaf1);
        TreeNode left1 = new TreeNode(0);

        TreeNode root1 = new TreeNode(1, left1, right1);

        MinimumAbsoluteDifferenceInBST530 minimumAbsoluteDifferenceInBST = new MinimumAbsoluteDifferenceInBST530();
        System.out.println(minimumAbsoluteDifferenceInBST.getMinimumDifference(root1));
        System.out.println(minimumAbsoluteDifferenceInBST.getMinimumDifference1(root1));
    }

    @Test
    public void findModeInBinarySearchTree501Test() {
        TreeNode right1 = new TreeNode(2, null, null);

        TreeNode root = new TreeNode(1, null, right1);
//        TreeNode left = new TreeNode(1);
//        TreeNode right = new TreeNode(2);
//
//        TreeNode root = new TreeNode(1, left, right);

        FindModeInBinarySearchTree501 findModeInBinarySearchTree = new FindModeInBinarySearchTree501();
        System.out.println(Arrays.toString(findModeInBinarySearchTree.findMode(root)));
    }
}
