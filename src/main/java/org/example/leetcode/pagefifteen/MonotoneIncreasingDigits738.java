package org.example.leetcode.pagefifteen;


//738. 单调递增的数字
//        给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
//
//        （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
//
//        示例 1:
//
//        输入: N = 10
//        输出: 9
//        示例 2:
//
//        输入: N = 1234
//        输出: 1234
//        示例 3:
//
//        输入: N = 332
//        输出: 299


public class MonotoneIncreasingDigits738 {
    public int monotoneIncreasingDigits(int N) {
        char[] digits = Integer.toString(N).toCharArray();

        int length = digits.length;
        int start = length;
        for (int i = length - 1; i > 0; i--) {

            if (digits[i - 1] > digits[i]) {
                digits[i - 1]--;
                start = i;
            }
        }

        for (int i = start; i < length; i++) {
            digits[i] = '9';
        }

        return Integer.parseInt(new String(digits));
    }
}
