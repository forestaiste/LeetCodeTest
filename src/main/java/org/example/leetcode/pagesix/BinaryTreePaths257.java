package org.example.leetcode.pagesix;

//257. 二叉树的所有路径
//        给定一个二叉树，返回所有从根节点到叶子节点的路径。
//
//        说明: 叶子节点是指没有子节点的节点。
//
//        示例:
//
//        输入:
//
//        1
//        /   \
//        2     3
//        \
//        5
//
//        输出: ["1->2->5", "1->3"]
//
//        解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3

import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {
    List<String> result;
    public List<String> binaryTreePaths(TreeNode root) {
        result = new ArrayList<>();

        if (root == null)
            return result;
        StringBuilder string = new StringBuilder();
        travel(root, string);

        return result;
    }

    public void travel(TreeNode node, StringBuilder string) {
        string.append(node.val + "->");

        if (node.left != null) {
            StringBuilder left = new StringBuilder(string);
            travel(node.left, left);
        }

        if (node.right != null) {
            StringBuilder right = new StringBuilder(string);
            travel(node.right, right);
        }

        if (node.left == null && node.right == null) {
            result.add(string.substring(0, string.length() - 2).toString());
            return;
        }
    }
}
