package org.example;

import org.example.leetcode.pageforteen.LongestContinuousIncreasingSubsequence674;
import org.example.leetcode.pageforteen.MaximumBinaryTree654;
import org.example.leetcode.pageforteen.SearchInABinarySearchTree700;
import org.example.models.TreeNode;
import org.junit.Test;

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
}
