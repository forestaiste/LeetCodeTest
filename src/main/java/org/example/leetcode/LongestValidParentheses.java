package org.example.leetcode;

//32. 最长有效括号
//        给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
//
//
//
//        示例 1：
//
//        输入：s = "(()"
//        输出：2
//        解释：最长有效括号子串是 "()"
//        示例 2：
//
//        输入：s = ")()())"
//        输出：4
//        解释：最长有效括号子串是 "()()"
//        示例 3：
//
//        输入：s = ""
//        输出：0
//
//
//        提示：
//
//        0 <= s.length <= 3 * 104
//        s[i] 为 '(' 或 ')'

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParenthesesStack(String s) {
        Stack<Character> stack = new Stack<Character>();

        char[] parentheses = s.toCharArray();

        StringBuilder intermediate = new StringBuilder();
        int maxLength = 0;
        int insertedLeft = 0;

        for (int i = 0; i < parentheses.length; i++) {
            if (parentheses[i] == ')' && stack.peek() == '(') {
                intermediate.append("()");
                stack.pop();
                insertedLeft--;
            }
            else if (parentheses[i] == '(') {
                stack.push(parentheses[i]);
                insertedLeft++;
            }
            else {
                stack.push(parentheses[i]);
                if (intermediate.length() > maxLength) {
                    maxLength = intermediate.length();

                    intermediate.delete(0, intermediate.length() - 1);
                }
            }
        }

        return maxLength;
    }

    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

}
