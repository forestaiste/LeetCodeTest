package org.example.leetcode.pagethree;

//107. 二叉树的层序遍历 II
//        给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
//
//        例如：
//        给定二叉树 [3,9,20,null,null,15,7],
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        返回其自底向上的层序遍历为：
//
//        [
//        [15,7],
//        [9,20],
//        [3]
//        ]

import org.example.models.TreeNode;

import java.sql.Statement;
import java.util.*;

public class BinaryTreeLevelOrderTraversalII107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) return results;

        Deque<TreeNode> layer = new ArrayDeque<>();
        layer.add(root);
        while (!layer.isEmpty()) {
            List<Integer> result = new ArrayList<>();
            int size = layer.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = layer.poll();

                if (node.left != null) {
                    layer.add(node.left);
                }

                if (node.right != null) {
                    layer.add(node.right);
                }

                result.add(node.val);
            }

            results.add(0, result);
        }

        return results;
    }
}
