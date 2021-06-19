package org.example.leetcode.pageseven;

//313. 超级丑数
//        编写一段程序来查找第 n 个超级丑数。
//
//        超级丑数是指其所有质因数都是长度为 k 的质数列表 primes 中的正整数。
//
//        示例:
//
//        输入: n = 12, primes = [2,7,13,19]
//        输出: 32
//        解释: 给定长度为 4 的质数列表 primes = [2,7,13,19]，前 12 个超级丑数序列为：[1,2,4,7,8,13,14,16,19,26,28,32] 。
//        说明:
//
//        1 是任何给定 primes 的超级丑数。
//        给定 primes 中的数字以升序排列。
//        0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000 。
//        第 n 个超级丑数确保在 32 位有符整数范围内。

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SuperUglyNumber313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int length = primes.length;

        int[] dp = new int[n];
        int[] pointers = new int[length];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < length; j++) {
                min = Math.min(min, dp[pointers[j]] * primes[j]);
            }

            for (int j = 0; j < length; j++) {
                if (min == dp[pointers[j]] * primes[j]) {
                    pointers[j]++;
                }
            }
        }

        return dp[n - 1];
    }

    public int nthSuperUglyNumber1(int n, int[] primes) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();

        queue.add(1L);
        set.add(1L);

        long result = 0;
        for (int i = 0; i < n; i++) {
            result = queue.poll();

            for (int prime : primes) {
                long num = prime * result;

                if (!set.contains(num)) {
                    set.add(num);
                    queue.add(num);
                }
            }
        }

        return (int) result;
    }
}
