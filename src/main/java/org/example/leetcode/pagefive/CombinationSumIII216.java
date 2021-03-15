package org.example.leetcode.pagefive;

//216. 组合总和 III
//        找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
//
//        说明：
//
//        所有数字都是正整数。
//        解集不能包含重复的组合。
//        示例 1:
//
//        输入: k = 3, n = 7
//        输出: [[1,2,4]]
//        示例 2:
//
//        输入: k = 3, n = 9
//        输出: [[1,2,6], [1,3,5], [2,3,4]]
import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        int sum = 0;

        backTrack(results, combination, n, k, 1, sum);

        return results;
    }

    private void backTrack(List<List<Integer>> results, List<Integer> combination, int n, int k, int t, int sum) {
        if (combination.size() == k) {
            if (sum == n) {
                results.add(new ArrayList<>(combination));
            }

            return;
        }

        if (sum + t > n || t > 9) {
            return;
        }

        backTrack(results, combination, n, k, t + 1, sum);

        combination.add(t);
        sum += t;
        backTrack(results, combination, n, k, t + 1, sum);
        combination.remove(combination.size() - 1);
        sum -= t;
    }
}
