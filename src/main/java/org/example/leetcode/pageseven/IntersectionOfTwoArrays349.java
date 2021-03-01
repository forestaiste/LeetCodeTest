package org.example.leetcode.pageseven;

//349. 两个数组的交集
//        给定两个数组，编写一个函数来计算它们的交集。
//
//
//
//        示例 1：
//
//        输入：nums1 = [1,2,2,1], nums2 = [2,2]
//        输出：[2]
//        示例 2：
//
//        输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        输出：[9,4]


import java.util.*;

public class IntersectionOfTwoArrays349 {
    public int[] intersection0(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }
        return getIntersection(set1, set2);
    }

    public int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }
        return intersection;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int length1 = nums1.length;
        int length2 = nums2.length;

        int[] intersections = new int[length1 + length2];
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        while (index1 < length1 && index2 < length2) {
            int num1 = nums1[index1];
            int num2 = nums2[index2];

            if (num1 == num2) {
                if (index == 0 || num1 != intersections[index - 1]) {
                    intersections[index++] = num1;
                }

                index1++;
                index2++;
            }
            else if (num1 > num2) {
                index2++;
            }
            else {
                index1++;
            }
        }

        return Arrays.copyOfRange(intersections, 0, index);
    }
}
