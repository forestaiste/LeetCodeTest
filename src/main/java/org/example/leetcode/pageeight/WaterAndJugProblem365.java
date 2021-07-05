package org.example.leetcode.pageeight;

//365. 水壶问题
//        有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？
//
//        如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。
//
//        你允许：
//
//        装满任意一个水壶
//        清空任意一个水壶
//        从一个水壶向另外一个水壶倒水，直到装满或者倒空
//        示例 1: (From the famous "Die Hard" example)
//
//        输入: x = 3, y = 5, z = 4
//        输出: True
//        示例 2:
//
//        输入: x = 2, y = 6, z = 5
//        输出: False

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import static java.util.Objects.hash;

public class WaterAndJugProblem365 {
    public boolean canMeasureWater1(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        Deque<int[]> stack = new LinkedList<int[]>();
        stack.push(new int[]{0, 0});
        Set<Long> seen = new HashSet<Long>();
        while (!stack.isEmpty()) {
            if (seen.contains(hash(stack.peek()))) {
                stack.pop();
                continue;
            }
            seen.add(hash(stack.peek()));

            int[] state = stack.pop();
            int remain_x = state[0], remain_y = state[1];
            if (remain_x == targetCapacity || remain_y == targetCapacity || remain_x + remain_y == targetCapacity) {
                return true;
            }
            // 把 X 壶灌满。
            stack.push(new int[]{jug1Capacity, remain_y});
            // 把 Y 壶灌满。
            stack.push(new int[]{remain_x, jug2Capacity});
            // 把 X 壶倒空。
            stack.push(new int[]{0, remain_y});
            // 把 Y 壶倒空。
            stack.push(new int[]{remain_x, 0});
            // 把 X 壶的水灌进 Y 壶，直至灌满或倒空。
            stack.push(new int[]{remain_x - Math.min(remain_x, jug2Capacity - remain_y), remain_y + Math.min(remain_x, jug2Capacity - remain_y)});
            // 把 Y 壶的水灌进 X 壶，直至灌满或倒空。
            stack.push(new int[]{remain_x + Math.min(remain_y, jug1Capacity - remain_x), remain_y - Math.min(remain_y, jug1Capacity - remain_x)});
        }
        return false;
    }

    public long hash(int[] state) {
        return (long) state[0] * 1000001 + state[1];
    }

    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        if (x == 0 || y == 0) {
            return z == 0 || x + y == z;
        }
        return z % gcd(x, y) == 0;
    }

    public int gcd(int x, int y) {
        int remainder = x % y;
        while (remainder != 0) {
            x = y;
            y = remainder;
            remainder = x % y;
        }
        return y;
    }

    public static void main(String[] args) {
        WaterAndJugProblem365 waterAndJugProblem = new WaterAndJugProblem365();

        System.out.println(waterAndJugProblem.canMeasureWater(3, 5, 4));
    }
}
