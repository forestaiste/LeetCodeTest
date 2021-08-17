package org.example.leetcode.pagefour;

//173. 二叉搜索树迭代器
//        实现一个二叉搜索树迭代器类BSTIterator ，表示一个按中序遍历二叉搜索树（BST）的迭代器：
//        BSTIterator(TreeNode root) 初始化 BSTIterator 类的一个对象。BST 的根节点 root 会作为构造函数的一部分给出。指针应初始化为一个不存在于 BST 中的数字，且该数字小于 BST 中的任何元素。
//        boolean hasNext() 如果向指针右侧遍历存在数字，则返回 true ；否则返回 false 。
//        int next()将指针向右移动，然后返回指针处的数字。
//        注意，指针初始化为一个不存在于 BST 中的数字，所以对 next() 的首次调用将返回 BST 中的最小元素。
//
//        你可以假设 next() 调用总是有效的，也就是说，当调用 next() 时，BST 的中序遍历中至少存在一个下一个数字。
//
//
//
//        示例：
//
//
//        输入
//        ["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
//        [[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
//        输出
//        [null, 3, 7, true, 9, true, 15, true, 20, false]
//
//        解释
//        BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
//        bSTIterator.next();    // 返回 3
//        bSTIterator.next();    // 返回 7
//        bSTIterator.hasNext(); // 返回 True
//        bSTIterator.next();    // 返回 9
//        bSTIterator.hasNext(); // 返回 True
//        bSTIterator.next();    // 返回 15
//        bSTIterator.hasNext(); // 返回 True
//        bSTIterator.next();    // 返回 20
//        bSTIterator.hasNext(); // 返回 False

import com.sun.source.tree.Tree;
import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTreeIterator173 {
//    private TreeNode cur;
//    private Deque<TreeNode> stack;
//
//    public BinarySearchTreeIterator173(TreeNode root) {
//        cur = root;
//        stack = new LinkedList<TreeNode>();
//    }
//
//    public int next() {
//        while (cur != null) {
//            stack.push(cur);
//            cur = cur.left;
//        }
//        cur = stack.pop();
//        int ret = cur.val;
//        cur = cur.right;
//        return ret;
//    }
//
//    public boolean hasNext() {
//        return cur != null || !stack.isEmpty();
//    }
/////////////////////////////////////////////////////////
    private int idx;
    private List<Integer> arr;

    public BinarySearchTreeIterator173(TreeNode root) {
        idx = 0;
        arr = new ArrayList<Integer>();
        inorderTraversal(root, arr);
    }

    public int next() {
        return arr.get(idx++);
    }

    public boolean hasNext() {
        return idx < arr.size();
    }

    private void inorderTraversal(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, arr);
        arr.add(root.val);
        inorderTraversal(root.right, arr);
    }

}
