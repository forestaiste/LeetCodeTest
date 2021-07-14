package org.example.leetcode.pageone;

//40. 组合总和 II
//        给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
//        candidates 中的每个数字在每个组合中只能使用一次。
//
//        说明：
//
//        所有数字（包括目标数）都是正整数。
//        解集不能包含重复的组合。
//        示例 1:
//
//        输入: candidates = [10,1,2,7,6,1,5], target = 8,
//        所求解集为:
//        [
//        [1, 7],
//        [1, 2, 5],
//        [2, 6],
//        [1, 1, 6]
//        ]
//        示例 2:
//
//        输入: candidates = [2,5,2,1,2], target = 5,
//        所求解集为:
//        [
//        [1,2,2],
//        [5]
//        ]


import java.util.*;

public class CombinationSumII40 {
//    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public List<List<Integer>> combinationSumII0(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();

        Arrays.sort(candidates);

        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(combine));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (target - candidates[i] >= 0) {
                combine.add(candidates[i]);
                dfs(candidates, target - candidates[i], ans, combine, i + 1);
                combine.remove(combine.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSumII(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();

        Arrays.sort(candidates);

        backTrack(candidates, target, ans, combine, 0, Integer.MIN_VALUE);
        return ans;
    }

    private void backTrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int index, int last) {
        if (index == candidates.length) {
            return;
        }

        if (target == 0) {
            ans.add(new ArrayList<>(combine));

            return;
        }

        if (last != candidates[index])
            backTrack(candidates, target, ans, combine, index + 1, last);

        if (//(index > 0 && candidates[index] == candidates[index - 1]) ||
                (target < candidates[index])) {
            return;
        }

        combine.add(candidates[index]);
        backTrack(candidates, target - candidates[index], ans, combine, index + 1, candidates[index]);
        combine.remove(combine.size() - 1);
    }
}
