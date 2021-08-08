package org.example.leetcode.pageone;

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

public class JumpGameII45 {
    int min = Integer.MAX_VALUE;
    List<Integer> path;
    public int jump0(int[] nums) {
        path = new ArrayList<>();

        backTrack(nums, 0);

        return min;
    }

    public void backTrack(int[] nums, int idx) {
        if (idx == nums.length - 1) {
            min = path.size();
            return;
        }

        if (idx > nums.length - 1)
            return;

        for (int j = 1; j <= nums[idx]; j++) {
            if (path.size() >= min) {
                continue;
            }
            path.add(nums[idx]);
            backTrack(nums, idx + j);
            path.remove(path.size() - 1);
        }
    }

    public int jump1(int[] nums) {
        if (nums.length == 1) return 0;

        int curPos = 0;
        int ans = 0;
        int maxPos = 0;

        for (int i = 0; i < nums.length; i++) {
            maxPos = Math.max(nums[i] + i, maxPos);

            if (i == curPos) {
                if (curPos != nums.length - 1) {
                    ans++;
                    curPos = maxPos;

                    if (maxPos >= nums.length - 1) break;
                }
                else {
                    break;
                }
            }
        }

        return ans;
    }

    public int jump(int[] nums) {
        int curPos = 0;
        int ans = 0;
        int maxPos = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxPos = Math.max(nums[i] + i, maxPos);

            if (i == curPos) {
                curPos = maxPos;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        JumpGameII45 jumpGameII = new JumpGameII45();
        int[] nums = {2, 3, 1, 1, 4};
//        int[] nums = {1, 2, 3};
        System.out.println(jumpGameII.jump(nums));
    }
}
