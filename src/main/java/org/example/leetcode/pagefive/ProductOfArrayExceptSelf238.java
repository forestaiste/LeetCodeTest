package org.example.leetcode.pagefive;

//238. 除自身以外数组的乘积
//        给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
//
//        示例:
//
//        输入: [1,2,3,4]
//        输出: [24,12,8,6]
//
//
//        提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。
//
//        说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
//
//        进阶：
//        你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）

public class ProductOfArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];

        answer[0] = 1;
        for (int i = 1; i < length; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        int r = 1;
        for (int i = length - 1; i >= 0; i--) {
            answer[i] = answer[i] * r;
            r *= nums[i];
        }

        return answer;
    }
    
    public int[] productExceptSelf1(int[] nums) {
        int length = nums.length;

        int[] l = new int[length];
        int[] r = new int[length];

        l[0] = 1;
        for (int i = 1; i < length; i++) {
            l[i] = nums[i - 1] * l[i - 1];
        }

        r[length - 1] = 1;
        for (int i = length - 2; i >= 0 ; i--) {
            r[i] = r[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            nums[i] = l[i] * r[i];
        }

        return nums;
    }
}
