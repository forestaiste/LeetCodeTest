package org.example.leetcode.pagetwo;

//99. 恢复二叉搜索树
//        给你二叉搜索树的根节点 root ，该树中的两个节点被错误地交换。请在不改变其结构的情况下，恢复这棵树。
//
//        进阶：使用 O(n) 空间复杂度的解法很容易实现。你能想出一个只使用常数空间的解决方案吗？
//
//        示例 1：
//
//        输入：root = [1,3,null,null,2]
//        输出：[3,1,null,null,2]
//        解释：3 不能是 1 左孩子，因为 3 > 1 。交换 1 和 3 使二叉搜索树有效。
//        示例 2：
//
//
//        输入：root = [3,1,4,null,null,2]
//        输出：[2,1,4,null,null,3]
//        解释：2 不能在 3 的右子树中，因为 2 < 3 。交换 2 和 3 使二叉搜索树有效。

import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RecoverBinarySearchTree99 {
    public void recoverTree(TreeNode root) {
        List<Integer> nums = new ArrayList<Integer>();
        inorder(root, nums);
        int[] swapped = findTwoSwapped(nums);
        recover(root, 2, swapped[0], swapped[1]);
    }

    public void inorder(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return;
        }
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }

    public int[] findTwoSwapped(List<Integer> nums) {
        int n = nums.size();
        int x = -1, y = -1;
        for (int i = 0; i < n - 1; ++i) {
            if (nums.get(i + 1) < nums.get(i)) {
                y = nums.get(i + 1);
                if (x == -1) {
                    x = nums.get(i);
                } else {
                    break;
                }
            }
        }
        return new int[]{x, y};
    }

    public void recover(TreeNode root, int count, int x, int y) {
        if (root != null) {
            if (root.val == x || root.val == y) {
                root.val = root.val == x ? y : x;
                if (--count == 0) {
                    return;
                }
            }
            recover(root.right, count, x, y);
            recover(root.left, count, x, y);
        }
    }

    public static void main(String[] args) {
        TreeNode rightLeftLeaf1 = new TreeNode(5);
        TreeNode rightRightLeaf1 = new TreeNode(7);
        TreeNode right1 = new TreeNode(4, rightLeftLeaf1, rightRightLeaf1);
        TreeNode left1 = new TreeNode(3);

        TreeNode root1 = new TreeNode(6, left1, right1);

        RecoverBinarySearchTree99 recoverBinarySearchTree = new RecoverBinarySearchTree99();
        recoverBinarySearchTree.recoverTree(root1);
    }
}
