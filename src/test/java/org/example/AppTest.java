package org.example;

import static org.junit.Assert.assertTrue;

import org.example.leetcode.*;
import org.example.models.ListNode;
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
        SudokuSolver1 sudokuSolver1 = new SudokuSolver1();

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
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> results = threeSum.threeSum(nums);
        results.forEach(r -> System.out.println(Arrays.toString(r.toArray())));
    }

    @Test
    public void combinationSumTest() {
        CombinationSum combinationSum = new CombinationSum();
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
        CombinationSumII combinationSumII = new CombinationSumII();
        int[] nums = {10,1,2,7,6,1,5};
        List<List<Integer>> results = combinationSumII.combinationSumII(nums, 8);

        results.forEach(r -> System.out.println(Arrays.toString(r.toArray())));
    }

    @Test
    public void swapNodesInPairsTest() {
        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        ListNode result = swapNodesInPairs.swapPairs(first);

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
        ListNode result = reverseNodesInKGroup.reverseKGroup(first, 3);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);
    }

    @Test
    public void removeDuplicatesFromSortedArrayTest() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int length = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    @Test
    public void removeElementTest() {
        RemoveElement removeElement = new RemoveElement();

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

        int[] nums = {1,3,5,6};

        System.out.println(searchInsertPosition.searchInsert(nums, 0));
    }
}
