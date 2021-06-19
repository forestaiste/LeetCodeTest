package org.example.leetcode.pageseven;

//316. 去除重复字母
//        给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
//
//        示例 1：
//
//        输入：s = "bcabc"
//        输出："abc"
//        示例 2：
//
//        输入：s = "cbacdcbc"
//        输出："acdb"

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicateLetters316 {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] positions = new int[27];
        List<Character> characters = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            char letter = s.charAt(i - 1);
            int c = letter - 'a';

            if (positions[c] == 0) {
                positions[c] = i;
                characters.add(letter);
            }
            else {
                if (s.charAt(positions[c]) < letter) {
                    positions[c] = i;
                    characters.remove(characters.indexOf(letter));
                    characters.add(letter);
                }
            }
        }


        StringBuilder builder = new StringBuilder();

        for (char letter : characters) {
            builder.append(letter);
        }
        return builder.toString();
    }
}
