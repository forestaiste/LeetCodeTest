package org.example.leetcode.pagetwo;
//60. 排列序列
//        给出集合 [1,2,3,...,n]，其所有元素共有 n! 种排列。
//
//        按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
//
//        "123"
//        "132"
//        "213"
//        "231"
//        "312"
//        "321"
//        给定 n 和 k，返回第 k 个排列。
//
//
//
//        示例 1：
//
//        输入：n = 3, k = 3
//        输出："213"
//        示例 2：
//
//        输入：n = 4, k = 9
//        输出："2314"
//        示例 3：
//
//        输入：n = 3, k = 1
//        输出："123"
//
//
//        提示：
//
//        1 <= n <= 9
//        1 <= k <= n!

import java.util.*;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        List<String> results = new ArrayList<String>();

        List<Integer> permutation = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            permutation.add(i + 1);
        }

        backTrack(results, permutation, n, 0);

        System.out.println(Arrays.toString(results.toArray()));

        return results.get(k - 1);
    }

    private void backTrack(List<String> results, List<Integer> permutation, int n, int level) {
        if (level == n) {
            StringBuilder builder = new StringBuilder();
            permutation.forEach(d -> builder.append(d.toString()));
            results.add(builder.toString());
        }

        for (int i = level; i < n; i++) {
            Collections.swap(permutation, level, i);
            backTrack(results, permutation, n, level + 1);
            Collections.swap(permutation, i, level);
        }
    }

    public String getPermutation2(int n, int k) {
        List<String> results = new ArrayList<String>();
        StringBuilder combination = new StringBuilder();
        Map<Integer, Boolean> usage = new HashMap<Integer, Boolean>();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
            usage.put(i + 1, false);
        }

        afs(nums, results, combination, usage);

        return results.get(k - 1);
    }

    private void afs(int[] nums, List<String> results, StringBuilder combination, Map<Integer, Boolean> usage) {
        if (combination.length() == nums.length) {
            results.add(combination.toString());
            return;
        }

        for (int n : nums) {
            if (!usage.get(n)) {
                combination.append(n);
                usage.put(n, true);
                afs(nums, results, combination, usage);
                combination.deleteCharAt(combination.length() - 1);
                usage.put(n, false);
            }
        }
    }
}
