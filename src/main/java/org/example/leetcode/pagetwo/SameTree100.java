package org.example.leetcode.pagetwo;

//100. 相同的树
//        给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
//
//        如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
//
//
//
//        示例 1：
//
//
//        输入：p = [1,2,3], q = [1,2,3]
//        输出：true
//        示例 2：
//
//
//        输入：p = [1,2], q = [1,null,2]
//        输出：false
//        示例 3：
//
//
//        输入：p = [1,2,1], q = [1,1,2]
//        输出：false

import org.example.models.TreeNode;

import java.util.Stack;

public class SameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p != null && q == null)
            return false;
        else if (p == null && q != null)
            return false;
        else if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();
        pStack.push(p);
        qStack.push(q);

        while (!pStack.isEmpty()) {
            TreeNode pNode = pStack.pop();
            TreeNode qNode = qStack.pop();

            if (pNode == null && qNode == null)
                continue;

            if ((pNode != null && qNode == null) || (pNode == null && qNode != null) || (pNode.val != qNode.val))
                return false;

            pStack.push(pNode.right);
            pStack.push(pNode.left);
            qStack.push(qNode.right);
            qStack.push(qNode.left);
        }

        return true;
    }
}
