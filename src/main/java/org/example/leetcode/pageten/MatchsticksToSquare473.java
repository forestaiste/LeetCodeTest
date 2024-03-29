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

    public boolean makesquare(int[] nums) {
        int total = 0;
        //统计所有火柴的长度
        for (int num : nums) {
            total += num;
        }
        //如果所有火柴的长度不是4的倍数，直接返回false
        if (total == 0 || (total & 3) != 0)
            return false;
        //回溯
        return backtrack(nums, 0, total >> 2, new int[4]);
    }

    //index表示访问到当前火柴的位置，target表示正方形的边长，size是长度为4的数组，
    //分别保存正方形4个边的长度
    private boolean backtrack(int[] nums, int index, int target, int[] size) {
        if (index == nums.length) {
            //如果火柴都访问完了，并且size的4个边的长度都相等，说明是正方形，直接返回true，
            //否则返回false
            if (size[0] == size[1] && size[1] == size[2] && size[2] == size[3])
                return true;
            return false;
        }
        //到这一步说明火柴还没访问完
        for (int i = 0; i < size.length; i++) {
            //如果把当前火柴放到size[i]这个边上，他的长度大于target，我们直接跳过
            if (size[i] + nums[index] > target)
                continue;
            //如果当前火柴放到size[i]这个边上，长度不大于target，我们就放上面
            size[i] += nums[index];
            //然后在放下一个火柴，如果最终能变成正方形，直接返回true
            if (backtrack(nums, index + 1, target, size))
                return true;
            //如果当前火柴放到size[i]这个边上，最终不能构成正方形，我们就把他从
            //size[i]这个边上给移除，然后在试其他的边
            size[i] -= nums[index];
        }
        //如果不能构成正方形，直接返回false
        return false;
    }


    public static void main(String[] args) {
        int[] matchsticks = {1,2,1,2,2};

        MatchsticksToSquare473 matchsticksToSquare = new MatchsticksToSquare473();

        System.out.println(matchsticksToSquare.makesquare(matchsticks));
    }
}
