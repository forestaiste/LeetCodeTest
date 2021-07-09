package org.example.leetcode.pageeight;

//386. 字典序排数
//        给定一个整数 n, 返回从 1 到 n 的字典顺序。
//
//        例如，
//
//        给定 n =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。
//
//        请尽可能的优化算法的时间复杂度和空间复杂度。 输入的数据 n 小于等于 5,000,000。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexicographicalNumbers386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> results = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            if (i > n)
                break;

            results.add(i);
            addNumber(results, i, n);
        }

        return results;
    }

    private void addNumber(List<Integer> results, int number, int n) {
        number *= 10;

        if (number > n)
            return;

        for (int i = 0; i <= 9; i++) {
            int m = number + i;
            if (m > n)
                break;

            results.add(m);
            addNumber(results, m, n);
        }
    }

    public static void main(String[] args) {
        LexicographicalNumbers386 lexicographicalNumbers = new LexicographicalNumbers386();
        List<Integer> results = lexicographicalNumbers.lexicalOrder(133);
        System.out.println(Arrays.toString(results.toArray()));
    }
}
