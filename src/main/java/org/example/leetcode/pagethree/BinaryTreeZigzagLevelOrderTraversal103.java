package org.example.leetcode.pagethree;

//103. 二叉树的锯齿形层序遍历
//        给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
//
//        例如：
//        给定二叉树 [3,9,20,null,null,15,7],
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        返回锯齿形层序遍历如下：
//
//        [
//        [3],
//        [20,9],
//        [15,7]
//        ]

import org.example.models.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();

        if (root == null)
            return results;

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        boolean forward = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = null;
                if (forward) {
                    node = queue.poll();

                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                else {
                    node = queue.pollLast();
                    if (node.right != null) {
                        queue.addFirst(node.right);
                    }
                    if (node.left != null) {
                        queue.addFirst(node.left);
                    }
                }

                result.add(node.val);
            }

            results.add(result);
            forward = !forward;
        }

        return results;
    }
}
