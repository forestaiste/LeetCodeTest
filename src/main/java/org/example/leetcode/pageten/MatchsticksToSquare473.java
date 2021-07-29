package org.example.leetcode.pageten;

//473. 火柴拼正方形
//        还记得童话《卖火柴的小女孩》吗？现在，你知道小女孩有多少根火柴，请找出一种能使用所有火柴拼成一个正方形的方法。不能折断火柴，可以把火柴连接起来，并且每根火柴都要用到。
//
//        输入为小女孩拥有火柴的数目，每根火柴用其长度表示。输出即为是否能用所有的火柴拼成正方形。
//
//        示例 1:
//
//        输入: [1,1,2,2,2]
//        输出: true
//
//        解释: 能拼成一个边长为2的正方形，每边两根火柴。
//        示例 2:
//
//        输入: [3,3,3,3,4]
//        输出: false
//
//        解释: 不能用所有火柴拼成一个正方形。

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MatchsticksToSquare473 {
    List<Integer> nums;
    int side;
    int[] sums;

    public boolean makesquare0(int[] matchsticks) {


        int sum = Arrays.stream(matchsticks).sum();

        if (sum % 4 != 0)
            return false;
        sums = new int[4];
        side = sum / 4;
        Arrays.sort(matchsticks);
        nums = Arrays.stream(matchsticks).boxed().collect(Collectors.toList());

        return dfs(0);
    }

    private boolean dfs(int index) {
        if (index == nums.size()) {
            return sums[0] == sums[1] && sums[1] == sums[2] && sums[2] == sums[3];
        }

        int element = nums.get(index);

        for (int i = 0; i < 4; i++) {
            if (sums[i] + element <= side) {
                sums[i] += element;
                if (dfs(index + 1)) {
                    return true;
                }

                this.sums[i] -= element;
            }
         }

        return false;
    }

    public boolean makesquare(int[] matchsticks) {
        int sum = Arrays.stream(matchsticks).sum();

        if (sum % 4 != 0)
            return false;

        sums = new int[4];
        side = sum / 4;
        Arrays.sort(matchsticks);

        int length = matchsticks.length;
        boolean[] occupied = new boolean[side];

        for (int i = 0; i < side; i++) {
            occupied[i] = false;
        }

        int[] f = new int[side + 1];
        for (int i = 0; i < 4; i++) {
            Arrays.fill(f, 0);
            for (int j = 0; j < length; j++) {
                for (int k = side; k >= matchsticks[j]; k--) {
                    if (!occupied[j] && f[j] < side) {
                        f[k] = f[k - matchsticks[j]] + matchsticks[j];
                        sums[i] = f[k];
                    }

                }


            }

            if (sums[i] == side)
                break;
            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] matchsticks = {1,1,1,1,2,2,2,2,3,3,3,3};

        MatchsticksToSquare473 matchsticksToSquare = new MatchsticksToSquare473();

        System.out.println(matchsticksToSquare.makesquare(matchsticks));
    }
}
