package org.example.leetcode.pagefive;

//240. 搜索二维矩阵 II
//        编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
//
//        每行的元素从左到右升序排列。
//        每列的元素从上到下升序排列。
//
//        示例 1：
//
//        输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
//        输出：true
//        示例 2：
//
//        输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
//        输出：false

import java.util.ArrayList;
import java.util.List;

public class SearchA2DMatrixII240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = m - 1;
        int column = 0;

        while (row >= 0 && column < n) {

            if (matrix[row][column] > target) {
                row--;
            }
            else if (matrix[row][column] < target) {
                column++;
            }
            else {
                return true;
            }
        }

        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;


        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n - 1;

            if (matrix[i][0] > target || matrix[i][n - 1] < target)
                continue;

            while (left <= right) {
                int mid = (right - left) / 2 + left;

                if (matrix[i][mid] < target) {
                    left = mid + 1;
                }
                else if (matrix[i][mid] > target) {
                    right = mid - 1;
                }
                else {
                    return true;
                }
            }
        }

        return false;
    }
    public boolean searchMatrix1(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] < target && matrix[i][n - 1] > target) {
                rows.add(i);
            }
            else if (matrix[i][0] == target || matrix[i][n - 1] == target) {
                return true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (matrix[0][i] < target && matrix[m - 1][i] > target) {
                columns.add(i);
            }
            else if (matrix[0][i] == target || matrix[m - 1][i] == target) {
                return true;
            }
        }

        for (int row : rows) {
            for (int column : columns) {
                if (matrix[row][column]  == target)
                    return true;
            }
        }
        return false;
    }
}
