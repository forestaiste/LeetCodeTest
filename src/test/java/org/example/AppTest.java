package org.example;

import static org.junit.Assert.assertTrue;

import org.example.leetcode.*;
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
    public void generateParenthesesTest() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> parentheses = generateParentheses.generateParenthesis(3);

        System.out.println(parentheses);
    }

    @Test
    public void concatenateWordsTest() {
        ConcatenateWords concatenateWords = new ConcatenateWords();
        String[] words = {"foo", "bar"};
        List<String> wordsCombination = concatenateWords.concatenate(words);
        System.out.println(wordsCombination);
        System.out.println(wordsCombination.size());

        List<Integer> positions = concatenateWords.findSubstring("barfoothefoobarman", words);
        System.out.println(positions);
    }

    @Test
    public void longestPalindromicSubstringTest() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

        System.out.println(longestPalindromicSubstring.longestPalindrome("babbad"));
    }

    @Test
    public  void nextPermutationTest() {
        NextPermutation nextPermutation = new NextPermutation();
        int[] nums = {4,5,2,6,3,1};
        nextPermutation.nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void longestSubstringWithoutRepeatingCharactersTest() {

        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longest.lengthOfLongestSubstring("abcabcdbb"));
    }

    @Test
    public void zigZagConversion() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        System.out.println(zigZagConversion.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void rotatedSortedArrayTest() {
        RotatedSortedArray rotatedSortedArray = new RotatedSortedArray();
        int[] nums = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        System.out.println(rotatedSortedArray.search(nums, 0));
    }

    @Test
    public void firstLastElementPositionInSortedArrayTest() {
        FirstLastElementPositionInSortedArray firstLastElementPositionInSortedArray = new FirstLastElementPositionInSortedArray();
//        int[] nums = {5,7,7,8,8,10};
        int[] nums = {5,7,7,8,8,8,8,8,8,10};
        System.out.println(Arrays.toString(firstLastElementPositionInSortedArray.searchRange(nums, 8)));
    }

    @Test
    public void containerWithMostWaterTest() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] nums = {1,8,6,2,5,4,8,3,7};

        System.out.println(containerWithMostWater.maxArea(nums));
    }
}
