package org.example.leetcode;

//给定一个字符串s和一些长度相同的单词words。找出 s 中恰好可以由words 中所有单词串联形成的子串的起始位置。
//
//        注意子串要与words 中的单词完全匹配，中间不能有其他字符，但不需要考虑words中单词串联的顺序。
//        示例 1：
//
//        输入：
//        s = "barfoothefoobarman",
//        words = ["foo","bar"]
//        输出：[0,9]
//        解释：
//        从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
//        输出的顺序不重要, [9,0] 也是有效答案。
//        示例 2：
//
//        输入：
//        s = "wordgoodgoodgoodbestword",
//        words = ["word","good","best","word"]
//        输出：[]

import java.util.*;

public class ConcatenateWords {

    public List<String> concatenate(String[] words) {
        List<String> combinations = new ArrayList<String>();

        StringBuilder builder = new StringBuilder();
        Map<String, Integer> wordsStatus = new HashMap<String, Integer>();

        int totalLength = 0;

        for (String w : words) {
            if (!wordsStatus.containsKey(w))
                wordsStatus.put(w, 1);
            else
                wordsStatus.put(w, wordsStatus.get(w) + 1);

            totalLength += w.length();
        }

        doConcatenation(wordsStatus, words, builder, totalLength, combinations);

        return combinations;
    }

    private void doConcatenation(Map<String, Integer> wordsStatus, String[] words, StringBuilder builder, int totalLength, List<String> combinations) {
        if (builder.length() == totalLength) {
            if (!combinations.contains(builder.toString()))
                combinations.add(builder.toString());
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (wordsStatus.get(words[i]) != 0) {
                wordsStatus.put(words[i], wordsStatus.get(words[i]) - 1);
                builder.append(words[i]);
                doConcatenation(wordsStatus, words, builder, totalLength, combinations);
                wordsStatus.put(words[i], wordsStatus.get(words[i]) + 1);
                int start = builder.length() - words[i].length();
                int end = builder.length();
                builder.delete(start, end);
            }
        }
    }

    public List<String> concatenateEnhancement(String[] words) {
        List<String> combinations = new ArrayList<String>();

        StringBuilder builder = new StringBuilder();
        Map<String, Integer> wordsStatus = new HashMap<String, Integer>();

        int totalLength = 0;

        for (String w : words) {
            if (!wordsStatus.containsKey(w))
                wordsStatus.put(w, 1);
            else
                wordsStatus.put(w, wordsStatus.get(w) + 1);

            totalLength += w.length();
        }

        Arrays.sort(words);

        doConcatenationEnhancement(wordsStatus, words, builder, totalLength, combinations);

        return combinations;
    }

    private void doConcatenationEnhancement(Map<String, Integer> wordsStatus, String[] words, StringBuilder builder, int totalLength, List<String> combinations) {
        if (builder.length() == totalLength) {
            combinations.add(builder.toString());
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (i > 0 && words[i] == words[i - 1])
                continue;

            if (wordsStatus.get(words[i]) != 0) {
                wordsStatus.put(words[i], wordsStatus.get(words[i]) - 1);
                builder.append(words[i]);
                doConcatenation(wordsStatus, words, builder, totalLength, combinations);
                wordsStatus.put(words[i], wordsStatus.get(words[i]) + 1);
                int start = builder.length() - words[i].length();
                int end = builder.length();
                builder.delete(start, end);
            }
        }
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        int wordNum = words.length;
        if (wordNum == 0) {
            return res;
        }
        int wordLen = words[0].length();
        //HashMap1 存所有单词
        HashMap<String, Integer> allWords = new HashMap<String, Integer>();
        for (String w : words) {
            int value = allWords.getOrDefault(w, 0);
            allWords.put(w, value + 1);
        }
        //遍历所有子串
        for (int i = 0; i < s.length() - wordNum * wordLen + 1; i++) {
            //HashMap2 存当前扫描的字符串含有的单词
            HashMap<String, Integer> hasWords = new HashMap<String, Integer>();
            int num = 0;
            //判断该子串是否符合
            while (num < wordNum) {
                String word = s.substring(i + num * wordLen, i + (num + 1) * wordLen);
                //判断该单词在 HashMap1 中
                if (allWords.containsKey(word)) {
                    int value = hasWords.getOrDefault(word, 0);
                    hasWords.put(word, value + 1);
                    //判断当前单词的 value 和 HashMap1 中该单词的 value
                    if (hasWords.get(word) > allWords.get(word)) {
                        break;
                    }
                } else {
                    break;
                }
                num++;
            }
            //判断是不是所有的单词都符合条件
            if (num == wordNum) {
                res.add(i);
            }
        }
        return res;
    }
}