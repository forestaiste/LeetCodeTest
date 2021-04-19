package org.example;

import org.example.leetcode.pagethirteen.AverageOfLevelsInBinaryTree637;
import org.example.leetcode.pagethirteen.PalindromicSubstrings647;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.Arrays;

public class PageThirteen {
    @Test
    public void palindromicSubstrings647Test() {
        PalindromicSubstrings647 palindromicSubstrings = new PalindromicSubstrings647();
        System.out.println(palindromicSubstrings.countSubstrings("aaa"));
    }

    @Test
    public void AverageOfLevelsInBinaryTree637Test() {
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, left, right);

        AverageOfLevelsInBinaryTree637 averageOfLevelsInBinaryTree = new AverageOfLevelsInBinaryTree637();
        System.out.println(Arrays.toString(averageOfLevelsInBinaryTree.averageOfLevels(root).toArray()));
    }
}
