package org.example.leetcode.pagetwo;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int number = 1;
        while (left < right) {
            for (int i = left; i <= right; i++) {
              matrix[top][i] = number++;
            }

            for (int i = top + 1; i <= bottom - 1; i++) {
                matrix[i][right] = number++;
            }

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = number++;
            }

            for (int i = bottom - 1; i >= top + 1; i--) {
                matrix[i][left] = number++;
            }

            left++;
            right--;
            top++;
            bottom--;
        }

        if (left == right)
            matrix[top][left] = number;

        return matrix;
    }
}
