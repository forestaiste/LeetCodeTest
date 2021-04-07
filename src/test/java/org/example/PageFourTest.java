package org.example;

import org.example.leetcode.pagefour.HouseRobber198;
import org.example.leetcode.pagefour.ReverseWordsInAString151;
import org.junit.Test;

public class PageFourTest {
    @Test
    public void reverseWordsInAStringTest() {
        ReverseWordsInAString151 reverseWordsInAString = new ReverseWordsInAString151();

        //System.out.println(reverseWordsInAString.reverseWords("  hello world!  "));

        System.out.println(reverseWordsInAString.reverseWords("  Bob    Loves  Alice   "));
    }

    @Test
    public void houseRobber198Test() {
        HouseRobber198 houseRobber = new HouseRobber198();
        int[] nums = {2, 7, 9, 3, 1, 5, 7, 8};
        System.out.println(houseRobber.rob(nums));
    }
}
