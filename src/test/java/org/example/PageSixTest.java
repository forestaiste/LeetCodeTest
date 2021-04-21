package org.example;

import org.example.leetcode.pagesix.BinaryTreePaths257;
import org.example.leetcode.pagesix.LongestIncreasingSubsequence300;
import org.example.leetcode.pagesix.PerfectSquares279;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.List;

public class PageSixTest {
    @Test
    public void perfectSquares279Test() {
        PerfectSquares279 perfectSquares = new PerfectSquares279();
        System.out.println(perfectSquares.numSquares(12));
        System.out.println(perfectSquares.numSquares(13));
    }

    @Test
    public void longestIncreasingSubsequence300Test() {
        LongestIncreasingSubsequence300 longestIncreasingSubsequence = new LongestIncreasingSubsequence300();
        int[] nums = {1,3,6,7,9,4,10,5,6};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{7,7,7,7,7,7,7};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{0,1,0,3,2,3};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{10,9,2,5,3,7,101,18};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    public void binaryTreePaths257Test() {
//        TreeNode ten = new TreeNode(10);
//        TreeNode eight = new TreeNode(8, null, null);
//        TreeNode nine = new TreeNode(3);
        TreeNode leftLeaf = new TreeNode(4);
        TreeNode rightLeaf = new TreeNode(5);
        TreeNode right = new TreeNode(2, null, rightLeaf);

        TreeNode left = new TreeNode(3);

        TreeNode root = new TreeNode(1, left, right);

        BinaryTreePaths257 binaryTreePaths = new BinaryTreePaths257();
        List<String> result = binaryTreePaths.binaryTreePaths(root);
        result.forEach(System.out::println);

        result = binaryTreePaths.binaryTreePaths1(root);
        result.forEach(System.out::println);

        result = binaryTreePaths.binaryTreePaths2(root);
        result.forEach(System.out::println);
    }
}
