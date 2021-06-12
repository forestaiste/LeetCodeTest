package org.example.leetcode.pagefive;

//229. 求众数 II
//        给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
//
//        进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1)的算法解决此问题。
//
//        示例 1：
//
//        输入：[3,2,3]
//        输出：[3]
//        示例 2：
//
//        输入：nums = [1]
//        输出：[1]
//        示例 3：
//
//        输入：[1,1,1,3,3,2,2,2]
//        输出：[1,2]

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return result;

        int number1 = nums[0];
        int count1 = 0;
        int number2 = nums[0];
        int count2 = 0;

        for (int num : nums) {
            if (number1 == num) {
                count1++;
                continue;
            }

            if (number2 == num) {
                count2++;
                continue;
            }

            if (count1 == 0) {
                number1 = num;
                count1++;
                continue;
            }

            if (count2 == 0) {
                number2 = num;
                count2++;
                continue;
            }

            count1--;
            count2--;
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == number1)
                count1++;
            else if (num == number2)
                count2++;
        }

        if (count1 > nums.length / 3) {
            result.add(number1);
        }

        if (count2 > nums.length / 3) {
            result.add(number2);
        }

        return result;
    }
}
