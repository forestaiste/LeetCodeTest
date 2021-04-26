package org.example.leetcode.pagetwo;

//98. 验证二叉搜索树
//        给定一个二叉树，判断其是否是一个有效的二叉搜索树。
//
//        假设一个二叉搜索树具有如下特征：
//
//        节点的左子树只包含小于当前节点的数。
//        节点的右子树只包含大于当前节点的数。
//        所有左子树和右子树自身必须也是二叉搜索树。
//        示例 1:
//
//        输入:
//        2
//        / \
//        1   3
//        输出: true
//        示例 2:
//
//        输入:
//        5
//        / \
//        1   4
//        / \
//        3   6
//        输出: false
//        解释: 输入为: [5,1,4,null,null,3,6]。
//        根节点的值为 5 ，但是其右子节点值为 4 。

import org.example.models.TreeNode;

public class ValidateBinarySearchTree98 {
    long max = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        boolean left = isValidBST(root.left);

        if (max < root.val) {
            max = root.val;
        }
        else {
            return false;
        }

        boolean right = isValidBST(root.right);

        return left && right;
    }

    TreeNode pre = null;
    public boolean isValidBST1(TreeNode root) {
        if (root == null)
            return true;

        boolean left = isValidBST1(root.left);

        if (pre != null && pre.val >= root.val) {
            return false;
        }
        pre = root;

        boolean right = isValidBST1(root.right);

        return left && right;
    }
}
