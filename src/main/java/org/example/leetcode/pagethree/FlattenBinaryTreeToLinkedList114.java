package org.example.leetcode.pagethree;

//114. 二叉树展开为链表
//        给你二叉树的根结点 root ，请你将它展开为一个单链表：
//
//        展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
//        展开后的单链表应该与二叉树 先序遍历 顺序相同。
//
//
//        示例 1：
//
//
//        输入：root = [1,2,5,3,4,null,6]
//        输出：[1,null,2,null,3,null,4,null,5,null,6]
//        示例 2：
//
//        输入：root = []
//        输出：[]
//        示例 3：
//
//        输入：root = [0]
//        输出：[0]

import org.example.models.TreeNode;

public class FlattenBinaryTreeToLinkedList114 {
    public void flatten(TreeNode root) {
        if (root == null)
            return;

        flatten(root.right);
        flatten(root.left);

        TreeNode right = root.right;
        if (root.left != null) {
            root.right = root.left;

            TreeNode rightMost = root.right;
            while (rightMost.right != null)
                rightMost = rightMost.right;

            rightMost.right = right;
            root.left = null;
        }
    }

    TreeNode pre;
    public void flatten1(TreeNode root) {
        if (root == null)
            return;

        flatten1(root.right);
        flatten1(root.left);

        System.out.println(root.val);
        root.right = pre;
        root.left = null;
        pre = root;
    }
}
