package org.example.leetcode;

//45. 跳跃游戏 II
//        给定一个非负整数数组，你最初位于数组的第一个位置。
//
//        数组中的每个元素代表你在该位置可以跳跃的最大长度。
//
//        你的目标是使用最少的跳跃次数到达数组的最后一个位置。
//
//        示例:
//
//        输入: [2,3,1,1,4]
//        输出: 2
//        解释: 跳到最后一个位置的最小跳跃数是 2。
//        从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
//        说明:
//
//        假设你总是可以到达数组的最后一个位置。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JumpGameII {
    public int jump(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();

        backTrack(nums, results, path, 0);

        int min = Integer.MAX_VALUE;
        for (List<Integer> result : results) {
            if (min > result.size()) {
                min = result.size();
            }
        }

        return min;
    }

    public void backTrack(int[] nums, List<List<Integer>> results, List<Integer> path, int idx) {
        if (idx == nums.length - 1) {
            results.add(new ArrayList<Integer>(path));
            return;
        }

        if (idx > nums.length - 1)
            return;

        for (int j = 1; j <= nums[idx]; j++) {
            path.add(nums[idx]);
            backTrack(nums, results, path, idx + j);
            path.remove(path.size() - 1);
        }
    }
}
