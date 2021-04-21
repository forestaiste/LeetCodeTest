package org.example.leetcode.pagethree;

//111. 二叉树的最小深度
//        给定一个二叉树，找出其最小深度。
//
//        最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
//
//        说明：叶子节点是指没有子节点的节点。
//
//
//
//        示例 1：
//
//
//        输入：root = [3,9,20,null,null,15,7]
//        输出：2
//        示例 2：
//
//        输入：root = [2,null,3,null,4,null,5,null,6]
//        输出：5

import org.example.models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        return getDepth(root.left, root.right) + 1;
    }

    private int getDepth(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return 0;
        }

        int leftDepth = Integer.MAX_VALUE;
        if (left != null)
            leftDepth = getDepth(left.left, left.right);
        int rightDepth = Integer.MAX_VALUE;
        if (right != null)
            rightDepth = getDepth(right.left, right.right);

        return Math.min(leftDepth, rightDepth) + 1;
    }

    public int minDepth1(TreeNode root) {
        if (root == null)
            return 0;

        return getDepth1(root);
    }

    private int getDepth1(TreeNode node) {
        if (node == null)
            return 0;

        if (node.left != null && node.right == null)
            return getDepth1(node.left) + 1;
        if (node.right != null && node.left == null)
            return getDepth1(node.right) + 1;

        return Math.min(getDepth1(node.left), getDepth1(node.right)) + 1;
    }

    public int minDepth2(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);

                if (node.left == null && node.right == null)
                    return depth;
            }
        }

        return depth;
    }
}
