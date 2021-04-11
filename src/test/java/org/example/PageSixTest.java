package org.example;

import org.example.leetcode.pagesix.LongestIncreasingSubsequence300;
import org.example.leetcode.pagesix.PerfectSquares279;
import org.junit.Test;

public class PageSixTest {
    @Test
    public void perfectSquares279Test() {
        PerfectSquares279 perfectSquares = new PerfectSquares279();
        System.out.println(perfectSquares.numSquares(12));
        System.out.println(perfectSquares.numSquares(13));
    }

    @Test
    public void longestIncreasingSubsequence300Test() {
        LongestIncreasingSubsequence300 longestIncreasingSubsequence = new LongestIncreasingSubsequence300();
        int[] nums = {4, 10, 4, 3, 8, 9};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{7,7,7,7,7,7,7};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{0,1,0,3,2,3};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{10,9,2,5,3,7,101,18};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));
    }
}
