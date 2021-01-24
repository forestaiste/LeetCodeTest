package org.example.leetcode;

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

public class CombinationSumII {
//    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public List<List<Integer>> combinationSumII(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();

        Arrays.sort(candidates);
//        for (int c : candidates) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int start) {
        if (start == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<Integer>(combine));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

//            if (map.get(candidates[i]) > 0) {
                if (target - candidates[i] >= 0) {
                    combine.add(candidates[i]);
//                    map.put(candidates[i], map.get(candidates[i]) - 1);
                    dfs(candidates, target - candidates[i], ans, combine, i + 1);
//                    map.put(candidates[i], map.get(candidates[i]) + 1);
                    combine.remove(combine.size() - 1);
                }
//            }
        }
    }
}
