package org.example;

import org.example.leetcode.pageten.FourSumII454;
import org.example.leetcode.pageten.RepeatedSubstringPattern459;
import org.junit.Test;

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
}
