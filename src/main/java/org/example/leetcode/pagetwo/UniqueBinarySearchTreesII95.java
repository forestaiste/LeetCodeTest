package org.example.leetcode.pagetwo;

//95. 不同的二叉搜索树 II
//        给你一个整数 n ，请你生成并返回所有由 n 个节点组成且节点值从 1 到 n 互不相同的不同 二叉搜索树 。可以按 任意顺序 返回答案。
//
//        示例 1：
//
//
//        输入：n = 3
//        输出：[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
//        示例 2：
//
//        输入：n = 1
//        输出：[[1]]

import com.sun.source.tree.Tree;
import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UniqueBinarySearchTreesII95 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }

        return build(1, n);
    }

    private List<TreeNode> build(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> lefTrees = build(start, i - 1);
            List<TreeNode> rightTrees = build(i + 1, end);

            for (TreeNode left : lefTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    allTrees.add(node);
                }
            }
        }

        return allTrees;
    }
}
