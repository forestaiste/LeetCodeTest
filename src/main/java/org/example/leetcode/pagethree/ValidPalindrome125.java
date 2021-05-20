package org.example.leetcode.pagethree;

//125. 验证回文串
//        给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
//        说明：本题中，我们将空字符串定义为有效的回文串。
//
//        示例 1:
//
//        输入: "A man, a plan, a canal: Panama"
//        输出: true
//        示例 2:
//
//        输入: "race a car"
//        输出: false

import java.util.Locale;

public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        int length = s.length();
        if (length == 0)
            return true;

        int i = 0;
        int j = length - 1;
        s = s.toLowerCase();

        char[] chars = s.toCharArray();

        while (i <= j) {
            char head;
            do {
                head = chars[i++];
            } while (!((head >= 'a' && head <= 'z') || (head >= '0' && head <= '9')) && i < length);

            if (!((head >= 'a' && head <= 'z') || (head >= '0' && head <= '9')))
                head = '\0';

            char tail;
            do {
                tail = chars[j--];

            } while (!((tail >= 'a' && tail <= 'z') || (tail >= '0' && tail <= '9')) && j >= 0);

            if (!((tail >= 'a' && tail <= 'z') || (tail >= '0' && tail <= '9')))
                tail = '\0';
            if (head != tail)
                return false;
        }

        return true;
    }

    public boolean isPalindrome1(String s) {
        int length = s.length();

        int left = 0, right = length - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;

            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}
