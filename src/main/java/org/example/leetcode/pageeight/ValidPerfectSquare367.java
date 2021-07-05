package org.example.leetcode.pageeight;

//367. 有效的完全平方数
//        给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
//
//        进阶：不要 使用任何内置的库函数，如  sqrt 。
//
//
//
//        示例 1：
//
//        输入：num = 16
//        输出：true
//        示例 2：
//
//        输入：num = 14
//        输出：false

public class ValidPerfectSquare367 {
    public boolean isPerfectSquare(int num) {
        if (num < 2)
            return true;

        long left = 0;
        long right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            long result = (long)(mid * mid);
            if (result == num) {
                return true;
            }
            else if (result < num) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return false;
    }

    public boolean isPerfectSquare1(int num) {
        int i = 0;

        while (i * i <= num) {
            if (i * i == num)
                return true;

            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        ValidPerfectSquare367 validPerfectSquare = new ValidPerfectSquare367();

        System.out.println(validPerfectSquare.isPerfectSquare(2147483647));
    }
}
