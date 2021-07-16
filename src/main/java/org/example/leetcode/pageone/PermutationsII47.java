package org.example.leetcode.pageone;

//47. 全排列 II
//        给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
//
//
//
//        示例 1：
//
//        输入：nums = [1,1,2]
//        输出：
//        [[1,1,2],
//        [1,2,1],
//        [2,1,1]]
//        示例 2：
//
//        输入：nums = [1,2,3]
//        输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//
//
//        提示：
//
//        1 <= nums.length <= 8
//        -10 <= nums[i] <= 10

import java.util.*;

public class PermutationsII47 {
    //存放结果
    List<List<Integer>> result = new ArrayList<>();
    //暂存结果
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        backTrack(nums, used);
        return result;
    }

    private void backTrack(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // used[i - 1] == true，说明同⼀树⽀nums[i - 1]使⽤过
            // used[i - 1] == false，说明同⼀树层nums[i - 1]使⽤过
            // 如果同⼀树层nums[i - 1]使⽤过则直接跳过
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            //如果同⼀树⽀nums[i]没使⽤过开始处理
            if (!used[i]) {
                used[i] = true;//标记同⼀树⽀nums[i]使⽤过，防止同一树支重复使用
                path.add(nums[i]);
                backTrack(nums, used);
                path.remove(path.size() - 1);//回溯，说明同⼀树层nums[i]使⽤过，防止下一树层重复
                used[i] = false;//回溯
            }
        }
    }

    public List<List<Integer>> permuteUnique1(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        afs(nums, map, results, combination);
        return results;
    }

    public void afs(int[] nums, Map<Integer, Integer> map, List<List<Integer>> results, List<Integer> combination) {
        if (combination.size() == nums.length) {
            results.add(new ArrayList<>(combination));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            if (map.get(nums[i]) > 0) {
                map.put(nums[i], map.get(nums[i]) - 1);
                combination.add(nums[i]);
                afs(nums, map, results, combination);
                map.put(nums[i], map.get(nums[i]) + 1);
                combination.remove(combination.size() - 1);
            }
        }
    }
}
