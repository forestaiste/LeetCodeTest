package org.example.leetcode.pagefive;

//204. 计数质数
//        统计所有小于非负整数 n 的质数的数量。
//
//        示例 1：
//
//        输入：n = 10
//        输出：4
//        解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
//        示例 2：
//
//        输入：n = 0
//        输出：0
//        示例 3：
//
//        输入：n = 1
//        输出：0

import java.util.Arrays;

public class CountPrimes204 {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }

    public int countPrimes0(int n) {
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }

    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
