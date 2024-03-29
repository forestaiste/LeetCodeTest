package org.example.leetcode.pagesix;

//300. 最长递增子序列
//        给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
//
//        子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
//
//
//        示例 1：
//
//        输入：nums = [10,9,2,5,3,7,101,18]
//        输出：4
//        解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
//        示例 2：
//
//        输入：nums = [0,1,0,3,2,3]
//        输出：4
//        示例 3：
//
//        输入：nums = [7,7,7,7,7,7,7]
//        输出：1
//
//
//        提示：
//
//        1 <= nums.length <= 2500
//        -104 <= nums[i] <= 104


import java.util.Arrays;

public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;

        if (length <= 1)
            return length;

        int[] f = new int[length];
        Arrays.fill(f, 1);

        int result = 0;

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }

            if (f[i] > result) {
                result = f[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence300 longestIncreasingSubsequence = new LongestIncreasingSubsequence300();
        int[] nums = {1,3,6,7,9,4,10,5,6};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{7,7,7,7,7,7,7};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{0,1,0,3,2,3};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{10,9,2,5,3,7,101,18};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));
    }
}
