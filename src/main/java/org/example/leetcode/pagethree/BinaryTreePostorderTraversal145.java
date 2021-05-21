package org.example.leetcode.pagethree;

import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal145 {
    List<Integer> result;
    public List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        if (root == null)
            return result;

        travel(root);

        return result;
    }

    private void travel(TreeNode node) {
        if (node == null)
            return;

        travel(node.left);
        travel(node.right);
        result.add(node.val);
    }
}
