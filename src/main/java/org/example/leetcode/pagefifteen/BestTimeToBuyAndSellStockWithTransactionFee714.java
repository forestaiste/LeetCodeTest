package org.example.leetcode.pagefifteen;

//714. 买卖股票的最佳时机含手续费
//        给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
//
//        你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
//
//        返回获得利润的最大值。
//
//        注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。
//
//        示例 1:
//
//        输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
//        输出: 8
//        解释: 能够达到的最大利润:
//        在此处买入 prices[0] = 1
//        在此处卖出 prices[3] = 8
//        在此处买入 prices[4] = 4
//        在此处卖出 prices[5] = 9
//        总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8.

public class BestTimeToBuyAndSellStockWithTransactionFee714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int buy = prices[0] + fee;
        int profit = 0;
        for (int i = 1; i < n; ++i) {
            if (prices[i] + fee < buy) {
                buy = prices[i] + fee;
            } else if (prices[i] > buy) {
                profit += prices[i] - buy;
                buy = prices[i];
            }
        }
        return profit;
    }

    public int maxProfit1(int[] prices, int fee) {
        int length = prices.length;

        int[][] f = new int[length][2];

        f[0][0] = -prices[0];

        for (int i = 1; i < length; i++) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][1] - prices[i]);
            f[i][1] = Math.max(f[i - 1][1], f[i - 1][0] + prices[i] - fee);
        }

        return f[length - 1][1];
    }

    public int maxProfit2(int[] prices, int fee) {
        int length = prices.length;

        int[][] f = new int[length][2];

        f[0][0] = -prices[0] - fee;

        for (int i = 1; i < length; i++) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][1] - prices[i] - fee);
            f[i][1] = Math.max(f[i - 1][1], f[i - 1][0] + prices[i]);
        }

        return f[length - 1][1];
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockWithTransactionFee714 bestTimeToBuyAndSellStockWithTransactionFee = new BestTimeToBuyAndSellStockWithTransactionFee714();
        int[] prices = {1, 3, 7, 5, 10, 3};
        System.out.println(bestTimeToBuyAndSellStockWithTransactionFee.maxProfit2(prices, 3));

        prices = new int[]{4,5,2,4,3,3,1,2,5,4};
        System.out.println(bestTimeToBuyAndSellStockWithTransactionFee.maxProfit2(prices, 1));

        prices = new int[]{1, 3, 2, 8, 4, 9};
        System.out.println(bestTimeToBuyAndSellStockWithTransactionFee.maxProfit2(prices, 2));
    }
}
