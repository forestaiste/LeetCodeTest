package org.example;

import static org.junit.Assert.assertTrue;

import org.example.leetcode.ConcatenateWords;
import org.example.leetcode.GenerateParentheses;
import org.example.leetcode.LetterCombination;
import org.example.leetcode.TwoSum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void letterCombinationTest() {
        LetterCombination combination = new LetterCombination();
        List<String> results = combination.letterCombine("256");
    }

    @Test
    public void twoSumTest() {
        TwoSum sum = new TwoSum();

        int[] samples = {2, 7, 11, 15};

        int[] results = sum.twoSum(samples, 9);
        System.out.println(Arrays.toString(results));
    }

    @Test
    public void GenerateParenthesesTest() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> parentheses = generateParentheses.generateParenthesis(3);

        System.out.println(parentheses);
    }

    @Test
    public void ConcatenateWordsTest() {
        ConcatenateWords concatenateWords = new ConcatenateWords();
        String[] words = {"foo", "bar"};
        List<String> wordsCombination = concatenateWords.concatenate(words);
        System.out.println(wordsCombination);
        System.out.println(wordsCombination.size());

        List<Integer> positions = concatenateWords.findSubstring("barfoothefoobarman", words);
        System.out.println(positions);
    }

}
