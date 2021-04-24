package org.example.leetcode.pageforteen;

//654. 最大二叉树
//        给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：
//
//        二叉树的根是数组 nums 中的最大元素。
//        左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。
//        右子树是通过数组中 最大值右边部分 递归构造出的最大二叉树。
//        返回有给定数组 nums 构建的 最大二叉树 。
//
//
//
//        示例 1：
//
//
//        输入：nums = [3,2,1,6,0,5]
//        输出：[6,3,5,null,2,0,null,null,1]
//        解释：递归调用如下所示：
//        - [3,2,1,6,0,5] 中的最大值是 6 ，左边部分是 [3,2,1] ，右边部分是 [0,5] 。
//        - [3,2,1] 中的最大值是 3 ，左边部分是 [] ，右边部分是 [2,1] 。
//        - 空数组，无子节点。
//        - [2,1] 中的最大值是 2 ，左边部分是 [] ，右边部分是 [1] 。
//        - 空数组，无子节点。
//        - 只有一个元素，所以子节点是一个值为 1 的节点。
//        - [0,5] 中的最大值是 5 ，左边部分是 [0] ，右边部分是 [] 。
//        - 只有一个元素，所以子节点是一个值为 0 的节点。
//        - 空数组，无子节点。
//        示例 2：
//
//
//        输入：nums = [3,2,1]
//        输出：[3,null,2,null,1]

import org.example.models.TreeNode;

public class MaximumBinaryTree654 {
    int[] nums;
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums = nums;

        int length = nums.length;

        if (length == 0)
            return null;

        return build(0, length - 1, length);
    }

    public TreeNode build(int start, int end, int length) {
        if (length == 0)
            return null;

        int max = nums[start];
        int index = 0;
        for (int i = 1; i <= end - start; i++) {
            if (max < nums[start + i]) {
                max = nums[start + i];
                index = i;
            }
        }

        TreeNode node = new TreeNode(max);

        node.left = build(start, start + index - 1, index);
        node.right = build(start + index+ 1, end, length - index - 1);

        return node;
    }
}
