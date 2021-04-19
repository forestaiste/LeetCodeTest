package org.example.leetcode.pagethirteen;

//637. 二叉树的层平均值
//        给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
//
//        示例 1：
//
//        输入：
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        输出：[3, 14.5, 11]
//        解释：
//        第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。

import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> layer = new LinkedList<>();
        layer.add(root);

        while (!layer.isEmpty()) {
            int size = layer.size();

            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = layer.poll();

                if (node != null) {
                    if (node.left != null) {
                        layer.add(node.left);
                    }

                    if (node.right != null) {
                        layer.add(node.right);
                    }

                    sum += node.val;
                }
            }

            result.add(sum / size);
        }

        return result;
    }
}
