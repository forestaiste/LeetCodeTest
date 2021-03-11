package org.example.leetcode.pagetwo;

//51. N 皇后
//        n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
//
//        给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
//
//        每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
//
//        示例 1：
//
//        输入：n = 4
//        输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
//        解释：如上图所示，4 皇后问题存在两个不同的解法。
//        示例 2：
//
//        输入：n = 1
//        输出：[["Q"]]
//
//
//        提示：
//
//        1 <= n <= 9
//        皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            positions[i] = -1;
        }

        backTrack(results, n, 0, positions);

        return results;
    }

    private void backTrack(List<List<String>> results, int n, int row, int[] positions) {
        if (row == n) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuffer string = new StringBuffer();
                for (int j = 0; j < n; j++) {
                    if (positions[i] == j) {
                        string.append("Q");
                    }
                    else {
                        string.append(".");
                    }
                }

                result.add(string.toString());
            }

            results.add(result);
            return;
        }

        for (int i = 0; i < n; i++) {
            positions[row] = i;

            if (InPlace(row, positions)) {
                backTrack(results, n, row + 1, positions);
            }

            positions[row] = -1;
        }
    }

    private boolean InPlace(int row, int[] positions) {
        for (int i = 0; i < row; i++) {
            if ((positions[i] == positions[row])
                || (row - i == Math.abs(positions[row] - positions[i])))
                return false;
        }

        return true;
    }
}
