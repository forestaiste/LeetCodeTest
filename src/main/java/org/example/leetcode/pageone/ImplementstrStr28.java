package org.example.leetcode.pageone;

//28. 实现 strStr()
//        实现 strStr() 函数。
//
//        给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
//
//        示例 1:
//
//        输入: haystack = "hello", needle = "ll"
//        输出: 2
//        示例 2:
//
//        输入: haystack = "aaaaa", needle = "bba"
//        输出: -1
//        说明:
//
//        当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//
//        对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

public class ImplementstrStr28 {

    public int strStr0(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();
        if (L == 0) return 0;

        int pn = 0;
        while (pn < n - L + 1) {
            // find the position of the first needle character
            // in the haystack string
            while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) ++pn;

            // compute the max match string
            int currLen = 0, pL = 0;
            while (pL < L && pn < n && haystack.charAt(pn) == needle.charAt(pL)) {
                ++pn;
                ++pL;
                ++currLen;
            }

            // if the whole needle string is found,
            // return its start position
            if (currLen == L) return pn - L;

            // otherwise, backtrack
            pn = pn - currLen + 1;
        }
        return -1;
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int[] next = new int[needle.length()];
        getNext(next, needle.toCharArray());
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while(j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length() ) {
                return (i - needle.length() + 1);
            }
        }
        return -1;
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
