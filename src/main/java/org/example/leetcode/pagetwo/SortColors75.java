package org.example.leetcode.pagetwo;

//75. 颜色分类
//        给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
//
//        此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
//
//
//
//        示例 1：
//
//        输入：nums = [2,0,2,1,1,0]
//        输出：[0,0,1,1,2,2]
//        示例 2：
//
//        输入：nums = [2,0,1]
//        输出：[0,1,2]
//        示例 3：
//
//        输入：nums = [0]
//        输出：[0]
//        示例 4：
//
//        输入：nums = [1]
//        输出：[1]

import java.util.Arrays;

public class SortColors75 {
    public void sortColors(int[] nums) {
        int length = nums.length;

        int pos = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }

        for (int i = pos; i < length; i++) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }
    }

    public void sortColors1(int[] nums) {
        int length = nums.length;
        int pos1 = 0;
        int pos2 = length - 1;

        for (int i = 0; i < length; i++) {
            if (nums[i] == 2 && pos2 > i) {
                int temp = nums[i];
                nums[i] = nums[pos2];
                nums[pos2] = temp;
                pos2--;
            }

            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[pos1];
                nums[pos1] = temp;
                pos1++;
            }
        }
    }

    public static void main(String[] args) {
        SortColors75 sortColors = new SortColors75();

        int[] nums = {2,0,2,1,1,0};
        sortColors.sortColors1(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {2, 1, 2};
        sortColors.sortColors1(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
