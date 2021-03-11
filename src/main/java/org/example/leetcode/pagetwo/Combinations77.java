package org.example.leetcode.pagetwo;

import java.util.ArrayList;
import java.util.List;

//77. 组合
//        给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
//
//        示例:
//
//        输入: n = 4, k = 2
//        输出:
//        [
//        [2,4],
//        [3,4],
//        [2,3],
//        [1,2],
//        [1,3],
//        [1,4],
//        ]
public class Combinations77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        backTrack(results, combination, n, k, 1);

        return results;
    }

    private void backTrack(List<List<Integer>> results, List<Integer> combination, int n, int k, int start) {
        if (combination.size() == k) {
            List<Integer> result = new ArrayList<>(combination);
            results.add(result);
            return;
        }

        for (int i = start; i <= n - (k - combination.size()) + 1; i++) {
            combination.add(i);
            backTrack(results, combination, n, k, i + 1);
            combination.remove(combination.size() - 1);
        }
    }
}
