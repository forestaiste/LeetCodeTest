package org.example.leetcode.pageten;
//491. 递增子序列
//        给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是 2 。
//
//
//
//        示例：
//
//        输入：[4, 6, 7, 7]
//        输出：[[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]]
//
//
//        提示：
//
//        给定数组的长度不会超过15。
//        数组中的整数范围是 [-100,100]。
//        给定数组中可能包含重复数字，相等的数字应该被视为递增的一种情况。
//        通过次数33,717提交次数60,458


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncreasingSubsequences491 {
    List<List<Integer>> results;
    List<Integer> combination;
    public List<List<Integer>> findSubsequences(int[] nums) {
        results = new ArrayList<>();
        combination = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(nums, 0);
        return results;
    }

    private void backTrack(int[] nums, int start) {
        if (combination.size() > 1) {
            results.add(new ArrayList<>(combination));
        }


        for (int i = start; i < nums.length; i++) {
            if ((i > start && nums[i] == nums[i - 1]) ||
                    (i > 0 && nums[i] < nums[i - 1]))
                continue;

            combination.add(nums[i]);
            backTrack(nums, i + 1);
            combination.remove(combination.size() - 1);
        }
    }

    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> findSubsequences1(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums);
        return ans;
    }

    public void dfs(int cur, int last, int[] nums) {
        if (cur == nums.length) {
            if (temp.size() >= 2) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if (nums[cur] >= last) {
            temp.add(nums[cur]);
            dfs(cur + 1, nums[cur], nums);
            temp.remove(temp.size() - 1);
        }
        if (nums[cur] != last) {
            dfs(cur + 1, last, nums);
        }
    }
}
