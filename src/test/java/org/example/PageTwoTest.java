package org.example;

import org.example.leetcode.pagetwo.*;
import org.example.models.ListNode;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PageTwoTest {
    @Test
    public void powTest() {
        Pow pow = new Pow();
        System.out.println(pow.myPow(2.00000, 11));
        System.out.println(pow.myPow(2.10000, 3));
        System.out.println(pow.myPow(2.00000, -2));
    }

    @Test
    public void maximumSubarrayTest() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximumSubarray.maxSubArray(nums));

        nums = new int[] {-2, -1};
        System.out.println(maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void spiralMatrixTest() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> results = spiralMatrix.spiralOrder(matrix);
        System.out.println(Arrays.toString(results.toArray()));

    }

    @Test
    public void jumpGameTest() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jumpGame.canJump(nums));
        nums = new int[] {3, 2, 1, 0, 4};
        System.out.println(jumpGame.canJump(nums));
    }

    @Test
    public void lengthOfLastWordTest() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord(" "));
        System.out.println(lengthOfLastWord.lengthOfLastWord("World "));
    }

    @Test
    public void spiralMatrixIITest() {
        SpiralMatrixII spiralMatrixII = new SpiralMatrixII();

        int[][] results = spiralMatrixII.generateMatrix(3);

        for (int[] result : results) {
            System.out.println(Arrays.toString(result));
        }

        System.out.println("-------------------");

        results = spiralMatrixII.generateMatrix(4);
        for (int[] result : results) {
            System.out.println(Arrays.toString(result));
        }

        System.out.println("-------------------");

        results = spiralMatrixII.generateMatrix(5);
        for (int[] result : results) {
            System.out.println(Arrays.toString(result));
        }
    }

    @Test
    public void mergeIntervalsTest() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        int[][] intervals = new int[][] {{1, 9}, {2, 5}, {19, 20}, {10, 11}, {12, 20}, {0, 3}, {0, 1}, {0, 2}};
        intervals = mergeIntervals.merge(intervals);

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    @Test
    public void InsertIntervalTest() {
        InsertInterval insertInterval = new InsertInterval();
        int[][] intervals = new int[][] {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        intervals = insertInterval.insert(intervals, newInterval);

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }

        System.out.println("---------------");

        intervals = new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}};
        newInterval = new int[]{4, 8};

        intervals = insertInterval.insert(intervals, newInterval);

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }

        System.out.println("---------------");
        intervals = new int[][] {};
        newInterval = new int[]{4, 8};

        intervals = insertInterval.insert(intervals, newInterval);

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }

        System.out.println("---------------");
        intervals = new int[][] {{2, 3}};
        newInterval = new int[]{1, 5};

        intervals = insertInterval.insert(intervals, newInterval);

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }

        System.out.println("---------------");
        intervals = new int[][] {{1, 5}};
        newInterval = new int[]{2, 7};

        intervals = insertInterval.insert(intervals, newInterval);

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    @Test
    public void rotateListTest() {
        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        RotateList rotateList = new RotateList();
        ListNode result = rotateList.rotateRight(first, 2);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);

        System.out.println("---------------------------");

        ListNode thirdI = new ListNode(2, null);
        ListNode secondI = new ListNode(1, thirdI);
        ListNode firstI = new ListNode(0, secondI);

        result = rotateList.rotateRight(firstI, 4);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);

        System.out.println("---------------------------");

    }

    @Test
    public void nQueensTest() {
        NQueens queens = new NQueens();
        List<List<String>> results = queens.solveNQueens(4);

        for (List<String> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void nQueensIITest() {
        NQueensII queens = new NQueensII();
        System.out.println(queens.totalNQueens(4));
    }

    @Test
    public void permutationSequenceTest() {
        PermutationSequence sequence = new PermutationSequence();
        System.out.println(sequence.getPermutation(3, 3));
    }

    @Test
    public  void uniquePathsTest() {
        UniquePaths uniquePaths = new UniquePaths();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(System.currentTimeMillis()));
        System.out.println(uniquePaths.uniquePaths(23, 12));
        System.out.println(df.format(System.currentTimeMillis()));
        System.out.println("-----------------------------");
        System.out.println(df.format(System.currentTimeMillis()));
        System.out.println(uniquePaths.uniquePaths0(23, 12));
        System.out.println(df.format(System.currentTimeMillis()));
    }

    @Test
    public  void uniquePathsIITest() {
        UniquePathsII uniquePaths = new UniquePathsII();

        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
//        int[][] obstacleGrid = {{1, 0}};

        System.out.println(uniquePaths.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    public void minimumPathSumTest() {
        MinimumPathSum minimumPathSum = new MinimumPathSum();

        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
//        int[][] obstacleGrid = {{1, 0}};

        System.out.println(minimumPathSum.minPathSum(grid));
    }

    @Test
    public void sqrtX69Test() {
        SqrtX69 sqrtX = new SqrtX69();

        System.out.println(sqrtX.mySqrt(2147395599));
    }

    @Test
    public void plusOne66Test() {
        PlusOne66 plusOne = new PlusOne66();
        int[] digits = {1, 2, 3};
        int[] results = plusOne.plusOne(digits);
        System.out.println(Arrays.toString(results));

        digits = new int[]{9, 9, 9, 9};
        results = plusOne.plusOne(digits);
        System.out.println(Arrays.toString(results));
    }

    @Test
    public void addBinary67Test() {
        AddBinary67 addBinary = new AddBinary67();
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary.addBinary(a, b));

        a = "11";
        b = "1";
        System.out.println(addBinary.addBinary(a, b));
    }
}
