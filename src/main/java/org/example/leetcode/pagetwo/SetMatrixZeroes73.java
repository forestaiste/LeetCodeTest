package org.example.leetcode.pagetwo;

//73. 矩阵置零
//        给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
//
//        进阶：
//
//        一个直观的解决方案是使用  O(mn) 的额外空间，但这并不是一个好的解决方案。
//        一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。
//        你能想出一个仅使用常量空间的解决方案吗？
//
//
//        示例 1：
//
//
//        输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
//        输出：[[1,0,1],[0,0,0],[1,0,1]]
//        示例 2：
//
//
//        输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//        输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]

import java.util.Arrays;

public class SetMatrixZeroes73 {
    public void setZeroes0(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes1(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean flagCol0 = false, flagRow0 = false;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                flagCol0 = true;
            }
        }
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                flagRow0 = true;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (flagCol0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (flagRow0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < m; k++) {
                        if (matrix[k][j] != 0)
                            matrix[k][j] = -1;
                    }

                    for (int l = 0; l < n; l++) {
                        if (matrix[i][l] != 0)
                            matrix[i][l] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1)
                    matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        SetMatrixZeroes73 setMatrixZeroes = new SetMatrixZeroes73();
        setMatrixZeroes.setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        int[][] matrix1 = {{1, 1, 2, 4}, {0, 4, 5, 2}, {1, 3, 1, 5}};
        setMatrixZeroes.setZeroes1(matrix1);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
    }
}
