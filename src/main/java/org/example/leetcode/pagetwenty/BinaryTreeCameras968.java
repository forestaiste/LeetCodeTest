package org.example.leetcode.pagetwenty;

//968. 监控二叉树
//        给定一个二叉树，我们在树的节点上安装摄像头。
//
//        节点上的每个摄影头都可以监视其父对象、自身及其直接子对象。
//
//        计算监控树的所有节点所需的最小摄像头数量。
//
//        示例 1：
//
//        输入：[0,0,null,0,0]
//        输出：1
//        解释：如图所示，一台摄像头足以监控所有节点。
//        示例 2：
//
//        输入：[0,0,null,0,null,0,null,null,0]
//        输出：2
//        解释：需要至少两个摄像头来监视树的所有节点。 上图显示了摄像头放置的有效位置之一。

import org.example.models.TreeNode;

public class BinaryTreeCameras968 {
    int result;

    public int minCameraCover(TreeNode root) {
        result = 0;

        if (traversal(root) == 0) {
            result++;
        }

        return result;
    }

    int traversal(TreeNode cur) {
        if (cur == null) return 2;
        int left = traversal(cur.left);
        int right = traversal(cur.right);

        if (left == 2 && right == 2) {
            return 0;
        }
        else if (left == 0 || right == 0) {
            result++;
            return 1;
        }
        else {
            return 2;
        }
    }
}
