package org.example.leetcode.pagetwo;

//62. 不同路径
//        一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
//
//        机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
//
//        问总共有多少条不同的路径？
//
//
//
//        示例 1：
//
//
//        输入：m = 3, n = 7
//        输出：28
//        示例 2：
//
//        输入：m = 3, n = 2
//        输出：3
//        解释：
//        从左上角开始，总共有 3 条路径可以到达右下角。
//        1. 向右 -> 向下 -> 向下
//        2. 向下 -> 向下 -> 向右
//        3. 向下 -> 向右 -> 向下
//        示例 3：
//
//        输入：m = 7, n = 3
//        输出：28
//        示例 4：
//
//        输入：m = 3, n = 3
//        输出：6

public class UniquePaths {
    int count = 0;
    int[] directionX = new int[2];
    int[] directionY = new int[2];

    public int uniquePaths0(int m, int n) {


        directionX[0] = 1;
        directionX[1] = 0;

        directionY[0] = 0;
        directionY[1] = 1;

        backTrack(0, 0, m, n);

        return count;

    }

    private void backTrack(int x, int y, int m, int n) {

        if (x == n - 1 && y == m - 1) {
            count++;

            return;
        }

        for (int i = 0; i < 2; i++) {

            x += directionX[i];
            y += directionY[i];

            if ((x < n) && (y < m))
                backTrack(x, y, m, n);

            x -= directionX[i];
            y -= directionY[i];
        }
    }

    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; ++j) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }
}
