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
        LengthOfLastWord58 lengthOfLastWord = new LengthOfLastWord58();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord(" "));
        System.out.println(lengthOfLastWord.lengthOfLastWord("World "));
    }

    @Test
    public void spiralMatrixIITest() {
        SpiralMatrixII59 spiralMatrixII59 = new SpiralMatrixII59();

        int[][] results = spiralMatrixII59.generateMatrix(3);

        for (int[] result : results) {
            System.out.println(Arrays.toString(result));
        }

        System.out.println("-------------------");

        results = spiralMatrixII59.generateMatrix(4);
        for (int[] result : results) {
            System.out.println(Arrays.toString(result));
        }

        System.out.println("-------------------");

        results = spiralMatrixII59.generateMatrix(5);
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

        RotateList61 rotateList = new RotateList61();
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
        MinimumPathSum64 minimumPathSum = new MinimumPathSum64();

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
    public void validateBinarySearchTree98Test() {

        TreeNode rightLeftLeaf1 = new TreeNode(3);
        TreeNode rightRightLeaf1 = new TreeNode(7);
        TreeNode right1 = new TreeNode(6, rightLeftLeaf1, rightRightLeaf1);
        TreeNode left1 = new TreeNode(4);

        TreeNode root1 = new TreeNode(5, left1, right1);

        ValidateBinarySearchTree98 validateBinarySearchTree = new ValidateBinarySearchTree98();
        System.out.println(validateBinarySearchTree.isValidBST(root1));
        System.out.println(validateBinarySearchTree.isValidBST1(root1));
    }

    @Test
    public void textJustification68Test() {
        String[] words = {"The","important","thing","is","not","to","stop","questioning.","Curiosity","has","its","own","reason","for","existing."};
        TextJustification68 textJustification = new TextJustification68();
        List<String> result = textJustification.fullJustify(words, 17);
        result.forEach(System.out::println);

        String[] words1 = {"What","must","be","acknowledgment","shall","be"};
        List<String> result1 = textJustification.fullJustify(words1, 16);
        result1.forEach(System.out::println);

        String[] words2 = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        List<String> result2 = textJustification.fullJustify(words2, 20);
        result2.forEach(System.out::println);
    }

    @Test
    public void simplifyPath71() {
        SimplifyPath71 simplifyPath = new SimplifyPath71();
        System.out.println(simplifyPath.simplifyPath("/a//b////c/d//././/.."));
        System.out.println(simplifyPath.simplifyPath("/../"));
        System.out.println(simplifyPath.simplifyPath("/home//foo/"));
        System.out.println(simplifyPath.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void setMatrixZeroes73() {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        SetMatrixZeroes73 setMatrixZeroes = new SetMatrixZeroes73();
        setMatrixZeroes.setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        int[][] matrix1 = {{1,1,2,4},{0,4,5,2},{1,3,1,5}};
        setMatrixZeroes.setZeroes1(matrix1);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
    }

    @Test
    public void searchA2DMatrix74Test() {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20},{23,30,34,60}};
        SearchA2DMatrix74 searchA2DMatrix = new SearchA2DMatrix74();

        System.out.println(searchA2DMatrix.searchMatrix1(matrix, 13));

        int[][] matrix1 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchA2DMatrix.searchMatrix1(matrix1, 3));


        int[][] matrix2 = {{1}};
        System.out.println(searchA2DMatrix.searchMatrix1(matrix2, 1));
    }

    @Test
    public void wordSearch79Test() {
        WordSearch79 wordSearch = new WordSearch79();

        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(wordSearch.exist(board, "ABCCED"));
    }

    @Test
    public void sortColors75Test() {
        SortColors75 sortColors = new SortColors75();

        int[] nums = {1, 2, 0};
        sortColors.sortColors1(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {2, 1, 2};
        sortColors.sortColors1(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void removeDuplicatesFromSortedArrayII80Test() {
        RemoveDuplicatesFromSortedArrayII80 removeDuplicatesFromSortedArrayII = new RemoveDuplicatesFromSortedArrayII80();

        int[] nums = {1,1,1, 2, 2, 3};
        int count = removeDuplicatesFromSortedArrayII.removeDuplicates1(nums);

        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(nums[i]);
        }

        int[] nums2 = {1,1,1, 2};
        int count2 = removeDuplicatesFromSortedArrayII.removeDuplicates1(nums2);

        System.out.println(count2);
        for (int i = 0; i < count2; i++) {
            System.out.println(nums2[i]);
        }

        int[] nums1 = {0,0,1,1,1,1,2,3,3, 3, 3};
        int count1 = removeDuplicatesFromSortedArrayII.removeDuplicates1(nums1);

        System.out.println(count1);
        for (int i = 0; i < count1; i++) {
            System.out.println(nums1[i]);
        }
    }

    @Test
    public void searchInRotatedSortedArrayII81Test() {
        SearchInRotatedSortedArrayII81 searchInRotatedSortedArrayII = new SearchInRotatedSortedArrayII81();
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(searchInRotatedSortedArrayII.search(nums, 2));
        System.out.println(searchInRotatedSortedArrayII.search(nums, 3));
    }

    @Test
    public void removeDuplicatesFromSortedListII82() {
        ListNode third11 = new ListNode(3);
        third11.next = null;
        ListNode second11 = new ListNode(2);
        second11.next = third11;
        ListNode first13 = new ListNode(1);
        first13.next = second11;
        ListNode first12 = new ListNode(1);
        first12.next = null;
        ListNode first11 = new ListNode(1);
        first11.next = first12;


        RemoveDuplicatesFromSortedListII82 removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII82();
        //removeDuplicatesFromSortedListII.deleteDuplicates(first11);
        ListNode fifth21 = new ListNode(5);
        fifth21.next = null;
        ListNode fourth22 = new ListNode(4);
        fourth22.next = fifth21;
        ListNode fourth21 = new ListNode(4);
        fourth21.next = fourth22;
        ListNode third22 = new ListNode(3);
        third22.next = fourth21;
        ListNode third21 = new ListNode(3);
        third21.next = third22;
        ListNode second21 = new ListNode(2);
        second21.next = third21;
        ListNode first21 = new ListNode(1);
        first21.next = second21;

        removeDuplicatesFromSortedListII.deleteDuplicates(first21);
    }

    @Test
    public void removeDuplicatesFromSortedList83Test() {
        ListNode third2 = new ListNode(3);
        third2.next = null;
        ListNode third1 = new ListNode(3);
        third1.next = third2;
        ListNode second = new ListNode(2);
        second.next = third1;
        ListNode first2 = new ListNode(1);
        first2.next = second;
        ListNode first1 = new ListNode(1);
        first1.next = first2;
        RemoveDuplicatesFromSortedList83 removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList83();
        removeDuplicatesFromSortedList.deleteDuplicates(first1);
    }

    @Test
    public void partitionList86Test() {
        PartitionList86 partitionList = new PartitionList86();
//        ListNode two2 = new ListNode(2);
//        ListNode five = new ListNode(5, two2);
//        ListNode two1 = new ListNode(2, five);
//        ListNode three = new ListNode(3, two1);
//        ListNode four = new ListNode(4, three);
//        ListNode one = new ListNode(1, four);
//
//        ListNode node = partitionList.partition(one, 3);

//        ListNode one = new ListNode(1);
//        ListNode two = new ListNode(2, one);
//
//        ListNode node = partitionList.partition(two, 2);

        ListNode two2 = new ListNode(2);
        ListNode five = new ListNode(5, two2);
        ListNode two1 = new ListNode(2, five);
        ListNode zero = new ListNode(0, two1);
        ListNode three = new ListNode(3, zero);
        ListNode four = new ListNode(4, three);
        ListNode one = new ListNode(1, four);
        ListNode node = partitionList.partition(one, 3);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

        node = partitionList.partition1(one, 3);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void mergeSortedArray88Test() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2, 5, 6};
        MergeSortedArray88 mergeSortedArray = new MergeSortedArray88();
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[] {1};
        nums2 = null;

        mergeSortedArray.merge(nums1, 1, nums2, 0);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[] {0};
        nums2 = new int[] {1};

        mergeSortedArray.merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[] {2, 0};
        nums2 = new int[] {1};

        mergeSortedArray.merge(nums1, 1, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void grayCode89Test() {
        GrayCode89 grayCode = new GrayCode89();
        List<Integer> result = grayCode.grayCode(3);
        System.out.println(Arrays.toString(result.toArray()));
    }

    @Test
    public void reverseLinkedListII92Test() {
        ReverseLinkedListII92 reverseLinkedListII = new ReverseLinkedListII92();

        ListNode two1 = new ListNode(5, null);
        ListNode zero = new ListNode(4, two1);
        ListNode three = new ListNode(3, zero);
        ListNode four = new ListNode(2, three);
        ListNode one = new ListNode(1, four);

        ListNode result = reverseLinkedListII.reverseBetween1(one, 2, 4);

    }

    @Test
    public void decodeWays91Test() {
        DecodeWays91 decodeWays = new DecodeWays91();
        System.out.println(decodeWays.numDecodings("0226"));
    }

    @Test
    public void binaryTreeInorderTraversal94Test() {
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, three, null);
        TreeNode one = new TreeNode(1, null, two);

        BinaryTreeInorderTraversal94 binaryTreeInorderTraversal = new BinaryTreeInorderTraversal94();
        System.out.println(Arrays.toString(binaryTreeInorderTraversal.inorderTraversal(one).toArray()));
    }

    @Test
    public void uniqueBinarySearchTreesII95Test() {
        UniqueBinarySearchTreesII95 uniqueBinarySearchTreesII = new UniqueBinarySearchTreesII95();
        List<TreeNode> results = uniqueBinarySearchTreesII.generateTrees(3);
    }

    @Test
    public void interleavingString97Test() {
        InterleavingString97 interleavingString = new InterleavingString97();
//        System.out.println(interleavingString.isInterleave("a", "", "c"));
//        System.out.println(interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcace"));
//        System.out.println(interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
//        System.out.println(interleavingString.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        System.out.println(interleavingString.isInterleave("aabcc", "", "aabcc"));
        System.out.println(interleavingString.isInterleave("", "b", "b"));
    }


}
