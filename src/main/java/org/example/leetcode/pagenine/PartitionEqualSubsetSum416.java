package org.example.leetcode.pagenine;

//416. 分割等和子集
//        给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
//
//        注意:
//
//        每个数组中的元素不会超过 100
//        数组的大小不会超过 200
//        示例 1:
//
//        输入: [1, 5, 11, 5]
//
//        输出: true
//
//        解释: 数组可以分割成 [1, 5, 5] 和 [11].
//
//
//        示例 2:
//
//        输入: [1, 2, 3, 5]
//
//        输出: false
//
//        解释: 数组不能分割成两个元素和相等的子集.

import java.util.Arrays;

public class PartitionEqualSubsetSum416 {
    public boolean canPartition(int[] nums) {

        int sum = Arrays.stream(nums).sum();

        if (sum % 2 != 0)
            return false;
        int length = nums.length;
        int capacity = sum / 2;

        int[][] f = new int[length + 1][capacity + 1];

        for (int i = 0; i <= length; i++) {
            f[i][0] = 0;
        }

        for (int i = 0; i <= capacity; i++) {
            f[0][i] = 0;
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (j < nums[i - 1]) {
                    f[i][j] = f[i - 1][j];
                }
                else {
                    f[i][j] = Math.max(f[i - 1][j - nums[i - 1]] + nums[i - 1], f[i - 1][j]);
                }
            }
        }

        return f[length][capacity] == capacity;
    }
}
