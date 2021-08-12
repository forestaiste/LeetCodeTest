package org.example.leetcode.pagethree;

//109. 有序链表转换二叉搜索树
//        给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
//
//        本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
//
//        示例:
//
//        给定的有序链表： [-10, -3, 0, 5, 9],
//
//        一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
//
//        0
//        / \
//        -3   9
//        /   /
//        -10  5

import org.example.models.ListNode;
import org.example.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBinarySearchTree109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;

        List<Integer> nums = new ArrayList<>();

        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }

        TreeNode root = build(nums, 0, nums.size() - 1);
        return root;
    }

    private TreeNode build(List<Integer> nums, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums.get(mid));

        node.left = build(nums, start, mid - 1);
        node.right = build(nums, mid + 1, end);

        return node;
    }


    ListNode globalHead;

    public TreeNode sortedListToBST1(ListNode head) {
        globalHead = head;
        int length = getLength(head);
        TreeNode root = buildTree(0, length - 1);
        return root;
    }

    public int getLength(ListNode head) {
        int ret = 0;
        while (head != null) {
            ++ret;
            head = head.next;
        }
        return ret;
    }

    public TreeNode buildTree(int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right + 1) / 2;
        TreeNode root = new TreeNode();
        root.left = buildTree(left, mid - 1);
        root.val = globalHead.val;
        globalHead = globalHead.next;
        root.right = buildTree(mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
        ConvertSortedListToBinarySearchTree109 convertSortedListToBinarySearchTree = new ConvertSortedListToBinarySearchTree109();

        ListNode nine = new ListNode(9);
        ListNode five = new ListNode(5, nine);
        ListNode zero = new ListNode(0, five);
        ListNode negThree = new ListNode(-3, zero);
        ListNode negTen = new ListNode(-10, negThree);

        convertSortedListToBinarySearchTree.sortedListToBST1(negTen);
    }
}
