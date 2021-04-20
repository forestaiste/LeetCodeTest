package org.example.leetcode.pagethree;

import org.example.models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null)
            return false;
        else if (left == null && right == null)
            return true;
        else if (left != null && right == null)
            return false;
        else if (left.val != right.val)
            return false;

        boolean outside = compare(left.left, right.right);
        boolean inside = compare(left.right, right.left);

        return outside && inside;
    }

    public boolean isSymmetric1(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if (left == null && right == null)
                continue;

            if (left == null ||right == null || left.val != right.val)
                return false;

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }
}
