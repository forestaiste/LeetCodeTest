package org.example;

import org.example.leetcode.pageeighteen.LemonadeChange860;
import org.junit.Test;

public class PageEighteenTest {
    @Test
    public void lemonadeChangeTest() {
        LemonadeChange860 lemonadeChange = new LemonadeChange860();
        int[] bills = {5, 5, 5, 10, 20};
//        System.out.println(lemonadeChange.lemonadeChange(bills));
//
//        bills = new int[]{5,5,10,10,20};
//        System.out.println(lemonadeChange.lemonadeChange(bills));

        bills = new int[]{5,5,5,10,5,5,10,20,20,20};
        System.out.println(lemonadeChange.lemonadeChange(bills));
    }
}
