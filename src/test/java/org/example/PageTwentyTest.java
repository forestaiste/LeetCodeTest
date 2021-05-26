package org.example;

import org.example.leetcode.pagetwenty.BinaryTreeCameras968;
import org.example.leetcode.pagetwenty.SquaresOfASortedArray977;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.Arrays;

public class PageTwentyTest {
    @Test
    public void binaryTreeCameras968Test() {
        BinaryTreeCameras968 binaryTreeCameras = new BinaryTreeCameras968();
        TreeNode level5 = new TreeNode(0);
        TreeNode level4 = new TreeNode(0);
        level4.right = level5;
        TreeNode level3 = new TreeNode(0);
        level3.left = level4;
        TreeNode level2 = new TreeNode(0);
        level2.left = level3;
        TreeNode level1 = new TreeNode(0);
        level1.left = level2;

        System.out.println(binaryTreeCameras.minCameraCover(level1));
    }

    @Test
    public void squaresOfASortedArray977Test() {
        SquaresOfASortedArray977 squaresOfASortedArray977 = new SquaresOfASortedArray977();
//        int[] nums = {-5, -3, -2, -1};
        int[] nums = {1};
        nums = squaresOfASortedArray977.sortedSquares(nums);

        System.out.println(Arrays.toString(nums));

        int[] nums1 = {-7,-3,2,3,11};
        nums1 = squaresOfASortedArray977.sortedSquares(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}
