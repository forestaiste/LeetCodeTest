package org.example;

import org.example.leetcode.pageforteen.LongestContinuousIncreasingSubsequence674;
import org.example.leetcode.pageforteen.MaximumBinaryTree654;
import org.example.leetcode.pageforteen.SearchInABinarySearchTree700;
import org.example.leetcode.pageforteen.TrimABinarySearchTree669;
import org.example.leetcode.pagefour.RepeatedDNASequences187;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PageForteenTest {
    @Test
    public void longestContinuousIncreasingSubsequence674Test() {
        LongestContinuousIncreasingSubsequence674 longestContinuousIncreasingSubsequence = new LongestContinuousIncreasingSubsequence674();
        int[] nums = {1,3,5,4,7};
        System.out.println(longestContinuousIncreasingSubsequence.findLengthOfLCIS(nums));
    }

    @Test
    public void maximumBinaryTree654Test() {
        MaximumBinaryTree654 maximumBinaryTree = new MaximumBinaryTree654();
        int[] nums = {3,2,1,6,0,5};
        maximumBinaryTree.constructMaximumBinaryTree(nums);
    }

    @Test
    public void SearchInABinarySearchTree700Test() {
        TreeNode right1 = new TreeNode(7);
        TreeNode leftLeftLeaf1 = new TreeNode(1);
        TreeNode leftRightLeaf1 = new TreeNode(3);

        TreeNode left1 = new TreeNode(2, leftLeftLeaf1, leftRightLeaf1);

        TreeNode root1 = new TreeNode(4, left1, right1);
        SearchInABinarySearchTree700 searchInABinarySearchTree = new SearchInABinarySearchTree700();
        searchInABinarySearchTree.searchBST(root1, 5);
    }

    @Test
    public void trimABinarySearchTree669Test() {
//        TreeNode rightLeft = new TreeNode(1);
//
//        TreeNode rightRight = new TreeNode(2, rightLeft, null);
//
//        TreeNode right = new TreeNode(4);
//
//        TreeNode left = new TreeNode(0, null, rightRight);
//
//        TreeNode root = new TreeNode(3, left, right);

        TreeNode right = new TreeNode(2);

        TreeNode left = new TreeNode(0);

        TreeNode root = new TreeNode(1, left, right);

        TrimABinarySearchTree669 trimABinarySearchTree = new TrimABinarySearchTree669();
//        trimABinarySearchTree.trimBST(root, 3, 4);
        trimABinarySearchTree.trimBST1(root, 1, 2);
    }

    @Test
    public void RepeatedDNASequences187Test() {
        RepeatedDNASequences187 repeatedDNASequences = new RepeatedDNASequences187();
        List<String> result = repeatedDNASequences.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        System.out.println(Arrays.toString(result.toArray()));
    }
}
