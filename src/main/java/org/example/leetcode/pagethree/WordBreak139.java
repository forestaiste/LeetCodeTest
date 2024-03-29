package org.example.leetcode.pagethree;

//139. 单词拆分
//        给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
//
//        说明：
//
//        拆分时可以重复使用字典中的单词。
//        你可以假设字典中没有重复的单词。
//        示例 1：
//
//        输入: s = "leetcode", wordDict = ["leet", "code"]
//        输出: true
//        解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
//        示例 2：
//
//        输入: s = "applepenapple", wordDict = ["apple", "pen"]
//        输出: true
//        解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
//        注意你可以重复使用字典中的单词。
//        示例 3：
//
//        输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
//        输出: false

import java.util.Arrays;
import java.util.List;

public class WordBreak139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = wordDict.size();

        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;

        for (int j = 0; j <= s.length(); j++) {
            for (String word : wordDict) {
                int wordLength = word.length();
                if (j >= wordLength) {
                    if (f[j - wordLength] && s.substring(j - wordLength, j).equals(word)) {
                        f[j] = true;
                    }
                }
            }
        }

        return f[s.length()];
    }

    public static void main(String[] args) {
        WordBreak139 wordBreak = new WordBreak139();
        List<String> wordDict = Arrays.asList("apple", "pen");
        System.out.println(wordBreak.wordBreak("applepenapple", wordDict));

        wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(wordBreak.wordBreak("catsandog", wordDict));

        wordDict = Arrays.asList("leet", "code");
        System.out.println(wordBreak.wordBreak("leetcode", wordDict));
    }
}
