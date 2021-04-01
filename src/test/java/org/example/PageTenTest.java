package org.example;

import org.example.leetcode.pageten.*;
import org.junit.Test;

import java.util.Arrays;

public class PageTenTest {
    @Test
    public void fourSumII454Test() {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        FourSumII454 fourSumII = new FourSumII454();
        System.out.println(fourSumII.fourSumCount(A, B, C, D));
    }

    @Test
    public void repeatedSubstringPattern459Test() {
        RepeatedSubstringPattern459 repeatedSubstringPattern = new RepeatedSubstringPattern459();
        System.out.println(repeatedSubstringPattern.repeatedSubstringPattern0("asdfasdfasdf"));
        System.out.println(repeatedSubstringPattern.repeatedSubstringPattern("asdfasdfasdf"));
    }

    @Test
    public void increasingSubsequences491Test() {
        IncreasingSubsequences491 increasingSubsequences = new IncreasingSubsequences491();
        int[] nums = {4, 6, 7, 7};
        System.out.println(Arrays.toString(increasingSubsequences.findSubsequences(nums).toArray()));

        int[] nums1 = new int[]{1,2,3,4,5,6,7,8,9,10,1,1,1,1,1};
        System.out.println(Arrays.toString(increasingSubsequences.findSubsequences1(nums1).toArray()));
    }

    @Test
    public void assignCookies455Test() {
        AssignCookies455 assignCookies = new AssignCookies455();
        int[] g = {1, 2, 3};
        int[] s = {3};
        System.out.println(assignCookies.findContentChildren(g, s));

        g = new int[] {1, 2};
        s = new int[] {1, 2, 3};
        System.out.println(assignCookies.findContentChildren(g, s));
    }

    @Test
    public void minimumNumberOfArrowsToBurstBalloonsTest() {
        MinimumNumberOfArrowsToBurstBalloons452 minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons452();
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{1,2},{2,3},{3,4},{4,5}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{1,2},{3,4},{5,6},{7,8}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{-1,1},{0, 1},{2,3},{1,2}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{1,2}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{2,3}, {2, 3}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{-2147483646,-2147483645}, {2147483646, 2147483647}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));
    }

    @Test
    public void targetSum494Test() {
        TargetSum494 targetSum = new TargetSum494();
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(targetSum.findTargetSumWays(nums, 3));

        System.out.println(targetSum.findTargetSumWays1(nums, 3));
    }

    @Test
    public void onesaAndZeroes474Test() {
        OnesAndZeroes474 onesaAndZeroes = new OnesAndZeroes474();
        String[] strs = {"10", "0001", "111001", "1", "0"};

        System.out.println(onesaAndZeroes.findMaxForm(strs, 5, 3));

        strs = new String[] {"10", "0", "1"};

        System.out.println(onesaAndZeroes.findMaxForm(strs, 1, 1));
    }
}
