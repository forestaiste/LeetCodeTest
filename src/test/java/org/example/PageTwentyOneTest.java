package org.example;

import org.example.leetcode.pagefour.EvaluateReversePolishNotation150;
import org.example.leetcode.pagetwentyone.RemoveAllAdjacentDuplicatesInString1047;
import org.junit.Test;

public class PageTwentyOneTest {
    @Test
    public void removeAllAdjacentDuplicatesInString1047Test() {
        RemoveAllAdjacentDuplicatesInString1047 removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString1047();
        System.out.println(removeAllAdjacentDuplicatesInString.removeDuplicates("abbaca"));
    }

    @Test
    public void evaluateReversePolishNotation150Test() {
        EvaluateReversePolishNotation150 evaluateReversePolishNotation = new EvaluateReversePolishNotation150();

        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evaluateReversePolishNotation.evalRPN(tokens));

        tokens = new String[]{"4", "13", "5", "/", "+"};
        System.out.println(evaluateReversePolishNotation.evalRPN(tokens));

        tokens = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evaluateReversePolishNotation.evalRPN(tokens));

    }
}
