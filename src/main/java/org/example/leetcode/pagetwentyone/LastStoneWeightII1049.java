package org.example.leetcode.pagetwentyone;

//1049. 最后一块石头的重量 II
//        有一堆石头，每块石头的重量都是正整数。
//
//        每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
//
//        如果 x == y，那么两块石头都会被完全粉碎；
//        如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
//        最后，最多只会剩下一块石头。返回此石头最小的可能重量。如果没有石头剩下，就返回 0。
//
//
//
//        示例：
//
//        输入：[2,7,4,1,8,1]
//        输出：1
//        解释：
//        组合 2 和 4，得到 2，所以数组转化为 [2,7,1,8,1]，
//        组合 7 和 8，得到 1，所以数组转化为 [2,1,1,1]，
//        组合 2 和 1，得到 1，所以数组转化为 [1,1,1]，
//        组合 1 和 1，得到 0，所以数组转化为 [1]，这就是最优值。


import java.util.Arrays;

public class LastStoneWeightII1049 {
    public int lastStoneWeightII(int[] stones) {
        int length = stones.length;

        int total = Arrays.stream(stones).sum();
        int weight = total / 2;

        int[][] f = new int[length + 1][weight + 1];

        for (int i = 0; i < length + 1; i++) {
            f[i][0] = 0;
        }

        for (int i = 0; i < weight + 1; i++) {
            f[0][i] = 0;
        }

        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < weight + 1; j++) {
                if (j < stones[i - 1]) {
                    f[i][j] = f[i - 1][j];
                }
                else {
                    f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - stones[i - 1]] + stones[i - 1]);
                }
            }
        }

        return total - f[length][weight] - f[length][weight];
    }

    public int lastStoneWeightII1(int[] stones) {
        int length = stones.length;

        int total = Arrays.stream(stones).sum();
        int weight = total / 2;

        int[] f = new int[weight + 1];


        for (int i = 1; i < length + 1; i++) {
            for (int j = weight; j >= stones[i - 1]; j--) {
                f[j] = Math.max(f[j], f[j - stones[i - 1]] + stones[i - 1]);
            }
        }

        return total - f[weight] - f[weight];
    }
}
