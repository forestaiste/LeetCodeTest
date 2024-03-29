package org.example.leetcode.pagetwo;


//53. 最大子序和
//        给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//        示例:
//
//        输入: [-2,1,-3,4,-1,2,1,-5,4]
//        输出: 6
//        解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
//        进阶:
//
//        如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。


public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int start = 0, end = 0;
        int pre = 0, maxAns = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);

            if (pre == nums[i]) {
                start = i;
                end = i;
            }

            maxAns = Math.max(maxAns, pre);

            if (maxAns == pre) {
                end = i;
            }

        }
        return maxAns;
    }

    public int maxSubArray1(int[] nums) {
        int result = Integer.MIN_VALUE;
        int count = 0;

        for (int num : nums) {
            count += num;

            result = Math.max(result, count);

            if (count < 0) {
                count = 0;
            }
        }

        return result;
    }

    public int maxSubArray2(int[] nums) {
        int n = nums.length;

        int[] f = new int[n];
        f[0] = nums[0];
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            f[i] = Math.max(f[i - 1] + nums[i], nums[i]);
            max = Math.max(max, f[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray53 maximumSubarray = new MaximumSubarray53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximumSubarray.maxSubArray(nums));

        nums = new int[] {-2, -1};
        System.out.println(maximumSubarray.maxSubArray2(nums));
    }
}
