package org.example.leetcode.pageeight;

//368. 最大整除子集
//        给你一个由 无重复 正整数组成的集合 nums ，请你找出并返回其中最大的整除子集 answer ，子集中每一元素对 (answer[i], answer[j]) 都应当满足：
//        answer[i] % answer[j] == 0 ，或
//        answer[j] % answer[i] == 0
//        如果存在多个有效解子集，返回其中任何一个均可。
//
//
//
//        示例 1：
//
//        输入：nums = [1,2,3]
//        输出：[1,2]
//        解释：[1,3] 也会被视为正确答案。
//        示例 2：
//
//        输入：nums = [1,2,4,8]
//        输出：[1,2,4,8]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int[] f = new int[nums.length];

        Arrays.fill(f, 1);

        int maxSize = 0;
        int maxValue = 0;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }

            if (maxSize < f[i]) {
                maxSize = f[i];
                maxValue = nums[i];
            }
        }

        List<Integer> result = new ArrayList<>();

        if (maxSize == 1) {
            result.add(maxValue);
        }

        for (int i = length - 1; i >= 0 && maxSize > 0; i--) {
            if (f[i] == maxSize && maxValue % nums[i] == 0) {
                result.add(nums[i]);
                maxSize--;
            }
        }

        return result;
    }
    public List<Integer> largestDivisibleSubset1(int[] nums) {
        List<Integer> result = null;

        if (nums.length == 0) {
            result = new ArrayList<>();
            return result;
        }

        Arrays.sort(nums);

        List<List<Integer>> collection = new ArrayList<>();

        for (int num : nums) {
            boolean added = false;
            List<Integer> copy = null;
            for (List<Integer> c : collection) {


                if (num % c.get(c.size() - 1) == 0) {
                    c.add(num);
                    added = true;
                }
                else if (c.size() >= 2 && num % c.get(c.size() - 2) == 0) {
                    copy = new ArrayList<>(c);
                    copy.remove(copy.size() - 1);
                    copy.add(num);
                    added = true;

                }
            }

            if (copy != null) {
                collection.add(copy);
            }

            if (!added) {
                List<Integer> c = new ArrayList<>();
                c.add(num);
                collection.add(c);
            }
        }

        int max = 0;
        for (List<Integer> c : collection) {
            if (c.size() > max) {
                max = c.size();
                result = c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LargestDivisibleSubset368 largestDivisibleSubset = new LargestDivisibleSubset368();
        int[] nums = {5,9,18,54,108,540,90,180,360,720};
        List<Integer> result = largestDivisibleSubset.largestDivisibleSubset(nums);
        System.out.println(Arrays.toString(result.toArray()));

        int[] nums1 = {22,1,74,51,18,38,9,44,88,12};
        List<Integer> result1 = largestDivisibleSubset.largestDivisibleSubset(nums1);
        System.out.println(Arrays.toString(result1.toArray()));
    }
}
