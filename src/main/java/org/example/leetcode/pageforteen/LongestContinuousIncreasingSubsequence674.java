package org.example.leetcode.pageforteen;

//674. 最长连续递增序列
//        给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
//
//        连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
//
//
//
//        示例 1：
//
//        输入：nums = [1,3,5,4,7]
//        输出：3
//        解释：最长连续递增序列是 [1,3,5], 长度为3。
//        尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为 5 和 7 在原数组里被 4 隔开。
//        示例 2：
//
//        输入：nums = [2,2,2,2,2]
//        输出：1
//        解释：最长连续递增序列是 [2], 长度为1。

import java.util.Arrays;

public class LongestContinuousIncreasingSubsequence674 {
    public int findLengthOfLCIS0(int[] nums) {
        int length = nums.length;

        if (length <= 1) return length;

        int max = 0;

        int count = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            }
            else {
                count = 1;
            }

            max = Math.max(count, max);
        }

        return max;
    }

    public static int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];

        Arrays.fill(dp, 1);

        int res = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                dp[i + 1] = dp[i] + 1;
            }

            res = Math.max(res, dp[i + 1]);
        }
        return res;
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence674 longestContinuousIncreasingSubsequence = new LongestContinuousIncreasingSubsequence674();
        int[] nums = {1,3,5,4,7};
        System.out.println(longestContinuousIncreasingSubsequence.findLengthOfLCIS(nums));
    }
}
