package org.example;

import org.example.leetcode.pageten.AssignCookies455;
import org.example.leetcode.pageten.FourSumII454;
import org.example.leetcode.pageten.IncreasingSubsequences491;
import org.example.leetcode.pageten.RepeatedSubstringPattern459;
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
}
