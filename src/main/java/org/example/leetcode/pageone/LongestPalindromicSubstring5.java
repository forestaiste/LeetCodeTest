package org.example.leetcode.pageone;


//给你一个字符串 s，找到 s 中最长的回文子串。
//
//
//        示例 1：
//
//        输入：s = "babad"
//        输出："bab"
//        解释："aba" 同样是符合题意的答案。
//        示例 2：
//
//        输入：s = "cbbd"
//        输出："bb"
//        示例 3：
//
//        输入：s = "a"
//        输出："a"
//        示例 4：
//
//        输入：s = "ac"
//        输出："a"

public class LongestPalindromicSubstring5 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring5 longestPalindromicSubstring = new LongestPalindromicSubstring5();

        System.out.println(longestPalindromicSubstring.longestPalindrome("babbad"));
    }
}
