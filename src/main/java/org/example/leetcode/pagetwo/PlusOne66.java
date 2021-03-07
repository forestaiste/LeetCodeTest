package org.example.leetcode.pagetwo;

//66. 加一
//        给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
//
//        最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
//        你可以假设除了整数 0 之外，这个整数不会以零开头。
//
//
//
//        示例 1：
//
//        输入：digits = [1,2,3]
//        输出：[1,2,4]
//        解释：输入数组表示数字 123。
//        示例 2：
//
//        输入：digits = [4,3,2,1]
//        输出：[4,3,2,2]
//        解释：输入数组表示数字 4321。
//        示例 3：
//
//        输入：digits = [0]
//        输出：[1]


public class PlusOne66 {
    public int[] plusOne0(int[] digits) {
        int i = digits.length - 1;
        int d = 1;
        while (i >= 0) {
            int result = digits[i] + d;
            digits[i] = result % 10;
            d = result / 10;

            if (d == 0) {
                break;
            }

            i--;
        }

        if (d == 1) {
            int[] newDigits = new int[digits.length + 1];

            newDigits[0] = 1;
            int j = 1;
            for (int digit : digits) {
                newDigits[j++] = digit;
            }

            digits = newDigits;
        }
        return digits;
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
