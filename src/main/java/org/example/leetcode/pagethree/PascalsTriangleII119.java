package org.example.leetcode.pagethree;

//119. 杨辉三角 II
//        给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
//
//
//
//        在杨辉三角中，每个数是它左上方和右上方的数的和。
//
//        示例:
//
//        输入: 3
//        输出: [1,3,3,1]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII119 {
    public List<Integer> getRow1(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        if (rowIndex == 0) {
            result.add(1);
            return result;
        }
        else {
            result.add(1);
            result.add(1);

            for (int i = 2; i < rowIndex + 1; i++) {
                for (int j = 1; j < i; j++) {
                    if (j == 1) {
                        result.add(1, result.get(0) + result.get(1));
                    }
                    else {
                        result.set(j, result.get(j) + result.get(j + 1));
                    }
                }
            }
        }

        return result;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            row.add(0);
            for (int j = i; j > 0; --j) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }


    public static void main(String[] args) {
        PascalsTriangleII119 pascalsTriangleII = new PascalsTriangleII119();
        List<Integer> result = pascalsTriangleII.getRow(4);

        System.out.println(Arrays.toString(result.toArray()));
    }
}
