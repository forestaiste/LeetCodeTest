package org.example.leetcode.pagefive;

//226. 翻转二叉树
//        翻转一棵二叉树。
//
//        示例：
//
//        输入：
//
//        4
//        /   \
//        2     7
//        / \   / \
//        1   3 6   9
//        输出：
//
//        4
//        /   \
//        7     2
//        / \   / \
//        9   6 3   1

import org.example.models.TreeNode;

public class InvertBinaryTree226 {
    public TreeNode invertTree1(TreeNode root) {

        if (root == null)
            return null;

        invert(root);

        return root;
    }

    private void invert(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        if (node.left != null)
            invert(node.left);
        if (node.right != null)
            invert(node.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
