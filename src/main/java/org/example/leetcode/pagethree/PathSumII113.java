package org.example.leetcode.pagethree;

//113. 路径总和 II
//        给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
//
//        叶子节点 是指没有子节点的节点。
//
//
//
//        示例 1：
//
//
//        输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
//        输出：[[5,4,11,2],[5,8,4,5]]
//        示例 2：
//
//
//        输入：root = [1,2,3], targetSum = 5
//        输出：[]
//        示例 3：
//
//        输入：root = [1,2], targetSum = 0
//        输出：[]

import com.sun.source.tree.Tree;
import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> results = new ArrayList<>();

        if (root == null)
            return results;

        List<Integer> paths = new ArrayList<>();

        paths.add(root.val);
        backTrack(root, results, paths, targetSum - root.val);

        return results;
    }

    public void backTrack(TreeNode node, List<List<Integer>> results, List<Integer> paths, int target) {
        if (node.left == null && node.right == null) {
            if (target == 0)
                results.add(new ArrayList<>(paths));
            return;
        }

        if (node.left != null) {
            paths.add(node.left.val);
            target -= node.left.val;
            backTrack(node.left, results, paths, target);
            target += node.left.val;
            paths.remove(paths.size() - 1);
        }

        if (node.right != null) {
            paths.add(node.right.val);
            target -= node.right.val;
            backTrack(node.right, results, paths, target);
            target += node.right.val;
            paths.remove(paths.size() - 1);
        }
    }

}
