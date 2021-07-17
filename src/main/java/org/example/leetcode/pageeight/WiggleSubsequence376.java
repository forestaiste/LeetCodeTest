package org.example.leetcode.pageeight;

public class WiggleSubsequence376 {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {

            return nums.length;
        }
        int pre = 0;
        int count = 1;
        int cur = 0;
        for (int i = 1; i < nums.length; i++) {
            cur = nums[i] - nums[i - 1];
            if ((pre >= 0 && cur < 0) || (pre <= 0 && cur > 0)) {
                pre = cur;
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        WiggleSubsequence376 wiggleSubsequence = new WiggleSubsequence376();
//        int[] nums = {0, 0};
//        int[] nums = {3, 3, 3,2,5};
//        int[] nums = {1,2,3,4,5,6,7,8,9};
        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(wiggleSubsequence.wiggleMaxLength(nums));
    }
}
