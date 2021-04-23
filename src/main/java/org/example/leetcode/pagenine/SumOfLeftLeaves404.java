package org.example.leetcode.pagenine;

//404. 左叶子之和
//        计算给定二叉树的所有左叶子之和。
//
//        示例：
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//
//        在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24

import org.example.models.TreeNode;

public class SumOfLeftLeaves404 {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        getSum(root);
        return sum;
    }
    public void getSum(TreeNode node) {
        if (node == null)
            return;

        if (node.left != null && node.left.left == null && node.left.right == null) {
            sum += node.left.val;
        }

        sumOfLeftLeaves(node.left);
        sumOfLeftLeaves(node.right);
    }
}

