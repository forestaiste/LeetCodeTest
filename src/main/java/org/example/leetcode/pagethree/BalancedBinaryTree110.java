package org.example.leetcode.pagethree;

//110. 平衡二叉树
//        给定一个二叉树，判断它是否是高度平衡的二叉树。
//
//        本题中，一棵高度平衡二叉树定义为：
//
//        一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
//
//
//
//        示例 1：
//
//
//        输入：root = [3,9,20,null,null,15,7]
//        输出：true
//        示例 2：
//
//
//        输入：root = [1,2,2,3,3,null,null,4,4]
//        输出：false
//        示例 3：
//
//        输入：root = []
//        输出：true

import org.example.models.TreeNode;

public class BalancedBinaryTree110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        if (getDepth(root) == -1)
            return false;
        else
            return true;
    }

    private int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getDepth(node.left);
        int right = getDepth(node.right);

        if (left == -1 || right == -1)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;
        else
            return Math.max(left, right) + 1;
    }
}
