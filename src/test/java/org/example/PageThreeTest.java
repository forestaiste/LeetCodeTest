package org.example;

import org.example.leetcode.pagethree.*;
import org.example.models.ListNode;
import org.example.models.TreeNode;
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
    public void bestTimeToBuyAndSellStockII122Test() {
        BestTimeToBuyAndSellStockII122 bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII122();
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit2(prices));
        prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit1(prices));
        prices = new int[]{7, 6, 4, 3, 1};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit1(prices));
        prices = new int[]{2, 1, 2, 0, 1};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit1(prices));
    }

    @Test
    public void gasStation134Test() {
        GasStation134 gasStation = new GasStation134();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));

        gas = new int[]{5, 8, 2, 8};
        cost = new int[]{6, 5, 6, 6};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));

        gas = new int[]{2, 3, 4};
        cost = new int[]{3, 4, 3};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    public void candy135Test() {
        Candy135 candy = new Candy135();
        int[] ratings = {2, 1, 1, 0, 2, 0, 1, 2};
        System.out.println(candy.candy(ratings));
    }

    @Test
    public void wordBreak139Test() {
        WordBreak139 wordBreak = new WordBreak139();
        List<String> wordDict = Arrays.asList("apple", "pen");
        System.out.println(wordBreak.wordBreak("applepenapple", wordDict));

        wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(wordBreak.wordBreak("catsandog", wordDict));

        wordDict = Arrays.asList("leet", "code");
        System.out.println(wordBreak.wordBreak("leetcode", wordDict));
    }

    @Test
    public void bestTimeToBuyAndSellStock121Test() {
        BestTimeToBuyAndSellStock121 bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock121();
        int[] prices = {2, 1, 2, 0, 1};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit3(prices));

        prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit2(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit3(prices));
    }

    @Test
    public void bestTimeToBuyAndSellStockIII123Test() {
        BestTimeToBuyAndSellStockIII123 bestTimeToBuyAndSellStockIII = new BestTimeToBuyAndSellStockIII123();
        int[] prices = {3, 3, 5, 1, 0, 3, 4, 5, 2, 8};

        System.out.println(bestTimeToBuyAndSellStockIII.maxProfit(prices));
    }

    @Test
    public void distinctSubsequences115Test() {
        DistinctSubsequences115 distinctSubsequences = new DistinctSubsequences115();
        System.out.println(distinctSubsequences.numDistinct("babgbag", "bag"));
    }

    @Test
    public void binaryTreeLevelOrderTraversal102Test() {
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, left, right);

        BinaryTreeLevelOrderTraversal102 binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal102();
        List<List<Integer>> results = binaryTreeLevelOrderTraversal.levelOrder(root);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void binaryTreeLevelOrderTraversalII107Test() {
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, left, right);

        BinaryTreeLevelOrderTraversalII107 binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII107();
        List<List<Integer>> results = binaryTreeLevelOrderTraversalII.levelOrderBottom(root);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void symmetricTree101Test() {
        TreeNode rightLeftLeaf = new TreeNode(15);
        TreeNode rightRightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(5, rightLeftLeaf, rightRightLeaf);
//        TreeNode right = new TreeNode(4);

        TreeNode leftLeftLeaf = new TreeNode(7);
        TreeNode leftRightLeaf = new TreeNode(15);
        TreeNode left = new TreeNode(5, leftLeftLeaf, leftRightLeaf);
//        TreeNode left = new TreeNode(5);

        TreeNode root = new TreeNode(3, left, right);

        SymmetricTree101 symmetricTree = new SymmetricTree101();
        System.out.println(symmetricTree.isSymmetric(root));

        System.out.println(symmetricTree.isSymmetric1(root));
    }

    @Test
    public void maximumDepthOfBinaryTree104Test() {
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, left, right);

        MaximumDepthOfBinaryTree104 maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree104();
        System.out.println(maximumDepthOfBinaryTree.maxDepth(root));
        System.out.println(maximumDepthOfBinaryTree.maxDepth1(root));
    }

    @Test
    public void minimumDepthOfBinaryTree111Test() {
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, null, right);

        MinimumDepthOfBinaryTree111 minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree111();
        System.out.println(minimumDepthOfBinaryTree.minDepth(root));
        System.out.println(minimumDepthOfBinaryTree.minDepth1(root));
        System.out.println(minimumDepthOfBinaryTree.minDepth2(root));
    }

    @Test
    public void balancedBinaryTree110Test() {
        TreeNode ten = new TreeNode(10);
        TreeNode eight = new TreeNode(8, null, null);
        TreeNode nine = new TreeNode(9);
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7, eight, nine);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, null, right);

        BalancedBinaryTree110 balancedBinaryTree = new BalancedBinaryTree110();
        System.out.println(balancedBinaryTree.isBalanced(root));
    }
}
