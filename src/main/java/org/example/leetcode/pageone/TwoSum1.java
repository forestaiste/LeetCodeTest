package org.example.leetcode.pageone;

//给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//        你可以按任意顺序返回答案。
//
//
//        示例 1：
//
//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
//        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//        示例 2：
//
//        输入：nums = [3,2,4], target = 6
//        输出：[1,2]
//        示例 3：
//
//        输入：nums = [3,3], target = 6
//        输出：[0,1]

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum1 sum = new TwoSum1();

        int[] samples = {2, 7, 11, 15};

        int[] results = sum.twoSum(samples, 9);
        System.out.println(Arrays.toString(results));
    }
}