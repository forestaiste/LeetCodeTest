package org.example.leetcode.pageeleven;

//530. 二叉搜索树的最小绝对差
//        给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
//
//
//
//        示例：
//
//        输入：
//
//        1
//        \
//        3
//        /
//        2
//
//        输出：
//        1
//
//        解释：
//        最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
import org.example.models.TreeNode;

public class MinimumAbsoluteDifferenceInBST530 {
    long min = Integer.MAX_VALUE;
    long preVal = Integer.MIN_VALUE;
    public int getMinimumDifference(TreeNode root) {
        travel(root);

        return (int)min;
    }

    public void travel(TreeNode node) {
        if (node == null)
            return;

        travel(node.left);

        min = Math.min(min, Math.abs(node.val - preVal));
        preVal = node.val;

        travel(node.right);
    }

    TreeNode pre = null;
    int minVal = Integer.MAX_VALUE;
    public int getMinimumDifference1(TreeNode root) {
        travel1(root);

        return (int)min;
    }

    public void travel1(TreeNode node) {
        if (node == null)
            return;

        getMinimumDifference(node.left);

        if (pre != null) {
            min = Math.min(min, node.val - pre.val);
        }
        pre = node;

        getMinimumDifference(node.right);
    }
}
