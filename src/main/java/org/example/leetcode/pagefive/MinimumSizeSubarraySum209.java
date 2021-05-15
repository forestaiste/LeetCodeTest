package org.example.leetcode.pagefive;

//209. 长度最小的子数组
//        给定一个含有 n 个正整数的数组和一个正整数 target 。
//
//        找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
//
//
//
//        示例 1：
//
//        输入：target = 7, nums = [2,3,1,2,4,3]
//        输出：2
//        解释：子数组 [4,3] 是该条件下的长度最小的子数组。
//        示例 2：
//
//        输入：target = 4, nums = [1,4,4]
//        输出：1
//        示例 3：
//
//        输入：target = 11, nums = [1,1,1,1,1,1,1,1]
//        输出：0


public class MinimumSizeSubarraySum209 {

    public int minSubArrayLen0(int target, int[] nums) {
        int sum;
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum >= target) {
                    count = Math.min(j - i + 1, count);

                    break;
                }
            }
        }

        return count == Integer.MAX_VALUE ? 0 : count;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int count = Integer.MAX_VALUE;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                count = Math.min(count, i - start + 1);
                sum -= nums[start++];
            }
        }

        return count == Integer.MAX_VALUE ? 0 : count;
    }
}
