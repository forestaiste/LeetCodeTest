package org.example;

import org.example.leetcode.pageeight.RansomNote383;
import org.junit.Test;

public class PageEightTest {
    @Test
    public void ransomNote383Test() {
        RansomNote383 ransomNote = new RansomNote383();
        System.out.println(ransomNote.canConstruct("a", "b"));
        System.out.println(ransomNote.canConstruct("aa", "ab"));
        System.out.println(ransomNote.canConstruct("aa", "aab"));
    }
}
