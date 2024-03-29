package org.example.leetcode.pagefifteen;

//718. 最长重复子数组
//        给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
//
//
//
//        示例：
//
//        输入：
//        A: [1,2,3,2,1]
//        B: [3,2,1,4,7]
//        输出：3
//        解释：
//        长度最长的公共子数组是 [3, 2, 1] 。

public class MaximumLengthOfRepeatedSubarray718 {
    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        int[][] f = new int[m + 1][n + 1];
        int max = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A[i - 1] == B[j - 1]) {
                    f[i][j] = f[i - 1][j - 1] + 1;
                }
//                else {
//                    f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
//                }
                max = Math.max(f[i][j], max);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumLengthOfRepeatedSubarray718 maximumLengthOfRepeatedSubarray = new MaximumLengthOfRepeatedSubarray718();
        int[] A = {1, 2, 3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};

        System.out.println(maximumLengthOfRepeatedSubarray.findLength(A, B));
    }
}
