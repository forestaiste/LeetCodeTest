package org.example.leetcode.pagefive;

//236. 二叉树的最近公共祖先
//        给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
//
//        百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
//
//
//
//        示例 1：
//
//
//        输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
//        输出：3
//        解释：节点 5 和节点 1 的最近公共祖先是节点 3 。
//        示例 2：
//
//
//        输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
//        输出：5
//        解释：节点 5 和节点 4 的最近公共祖先是节点 5 。因为根据定义最近公共祖先节点可以为节点本身。
//        示例 3：
//
//        输入：root = [1,2], p = 1, q = 2
//        输出：1
//
//
//        提示：
//
//        树中节点数目在范围 [2, 105] 内。
//        -109 <= Node.val <= 109
//        所有 Node.val 互不相同 。
//        p != q
//        p 和 q 均存在于给定的二叉树中。

import com.sun.source.tree.Tree;
import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestorOfABinaryTree236 {
    List<TreeNode> pPath = null;
    List<TreeNode> qPath = null;
    List<TreeNode> result = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path = new ArrayList<>();
        path.add(root);
        searchTreeNode(root, p, path);
        pPath = result;
        path.clear();
        path.add(root);
        searchTreeNode(root, q, path);
        qPath = result;

        int size = Math.min(pPath.size(), qPath.size());
        TreeNode same = null;
        for (int i = 0; i < size; i++) {
            if (pPath.get(i).val == qPath.get(i).val) {
                same = pPath.get(i);
            }
            else
            {
                break;
            }
        }

        return same;
    }

    private void searchTreeNode(TreeNode root, TreeNode target, List<TreeNode> path) {
        if (root == null)
            return;

        if (root.val == target.val) {
            result = new ArrayList<>(path);
            return;
        }


            path.add(root.left);
            searchTreeNode(root.left, target, path);
            path.remove(path.size() - 1);

            path.add(root.right);
            searchTreeNode(root.right, target, path);
            path.remove(path.size() - 1);
    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor1(root, p, q);
        TreeNode right = lowestCommonAncestor1(root, p, q);

        if (left != null && right != null)
            return root;
        if (left == null && right != null)
            return right;
        else if (left != null && right == null)
            return left;
        else
            return null;
    }
}
