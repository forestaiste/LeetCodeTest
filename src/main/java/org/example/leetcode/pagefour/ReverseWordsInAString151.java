package org.example.leetcode.pagefour;
//151. 翻转字符串里的单词
//        给定一个字符串，逐个翻转字符串中的每个单词。
//
//        说明：
//
//        无空格字符构成一个 单词 。
//        输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
//        如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
//
//
//        示例 1：
//
//        输入："the sky is blue"
//        输出："blue is sky the"
//        示例 2：
//
//        输入："  hello world!  "
//        输出："world! hello"
//        解释：输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
//        示例 3：
//
//        输入："a good   example"
//        输出："example good a"
//        解释：如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
//        示例 4：
//
//        输入：s = "  Bob    Loves  Alice   "
//        输出："Alice Loves Bob"
//        示例 5：
//
//        输入：s = "Alice does not even like bob"
//        输出："bob like even not does Alice"
//
//
//        提示：
//
//        1 <= s.length <= 104
//        s 包含英文大小写字母、数字和空格 ' '
//        s 中 至少存在一个 单词

import java.util.*;

public class ReverseWordsInAString151 {
    public String reverseWords0(String s) {
        s = s.trim();

        List<String> words = Arrays.asList(s.split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    public String reverseWords(String s) {
        StringBuilder sb = trimSpaces(s);

        // 翻转字符串
        reverse(sb, 0, sb.length() - 1);

        // 翻转每个单词
        reverseEachWord(sb);

        return sb.toString();
    }

    public StringBuilder trimSpaces(String s) {
        int left = 0, right = s.length() - 1;
        // 去掉字符串开头的空白字符
        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }

        // 去掉字符串末尾的空白字符
        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }

        // 将字符串间多余的空白字符去除
        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            char c = s.charAt(left);

            if (c != ' ') {
                sb.append(c);
            } else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }

            ++left;
        }
        return sb;
    }

    public void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char tmp = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, tmp);
        }
    }

    public void reverseEachWord(StringBuilder sb) {
        int n = sb.length();
        int start = 0, end = 0;

        while (start < n) {
            // 循环至单词的末尾
            while (end < n && sb.charAt(end) != ' ') {
                ++end;
            }
            // 翻转单词
            reverse(sb, start, end - 1);
            // 更新start，去找下一个单词
            start = end + 1;
            ++end;
        }
    }

}
