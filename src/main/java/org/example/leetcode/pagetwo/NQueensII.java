package org.example.leetcode.pagetwo;

import java.util.ArrayList;
import java.util.List;

public class NQueensII {
    int count = 0;
    public int totalNQueens(int n) {
        List<List<String>> results = new ArrayList<List<String>>();
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            positions[i] = -1;
        }

        backTrack(results, n, 0, positions);

        return count;
    }

    private void backTrack(List<List<String>> results, int n, int row, int[] positions) {
        if (row == n) {
            count++;
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
