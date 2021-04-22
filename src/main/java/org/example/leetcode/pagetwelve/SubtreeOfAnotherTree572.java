package org.example.leetcode.pagetwelve;

//572. 另一个树的子树
//        给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
//
//        示例 1:
//        给定的树 s:
//
//        3
//        / \
//        4   5
//        / \
//        1   2
//        给定的树 t：
//
//        4
//        / \
//        1   2
//        返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
//
//        示例 2:
//        给定的树 s：
//
//        3
//        / \
//        4   5
//        / \
//        1   2
//        /
//        0
//        给定的树 t：
//
//        4
//        / \
//        1   2
//        返回 false。

import org.example.models.TreeNode;

public class SubtreeOfAnotherTree572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;

        if (s == null)
            return false;

        if (t == null)
            return true;

        s = getStartNodeInS(s, t.val);

        while (s != null) {
            if (!isSameTree(s, t)) {
                TreeNode left = getStartNodeInS(s.left, t.val);

                if (left != null) {
                    if (isSameTree(left, t)) {
                        return true;
                    }
                    else {
                        s = getStartNodeInS(s.right, t.val);
                    }
                }
                else if (left == null) {
                    s = getStartNodeInS(s.right, t.val);
                }
            }
            else {
                return true;
            }
        }

        return false;
    }

    private TreeNode getStartNodeInS(TreeNode s, int value) {
        if (s == null) {
            return null;
        }

        if (s.val == value)
            return s;

        TreeNode node;
        node = getStartNodeInS(s.left, value);

        if (node == null)
            node = getStartNodeInS(s.right, value);

        return node;
    }

    private boolean isSameTree(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        else if (left != null && right == null)
            return false;
        else if (left == null && right != null)
            return false;
        else if (left.val != right.val)
            return false;

        return isSameTree(left.left, right.left) && isSameTree(left.right, right.right);
    }

}
