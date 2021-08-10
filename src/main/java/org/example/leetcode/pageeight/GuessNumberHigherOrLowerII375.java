package org.example.leetcode.pageeight;

//375. 猜数字大小 II
//        我们正在玩一个猜数游戏，游戏规则如下：
//
//        我从 1 到 n 之间选择一个数字，你来猜我选了哪个数字。
//
//        每次你猜错了，我都会告诉你，我选的数字比你的大了或者小了。
//
//        然而，当你猜了数字 x 并且猜错了的时候，你需要支付金额为 x 的现金。直到你猜到我选的数字，你才算赢得了这个游戏。
//
//        示例:
//
//        n = 10, 我选择了8.
//
//        第一轮: 你猜我选择的数字是5，我会告诉你，我的数字更大一些，然后你需要支付5块。
//        第二轮: 你猜是7，我告诉你，我的数字更大一些，你支付7块。
//        第三轮: 你猜是9，我告诉你，我的数字更小一些，你支付9块。
//
//        游戏结束。8 就是我选的数字。
//
//        你最终要支付 5 + 7 + 9 = 21 块钱。
//        给定 n ≥ 1，计算你至少需要拥有多少现金才能确保你能赢得这个游戏。

public class GuessNumberHigherOrLowerII375 {
    public int getMoneyAmount(int n) {
        if (n == 1)
            return 0;

        int[][] f = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                f[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i <= n; i++) {
            f[i][i] = 0;
        }

        for (int j = 2; j <= n; j++) {
            for (int i = j - 1; i >= 1; i--) {
                for (int k = i + 1; k <= j - 1; k++) {
                    f[i][j] = Math.min(k + Math.max(f[i][k - 1], f[k + 1][j]), f[i][j]);
                }

               f[i][j] = Math.min(f[i][j], i + f[i + 1][j]);
                f[i][j] = Math.min(f[i][j], j + f[i][j - 1]);
            }
        }

        return f[1][n];
    }

    public int calculate1(int low, int high) {
        if (low >= high)
            return 0;
        int minres = Integer.MAX_VALUE;
        for (int i = low; i <= high; i++) {
            int res = i + Math.max(calculate1(i + 1, high), calculate1(low, i - 1));
            minres = Math.min(res, minres);
        }

        return minres;
    }
    public int getMoneyAmount1(int n) {
        return calculate1(1, n);
    }

    public int calculate2(int low, int high) {
        if (low >= high)
            return 0;
        int minres = Integer.MAX_VALUE;
        for (int i = (low + high) / 2; i <= high; i++) {
            int res = i + Math.max(calculate2(i + 1, high), calculate2(low, i - 1));
            minres = Math.min(res, minres);
        }
        return minres;
    }
    public int getMoneyAmount2(int n) {
        return calculate2(1, n);
    }

    public static void main(String[] args) {
        GuessNumberHigherOrLowerII375 guessNumberHigherOrLowerII = new GuessNumberHigherOrLowerII375();

        System.out.println(guessNumberHigherOrLowerII.getMoneyAmount(4));
    }
}
