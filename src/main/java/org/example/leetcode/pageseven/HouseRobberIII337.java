package org.example.leetcode.pageseven;

//337. 打家劫舍 III
//        在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
//
//        计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
//
//        示例 1:
//
//        输入: [3,2,3,null,3,null,1]
//
//        3
//        / \
//        2   3
//        \   \
//        3   1
//
//        输出: 7
//        解释: 小偷一晚能够盗取的最高金额 = 3 + 3 + 1 = 7.
//        示例 2:
//
//        输入: [3,4,5,1,3,null,1]
//
//        3
//        / \
//        4   5
//        / \   \
//        1   3   1
//
//        输出: 9
//        解释: 小偷一晚能够盗取的最高金额 = 4 + 5 = 9.

import com.sun.source.tree.Tree;
import org.example.models.TreeNode;

import java.util.List;

public class HouseRobberIII337 {
    public int rob(TreeNode root) {
        int[] val = robTree(root);

        return Math.max(val[0], val[1]);
    }

    private int[] robTree(TreeNode node) {
        if (node == null) return new int[2];

        int[] left = robTree(node.left);
        int[] right = robTree(node.right);

        int[] val = new int[2];

        val[1] = node.val + left[0] + right[0];
        val[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return val;
    }

    public static void main(String[] args) {
        HouseRobberIII337 houseRobberIII = new HouseRobberIII337();

        TreeNode leaf1 = new TreeNode(1);
        TreeNode leaf2 = new TreeNode(3);
        TreeNode left = new TreeNode(4, leaf1, leaf2);

        TreeNode leaf3 = new TreeNode(1);
        TreeNode right = new TreeNode(5);

        TreeNode root = new TreeNode(3, left, right);

        int val = houseRobberIII.rob(root);

        System.out.println(val);
    }
}
