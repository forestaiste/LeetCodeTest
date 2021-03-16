package org.example.leetcode.pageeight;

public class WiggleSubsequence376 {
    public int wiggleMaxLength(int[] nums) {
        int pre = 0;
        int count = 0;
        if (nums.length < 2) {

            return nums.length;
        }

        pre = nums[1] - nums[0];
        count = pre == 0 ? 1 : 2;

        for (int i = 2; i < nums.length; i++) {
            if ((pre >= 0 && (nums[i] - nums[i - 1]) < 0) || (pre <= 0 && (nums[i] - nums[i - 1]) > 0)) {
                pre = nums[i] - nums[i - 1];
                System.out.println(nums[i -1]);
                count++;
            }

        }

        return count;
    }
}
