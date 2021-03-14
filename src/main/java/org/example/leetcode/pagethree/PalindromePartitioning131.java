package org.example.leetcode.pagethree;

//131. 分割回文串
//        给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
//
//        回文串 是正着读和反着读都一样的字符串。
//
//
//
//        示例 1：
//
//        输入：s = "aab"
//        输出：[["a","a","b"],["aa","b"]]
//        示例 2：
//
//        输入：s = "a"
//        输出：[["a"]]

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PalindromePartitioning131 {
    List<List<String>> results = new ArrayList<>();
    List<String> combination = new ArrayList<>();

    public List<List<String>> partition(String s) {

        backTrack(s, 0);

        return results;

    }

    private void backTrack(String s, int start) {
        if (start == s.length()) {
            results.add(new ArrayList<>(combination));

            return;
        }

        for (int i = start; i < s.length(); i++) {
            String sub = s.substring(start, i + 1);

            if (isPalindrome(sub)) {
                combination.add(sub);
                backTrack(s, i + 1);
                combination.remove(combination.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String sub) {
        int length = sub.length();

        for (int i = 0, j = length - 1; i < j; i++, j--) {
            if (sub.charAt(i) != sub.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> partition0(String s) {
        int len = s.length();
        List<List<String>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        // Stack 这个类 Java 的文档里推荐写成 Deque<Integer> stack = new ArrayDeque<Integer>();
        // 注意：只使用 stack 相关的接口
        Deque<String> stack = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        dfs(charArray, 0, len, stack, res);
        return res;
    }

    private void dfs(char[] charArray, int index, int len, Deque<String> path, List<List<String>> res) {
        if (index == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < len; i++) {
            // 因为截取字符串是消耗性能的，因此，采用传子串下标的方式判断一个子串是否是回文子串
            if (!checkPalindrome(charArray, index, i)) {
                continue;
            }
            path.addLast(new String(charArray, index, i + 1 - index));
            dfs(charArray, i + 1, len, path, res);
            path.removeLast();
        }
    }


    private boolean checkPalindrome(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
