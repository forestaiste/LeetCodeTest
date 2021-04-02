package org.example.leetcode.pageeight;

//377. 组合总和 Ⅳ
//        给你一个由 不同 整数组成的数组 nums ，和一个目标整数 target 。请你从 nums 中找出并返回总和为 target 的元素组合的个数。
//
//        题目数据保证答案符合 32 位整数范围。
//
//
//
//        示例 1：
//
//        输入：nums = [1,2,3], target = 4
//        输出：7
//        解释：
//        所有可能的组合为：
//        (1, 1, 1, 1)
//        (1, 1, 2)
//        (1, 2, 1)
//        (1, 3)
//        (2, 1, 1)
//        (2, 2)
//        (3, 1)
//        请注意，顺序不同的序列被视作不同的组合。
//        示例 2：
//
//        输入：nums = [9], target = 3
//        输出：0


public class CombinationSumIV377 {
    public int combinationSum4(int[] nums, int target) {
        int length = nums.length;

        int[] f = new int[target + 1];

        f[0] = 1;


        for (int j = 0; j <= target; j++) {
            for (int i = 0; i < length; i++) {
                if (j >= nums[i]) {
                    f[j] = f[j] + f[j - nums[i]];
                }
            }
        }

        return f[target];
    }
}
