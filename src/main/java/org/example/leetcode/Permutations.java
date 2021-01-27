package org.example.leetcode;

//    46. 全排列
//    给定一个 没有重复 数字的序列，返回其所有可能的全排列。
//
//    示例:
//
//    输入: [1,2,3]
//    输出:
//            [
//            [1,2,3],
//            [1,3,2],
//            [2,1,3],
//            [2,3,1],
//            [3,1,2],
//            [3,2,1]
//            ]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> combination = new ArrayList<Integer>();
        Map<Integer, Boolean> usage = new HashMap<Integer, Boolean>();

        for (int n: nums) {
            usage.put(n, false);
        }

        afs(nums, results, combination, usage);

        return results;
    }

    private void afs(int[] nums, List<List<Integer>> results, List<Integer> combination, Map<Integer, Boolean> usage) {
        if (combination.size() == nums.length) {
            List<Integer> result = new ArrayList<>(combination);
            results.add(result);
            return;
        }

        for (int n : nums) {
            if (!usage.get(n)) {
                combination.add(n);
                usage.put(n, true);
                afs(nums, results, combination, usage);
                combination.remove(combination.size() - 1);
                usage.put(n, false);
            }
        }
    }
}
