package org.example.leetcode.pagethree;

//102. 二叉树的层序遍历
//        给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
//
//
//
//        示例：
//        二叉树：[3,9,20,null,null,15,7],
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        返回其层序遍历结果：
//
//        [
//        [3],
//        [9,20],
//        [15,7]
//        ]

import org.example.models.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();

        if (root == null) return results;
        Deque<TreeNode> layer = new ArrayDeque<>();
        layer.add(root);

        while (!layer.isEmpty()) {
            List<Integer> result = new ArrayList<>();
            int layerSize = layer.size();
            for (int i = 0; i < layerSize; i++) {
                TreeNode node = layer.poll();
                if (node.left != null) {
                    layer.add(node.left);
                }

                if (node.right != null) {
                    layer.add(node.right);
                }

                result.add(node.val);
            }

            results.add(result);
        }

        return results;
    }
}
