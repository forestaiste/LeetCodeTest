package org.example.leetcode.pageeleven;

//518. 零钱兑换 II
//        给定不同面额的硬币和一个总金额。写出函数来计算可以凑成总金额的硬币组合数。假设每一种面额的硬币有无限个。
//
//
//
//        示例 1:
//
//        输入: amount = 5, coins = [1, 2, 5]
//        输出: 4
//        解释: 有四种方式可以凑成总金额:
//        5=5
//        5=2+2+1
//        5=2+1+1+1
//        5=1+1+1+1+1
//        示例 2:
//
//        输入: amount = 3, coins = [2]
//        输出: 0
//        解释: 只用面额2的硬币不能凑成总金额3。
//        示例 3:
//
//        输入: amount = 10, coins = [10]
//        输出: 1

public class CoinChangeII518 {
    public int change(int amount, int[] coins) {

        int length = coins.length;

        int[] f = new int[amount + 1];

        f[0] = 1;

        for (int i = 0; i < length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                f[j] = f[j] + f[j - coins[i]];
            }
        }

        return f[amount];
    }

    public int change1(int amount, int[] coins) {
        int len = coins.length;
        if (len == 0) {
            if (amount == 0) {
                return 1;
            }
            return 0;
        }

        int[][] dp = new int[len][amount + 1];
        // 题解中有说明应该如何理解这个初始化
        dp[0][0] = 1;

        // 填第 1 行
        for (int i = coins[0]; i <= amount; i += coins[0]) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= amount; j++) {
                for (int k = 0; j - k * coins[i] >= 0; k++) {
                    dp[i][j] += dp[i - 1][j - k * coins[i]];
                }
            }
        }
        return dp[len - 1][amount];
    }

    public int change2(int amount, int[] coins) {
        int len = coins.length;
        if (len == 0) {
            if (amount == 0) {
                return 1;
            }
            return 0;
        }

        int[][] dp = new int[len][amount + 1];
        dp[0][0] = 1;

        for (int i = coins[0]; i <= amount; i += coins[0]) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - coins[i] >= 0) {
                    dp[i][j] += dp[i][j - coins[i]];
                }
            }
        }
        return dp[len - 1][amount];
    }
}
