package org.example.leetcode.pagetwo;

//90. 子集 II
//        给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
//
//        说明：解集不能包含重复的子集。
//
//        示例:
//
//        输入: [1,2,2]
//        输出:
//        [
//        [2],
//        [1],
//        [1,2,2],
//        [2,2],
//        [1,2],
//        []
//        ]

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII90 {
    List<List<Integer>> results;
    List<Integer> combination;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        results = new ArrayList<>();
        combination = new ArrayList<>();

        Arrays.sort(nums);

        backTrack(nums, 0);
        return results;
    }

    private void backTrack(int[] nums, int start) {
        results.add(new ArrayList<>(combination));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            combination.add(nums[i]);
            backTrack(nums, i + 1);
            combination.remove(combination.size() - 1);
        }
    }
}
