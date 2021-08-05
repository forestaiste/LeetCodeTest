package org.example.leetcode.pageone;

public class ReverseInteger7 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger7 reverseInteger = new ReverseInteger7();
        System.out.println(reverseInteger.reverse(-321));
    }
}
