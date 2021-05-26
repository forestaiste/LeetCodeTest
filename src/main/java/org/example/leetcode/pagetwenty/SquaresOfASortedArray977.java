package org.example.leetcode.pagetwenty;

//977. 有序数组的平方
//        给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
//
//
//
//        示例 1：
//
//        输入：nums = [-4,-1,0,3,10]
//        输出：[0,1,9,16,100]
//        解释：平方后，数组变为 [16,1,0,9,100]
//        排序后，数组变为 [0,1,9,16,100]
//        示例 2：
//
//        输入：nums = [-7,-3,2,3,11]
//        输出：[4,9,9,49,121]

public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int i = 0;
        int j = length - 1;
        int pos = length - 1;

        while (i <= j) {
            if (nums[i] * nums[i] <= nums[j] * nums[j]) {
                result[pos--] = nums[j] * nums[j];
                j--;
            }
            else {
                result[pos--] = nums[i] * nums[i];
                i++;
            }
        }

        return result;
    }
    public int[] sortedSquares1(int[] nums) {
        int length = nums.length;

        int[] result = new int[length];
        int border = length;
        for (int i = 0; i < length; i++) {
            if (nums[i] >= 0) {
                border = i;
                break;
            }
        }

        int right = border;
        int left = border - 1;
        int i = 0;
        while(left >= 0 && right < length) {
            if (nums[left] * nums[left] <= nums[right] * nums[right]) {
                result[i++] = nums[left] * nums[left];
                left--;
            }
            else {
                result[i++] = nums[right] * nums[right];
                right++;
            }
        }

        while (left >= 0) {
            result[i++] = nums[left] * nums[left];
            left--;
        }

        while (right < length) {
            result[i++] = nums[right] * nums[right];
            right++;
        }


        return result;
    }
}
