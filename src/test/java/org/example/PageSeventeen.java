package org.example;

import org.example.leetcode.pageforteen.LongestContinuousIncreasingSubsequence674;
import org.example.leetcode.pageseventeen.BackspaceStringCompare844;
import org.junit.Test;

public class PageSeventeen {
    @Test
    public void backspaceStringCompare844Test() {
        BackspaceStringCompare844 backspaceStringCompare = new BackspaceStringCompare844();

        System.out.println(backspaceStringCompare.backspaceCompare("ad#c", "ab#c"));
        System.out.println(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceStringCompare.backspaceCompare("a#c", "b"));
    }
}
