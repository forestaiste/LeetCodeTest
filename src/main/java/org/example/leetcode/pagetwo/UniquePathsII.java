package org.example.leetcode.pagetwo;

public class UniquePathsII {
    int count = 0;
    int[] directionX = new int[2];
    int[] directionY = new int[2];

    public int uniquePathsWithObstacles0(int[][] obstacleGrid) {

        directionX[0] = 1;
        directionX[1] = 0;

        directionY[0] = 0;
        directionY[1] = 1;

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

         if (obstacleGrid[0][0] == 1)
            return 0;

        backTrack(0, 0, m, n, obstacleGrid);

        return count;

    }

    private void backTrack(int x, int y, int m, int n, int[][] obstacleGrid) {

        if (x == n - 1 && y == m - 1 && obstacleGrid[y][x] != 1) {
            count++;
            return;
        }

        for (int i = 0; i < 2; i++) {

            x += directionX[i];
            y += directionY[i];

            if ((x < n) && (y < m) && obstacleGrid[y][x] != 1)
                backTrack(x, y, m, n, obstacleGrid);

            x -= directionX[i];
            y -= directionY[i];
        }
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] f = new int[m][n];
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; ++i) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n && obstacleGrid[0][j] == 0; ++j) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (obstacleGrid[i][j] == 1) continue;
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }
}
