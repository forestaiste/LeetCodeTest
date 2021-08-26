package org.example.leetcode.pageeight;

//357. 计算各个位数不同的数字个数
//        给定一个非负整数 n，计算各位数字都不同的数字 x 的个数，其中 0 ≤ x < 10n 。
//
//        示例:
//
//        输入: 2
//        输出: 91
//        解释: 答案应为除去 11,22,33,44,55,66,77,88,99 外，在 [0,100) 区间内的所有数字。


public class CountNumbersWithUniqueDigits357 {
    public int countNumbersWithUniqueDigits(int n) {
        int count = 1;
        while (n > 0) {
            int addUp = 9;
            int digit = n;
            while (digit > 1) {
                addUp *= (10 - digit + 1);
                digit--;
            }

            count += addUp;

            n--;
        }

        return count;
    }

    public static void main(String[] args) {
        CountNumbersWithUniqueDigits357 countNumbersWithUniqueDigits = new CountNumbersWithUniqueDigits357();
//        System.out.println(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(0));
//        System.out.println(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(1));
        System.out.println(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(2));
        System.out.println(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(3));
        System.out.println(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(4));
        System.out.println(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(5));
        System.out.println(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(10));
        System.out.println(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(11));
    }
}
