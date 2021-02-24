package org.example;

import org.example.leetcode.pageseven.ReverseString;
import org.junit.Test;

public class PageSevenTest {
    @Test
    public void reverseStringTest() {
        ReverseString reverseString = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(s);

        char[] s1 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString.reverseString(s1);
    }
}
