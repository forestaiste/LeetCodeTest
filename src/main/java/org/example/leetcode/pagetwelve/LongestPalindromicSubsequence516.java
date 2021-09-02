package org.example.leetcode.pagetwelve;

public class LongestPalindromicSubsequence516 {
    public int longestPalindromeSubseq(String s) {

        int length = s.length();

        int[][] f = new int[length + 1][length + 1];

        for (int i = 0; i < length; i++) {
            f[i][i] = 1;
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    f[i][j] = f[i + 1][j - 1] + 2;
                } else {
                    f[i][j] = Math.max(f[i + 1][j], f[i][j -1]);
                }

            }
        }

        return f[0][length -1];
    }

    public static void main(String[] args) {
        LongestPalindromicSubsequence516 longestPalindromicSubsequence = new LongestPalindromicSubsequence516();
        System.out.println(longestPalindromicSubsequence.longestPalindromeSubseq("bbbab"));
    }
}
