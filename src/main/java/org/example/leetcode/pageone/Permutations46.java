package org.example.leetcode.pageone;

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

import java.util.*;

public class Permutations46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        Map<Integer, Boolean> usage = new HashMap<>();

        for (int n : nums) {
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

    int[] nums;

    public List<List<Integer>> permute2(int[] nums) {
        this.nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            this.nums[i] = nums[i];
        }

        List<List<Integer>> results = new ArrayList<>();

        afs2(results, 0);

        return results;
    }

    private void afs2(List<List<Integer>> results, int level) {
        if (level == nums.length) {
            List<Integer> combination = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                combination.add(nums[i]);
            }
            List<Integer> result = new ArrayList<>(combination);
            results.add(result);
            return;
        }

        for (int i = level; i < nums.length; i++) {
            int temp;
            temp = nums[level];
            nums[level] = nums[i];
            nums[i] = temp;

            afs2(results, level + 1);

            temp = nums[level];
            nums[level] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute3(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }


        int n = nums.length;
        backtrack(n, output, results, 0);
        return results;
    }

    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int level) {
        // 所有数都填完了
        if (level == n) {
            res.add(new ArrayList<>(output));

            return;
        }

        for (int i = level; i < n; i++) {
            Collections.swap(output, level, i);
            backtrack(n, output, res, level + 1);
            Collections.swap(output, level, i);
        }
    }
}
