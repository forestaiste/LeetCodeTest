package org.example.leetcode.pagefive;

//221. 最大正方形
//        在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积。
//
//        示例 1：
//
//        输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
//        输出：4
//        示例 2：
//
//
//        输入：matrix = [["0","1"],["1","0"]]
//        输出：1

public class MaximalSquare221 {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;

        int[][] f = new int[m][n];

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == '1') {
                f[i][0] = 1;
                max = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == '1') {
                f[0][i] = 1;
                max = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '1') {
                    f[i][j] = Math.min(f[i - 1][j - 1], Math.min(f[i][j - 1], f[i - 1][j])) + 1;
                    max = Math.max(max, f[i][j]);
                }
            }
        }

        return max * max;
    }
}
