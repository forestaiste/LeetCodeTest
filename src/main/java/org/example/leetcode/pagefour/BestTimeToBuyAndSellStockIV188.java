package org.example.leetcode.pagefour;

//188. 买卖股票的最佳时机 IV
//        给定一个整数数组 prices ，它的第 i 个元素 prices[i] 是一支给定的股票在第 i 天的价格。
//
//        设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
//
//        注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
//
//
//
//        示例 1：
//
//        输入：k = 2, prices = [2,4,1]
//        输出：2
//        解释：在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
//        示例 2：
//
//        输入：k = 2, prices = [3,2,6,5,0,3]
//        输出：7
//        解释：在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
//        随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。


public class BestTimeToBuyAndSellStockIV188 {
    public int maxProfit(int k, int[] prices) {
        int length = prices.length;

        if (length == 0)
            return 0;

        int[] f = new int[2 * k + 1];

        for (int i = 0; i < k; i++) {
            f[i * 2 + 1] = -prices[0];
        }

        for (int i = 1; i < length; i++) {
            for (int j = 1; j <= k; j++) {
                f[2 * j - 1] = Math.max(f[2 * j - 1], f[2 * j - 2] - prices[i]);
                f[2 * j] = Math.max(f[2 * j], f[2 * j - 1] + prices[i]);
            }
        }

        return f[2 * k];
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIV188 bestTimeToBuyAndSellStockIV = new BestTimeToBuyAndSellStockIV188();
        int[] prices = {3, 3, 5, 1, 0, 3, 4, 5, 2, 8};
        System.out.println(bestTimeToBuyAndSellStockIV.maxProfit(3, prices));
    }
}
