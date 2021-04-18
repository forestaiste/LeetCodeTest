package org.example.leetcode.pageeleven;

//516. 最长回文子序列
//        给定一个字符串 s ，找到其中最长的回文子序列，并返回该序列的长度。可以假设 s 的最大长度为 1000 。
//
//
//
//        示例 1:
//        输入:
//
//        "bbbab"
//        输出:
//
//        4
//        一个可能的最长回文子序列为 "bbbb"。
//
//        示例 2:
//        输入:
//
//        "cbbd"
//        输出:
//
//        2
//        一个可能的最长回文子序列为 "bb"。

public class LongestPalindromicSubsequence516 {
    public int longestPalindromeSubseq(String s) {
        int length = s.length();

        int[][] f = new int[length][length];

        for (int i = 0; i < length; i++) {
            f[i][i] = 1;
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    f[i][j] = f[i + 1][j - 1] + 2;
                }
                else {
                    f[i][j] = Math.max(f[i][j - 1], f[i + 1][j]);
                }
            }
        }

        return f[0][length - 1];
    }
}
