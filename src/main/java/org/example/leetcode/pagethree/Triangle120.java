package org.example.leetcode.pagethree;

//120. 三角形最小路径和
//        给定一个三角形 triangle ，找出自顶向下的最小路径和。
//
//        每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
//
//
//
//        示例 1：
//
//        输入：triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
//        输出：11
//        解释：如下面简图所示：
//        2
//        3 4
//        6 5 7
//        4 1 8 3
//        自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
//        示例 2：
//
//        输入：triangle = [[-10]]
//        输出：-10

import java.util.List;

public class Triangle120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int length = triangle.size();

        int[][] f = new int[length][length];

        f[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < length; i++) {
            f[i][0] = f[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j <= i; j++) {
                f[i][j] = f[i - 1][j -1] + triangle.get(i).get(j);
                if (j < triangle.get(i - 1).size())
                    f[i][j] = Math.min(f[i][j], f[i - 1][j] + triangle.get(i).get(j));
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (min > f[length -1][i])
                min = f[length - 1][i];
        }

        return min;
    }
}
