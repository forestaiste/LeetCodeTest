package org.example.leetcode.pageeleven;

//541. 反转字符串 II
//        给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
//
//        如果剩余字符少于 k 个，则将剩余字符全部反转。
//        如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
//
//
//        示例:
//
//        输入: s = "abcdefg", k = 2
//        输出: "bacdfeg"


public class ReverseStringII541 {
    public String reverseStr0(String s, int k) {
        char[] chars = s.toCharArray();

        int length = s.length();

        int seg = length / k  + ((length % k > 0) ? 1 : 0);

        for (int i = 0; i < seg; i++) {
            if (i % 2 == 0) {
                int subLength = ((i + 1) * k < length) ? k : length - i * k;
                for (int j = i * k, l = i * k + subLength - 1; j < i * k + subLength / 2; j++, l--) {
                    char temp = chars[j];
                    chars[j] = chars[l];
                    chars[l] = temp;
                }
            }
        }

        return new String(chars);
    }

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        int length = s.length();

        for (int start = 0; start < length; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, chars.length - 1);

            while (i < j) {
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
        }

        return new String(chars);
    }
}
