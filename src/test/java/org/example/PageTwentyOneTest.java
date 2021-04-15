package org.example;

import org.example.leetcode.pagefour.EvaluateReversePolishNotation150;
import org.example.leetcode.pagetwentyone.LastStoneWeightII1049;
import org.example.leetcode.pagetwentyone.MaximizeSumOfArrayAfterKNegations1005;
import org.example.leetcode.pagetwentyone.RemoveAllAdjacentDuplicatesInString1047;
import org.example.leetcode.pagetwentyone.UncrossedLines1035;
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

    @Test
    public void maximizeSumOfArrayAfterKNegations1005() {
        MaximizeSumOfArrayAfterKNegations1005 maximizeSumOfArrayAfterKNegations = new MaximizeSumOfArrayAfterKNegations1005();
        Integer[] A = {2,-3,-1,5,-4};
        int K = 2;
        System.out.println(maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(A, K));

        A = new Integer[]{3,-1,0,2};
        K = 3;
        System.out.println(maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(A, K));

        A = new Integer[]{4,2,3};
        K = 3;
        System.out.println(maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(A, K));
    }

    @Test
    public void lastStoneWeightII1049Test() {
        LastStoneWeightII1049 lastStoneWeightII = new LastStoneWeightII1049();
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeightII.lastStoneWeightII(stones));
        System.out.println(lastStoneWeightII.lastStoneWeightII1(stones));
    }

    @Test
    public void uncrossedLines1035Test() {
        UncrossedLines1035 uncrossedLines = new UncrossedLines1035();
        int[] A = {2,5,1,2,5};
        int[] B = {10,5,2,1,5,2};
        System.out.println(uncrossedLines.maxUncrossedLines(A, B));
    }
}
