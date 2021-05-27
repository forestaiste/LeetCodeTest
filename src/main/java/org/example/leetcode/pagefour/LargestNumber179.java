package org.example.leetcode.pagefour;

//179. 最大数
//        给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
//
//        注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
//
//
//
//        示例 1：
//
//        输入：nums = [10,2]
//        输出："210"
//        示例 2：
//
//        输入：nums = [3,30,34,5,9]
//        输出："9534330"
//        示例 3：
//
//        输入：nums = [1]
//        输出："1"
//        示例 4：
//
//        输入：nums = [10]
//        输出："10"

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber179 {
    public String largestNumber(int[] nums) {
        int length = nums.length;

        Integer[] numbers = new Integer[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = nums[i];
        }

        Arrays.sort(numbers, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }

            return (int)(sx * y + x - sy * x -y);
        });

        if (numbers[0] == 0) {
            return "0";
        }

        StringBuilder builder = new StringBuilder();
        for (int n : numbers) {
            builder.append(n);
        }

        return builder.toString();
    }
}
