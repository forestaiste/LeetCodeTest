package org.example.leetcode.pagefour;

//167. 两数之和 II - 输入有序数组
//        给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
//
//        函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
//
//        你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
//
//
//        示例 1：
//
//        输入：numbers = [2,7,11,15], target = 9
//        输出：[1,2]
//        解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
//        示例 2：
//
//        输入：numbers = [2,3,4], target = 6
//        输出：[1,3]
//        示例 3：
//
//        输入：numbers = [-1,0], target = -1
//        输出：[1,2]

public class TwoSumIIInputArrayIsSorted167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                return new int[] {left + 1, right + 1};
            }
        }

        return new int[]{};
    }


    public int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1, high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum2(int[] numbers, int target) {
        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            int rest = target - numbers[i];

            int left = i + 1, right = length - 1;
            while (left <= right) {
                int mid = (right - left) / 2 + left;

                if (numbers[mid] > rest) {
                    right = mid - 1;
                }
                else if (numbers[mid] < rest) {
                    left = mid + 1;
                }
                else {
                    return new int[] {i + 1, left + 1};
                }
            }
        }

        return new int[]{};
    }
}
