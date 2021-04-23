package org.example.leetcode.pagethree;

//112. 路径总和
//        给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
//
//        叶子节点 是指没有子节点的节点。
//
//
//
//        示例 1：
//
//
//        输入：root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
//        输出：true
//        示例 2：
//
//
//        输入：root = [1,2,3], targetSum = 5
//        输出：false
//        示例 3：
//
//        输入：root = [1,2], targetSum = 0
//        输出：false

import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum112 {
    boolean found = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        backTrack(root, targetSum);
        return found;
    }

    private void backTrack(TreeNode node, int target) {
        target -= node.val;

        if (target == 0 && node.left == null && node.right == null) {
            found = true;
            return;
        }

        if (node.left != null)
            backTrack(node.left, target);

        if (node.right != null)
            backTrack(node.right, target);
    }
}

