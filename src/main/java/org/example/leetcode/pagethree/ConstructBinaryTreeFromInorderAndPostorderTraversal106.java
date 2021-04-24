package org.example.leetcode.pagethree;

//106. 从中序与后序遍历序列构造二叉树
//        根据一棵树的中序遍历与后序遍历构造二叉树。
//
//        注意:
//        你可以假设树中没有重复的元素。
//
//        例如，给出
//
//        中序遍历 inorder = [9,3,15,20,7]
//        后序遍历 postorder = [9,15,7,20,3]
//        返回如下的二叉树：
//
//        3
//        / \
//        9  20
//        /  \
//        15   7

import org.example.models.TreeNode;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal106 {
    int[] inorder;
    int[] postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;

        if (inorder.length != postorder.length)
            return null;

        return build(0, inorder.length - 1, 0, inorder.length - 1, inorder.length);
    }

    private TreeNode build(int inStart, int inEnd, int postStart, int postEnd, int length) {
        if (length == 0)
            return null;

        int rootVal = postorder[postEnd];

        int i = 0;
        while (inorder[inStart + i] != rootVal) i++;

        TreeNode node = new TreeNode(rootVal);

        node.left = build(inStart, inStart + i - 1, postStart, postStart + i - 1, i);
        node.right = build(inStart + i + 1, inEnd, postStart + i, postEnd - 1, length - i - 1);

        return node;
    }
}
