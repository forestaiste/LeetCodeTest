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
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<String> binaryTreePaths1(TreeNode root) {
        result = new ArrayList<>();
        List<String> paths = new ArrayList<>();

        if (root == null)
            return result;
        paths.add(String.valueOf(root.val));
        backTrack(root, paths);
        return result;
    }

    private void backTrack(TreeNode node, List<String> paths) {
        if (node.left != null) {
            paths.add(String.valueOf(node.left.val));
            backTrack(node.left, paths);
            paths.remove(paths.size() - 1);
        }

        if (node.right != null) {
            paths.add(String.valueOf(node.right.val));
            backTrack(node.right, paths);
            paths.remove(paths.size() - 1);
        }

        if (node.left == null && node.right == null) {
            result.add(String.join("->", paths));
            return;
        }
    }

    public List<String> binaryTreePaths2(TreeNode root) {
        result = new ArrayList<>();
        List<String> paths = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        paths.add(String.valueOf(root.val));

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left == null && node.right == null) {
                result.add(String.join("->", paths));
            }

            if (node.right != null) {
                paths.add(String.valueOf(node.right.val));
                queue.add(node.right);
                paths.remove(paths.size() - 1);
            }

            if (node.left != null) {
                paths.add(String.valueOf(node.left.val));
                queue.add(node.left);
                paths.remove(paths.size() - 1);
            }
        }

        return result;
    }
}
