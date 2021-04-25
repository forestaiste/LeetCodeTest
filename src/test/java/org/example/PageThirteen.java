package org.example;

import org.example.leetcode.pagethirteen.AverageOfLevelsInBinaryTree637;
import org.example.leetcode.pagethirteen.MergeTwoBinaryTrees613;
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

    @Test
    public void MergeTwoBinaryTrees613Test() {


        TreeNode right1 = new TreeNode(2);
        TreeNode leftLeftLeaf1 = new TreeNode(5);
        TreeNode left1 = new TreeNode(3, leftLeftLeaf1, null);

        TreeNode root1 = new TreeNode(1, left1, right1);

        TreeNode rightRightLeaf = new TreeNode(7);
        TreeNode right2 = new TreeNode(3, null, rightRightLeaf);
        TreeNode leftRightLeaf1 = new TreeNode(4);
        TreeNode left2 = new TreeNode(1, null, leftRightLeaf1);

        TreeNode root2 = new TreeNode(2, left2, right2);

        MergeTwoBinaryTrees613 mergeTwoBinaryTrees = new MergeTwoBinaryTrees613();
//        mergeTwoBinaryTrees.mergeTrees(root1, root2);
        mergeTwoBinaryTrees.mergeTrees2(root1, root2);
    }
}
