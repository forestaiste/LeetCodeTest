package org.example.leetcode.pageseven;

//324. 摆动排序 II
//        给你一个整数数组 nums，将它重新排列成 nums[0] < nums[1] > nums[2] < nums[3]... 的顺序。
//
//        你可以假设所有输入数组都可以得到满足题目要求的结果。
//
//        示例 1：
//
//        输入：nums = [1,5,1,1,6,4]
//        输出：[1,6,1,5,1,4]
//        解释：[1,4,1,5,1,6] 同样是符合题目要求的结果，可以被判题程序接受。
//        示例 2：
//
//        输入：nums = [1,3,2,2,3,1]
//        输出：[2,3,1,3,1,2]
//
//
//        提示：
//
//        1 <= nums.length <= 5 * 104
//        0 <= nums[i] <= 5000
//        题目数据保证，对于给定的输入 nums ，总能产生满足题目要求的结果

public class WiggleSortII324 {
    public void wiggleSort(int[] nums) {
        int len = nums.length;

        int left = 0;
        int right = len - 1;
        while (true) {
            int index = quickSelect(nums, left, right);

            if (index == len / 2) {
                break;
            } else if (index > len / 2) {
                right = index - 1;
            } else {
                left = index + 1;
            }
        }

        int[] small = new int[len / 2 + len % 2];
        int[] big = new int[len / 2];

        System.arraycopy(nums, 0, small, 0, small.length);
        System.arraycopy(nums, small.length, big, 0, big.length);

        int i = 0;
        for (; i < len / 2; i++) {
            nums[2 * i] = small[small.length - 1 - i];
            nums[2 * i + 1] = big[len / 2 - 1 - i];
        }

        if (len % 2 != 0)
            nums[2 * i] = small[small.length - 1 - i];
    }

    private int quickSelect(int[] nums, int left, int right) {
        int pivot = nums[left];
        int i = left, j = left + 1;

        while (j <= right) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }

            j++;
        }

        swap(nums, left, i);

        return i;
    }

    void swap(int[] nums, int p, int q) {
        int tmp = nums[p];
        nums[p] = nums[q];
        nums[q] = tmp;
    }
//
//    //virtual mapping to new index
//    //e.g. n = 8, [a, b, c, d, e, f, g, h] -> [a, e, b, f, c, g, d, h]
//    //e.g. n = 9, [a, b, c, d, e, f, g, h, i] -> [a, f, b, g, c, h, d, i, e]
//    int ni(int n, int i) {
//        return i <= (n - 1) / 2 ? i * 2 : (i - (n + 1) / 2) * 2 + 1;
//    }
//
//    //three-way partition, O(n)-average time, O(1)-space, k starts from index 0
//    int getKth(int[] nums, int k) {
//        int n = nums.length, start = 0, end = n - 1;
//        while (true) {
//            //[start, p) < pivot, [p, q) == pivot, [q, i) > pivot
//            int pivot = nums[ni(n, end)], p = start, q = p;
//            for (int i = start; i < end; i++)
//                if (nums[ni(n, i)] <= pivot) {
//                    swap(nums, ni(n, q++), ni(n, i));
//                    if (nums[ni(n, q - 1)] < pivot)
//                        swap(nums, ni(n, p++), ni(n, q - 1));
//                }
//            swap(nums, ni(n, q++), ni(n, end));
//            if (k < p - start)
//                end = p - 1;
//            else if (k < q - start)
//                return pivot;
//            else {
//                k -= q - start;
//                start = q;
//            }
//        }
//    }
//
//    public void wiggleSort(int[] nums) {
//        int n = nums.length, mid = (n - 1) / 2;
//        getKth(nums, mid);
//        //reverse index [0, 2, 4, 6, ...]
//        for (int p = 0, q = mid; p < q; p++, q--)
//            swap(nums, ni(n, p), ni(n, q));
//        //reverse index [1, 3, 5, 7, ...]
//        for (int p = mid + 1, q = n - 1; p < q; p++, q--)
//            swap(nums, ni(n, p), ni(n, q));
//    }

}
