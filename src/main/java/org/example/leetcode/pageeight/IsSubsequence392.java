package org.example.leetcode.pageeight;

//392. 判断子序列
//        给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
//
//        字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
//
//        进阶：
//
//        如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
//
//        致谢：
//
//        特别感谢 @pbrother 添加此问题并且创建所有测试用例。
//
//
//
//        示例 1：
//
//        输入：s = "abc", t = "ahbgdc"
//        输出：true
//        示例 2：
//
//        输入：s = "axc", t = "ahbgdc"
//        输出：false

public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[][] f = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    f[i][j] = f[i - 1][j - 1] + 1;
                }
                else {
                    f[i][j] = f[i][j - 1];
//                    f[i][j] = Math.max(f[i][j - 1], f[i - 1][j]);
                }
            }
        }

        return f[m][n] == m;
    }

    public boolean isSubsequence2(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }

    public static void main(String[] args) {
        IsSubsequence392 isSubsequence = new IsSubsequence392();

        System.out.println(isSubsequence.isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequence("axc", "ahbgdc"));
    }
}
