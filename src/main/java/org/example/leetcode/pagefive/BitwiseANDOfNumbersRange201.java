package org.example.leetcode.pagefive;

//201. 数字范围按位与
//        给你两个整数 left 和 right ，表示区间 [left, right] ，返回此区间内所有数字 按位与 的结果（包含 left 、right 端点）。
//
//        示例 1：
//
//        输入：left = 5, right = 7
//        输出：4
//        示例 2：
//
//        输入：left = 0, right = 0
//        输出：0
//        示例 3：
//
//        输入：left = 1, right = 2147483647
//        输出：0

public class BitwiseANDOfNumbersRange201 {
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        // 找到公共前缀
        while (m < n) {
            m >>= 1;
            n >>= 1;
            ++shift;
        }
        return m << shift;
    }

    public int rangeBitwiseAnd1(int left, int right) {
        String leftBinary = Integer.toBinaryString(left);
        String rightBinary = Integer.toBinaryString(right);

        if (leftBinary.length() != rightBinary.length())
            return 0;
        int value = 0;

        int i =  0;
        while (i < leftBinary.length()) {
            if (leftBinary.charAt(i) == rightBinary.charAt(i)) {
                value = value << 1 | ((leftBinary.charAt(i) == '1') ? 1 : 0);
            }
            else {
                break;
            }
            i++;
        }

        for (int j = i; j < leftBinary.length(); j++) {
            value = value << 1;
        }

        return value;
    }
}
