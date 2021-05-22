package org.example.leetcode.pagefour;

//152. 乘积最大子数组
//        给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
//
//        示例 1:
//
//        输入: [2,3,-2,4]
//        输出: 6
//        解释: 子数组 [2,3] 有最大乘积 6。
//        示例 2:
//
//        输入: [-2,0,-1]
//        输出: 0
//        解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。

import java.util.ArrayList;
import java.util.List;

public class MaximumProductSubarray152 {
    public int maxProduct(int[] nums) {
        int length = nums.length;

        int[] fMax = new int[length];
        int[] fMin = new int[length];

//        System.arraycopy(nums, 0, fMax, 0, length);
//        System.arraycopy(nums, 0, fMin, 0, length);
        fMax[0] = nums[0];
        fMin[0] = nums[0];

        for (int i = 1; i < length; i++) {
            fMax[i] = Math.max(fMax[i - 1] * nums[i], Math.max(nums[i], fMin[i - 1] * nums[i]));
            fMin[i] = Math.min(fMin[i - 1] * nums[i], Math.min(nums[i], fMax[i - 1] * nums[i]));
        }

        int max = fMax[0];

        for (int i = 1; i < length; i++) {
            max = Math.max(max, fMax[i]);
        }

        return max;
    }

    public int maxProduct0(int[] nums) {
        int maxF = nums[0], minF = nums[0], ans = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            int mx = maxF, mn = minF;
            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
            ans = Math.max(maxF, ans);
        }
        return ans;
    }
}
