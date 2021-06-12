package org.example.leetcode.pagefive;

//230. 二叉搜索树中第K小的元素
//        给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
//
//        示例 1：
//
//        输入：root = [3,1,4,null,2], k = 1
//        输出：1
//        示例 2：
//
//        输入：root = [5,3,6,2,4,null,null,1], k = 3
//        输出：3

import org.example.models.TreeNode;

public class KthSmallestElementInABST230 {
    int count;
    int result;
    public int kthSmallest(TreeNode root, int k) {
        count = 0;

        travel(root, k);
        return result;
    }

    private void travel(TreeNode node, int k) {
        if (node == null)
            return;

        travel(node.left, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        travel(node.right, k);
    }
}
