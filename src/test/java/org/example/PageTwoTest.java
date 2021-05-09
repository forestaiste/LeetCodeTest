package org.example;

import org.example.leetcode.pagetwo.*;
import org.example.models.ListNode;
import org.example.models.TreeNode;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
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
        MaximumSubarray53 maximumSubarray = new MaximumSubarray53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximumSubarray.maxSubArray2(nums));

        nums = new int[] {-2, -1};
        System.out.println(maximumSubarray.maxSubArray2(nums));
    }

    @Test
    public void spiralMatrixTest() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        SpiralMatrix54 spiralMatrix = new SpiralMatrix54();
        List<Integer> results = spiralMatrix.spiralOrder(matrix);
        System.out.println(Arrays.toString(results.toArray()));

    }

    @Test
    public void jumpGameTest() {
        JumpGame55 jumpGame = new JumpGame55();
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
        MergeIntervals56 mergeIntervals = new MergeIntervals56();

//        int[][] intervals = new int[][] {{1, 9}, {2, 5}, {19, 20}, {10, 11}, {12, 20}, {0, 3}, {0, 1}, {0, 2}};
        int[][] intervals = new int[][] {{1, 4}, {4, 5}};
        intervals = mergeIntervals.merge(intervals);

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    @Test
    public void InsertIntervalTest() {
        InsertInterval57 insertInterval = new InsertInterval57();
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
        NQueens51 queens = new NQueens51();
        List<List<String>> results = queens.solveNQueens(4);

        for (List<String> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void nQueensIITest() {
        NQueensII52 queens = new NQueensII52();
        System.out.println(queens.totalNQueens(4));
    }

    @Test
    public void permutationSequenceTest() {
        PermutationSequence sequence = new PermutationSequence();
        System.out.println(sequence.getPermutation(3, 3));
    }

    @Test
    public  void uniquePathsTest() {
        UniquePaths62 uniquePaths = new UniquePaths62();

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
        UniquePathsII63 uniquePaths = new UniquePathsII63();

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

    @Test
    public void combinationsTest() {
        Combinations77 combinations = new Combinations77();
        List<List<Integer>> results = combinations.combine(4, 2);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void restoreIPAddresses93() {
        RestoreIPAddresses93 restoreIPAddresses = new RestoreIPAddresses93();
        System.out.println(Arrays.toString(restoreIPAddresses.restoreIpAddresses("101023").toArray()));
        System.out.println(Arrays.toString(restoreIPAddresses.restoreIpAddresses("25525511135").toArray()));
        System.out.println(Arrays.toString(restoreIPAddresses.restoreIpAddresses("0000").toArray()));
        System.out.println(Arrays.toString(restoreIPAddresses.restoreIpAddresses("1111").toArray()));
        System.out.println(Arrays.toString(restoreIPAddresses.restoreIpAddresses("010010").toArray()));
    }

    @Test
    public void subsets78Test() {
        Subsets78 subsets = new Subsets78();
        int[] nums = {1, 2, 3};

        System.out.println(Arrays.toString(subsets.subsets(nums).toArray()));
    }

    @Test
    public void subsetsII90Test() {
        SubsetsII90 subsetsII = new SubsetsII90();
        int[] nums = {1, 2, 2};
        System.out.println(Arrays.toString(subsetsII.subsetsWithDup(nums).toArray()));
    }

    @Test
    public void climbingStairs70Test() {
        ClimbingStairs70 climbingStairs = new ClimbingStairs70();
        System.out.println(climbingStairs.climbStairs(5));

        System.out.println(climbingStairs.climbStairs1(5));
    }

    @Test
    public void uniqueBinarySearchTrees96Test() {
        UniqueBinarySearchTrees96 uniqueBinarySearchTrees = new UniqueBinarySearchTrees96();
        System.out.println(uniqueBinarySearchTrees.numTrees(5));
    }

    @Test
    public void editDistance72Test() {
        EditDistance72 editDistance = new EditDistance72();
        System.out.println(editDistance.minDistance("intention", "execution"));
    }

    @Test
    public void sameTree100Test() {
        TreeNode pRight = new TreeNode(20);

        TreeNode pLeft = new TreeNode(9);

        TreeNode p = new TreeNode(3, pLeft, pRight);

        TreeNode qRight = new TreeNode(20);

        TreeNode qLeft = new TreeNode(9);

        TreeNode q = new TreeNode(3, qLeft, qRight);

        SameTree100 sameTree = new SameTree100();

        System.out.println(sameTree.isSameTree1(p, q));
    }

    @Test
    public void ValidateBinarySearchTree98Test() {

        TreeNode rightLeftLeaf1 = new TreeNode(3);
        TreeNode rightRightLeaf1 = new TreeNode(7);
        TreeNode right1 = new TreeNode(6, rightLeftLeaf1, rightRightLeaf1);
        TreeNode left1 = new TreeNode(4);

        TreeNode root1 = new TreeNode(5, left1, right1);

        ValidateBinarySearchTree98 validateBinarySearchTree = new ValidateBinarySearchTree98();
        System.out.println(validateBinarySearchTree.isValidBST(root1));
        System.out.println(validateBinarySearchTree.isValidBST1(root1));
    }
}
