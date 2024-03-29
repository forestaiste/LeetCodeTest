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


import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumberII264 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
            if (dp[i] == num5) {
                p5++;
            }
        }
        return dp[n];
    }

    int[] factors = {2, 3, 5};
    public int nthUglyNumber2(int n) {
        Set<Long> seen = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();

        seen.add(1L);
        heap.offer(1L);

        int ugly = 0;

        for (int i = 0; i < n; i++) {
            long cur = heap.poll();
            ugly = (int) cur;

            for (int factor : factors) {
                long next = cur * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }

        return ugly;
    }


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

    public static void main(String[] args) {
        UglyNumberII264 uglyNumberII264 = new UglyNumberII264();
        System.out.println(uglyNumberII264.nthUglyNumber(10));
    }
}
