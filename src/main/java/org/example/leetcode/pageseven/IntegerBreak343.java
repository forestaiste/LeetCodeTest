package org.example.leetcode.pageseven;

//343. 整数拆分
//        给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
//
//        示例 1:
//
//        输入: 2
//        输出: 1
//        解释: 2 = 1 + 1, 1 × 1 = 1。
//        示例 2:
//
//        输入: 10
//        输出: 36
//        解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class IntegerBreak343 {
    public int integerBreak(int n) {
        int[] f = new int[n + 1];

        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < (i - 1); j++) {
                f[i] = Math.max(Math.max(j * f[i - j], j * (i - j)), f[i]);
            }
        }

        return f[n];
    }

    public static void main(String[] args) {
        IntegerBreak343 integerBreak = new IntegerBreak343();

        System.out.println(integerBreak.integerBreak(10));

    }
}
