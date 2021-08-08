package org.example.leetcode.pageone;

//37. 解数独
//        编写一个程序，通过填充空格来解决数独问题。
//
//        一个数独的解法需遵循如下规则：
//
//        数字 1-9 在每一行只能出现一次。
//        数字 1-9 在每一列只能出现一次。
//        数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
//        空白格用 '.' 表示。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuSolver37 {

    private boolean[][] line = new boolean[9][9];
    private boolean[][] column = new boolean[9][9];
    private boolean[][][] block = new boolean[3][3][9];
    private boolean valid = false;
    private List<int[]> spaces = new ArrayList<int[]>();

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    spaces.add(new int[]{i, j});
                } else {
                    int digit = board[i][j] - '0' - 1;
                    line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = true;
                }
            }
        }

        dfs(board, 0);
    }

    public void dfs(char[][] board, int pos) {
        if (pos == spaces.size()) {
            valid = true;
            return;
        }

        int[] space = spaces.get(pos);
        int i = space[0], j = space[1];
        for (int digit = 0; digit < 9 && !valid; ++digit) {
            if (!line[i][digit] && !column[j][digit] && !block[i / 3][j / 3][digit]) {
                line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = true;
                board[i][j] = (char) (digit + '0' + 1);
                dfs(board, pos + 1);
                line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = false;
            }
        }
    }

//////////////////////////////////////////////////////////
    private int[] line2 = new int[9];
    private int[] column2 = new int[9];
    private int[][] block2 = new int[3][3];
    private boolean valid2 = false;
    private List<int[]> spaces2 = new ArrayList<int[]>();

    public void solveSudoku2(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    spaces2.add(new int[]{i, j});
                } else {
                    int digit = board[i][j] - '0' - 1;
                    flip2(i, j, digit);
                }
            }
        }

        dfs2(board, 0);
    }

    public void dfs2(char[][] board, int pos) {
        if (pos == spaces2.size()) {
            valid2 = true;
            return;
        }

        int[] space = spaces2.get(pos);
        int i = space[0], j = space[1];
        int mask = ~(line2[i] | column2[j] | block2[i / 3][j / 3]) & 0x1ff;
        for (; mask != 0 && !valid2; mask &= (mask - 1)) {
            int digitMask = mask & (-mask);
            int digit = Integer.bitCount(digitMask - 1);
            flip2(i, j, digit);
            board[i][j] = (char) (digit + '0' + 1);
            dfs2(board, pos + 1);
            flip2(i, j, digit);
        }
    }

    public void flip2(int i, int j, int digit) {
        line2[i] ^= (1 << digit);
        column2[j] ^= (1 << digit);
        block2[i / 3][j / 3] ^= (1 << digit);
    }

////////////////////////////////////////////////////////////////////////

    private int[] line3 = new int[9];
    private int[] column3 = new int[9];
    private int[][] block3 = new int[3][3];
    private boolean valid3 = false;
    private List<int[]> spaces3 = new ArrayList<int[]>();

    public void solveSudoku3(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '0' - 1;
                    flip3(i, j, digit);
                }
            }
        }

        while (true) {
            boolean modified = false;
            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 9; ++j) {
                    if (board[i][j] == '.') {
                        int mask = ~(line3[i] | column3[j] | block3[i / 3][j / 3]) & 0x1ff;
                        if ((mask & (mask - 1)) == 0) {
                            int digit = Integer.bitCount(mask - 1);
                            flip3(i, j, digit);
                            board[i][j] = (char) (digit + '0' + 1);
                            modified = true;
                        }
                    }
                }
            }
            if (!modified) {
                break;
            }
        }

        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    spaces3.add(new int[]{i, j});
                }
            }
        }

        dfs3(board, 0);
    }

    public void dfs3(char[][] board, int pos) {
        if (pos == spaces3.size()) {
            valid3 = true;
            return;
        }

        int[] space = spaces3.get(pos);
        int i = space[0], j = space[1];
        int mask = ~(line3[i] | column3[j] | block3[i / 3][j / 3]) & 0x1ff;
        for (; mask != 0 && !valid3; mask &= (mask - 1)) {
            int digitMask = mask & (-mask);
            int digit = Integer.bitCount(digitMask - 1);
            flip3(i, j, digit);
            board[i][j] = (char) (digit + '0' + 1);
            dfs3(board, pos + 1);
            flip3(i, j, digit);
        }
    }

    public void flip3(int i, int j, int digit) {
        line3[i] ^= (1 << digit);
        column3[j] ^= (1 << digit);
        block3[i / 3][j / 3] ^= (1 << digit);
    }

    public static void main(String[] args) {
        SudokuSolver37 sudokuSolver1 = new SudokuSolver37();

        char[][] board =
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'},
                };

        sudokuSolver1.solveSudoku(board);

        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));
        System.out.println(Arrays.toString(board[3]));
        System.out.println(Arrays.toString(board[4]));
        System.out.println(Arrays.toString(board[5]));
        System.out.println(Arrays.toString(board[6]));
        System.out.println(Arrays.toString(board[7]));
        System.out.println(Arrays.toString(board[8]));
    }

}
