package org.example;

import org.example.leetcode.pageeight.CombinationSumIV377;
import org.example.leetcode.pageeight.IsSubsequence392;
import org.example.leetcode.pageeight.RansomNote383;
import org.example.leetcode.pageeight.WiggleSubsequence376;
import org.junit.Test;

public class PageEightTest {
    @Test
    public void ransomNote383Test() {
        RansomNote383 ransomNote = new RansomNote383();
        System.out.println(ransomNote.canConstruct("a", "b"));
        System.out.println(ransomNote.canConstruct("aa", "ab"));
        System.out.println(ransomNote.canConstruct("aa", "aab"));
    }

    @Test
    public void wiggleSubsequence376Test() {
        WiggleSubsequence376 wiggleSubsequence = new WiggleSubsequence376();
//        int[] nums = {3, 3, 3,2,5};
//        int[] nums = {1,2,3,4,5,6,7,8,9};
        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(wiggleSubsequence.wiggleMaxLength(nums));
    }

    @Test
    public void combinationSumIV377Test() {
        CombinationSumIV377 combinationSumIV = new CombinationSumIV377();

        int[] nums = {1, 2, 3};
        System.out.println(combinationSumIV.combinationSum4(nums, 4));
    }

    @Test
    public void isSubsequence392Test() {
        IsSubsequence392 isSubsequence = new IsSubsequence392();

        System.out.println(isSubsequence.isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequence("axc", "ahbgdc"));
    }
}
