package org.example.leetcode.pagethree;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> result = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    result.add(1);
                }
                else {
                    List<Integer> upper = results.get(i - 1);
                    result.add(upper.get(j - 1) + upper.get(j));
                }
            }

            results.add(result);
        }

        return results;
    }
}
