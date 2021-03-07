package org.example.leetcode.pageten;

public class RepeatedSubstringPattern459 {
    public boolean repeatedSubstringPattern0(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();

        if (length == 0)
            return false;

        char[] chars = s.toCharArray();
        int[] next = new int[length];

        getNext(next, chars);

        if (next[length - 1] != 0 && (length % (length - next[length - 1]) == 0)) {
            return true;
        }

        return false;
    }

    private void getNext(int[] next, char[] s) {
        int j = 0;
        next[0] = 0;

        for (int i = 1; i < s.length; i++) {
            while (j > 0 && s[i] != s[j]) {
                j = next[j - 1];
            }

            if (s[i] == s[j]) {
                j++;
            }

            next[i] = j;
        }
    }
}
