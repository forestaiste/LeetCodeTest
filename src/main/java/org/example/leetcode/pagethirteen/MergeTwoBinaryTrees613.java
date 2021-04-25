package org.example.leetcode.pagethirteen;
//
//617. 合并二叉树
//        给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
//
//        你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
//
//        示例 1:
//
//        输入:
//        Tree 1                     Tree 2
//        1                         2
//        / \                       / \
//        3   2                     1   3
//        /                           \   \
//        5                             4   7
//        输出:
//        合并后的树:
//        3
//        / \
//        4   5
//        / \   \
//        5   4   7

import org.example.models.TreeNode;

public class MergeTwoBinaryTrees613 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return null;

        if (root1 == null)
            return root2;

        if (root2 == null)
            return root1;

        merge(root1, root2);
        return root1;
    }

    public void merge(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return;

        if (node1 != null && node2 == null)
            return;

        if (node1.left == null && node2.left != null) {
            node1.left = node2.left;
        }

        if (node1.right == null && node2.right != null) {
            node1.right = node2.right;
        }

        if (node1 != node2) {
            node1.val += node2.val;
        }

        merge(node1.right, node2.right);
        merge(node1.left, node2.left);
    }

    public TreeNode mergeTrees2(TreeNode root1, TreeNode root2) {
        TreeNode root = merge2(root1, root2);

        return root;
    }

    public TreeNode merge2(TreeNode node1, TreeNode node2) {
        if (node1 == null)
            return node2;

        if (node2 == null)
            return node1;

        TreeNode node = new TreeNode(node1.val + node2.val);

        node.left = merge2(node1.left, node2.left);
        node.right = merge2(node1.right, node2.right);

        return node;
    }
}
