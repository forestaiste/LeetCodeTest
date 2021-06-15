package org.example;

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
    public void MissingNumber268Test() {
        MissingNumber268 missingNumber = new MissingNumber268();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber.missingNumber(nums));
    }

    @Test
    public void HIndex274Test() {
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
    public void HIndexII275Test() {
        HIndexII275 hIndexII = new HIndexII275();
        int[] citations = {0,1,4,5,6};
        System.out.println(hIndexII.hIndex(citations));
    }
}
