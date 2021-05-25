package org.example;

import static org.junit.Assert.assertTrue;

import org.example.leetcode.pageone.*;
import org.example.models.ListNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class PageOneTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void letterCombinationTest() {
        LetterCombination17 combination = new LetterCombination17();
        List<String> results = combination.letterCombine("256");
    }

    @Test
    public void twoSumTest() {
        TwoSum1 sum = new TwoSum1();

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
        //String[] words = {"foo", "bar"};
        String[] words = {"word","good","best","word"};
        List<String> wordsCombination = concatenateWords.concatenate(words);
        System.out.println(wordsCombination);
        System.out.println(wordsCombination.size());

        System.out.println("----------------------------------");

        wordsCombination = concatenateWords.concatenateEnhancement(words);
        System.out.println(wordsCombination);
        System.out.println(wordsCombination.size());

        System.out.println("----------------------------------");

        //List<Integer> positions = concatenateWords.findSubstring("barfoothefoobarman", words);
        List<Integer> positions = concatenateWords.findSubstring("wordgoodgoodgoodbestword", words);
        System.out.println(positions);
    }

    @Test
    public void longestPalindromicSubstringTest() {
        LongestPalindromicSubstring5 longestPalindromicSubstring = new LongestPalindromicSubstring5();

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
        RotatedSortedArray33 rotatedSortedArray = new RotatedSortedArray33();
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

    @Test
    public void validSudokuTest() {
        ValidSudoku validSudoku = new ValidSudoku();
        char[][] board =
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'},
                };
        System.out.println(validSudoku.isValidSudoku(board));
    }

    @Test
    public void SudokuSolver1Test() {
        SudokuSolver37 sudokuSolver1 = new SudokuSolver37();

        char[][] board =
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'},
                };

        sudokuSolver1.solveSudoku(board);

        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));
        System.out.println(Arrays.toString(board[3]));
        System.out.println(Arrays.toString(board[4]));
        System.out.println(Arrays.toString(board[5]));
        System.out.println(Arrays.toString(board[6]));
        System.out.println(Arrays.toString(board[7]));
        System.out.println(Arrays.toString(board[8]));
    }

    @Test
    public void sudokuSolver2Test() {
        SudokuSolver2 sudokuSolver2 = new SudokuSolver2();

        char[][] board =
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'},
                };

        sudokuSolver2.solveSudoku(board);

        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));
        System.out.println(Arrays.toString(board[3]));
        System.out.println(Arrays.toString(board[4]));
        System.out.println(Arrays.toString(board[5]));
        System.out.println(Arrays.toString(board[6]));
        System.out.println(Arrays.toString(board[7]));
        System.out.println(Arrays.toString(board[8]));
    }

    @Test
    public void sudokuSolver3Test() {
        SudokuSolver3 sudokuSolver3 = new SudokuSolver3();

        char[][] board =
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'},
                };

        sudokuSolver3.solveSudoku(board);

        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));
        System.out.println(Arrays.toString(board[3]));
        System.out.println(Arrays.toString(board[4]));
        System.out.println(Arrays.toString(board[5]));
        System.out.println(Arrays.toString(board[6]));
        System.out.println(Arrays.toString(board[7]));
        System.out.println(Arrays.toString(board[8]));
    }

    @Test
    public void countAndSayTest() {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(4));
    }

    @Test
    public void threeSumTest() {
        ThreeSum15 threeSum = new ThreeSum15();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> results = threeSum.threeSum(nums);
        results.forEach(r -> System.out.println(Arrays.toString(r.toArray())));
    }

    @Test
    public void combinationSumTest() {
        CombinationSum39 combinationSum = new CombinationSum39();
        int[] nums = {2,3,6,7};
        //int[] nums = {1, 2};
        List<List<Integer>> results = combinationSum.combinationSum(nums, 7);

        results.forEach(r -> System.out.println(Arrays.toString(r.toArray())));
        System.out.println("-----------------------");
        results = combinationSum.combinationSum2(nums, 7);
        results.forEach(r -> System.out.println(Arrays.toString(r.toArray())));
    }

    @Test
    public void combinationSumIITest() {
        CombinationSumII40 combinationSumII = new CombinationSumII40();
        int[] nums = {10,1,2,7,6,1,5};
        List<List<Integer>> results = combinationSumII.combinationSumII(nums, 8);

        results.forEach(r -> System.out.println(Arrays.toString(r.toArray())));
        System.out.println("----------------------------------");
        results = combinationSumII.combinationSumII0(nums, 8);

        results.forEach(r -> System.out.println(Arrays.toString(r.toArray())));
    }

    @Test
    public void swapNodesInPairsTest() {
        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        SwapNodesInPairs24 swapNodesInPairs = new SwapNodesInPairs24();
        ListNode result = swapNodesInPairs.swapPairs1(first);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);
    }

    @Test
    public void reverseNodesInKGroupTest() {
        //ListNode ninth = new ListNode(9, null);
        ListNode eighth = new ListNode(8, null);
        ListNode seventh = new ListNode(7, eighth);
        ListNode sixth = new ListNode(6, seventh);
        ListNode fifth = new ListNode(5, sixth);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();
        ListNode result = reverseNodesInKGroup.reverseKGroupOfMine(first, 3);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);
    }

    @Test
    public void removeDuplicatesFromSortedArrayTest() {
        RemoveDuplicatesFromSortedArray26 removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray26();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int length = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    @Test
    public void removeElementTest() {
        RemoveElement27 removeElement = new RemoveElement27();

        int[] nums = {0,1,2,2,3,0,4,2};

        int length = removeElement.removeElement(nums, 2);

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    @Test
    public void firstMissingPositiveTest() {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();

        int[] nums = {3, 4, -1, 1};

        System.out.println(firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void searchInsertPositionTest() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1, 3, 5, 6, 10, 14, 19, 26};

        System.out.println(searchInsertPosition.searchInsert(nums, 5));

        System.out.println(searchInsertPosition.searchInsert(nums, 4));

        System.out.println(searchInsertPosition.searchInsert(nums, 27));

        System.out.println(searchInsertPosition.searchInsert(nums, 0));
    }

    @Test
    public void trappingRainWaterTest() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater.trap(nums));

        System.out.println(trappingRainWater.trap2(nums));

        System.out.println(trappingRainWater.trap3(nums));
    }

    @Test
    public void permutationsTest() {
        Permutations46 permutations = new Permutations46();

        int[] nums = {1, 2, 3};

        List<List<Integer>> results = permutations.permute(nums);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }

        System.out.println("------------------------------");

        results = permutations.permute2(nums);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }

        System.out.println("------------------------------");

        results = permutations.permute3(nums);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void jumpGameIITest() {
        JumpGameII45 jumpGameII = new JumpGameII45();
        int[] nums = {1,2,2,0,4};
//        int[] nums = {1, 2, 3};
        System.out.println(jumpGameII.jump(nums));
    }

    @Test
    public void wildcardMatchingTest() {
        WildcardMatching wildcardMatching = new WildcardMatching();

        System.out.println(wildcardMatching.isMatch("abcabczzzde", "*abc???de*"));
        System.out.println(wildcardMatching.isMatch("aa", "a*"));
        System.out.println(wildcardMatching.isMatch("aa", "a"));
        System.out.println(wildcardMatching.isMatch("aa", "*"));
        System.out.println(wildcardMatching.isMatch("cb", "?a"));
        System.out.println(wildcardMatching.isMatch("acdcb", "*a*b"));
        System.out.println(wildcardMatching.isMatch("acdcb", "a*c?b"));
    }

    @Test
    public void groupAnagramsTest() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> results = groupAnagrams.groupAnagrams(strs);
        for (List<String> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void rotateImageTest() {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {{5, 1, 9,11},
                          {2, 4, 8,10},
                          {13, 3, 6, 7},
                          {15,14,12,16}};
        rotateImage.rotate(matrix);

        for (int[] result : matrix) {
            System.out.println(Arrays.toString(result));
        }
    }

    @Test
    public void permutationsIITest() {
        PermutationsII47 permutationsII = new PermutationsII47();

        int[] nums = {1, 2, 3};
        List<List<Integer>> results = permutationsII.permuteUnique(nums);
        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }

        System.out.println("------------------------------------");

        nums = new int[] {3,3,0,3};
        results = permutationsII.permuteUnique(nums);
        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void removeNthNodeFromEndOfList() {
        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        RemoveNthNodeFromEndOfList19 removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList19();
        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(first, 2);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);

        System.out.println("---------------------------");

        ListNode firstI = new ListNode(1, null);

        result = removeNthNodeFromEndOfList.removeNthFromEnd(firstI, 1);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("---------------------------");

        ListNode secondII = new ListNode(2, null);
        ListNode firstII = new ListNode(1, secondII);

        result = removeNthNodeFromEndOfList.removeNthFromEnd(firstII, 1);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("---------------------------");

    }

    @Test
    public void longestValidParenthesesTest() {
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        String s = "()))((())";
        System.out.println(longestValidParentheses.longestValidParentheses(s));
    }

    @Test
    public void fourSumTest() {
        FourSum18 sum = new FourSum18();
//        int[] nums = {1, 0, -1, 0, -2, 2};
//        int[] nums = {0, 0, 0, 0};
        int[] nums = {-2, -1, -1, 1, 1, 2, 2};
        List<List<Integer>> results = sum.fourSum(nums, 0);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void strStrTest() {
        ImplementstrStr28 implementstrStr = new ImplementstrStr28();
        String haystack = "hello";
        String needle = "ll";

        System.out.println(implementstrStr.strStr(haystack, needle));

        haystack = "";
        needle = "";

        System.out.println(implementstrStr.strStr(haystack, needle));
        haystack = "aabaabaac";
        needle = "aabaac";

        System.out.println(implementstrStr.strStr(haystack, needle));
    }

    @Test
    public void validParentheses20Test() {
        ValidParentheses20 validParentheses20 = new ValidParentheses20();


        System.out.println(validParentheses20.isValid("]"));
        System.out.println(validParentheses20.isValid("()[]{}"));
        System.out.println(validParentheses20.isValid("([)]"));
        System.out.println(validParentheses20.isValid("{[]}"));
        System.out.println(validParentheses20.isValid("(]"));
    }
}
