package org.example.leetcode.pagefour;

//172. 阶乘后的零
//        给定一个整数 n，返回 n! 结果尾数中零的数量。
//
//        示例 1:
//
//        输入: 3
//        输出: 0
//        解释: 3! = 6, 尾数中没有零。
//        示例 2:
//
//        输入: 5
//        输出: 1
//        解释: 5! = 120, 尾数中有 1 个零.

public class FactorialTrailingZeroes172 {
    public int trailingZeroes0(int n) {
        int count = n / 10 * 2 + ((n % 10) >= 5 ? 1 : 0);
        int number = 25;
        while ( n / number > 0) {
            count += n / number;
            number *= 5;
        }
        return count;
    }

    public int trailingZeroes(int n) {
        int zeroCount = 0;
        long currentMultiple = 5;
        while (n > 0) {
            n /= 5;
            zeroCount += n;
        }
        return zeroCount;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes172 factorialTrailingZeroes = new FactorialTrailingZeroes172();

        System.out.println(factorialTrailingZeroes.trailingZeroes(625));
        System.out.println(factorialTrailingZeroes.trailingZeroes(10));
        System.out.println(factorialTrailingZeroes.trailingZeroes(20));
        System.out.println(factorialTrailingZeroes.trailingZeroes(30));
    }
}
