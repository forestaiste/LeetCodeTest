package org.example.leetcode.pagefive;

//227. 基本计算器 II
//        给你一个字符串表达式 s ，请你实现一个基本计算器来计算并返回它的值。
//
//        整数除法仅保留整数部分。
//
//        示例 1：
//
//        输入：s = "3+2*2"
//        输出：7
//        示例 2：
//
//        输入：s = " 3/2 "
//        输出：1
//        示例 3：
//
//        输入：s = " 3+5 / 2 "
//        输出：5
//
//
//        提示：
//
//        1 <= s.length <= 3 * 105
//        s 由整数和算符 ('+', '-', '*', '/') 组成，中间由一些空格隔开
//        s 表示一个 有效表达式
//        表达式中的所有整数都是非负整数，且在范围 [0, 231 - 1] 内
//        题目数据保证答案是一个 32-bit 整数

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicCalculatorII227 {
    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<Integer>();
        char preSign = '+';
        int num = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    default:
                        stack.push(stack.pop() / num);
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

    public int calculate1(String s) {
        Deque<String> queue = new LinkedList<>();

//        Queue<Character> operatorQueue = new LinkedList<>();

        StringBuilder number = new StringBuilder();
        char latestOperator = '\0';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                if ((latestOperator == '*' || latestOperator == '/') && number.length() > 0) {
                    int a = Integer.parseInt(queue.pollLast());
                    int b = Integer.parseInt(number.toString());

                    Integer result;
                    if (latestOperator == '*') {
                        result = a * b;
                    }
                    else {
                        result = a / b;
                    }

                    queue.add(result.toString());
                    latestOperator = '\0';
                }
                else if (number.length() > 0) {
                    queue.add(number.toString());
                    number = new StringBuilder();
                }
            }
            else if (c == '+' || c == '-') {
                if (number.length() > 0 && latestOperator == '\0') {
                    queue.add(number.toString());
                    number = new StringBuilder();

                    queue.add(new String(new char[]{c}));
                }
                else if (number.length() > 0 && latestOperator != '\0') {
                    int a = Integer.parseInt(queue.pollLast());
                    int b = Integer.parseInt(number.toString());
                    number = new StringBuilder();

                    Integer result;
                    if (latestOperator == '*') {
                        result = a * b;
                    }
                    else {
                        result = a / b;
                    }

                    queue.add(result.toString());
                    latestOperator = '\0';
                    queue.add(new String(new char[]{c}));
                }
                else {
                    queue.add(new String(new char[]{c}));
                }
            }
            else if (c == '*' || c == '/') {
                if (latestOperator != '\0' && number.length() > 0) {
                    int a = Integer.parseInt(queue.pollLast());
                    int b = Integer.parseInt(number.toString());
                    number = new StringBuilder();

                    Integer result;
                    if (latestOperator == '*') {
                        result = a * b;
                    }
                    else {
                        result = a / b;
                    }

                    queue.add(result.toString());
                }
                else if (number.length() > 0 ) {
                    queue.add(number.toString());
                    number = new StringBuilder();
                }

                latestOperator = c;
            }
            else if (i == s.length() - 1) {
                number.append(c);
                if (latestOperator != '\0' && number.length() > 0) {
                    int a = Integer.parseInt(queue.pollLast());
                    int b = Integer.parseInt(number.toString());

                    Integer result;
                    if (latestOperator == '*') {
                        result = a * b;
                    }
                    else {
                        result = a / b;
                    }

                    queue.add(result.toString());
                    latestOperator = '\0';
                }
                else if (number.length() > 0) {
                    queue.add(number.toString());
                    number = new StringBuilder();
                }
            }
            else {
                number.append(c);
            }
        }

        int result = Integer.parseInt(queue.pollFirst());
        while (!queue.isEmpty()) {
            String operator = queue.pollFirst();

            if (operator.equals("+")) {
                result += Integer.parseInt(queue.pollFirst());
            }
            else if (operator.equals("-")) {
                result -= Integer.parseInt(queue.pollFirst());
            }
        }

        return result;
    }
}
