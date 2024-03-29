package org.example.leetcode.pagefour;

//153. 寻找旋转排序数组中的最小值
//        已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,2,4,5,6,7] 在变化后可能得到：
//        若旋转 4 次，则可以得到 [4,5,6,7,0,1,2]
//        若旋转 7 次，则可以得到 [0,1,2,4,5,6,7]
//        注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
//
//        给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
//
//        示例 1：
//
//        输入：nums = [3,4,5,1,2]
//        输出：1
//        解释：原数组为 [1,2,3,4,5] ，旋转 3 次得到输入数组。
//        示例 2：
//
//        输入：nums = [4,5,6,7,0,1,2]
//        输出：0
//        解释：原数组为 [0,1,2,4,5,6,7] ，旋转 4 次得到输入数组。
//        示例 3：
//
//        输入：nums = [11,13,15,17]
//        输出：11
//        解释：原数组为 [11,13,15,17] ，旋转 4 次得到输入数组。

//左、中、右三个位置的值相比较，有以下几种情况：
//
//        左值 < 中值, 中值 < 右值 ：没有旋转，最小值在最左边，可以收缩右边界
//
//                  右
//             中
//        左
//        左值 > 中值, 中值 < 右值 ：有旋转，最小值在左半边，可以收缩右边界
//
//        左
//                   右
//             中
//        左值 < 中值, 中值 > 右值 ：有旋转，最小值在右半边，可以收缩左边界
//
//             中
//        左
//                   右
//        左值 > 中值, 中值 > 右值 ：单调递减，不可能出现
//
//        左
//             中
//                   右
//        分析前面三种可能的情况，会发现情况1、2是一类，情况3是另一类。
//
//        如果中值 < 右值，则最小值在左半边，可以收缩右边界。
//        如果中值 > 右值，则最小值在右半边，可以收缩左边界。
//        通过比较中值与右值，可以确定最小值的位置范围，从而决定边界收缩的方向。
//
//        而情况1与情况3都是左值 < 中值，但是最小值位置范围却不同，这说明，如果只比较左值与中值，不能确定最小值的位置范围。
//
//        所以我们需要通过比较中值与右值来确定最小值的位置范围，进而确定边界收缩的方向。

public class FindMinimumInRotatedSortedArray153 {
    public int findMin(int[] nums) {
        int length = nums.length;

        int left = 0;
        int right = length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return nums[left];
    }

    public int findMin1(int[] nums) {
        int length = nums.length;

        int left = 0;
        int right = length - 1;

        int result = nums[0];

        while (left < right) {
            int mid = (left + right) / 2;

            if (left + 1 == right) {
                result = Math.min(nums[left], nums[right]);
                break;
            } else if (nums[left] > nums[mid]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid;
            } else {
                break;
            }
        }


        return result;
    }

    public int findMin2(int[] nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }

        return min;
    }

    public int findMin3(int[] nums) {
        int length = nums.length;

        int left = 0;
        int right = length - 1;

        while (left < right) {
            int mid = (right - left) / 2 + left;

            if (nums[0] > nums[mid]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return nums[left] > nums[0] ? nums[0]: nums[left];
    }
}
