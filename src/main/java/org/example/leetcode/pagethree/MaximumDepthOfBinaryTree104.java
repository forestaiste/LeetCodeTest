package org.example.leetcode.pagethree;

//104. 二叉树的最大深度
//        给定一个二叉树，找出其最大深度。
//
//        二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//
//        说明: 叶子节点是指没有子节点的节点。
//
//        示例：
//        给定二叉树 [3,9,20,null,null,15,7]，
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        返回它的最大深度 3 。

import org.example.models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int m = 0, n = 0;

        m = maxDepth(root.left);
        n = maxDepth(root.right);

        return Math.max(m, n) + 1;
    }

    public int maxDepth1(TreeNode root) {
        if (root == null)
            return 0;

        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);

            }

            depth++;
        }

        return depth;
    }
}
