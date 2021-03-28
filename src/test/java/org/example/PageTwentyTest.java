package org.example;

import org.example.leetcode.pagetwenty.BinaryTreeCameras968;
import org.example.models.TreeNode;
import org.junit.Test;

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
}
