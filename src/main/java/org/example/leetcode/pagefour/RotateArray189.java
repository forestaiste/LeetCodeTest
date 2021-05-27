package org.example.leetcode.pagefour;

//189. 旋转数组
//        给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//
//        进阶：
//
//        尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
//        你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
//
//
//        示例 1:
//
//        输入: nums = [1,2,3,4,5,6,7], k = 3
//        输出: [5,6,7,1,2,3,4]
//        解释:
//        向右旋转 1 步: [7,1,2,3,4,5,6]
//        向右旋转 2 步: [6,7,1,2,3,4,5]
//        向右旋转 3 步: [5,6,7,1,2,3,4]
//        示例 2:
//
//        输入：nums = [-1,-100,3,99], k = 2
//        输出：[3,99,-1,-100]
//        解释:
//        向右旋转 1 步: [99,-1,-100,3]
//        向右旋转 2 步: [3,99,-1,-100]

public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    public void rotate0(int[] nums, int k) {
        int length = nums.length;

        if (length <= 1)
            return;

        k = k % length;

        if (k < length / 2) {
            while (k > 0) {
                int temp = nums[length - 1];
                for (int i = length - 1; i >= 1; i--) {
                    nums[i] = nums[i - 1];
                }

                nums[0] = temp;
                k--;
            }
        }
        else {
            k = length - k;

            while (k > 0) {
                int temp = nums[0];

                for (int i = 0; i < length - 1; i++) {
                    nums[i] = nums[i + 1];
                }

                nums[length - 1] = temp;
                k--;
            }
        }
    }
}
