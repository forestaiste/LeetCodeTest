package org.example.leetcode.pagetwelve;

//559. N 叉树的最大深度
//        给定一个 N 叉树，找到其最大深度。
//
//        最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
//
//        N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔（请参见示例）。
//
//
//
//        示例 1：
//
//
//
//        输入：root = [1,null,3,2,4,null,5,6]
//        输出：3
//        示例 2：
//
//
//
//        输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
//        输出：5

import org.example.models.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfNAryTree559 {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;

        return getDepth(root);
    }

    private int getDepth(Node node) {
        if (node == null)
            return 0;

        int depth = 0;
        if (node.children != null) {
            for (Node child : node.children) {
                depth = Math.max(getDepth(child), depth);
            }
        }

        return depth + 1;
    }

    public int maxDepth1(Node root) {
        if (root == null)
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

                if (node.children != null) {
                    for (Node child : node.children) {
                        queue.add(child);
                    }
                }
            }

            depth++;
        }

        return depth;
    }
}
