package org.example.leetcode.pageeight;

//394. 字符串解码
//        给定一个经过编码的字符串，返回它解码后的字符串。
//
//        编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
//
//        你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
//
//        此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
//
//
//
//        示例 1：
//
//        输入：s = "3[a]2[bc]"
//        输出："aaabcbc"
//        示例 2：
//
//        输入：s = "3[a2[c]]"
//        输出："accaccacc"
//        示例 3：
//
//        输入：s = "2[abc]3[cd]ef"
//        输出："abcabccdcdcdef"
//        示例 4：
//
//        输入：s = "abc3[cd]xyz"
//        输出："abccdcdcdxyz"

import java.util.Stack;

public class DecodeString394 {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        StringBuilder builder = new StringBuilder();

        int brackets = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c);
            }
            else if (c == '[') {
                stack.push(c);
                brackets++;
            }
            else if (c == ']') {
                StringBuilder seg = new StringBuilder();

                while (!stack.isEmpty() && stack.peek() != '[') {
                    seg.insert(0, stack.pop());
                }
                stack.pop();

                StringBuilder number = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    number.insert(0, stack.pop());
                }

                int times = Integer.parseInt(number.toString());

                brackets--;

                if (brackets > 0) {
                    for (int j = 0; j < times; j++) {
                        for (int k = 0; k < seg.length(); k++) {
                            stack.push(seg.charAt(k));
                        }
                    }
                }
                else {
                    for (int j = 0; j < times; j++) {
                        builder.append(seg.toString());
                    }
                }
            }
            else if (brackets > 0) {
                stack.push(c);
            }
            else {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        DecodeString394 decodeString = new DecodeString394();
        System.out.println(decodeString.decodeString("100[leetcode]"));
        System.out.println(decodeString.decodeString("3[a]2[bc]"));
        System.out.println(decodeString.decodeString("3[a2[c]]"));
        System.out.println(decodeString.decodeString("2[abc]3[cd]ef"));
        System.out.println(decodeString.decodeString("abc3[cd]xyz"));
    }
}
