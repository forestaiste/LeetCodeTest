package org.example.leetcode.pagethree;

//105. 从前序与中序遍历序列构造二叉树
//        根据一棵树的前序遍历与中序遍历构造二叉树。
//
//        注意:
//        你可以假设树中没有重复的元素。
//
//        例如，给出
//
//        前序遍历 preorder = [3,9,20,15,7]
//        中序遍历 inorder = [9,3,15,20,7]
//        返回如下的二叉树：
//
//        3
//        / \
//        9  20
//        /  \
//        15   7

import org.example.models.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105 {
    int[] preorder;
    int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;

        int length = preorder.length;

        if (length == 0)
            return null;

        if (length != inorder.length) {
            return null;
        }

        return build(0, length - 1, 0, length - 1, length);
    }

    public TreeNode build(int preStart, int preEnd, int inStart, int inEnd, int length) {
        if (length == 0)
            return null;

        int value = preorder[preStart];

        int i = 0;
        while (inorder[inStart + i] != value) i++;

        TreeNode node = new TreeNode(value);

        node.left = build(preStart + 1, preStart + i, inStart, inStart + i, i);
        node.right = build(preStart + i + 1, preEnd, inStart + i + 1, inEnd, length - i - 1);
        return node;
    }
}
