package org.example.leetcode.pagethirteen;

//647. 回文子串
//        给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
//
//        具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
//
//
//
//        示例 1：
//
//        输入："abc"
//        输出：3
//        解释：三个回文子串: "a", "b", "c"
//        示例 2：
//
//        输入："aaa"
//        输出：6
//        解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"

import java.util.Arrays;

public class PalindromicSubstrings647 {
    public int countSubstrings(String s) {
        int length = s.length();

        boolean[][] f = new boolean[length][length];

        int count = 0;

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j < length; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        count++;
                        f[i][j] = true;
                    }
                    else if (f[i + 1][j - 1]) {
                        count++;
                        f[i][j] = true;
                    }
                }
            }
        }

        return count;
    }
}
