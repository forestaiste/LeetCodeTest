package org.example.leetcode.pageseven;

//322. 零钱兑换
//        给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
//
//        你可以认为每种硬币的数量是无限的。
//
//
//
//        示例 1：
//
//        输入：coins = [1, 2, 5], amount = 11
//        输出：3
//        解释：11 = 5 + 5 + 1
//        示例 2：
//
//        输入：coins = [2], amount = 3
//        输出：-1
//        示例 3：
//
//        输入：coins = [1], amount = 0
//        输出：0
//        示例 4：
//
//        输入：coins = [1], amount = 1
//        输出：1
//        示例 5：
//
//        输入：coins = [1], amount = 2
//        输出：2

public class CoinChange322 {
    public int coinChange(int[] coins, int amount) {
        int length = coins.length;

        int[] f = new int[amount + 1];
        f[0] = 0;

        for (int i = 1; i < amount + 1; i++) {
            f[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (f[j -coins[i]] != Integer.MAX_VALUE) {
                    f[j] = Math.min(f[j], f[j - coins[i]] + 1);
                }
            }
        }

        return (f[amount] == Integer.MAX_VALUE) ? (-1): f[amount];
    }

    public static void main(String[] args) {
        CoinChange322 coinChange = new CoinChange322();
        int[] coins = {1, 2, 5};
        System.out.println(coinChange.coinChange(coins, 11));

        coins = new int[]{2};
        System.out.println(coinChange.coinChange(coins, 3));
    }
}
