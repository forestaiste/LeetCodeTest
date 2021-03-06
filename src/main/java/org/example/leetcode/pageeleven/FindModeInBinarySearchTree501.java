package org.example.leetcode.pageeleven;

//501. 二叉搜索树中的众数
//        给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
//
//        假定 BST 有如下定义：
//
//        结点左子树中所含结点的值小于等于当前结点的值
//        结点右子树中所含结点的值大于等于当前结点的值
//        左子树和右子树都是二叉搜索树
//        例如：
//        给定 BST [1,null,2,2],
//
//        1
//        \
//        2
//        /
//        2
//        返回[2].
//
//        提示：如果众数超过1个，不需考虑输出顺序
//
//        进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）

import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class FindModeInBinarySearchTree501 {
    int max = 0;
    int count = 0;
    TreeNode pre = null;
    List<Integer> queue = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        if (root == null)
            return null;

        travel(root);

        return queue.stream().mapToInt(i -> i).toArray();
    }

    private void travel(TreeNode node) {
        if (node == null)
            return;

        travel(node.left);

        if (pre == null) {
            count = 1;
        }
        else if (node.val == pre.val) {
            count++;
        }
        else {
            count = 1;
        }

        if (count > max) {
            max = count;
            queue.clear();
            queue.add(node.val);
        }
        else if (count == max) {
            queue.add(node.val);
        }

        pre = node;

        travel(node.right);
    }
}
