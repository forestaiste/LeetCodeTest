package org.example.leetcode.pageforteen;

//669. 修剪二叉搜索树
//        给你二叉搜索树的根节点 root ，同时给定最小边界low 和最大边界 high。通过修剪二叉搜索树，使得所有节点的值在[low, high]中。修剪树不应该改变保留在树中的元素的相对结构（即，如果没有被移除，原有的父代子代关系都应当保留）。 可以证明，存在唯一的答案。
//
//        所以结果应当返回修剪好的二叉搜索树的新的根节点。注意，根节点可能会根据给定的边界发生改变。
//
//
//
//        示例 1：
//
//
//        输入：root = [1,0,2], low = 1, high = 2
//        输出：[1,null,2]
//        示例 2：
//
//
//        输入：root = [3,0,4,null,2,null,null,1], low = 1, high = 3
//        输出：[3,2,null,1]
//        示例 3：
//
//        输入：root = [1], low = 1, high = 2
//        输出：[1]
//        示例 4：
//
//        输入：root = [1,null,2], low = 1, high = 3
//        输出：[1,null,2]
//        示例 5：
//
//        输入：root = [1,null,2], low = 2, high = 4
//        输出：[2]

import org.example.models.TreeNode;

public class TrimABinarySearchTree669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null)
            return null;

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        if (root.val < low || root.val > high) {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                TreeNode cur = root.right;

                while (cur.left != null)
                    cur = cur.left;

                cur.left = root.left;
                return root.right;
            }
        }

        return root;
    }

    public TreeNode trimBST1(TreeNode root, int low, int high) {
        if (root == null)
            return null;

        if (root.val < low) {
            TreeNode right = trimBST1(root.right, low, high);
            return right;
        }

        if (root.val > high) {
            TreeNode left = trimBST1(root.left, low, high);
            return left;
        }

        root.left = trimBST1(root.left, low, high);
        root.right = trimBST1(root.right, low, high);

        return root;
    }

    public static void main(String[] args) {
                TreeNode rightLeft = new TreeNode(1);

        TreeNode rightRight = new TreeNode(2, rightLeft, null);

        TreeNode right = new TreeNode(4);

        TreeNode left = new TreeNode(0, null, rightRight);

        TreeNode root = new TreeNode(3, left, right);

//        TreeNode right = new TreeNode(2);
//
//        TreeNode left = new TreeNode(0);
//
//        TreeNode root = new TreeNode(1, left, right);

        TrimABinarySearchTree669 trimABinarySearchTree = new TrimABinarySearchTree669();
        trimABinarySearchTree.trimBST1(root, 3, 4);
//        trimABinarySearchTree.trimBST1(root, 1, 2);
    }
}
