package org.example;

import org.example.leetcode.pagetwo.JumpGame;
import org.example.leetcode.pagetwo.MaximumSubarray;
import org.example.leetcode.pagetwo.Pow;
import org.example.leetcode.pagetwo.SpiralMatrix;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PageTwoTest {
    @Test
    public void powTest() {
        Pow pow = new Pow();
        System.out.println(pow.myPow(2.00000, 11));
        System.out.println(pow.myPow(2.10000, 3));
        System.out.println(pow.myPow(2.00000, -2));
    }

    @Test
    public void maximumSubarrayTest() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximumSubarray.maxSubArray(nums));

        nums = new int[] {-2, -1};
        System.out.println(maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void spiralMatrixTest() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> results = spiralMatrix.spiralOrder(matrix);
        System.out.println(Arrays.toString(results.toArray()));

    }

    @Test
    public void jumpGameTest() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jumpGame.canJump(nums));
        nums = new int[] {3, 2, 1, 0, 4};
        System.out.println(jumpGame.canJump(nums));
    }
}
