package org.example.leetcode.pageeight;

//389. 找不同
//        给定两个字符串 s 和 t，它们只包含小写字母。
//
//        字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
//
//        请找出在 t 中被添加的字母。
//
//        示例 1：
//
//        输入：s = "abcd", t = "abcde"
//        输出："e"
//        解释：'e' 是那个被添加的字母。
//        示例 2：
//
//        输入：s = "", t = "y"
//        输出："y"
//        示例 3：
//
//        输入：s = "a", t = "aa"
//        输出："a"
//        示例 4：
//
//        输入：s = "ae", t = "aea"
//        输出："a"

public class FindTheDifference389 {
    public char findTheDifference0(String s, String t) {
        int[] map = new int[26];

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            map[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            map[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (map[i] == 1) {
                return (char)('a' + i);
            }
        }

        return 'a';
    }

    public char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            cnt[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }

    public char findTheDifference2(String s, String t) {
        int as = 0, at = 0;
        for (int i = 0; i < s.length(); ++i) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            at += t.charAt(i);
        }
        return (char) (at - as);
    }



    public static void main(String[] args) {
        FindTheDifference389 findTheDifference = new FindTheDifference389();
        System.out.println(findTheDifference.findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference.findTheDifference("ae", "aea"));
    }
}
