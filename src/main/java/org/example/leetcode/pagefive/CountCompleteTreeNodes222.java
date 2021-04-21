package org.example.leetcode.pagefive;

//222. 完全二叉树的节点个数
//        给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
//
//        完全二叉树 的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~ 2h 个节点。
//
//
//
//        示例 1：
//
//
//        输入：root = [1,2,3,4,5,6]
//        输出：6
//        示例 2：
//
//        输入：root = []
//        输出：0
//        示例 3：
//
//        输入：root = [1]
//        输出：1

import com.sun.source.tree.Tree;
import org.example.models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes222 {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int total = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            total += size;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return total;
    }

    public int countNodes1(TreeNode root) {
        if (root == null)
            return 0;

        int left = countNodes1(root.left);
        int right = countNodes1(root.right);

        return left + right + 1;
    }

}
