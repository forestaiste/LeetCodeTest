package org.example;

import org.example.leetcode.pageseven.RangeSumQueryImmutable303;
import org.example.leetcode.pagesix.*;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PageSixTest {
    @Test
    public void perfectSquares279Test() {
        PerfectSquares279 perfectSquares = new PerfectSquares279();
        System.out.println(perfectSquares.numSquares(12));
        System.out.println(perfectSquares.numSquares(13));
    }

    @Test
    public void longestIncreasingSubsequence300Test() {
        LongestIncreasingSubsequence300 longestIncreasingSubsequence = new LongestIncreasingSubsequence300();
        int[] nums = {1,3,6,7,9,4,10,5,6};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{7,7,7,7,7,7,7};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{0,1,0,3,2,3};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));

        nums = new int[]{10,9,2,5,3,7,101,18};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    public void binaryTreePaths257Test() {
//        TreeNode ten = new TreeNode(10);
//        TreeNode eight = new TreeNode(8, null, null);
//        TreeNode nine = new TreeNode(3);
        TreeNode leftLeaf = new TreeNode(4);
        TreeNode rightLeaf = new TreeNode(5);
        TreeNode right = new TreeNode(2, null, rightLeaf);

        TreeNode left = new TreeNode(3);

        TreeNode root = new TreeNode(1, left, right);

        BinaryTreePaths257 binaryTreePaths = new BinaryTreePaths257();
        List<String> result = binaryTreePaths.binaryTreePaths(root);
        result.forEach(System.out::println);

        result = binaryTreePaths.binaryTreePaths1(root);
        result.forEach(System.out::println);

        result = binaryTreePaths.binaryTreePaths2(root);
        result.forEach(System.out::println);
    }

    @Test
    public void moveZeroes283Test() {
        MoveZeroes283 moveZeroes = new MoveZeroes283();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void addDigits258Test() {
        AddDigits258 addDigits258 = new AddDigits258();
        System.out.println(addDigits258.addDigits(38));
    }

    @Test
    public void singleNumberIII260Test() {
        SingleNumberIII260 singleNumberIII260 = new SingleNumberIII260();
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumberIII260.singleNumber(nums)));
    }

    @Test
    public void UglyNumber263Test() {
        UglyNumber263 uglyNumber = new UglyNumber263();
        System.out.println(uglyNumber.isUgly(14));
        System.out.println(uglyNumber.isUgly(6));
        System.out.println(uglyNumber.isUgly(8));
        System.out.println(uglyNumber.isUgly(1));
        System.out.println(uglyNumber.isUgly(15));
        System.out.println(uglyNumber.isUgly(19));
    }

    @Test
    public void uglyNumberII264Test() {
        UglyNumberII264 uglyNumberII264 = new UglyNumberII264();
//        System.out.println(uglyNumberII264.nthUglyNumber(3));
//        System.out.println(uglyNumberII264.nthUglyNumber(4));
//        System.out.println(uglyNumberII264.nthUglyNumber(5));
//        System.out.println(uglyNumberII264.nthUglyNumber(6));
//        System.out.println(uglyNumberII264.nthUglyNumber(7));
//        System.out.println(uglyNumberII264.nthUglyNumber(8));
//        System.out.println(uglyNumberII264.nthUglyNumber(9));
        System.out.println(uglyNumberII264.nthUglyNumber(10));
    }

    @Test
    public void missingNumber268Test() {
        MissingNumber268 missingNumber = new MissingNumber268();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber.missingNumber(nums));
    }

    @Test
    public void hIndex274Test() {
        HIndex274 hIndex = new HIndex274();
        int[] citations = {1,3,2,3,100};
        System.out.println(hIndex.hIndex(citations));

        int[] citations2 = {4,0,6,1,5};
        System.out.println(hIndex.hIndex(citations2));

        int[] citations1 = {1};
        System.out.println(hIndex.hIndex(citations1));
        int[] citations3 = {100};
        System.out.println(hIndex.hIndex(citations3));
    }

    @Test
    public void hIndexII275Test() {
        HIndexII275 hIndexII = new HIndexII275();
        int[] citations = {0,1,4,5,6};
        System.out.println(hIndexII.hIndex(citations));
    }

    @Test
    public void firstBadVersion278Test() {
        FirstBadVersion278 firstBadVersion = new FirstBadVersion278();
        System.out.println(firstBadVersion.firstBadVersion(5));
    }

    @Test
    public void FindTheDuplicateNumber287Test() {
        FindTheDuplicateNumber287 findTheDuplicateNumber = new FindTheDuplicateNumber287();
        int[] nums = {1,4,6,6,6,2,3};

        System.out.println(findTheDuplicateNumber.findDuplicate(nums));
    }

    @Test
    public void gameOfLife289Test() {
        GameOfLife289 gameOfLife = new GameOfLife289();

        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife.gameOfLife(board);
    }

    @Test
    public void wordPattern290Test() {
        WordPattern290 wordPattern = new WordPattern290();
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern.wordPattern("abba", "dog dog dog dog"));
    }

    @Test
    public void nimGame292Test() {
        NimGame292 nimGame = new NimGame292();
        System.out.println(nimGame.canWinNim(4));
    }

    @Test
    public void bullsAndCows299Test() {
        BullsAndCows299 bullsAndCows = new BullsAndCows299();
        System.out.println(bullsAndCows.getHint("1122", "2211"));
        System.out.println(bullsAndCows.getHint("11", "10"));
        System.out.println(bullsAndCows.getHint("1807", "7810"));
        System.out.println(bullsAndCows.getHint("1123", "0111"));
    }

    @Test
    public void rangeSumQueryImmutable303() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable303 rangeSumQueryImmutable = new RangeSumQueryImmutable303(nums);

        System.out.println(rangeSumQueryImmutable.sumRange(2, 5));
    }

    @Test
    public void RangeSumQuery2DImmutable304Test() {

        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}};
        RangeSumQuery2DImmutable304 rangeSumQuery2DImmutable = new RangeSumQuery2DImmutable304(matrix);
        System.out.println(rangeSumQuery2DImmutable.sumRegion(2, 1, 4, 3));
    }
}
