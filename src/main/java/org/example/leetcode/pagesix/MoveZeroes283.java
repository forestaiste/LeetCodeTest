package org.example.leetcode.pagesix;

//283. 移动零
//        给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
//        示例:
//
//        输入: [0,1,0,3,12]
//        输出: [1,3,12,0,0]

import java.util.Arrays;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int tail = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[tail++] = nums[i];
            }
        }

        while (tail < nums.length) {
            nums[tail++] = 0;
        }
    }

    public void moveZeroes1(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    public static void main(String[] args) {
        MoveZeroes283 moveZeroes = new MoveZeroes283();
        int[] nums = {10, 1, 0, 3, 12};
        moveZeroes.moveZeroes1(nums);
        System.out.println(Arrays.toString(nums));
    }
}
