package org.example.leetcode.pageone;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        LongestCommonPrefix14 longestCommonPrefix = new LongestCommonPrefix14();
        String[] strs = {"HelloKitty", "HelloWorld", "HelloMoto"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}
