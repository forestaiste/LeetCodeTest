package org.example.leetcode.pagetwo;

//94. 二叉树的中序遍历
//        给定一个二叉树的根节点 root ，返回它的 中序 遍历。
//
//
//
//        示例 1：
//
//
//        输入：root = [1,null,2,3]
//        输出：[1,3,2]
//        示例 2：
//
//        输入：root = []
//        输出：[]
//        示例 3：
//
//        输入：root = [1]
//        输出：[1]
//        示例 4：
//
//
//        输入：root = [1,2]
//        输出：[2,1]
//        示例 5：
//
//
//        输入：root = [1,null,2]
//        输出：[1,2]

import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();

        if (root == null)
            return result;

        middleTravel(root);

        return result;
    }

    private void middleTravel(TreeNode node) {
        if (node == null)
            return;

        middleTravel(node.left);
        result.add(node.val);
        middleTravel(node.right);
    }
}
