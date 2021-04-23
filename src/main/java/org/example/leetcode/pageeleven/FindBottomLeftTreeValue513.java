package org.example.leetcode.pageeleven;



//513. 找树左下角的值
//        给定一个二叉树，在树的最后一行找到最左边的值。
//
//        示例 1:
//
//        输入:
//
//        2
//        / \
//        1   3
//
//        输出:
//        1
//
//
//        示例 2:
//
//        输入:
//
//        1
//        / \
//        2   3
//        /   / \
//        4   5   6
//        /
//        7
//
//        输出:
//        7

import com.sun.source.tree.Tree;
import org.example.models.TreeNode;

import java.time.temporal.Temporal;
import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue513 {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null)
            return 0;

        int result = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (i == 0)
                    result = node.val;

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
        }

        return result;
    }
}
