package org.example.leetcode.pageseven;

//306. 累加数
//        累加数是一个字符串，组成它的数字可以形成累加序列。
//
//        一个有效的累加序列必须至少包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。
//
//        给定一个只包含数字 '0'-'9' 的字符串，编写一个算法来判断给定输入是否是累加数。
//
//        说明: 累加序列里的数不会以 0 开头，所以不会出现 1, 2, 03 或者 1, 02, 3 的情况。
//
//        示例 1:
//
//        输入: "112358"
//        输出: true
//        解释: 累加序列为: 1, 1, 2, 3, 5, 8 。1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
//        示例 2:
//
//        输入: "199100199"
//        输出: true
//        解释: 累加序列为: 1, 99, 100, 199。1 + 99 = 100, 99 + 100 = 199

public class AdditiveNumber306 {
    public boolean isAdditiveNumber(String num) {
        long numA = 0;

        int length = num.length();

        for (int i = 0; i < length - 2; i++) {
            if (i != 0 && numA == 0)
                return false;

            numA = numA * 10 + num.charAt(i) - '0';
            System.out.println("numA:" + numA);
            long numB = 0;
            for (int j = i + 1; j < length - 1; j++) {
                if (j != i + 1 && numB == 0)
                    break;

                numB = numB * 10 + num.charAt(j) - '0';
                System.out.println("numB:" + numB);

                if (backTrack(num, j + 1, length, numA, numB))
                    return true;
            }
        }

        return false;
    }

    private boolean backTrack(String num, int start, int length, long numA, long numB) {
        long sum = numA + numB;

        long numC = 0;
        for (int i = start; i < length; i++) {
            if (i != start && numC == 0) {
                return false;
            }
            numC = numC * 10 + num.charAt(i) - '0';

            if (numC == sum) {
                if (i == length - 1) {
                    return true;
                }
                else {
                    System.out.println("numC:" + numC);
                    return backTrack(num, i + 1, length, numB, numC);
                }
            }
            else if (numC > sum) {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        AdditiveNumber306 additiveNumber = new AdditiveNumber306();

//        System.out.println(additiveNumber.isAdditiveNumber("121474836472147483648"));
//        System.out.println(additiveNumber.isAdditiveNumber("211738"));
//        System.out.println(additiveNumber.isAdditiveNumber("1203"));
        System.out.println(additiveNumber.isAdditiveNumber("199100199"));
//        System.out.println(additiveNumber.isAdditiveNumber("1112358"));
    }
}
