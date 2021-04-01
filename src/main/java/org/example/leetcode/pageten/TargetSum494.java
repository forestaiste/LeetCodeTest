package org.example.leetcode.pageten;

//494. 目标和
//        给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
//
//        返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
//
//
//
//        示例：
//
//        输入：nums: [1, 1, 1, 1, 1], S: 3
//        输出：5
//        解释：
//
//        -1+1+1+1+1 = 3
//        +1-1+1+1+1 = 3
//        +1+1-1+1+1 = 3
//        +1+1+1-1+1 = 3
//        +1+1+1+1-1 = 3
//
//        一共有5种方法让最终目标和为3。

import java.util.Arrays;

public class TargetSum494 {

    public int findTargetSumWays(int[] nums, int S) {

        int sum = Arrays.stream(nums).sum();

        int capacity = S + (sum - S) / 2;

        if (S > sum) return 0;

        if ((sum - S) % 2 != 0) {
            return 0;
        }

        int length = nums.length;
        int[][] f = new int[length + 1][capacity + 1];

        for (int i = 0; i <= capacity; i++) {
            f[0][i] = 0;
        }

        for (int i = 0; i < length + 1 ; i++) {
            f[i][0] = 1;
        }

        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < capacity + 1; j++) {
                if (j < nums[i - 1]) {
                    f[i][j] = f[i - 1][j];
                }
                else {
                    f[i][j] = f[i - 1][j] + f[i - 1][j - nums[i - 1]];
                }
            }
        }

        return f[length][capacity];
    }

    public int findTargetSumWays1(int[] nums, int S) {

        int sum = Arrays.stream(nums).sum();

        if (S > sum) return 0;

        if ((sum - S) % 2 != 0) {
            return 0;
        }

        int capacity = S + (sum - S) / 2;

        int length = nums.length;
        int[] f = new int[capacity + 1];

        f[0] = 1;

        for (int i = 1; i < length + 1; i++) {
            for (int j = capacity; j >= nums[i - 1]; j--) {
                    f[j] = f[j] + f[j - nums[i - 1]];
            }
        }

        return f[capacity];
    }
}
