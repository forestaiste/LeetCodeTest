package org.example.leetcode.pageseven;

//331. 验证二叉树的前序序列化
//        序列化二叉树的一种方法是使用前序遍历。当我们遇到一个非空节点时，我们可以记录下这个节点的值。如果它是一个空节点，我们可以使用一个标记值记录，例如 #。
//
//        _9_
//        /   \
//        3     2
//        / \   / \
//        4   1  #  6
//        / \ / \   / \
//        # # # #   # #
//        例如，上面的二叉树可以被序列化为字符串 "9,3,4,#,#,1,#,#,2,#,6,#,#"，其中 # 代表一个空节点。
//
//        给定一串以逗号分隔的序列，验证它是否是正确的二叉树的前序序列化。编写一个在不重构树的条件下的可行算法。
//
//        每个以逗号分隔的字符或为一个整数或为一个表示 null 指针的 '#' 。
//
//        你可以认为输入格式总是有效的，例如它永远不会包含两个连续的逗号，比如 "1,,3" 。
//
//        示例 1:
//
//        输入: "9,3,4,#,#,1,#,#,2,#,6,#,#"
//        输出: true
//        示例 2:
//
//        输入: "1,#"
//        输出: false
//        示例 3:
//
//        输入: "9,#,#,1"
//        输出: false

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class VerifyPreorderSerializationOfABinaryTree331 {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split("\\,");

        int inDegrees = -1;
        int outDegrees = 0;

        for (int i = 0; i < nodes.length; i++) {
            inDegrees += 1;

            if (outDegrees < inDegrees)
                return false;

            if (!nodes[i].equals("#")) {
                outDegrees += 2;
            }
        }

        return inDegrees == outDegrees;
    }

    public boolean isValidSerialization1(String preorder) {
        int n = preorder.length();
        int i = 0;

        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);

        while (i < n) {
            if (stack.isEmpty()) {
                return false;
            }

            if (preorder.charAt(i) == ',') {
                i++;
            } else if (preorder.charAt(i) == '#') {
                int top = stack.pop() - 1;

                if (top > 0) {
                    stack.push(top);
                }
                i++;
            } else {
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                int top = stack.pop() - 1;

                if (top > 0) {
                    stack.push(top);
                }

                stack.push(2);
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        VerifyPreorderSerializationOfABinaryTree331 verifyPreorderSerializationOfABinaryTree = new VerifyPreorderSerializationOfABinaryTree331();
        System.out.println(verifyPreorderSerializationOfABinaryTree.isValidSerialization("7,2,#,2,#,#,#,6,#"));
        System.out.println(verifyPreorderSerializationOfABinaryTree.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
        System.out.println(verifyPreorderSerializationOfABinaryTree.isValidSerialization("1,#"));
        System.out.println(verifyPreorderSerializationOfABinaryTree.isValidSerialization("9,#,#,1"));
        System.out.println(verifyPreorderSerializationOfABinaryTree.isValidSerialization("#,#,3,5,#"));
        System.out.println(verifyPreorderSerializationOfABinaryTree.isValidSerialization("#,#,#"));
    }
}
