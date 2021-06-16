package org.example.leetcode.pagesix;

//287. 寻找重复数
//        给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
//
//        假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。
//
//        你设计的解决方案必须不修改数组 nums 且只用常量级 O(1) 的额外空间。
//
//        示例 1：
//
//        输入：nums = [1,3,4,2,2]
//        输出：2
//        示例 2：
//
//        输入：nums = [3,1,3,4,2]
//        输出：3
//        示例 3：
//
//        输入：nums = [1,1]
//        输出：1
//        示例 4：
//
//        输入：nums = [1,1,2]
//        输出：1

public class FindTheDuplicateNumber287 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }


    public int findDuplicate1(int[] nums) {
        int slow = 0;
        int fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int pre1 = 0;
        int pre2 = slow;
        while(pre1 != pre2){
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }


}
