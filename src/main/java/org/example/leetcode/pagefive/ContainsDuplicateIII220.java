package org.example.leetcode.pagefive;

//220. 存在重复元素 III
//        给你一个整数数组 nums 和两个整数 k 和 t 。请你判断是否存在 两个不同下标 i 和 j，使得 abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k 。
//
//        如果存在则返回 true，不存在返回 false。
//
//        示例 1：
//
//        输入：nums = [1,2,3,1], k = 3, t = 0
//        输出：true
//        示例 2：
//
//        输入：nums = [1,0,1,1], k = 1, t = 2
//        输出：true
//        示例 3：
//
//        输入：nums = [1,5,9,1,5,9], k = 2, t = 3
//        输出：false

import java.util.TreeSet;

public class ContainsDuplicateIII220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Long> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Long u = nums[i] * 1L;
            // 从 ts 中找到小于等于 u 的最大值（小于等于 u 的最接近 u 的数）
            Long l = ts.floor(u);
            // 从 ts 中找到大于等于 u 的最小值（大于等于 u 的最接近 u 的数）
            Long r = ts.ceiling(u);
            if(l != null && u - l <= t) return true;
            if(r != null && r - u <= t) return true;
            // 将当前数加到 ts 中，并移除下标范围不在 [max(0, i - k), i) 的数（维持滑动窗口大小为 k）
            ts.add(u);
            if (i >= k) ts.remove(nums[i - k] * 1L);
        }
        return false;

    }
}
