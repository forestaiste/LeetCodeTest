package org.example.leetcode.pageone;

//20. 有效的括号
//        给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
//        有效字符串需满足：
//
//        左括号必须用相同类型的右括号闭合。
//        左括号必须以正确的顺序闭合。
//
//
//        示例 1：
//
//        输入：s = "()"
//        输出：true
//        示例 2：
//
//        输入：s = "()[]{}"
//        输出：true
//        示例 3：
//
//        输入：s = "(]"
//        输出：false
//        示例 4：
//
//        输入：s = "([)]"
//        输出：false
//        示例 5：
//
//        输入：s = "{[]}"
//        输出：true


import java.util.*;

public class ValidParentheses20 {
    public boolean isValid0(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '{' || c == '(' || c == '[') {
                parentheses.push(s.charAt(i));
            }
            else {
                if (parentheses.empty()) {
                    return false;
                }

                char out = parentheses.pop();
                if (!((c == '}' && out == '{')
                        || (c == ']' && out == '[')
                        || (c == ')' && out == '('))) {
                    return false;
                }
            }
        }

        return parentheses.empty();
    }

    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
