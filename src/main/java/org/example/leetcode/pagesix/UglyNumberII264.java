package org.example.leetcode.pagesix;

//264. 丑数 II
//        给你一个整数 n ，请你找出并返回第 n 个 丑数 。
//
//        丑数 就是只包含质因数 2、3 和/或 5 的正整数。
//
//
//
//        示例 1：
//
//        输入：n = 10
//        输出：12
//        解释：[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] 是由前 10 个丑数组成的序列。
//        示例 2：
//
//        输入：n = 1
//        输出：1
//        解释：1 通常被视为丑数。


public class UglyNumberII264 {
    public int nthUglyNumber(int n) {
        return 0;
    }
    int[] factors = {2, 3, 5};

    private boolean isUgly(int n) {
        if (n == 1) {
            return true;
        }

        for (int i = 0; i < factors.length; i++) {
            while (n % factors[i] == 0) {
                n /= factors[i];
            }
        }

        return n == 1;
    }

    public int nthUglyNumber1(int n) {
        int i = 0;
        int number = 0;
        while (i < n) {
            number++;
            if (isUgly(number)) {
                i++;
            }
        }

        return number;
    }
}
