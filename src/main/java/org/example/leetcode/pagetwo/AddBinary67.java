package org.example.leetcode.pagetwo;

//67. 二进制求和
//        给你两个二进制字符串，返回它们的和（用二进制表示）。
//
//        输入为 非空 字符串且只包含数字 1 和 0。
//
//        示例 1:
//
//        输入: a = "11", b = "1"
//        输出: "100"
//        示例 2:
//
//        输入: a = "1010", b = "1011"
//        输出: "10101"

public class AddBinary67 {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i >= 0 || j >= 0) {
            int da = 0;

            if (i >= 0) {
                da = a.charAt(i) - '0';
            }

            int db = 0;
            if (j >= 0) {
                db = b.charAt(j) - '0';
            }

            int r = da + db + carry;

            result.insert(0, r % 2);
            carry = r / 2;

            i--;
            j--;
        }

        if (carry > 0)
            result.insert(0, 1);

        return result.toString();
    }
}
