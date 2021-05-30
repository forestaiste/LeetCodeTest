package org.example.leetcode.pagefive;

//217. 存在重复元素
//        给定一个整数数组，判断是否存在重复元素。
//
//        如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
//
//        示例 1:
//
//        输入: [1,2,3,1]
//        输出: true
//        示例 2:
//
//        输入: [1,2,3,4]
//        输出: false
//        示例 3:
//
//        输入: [1,1,1,3,3,4,3,2,4,2]
//        输出: true

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int m = nums.length;

        for (int i = 0; i < m; i++) {
            if (set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }

        return false;
    }
}
