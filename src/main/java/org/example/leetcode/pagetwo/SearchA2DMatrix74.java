package org.example.leetcode.pagetwo;

//74. 搜索二维矩阵
//        编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
//
//        每行中的整数从左到右按升序排列。
//        每行的第一个整数大于前一行的最后一个整数。
//
//
//        示例 1：
//
//
//        输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//        输出：true
//        示例 2：
//
//
//        输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//        输出：false

public class SearchA2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if (target < matrix[0][0] || target > matrix[m - 1][n - 1])
            return false;

        for (int i = 0; i < m; i++) {
            if (target <= matrix[i][n - 1]) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == target)
                        return true;
                }

                return false;
            }
        }

        return false;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if (target < matrix[0][0] || target > matrix[m - 1][n - 1])
            return false;

        int top = 0;
        int bottom = m - 1;
        int horizon = 0;

        while (top <= bottom) {
            horizon = (top + bottom) / 2;
            if (matrix[horizon][n - 1] < target) {
                top = horizon + 1;
            }
            else if (matrix[horizon][0] > target) {
                bottom = horizon - 1;
            }
            else {
                break;
            }
        }

        int left = 0;
        int right = n - 1;


        while (left <= right) {
            int vertical = (left + right) / 2;
            if (matrix[horizon][vertical] < target) {
                left = vertical + 1;
            }
            else if (matrix[horizon][vertical] > target) {
                right = vertical - 1;
            }
            else {
                return true;
            }
        }

        return false;
    }
}
