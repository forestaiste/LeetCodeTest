package org.example.leetcode.pagetwo;

//88. 合并两个有序数组
//        给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
//
//        初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
//
//
//
//        示例 1：
//
//        输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        输出：[1,2,2,3,5,6]
//        示例 2：
//
//        输入：nums1 = [1], m = 1, nums2 = [], n = 0
//        输出：[1]


public class MergeSortedArray88 {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int i = 0;
        int j = 0;

        if (m == 0) {
            while (j < n) {
                nums1[i++] = nums2[j++];
            }
            return;
        }

        int count = m;
        while (j < n && i < count) {

            if (nums1[i] > nums2[j]) {
                count++;
                int k = count - 1;
                while(k > i) {
                    nums1[k] = nums1[k - 1];
                    k--;
                }

                nums1[i] = nums2[j];
                j++;
            }
            i++;
        }

        while (j < n) {
            nums1[i++] = nums2[j++];
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[m + n];

        while (i < m || j < n) {
            if (i == m) {
                result[k++] = nums2[j++];
            }
            else if (j == n) {
                result[k++] = nums1[i++];
            }
            else if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            }
            else {
                result[k++] = nums2[j++];
            }
        }

        for (i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        int tail = m + n - 1;
        int val;

        while (i >= 0 || j >= 0) {
            if (i == - 1) {
                val = nums2[j--];
            }
            else if (j == -1) {
                val = nums1[i--];
            }
            else if (nums1[i] > nums2[j]) {
                val = nums1[i--];
            }
            else {
                val = nums2[j--];
            }

            nums1[tail--] = val;
        }
    }
}
