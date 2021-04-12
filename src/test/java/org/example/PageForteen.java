package org.example;

import org.example.leetcode.pageforteen.LongestContinuousIncreasingSubsequence674;
import org.junit.Test;

public class PageForteen {
    @Test
    public void longestContinuousIncreasingSubsequence674Test() {
        LongestContinuousIncreasingSubsequence674 longestContinuousIncreasingSubsequence = new LongestContinuousIncreasingSubsequence674();
        int[] nums = {1,3,5,4,7};
        System.out.println(longestContinuousIncreasingSubsequence.findLengthOfLCIS(nums));
    }
}
