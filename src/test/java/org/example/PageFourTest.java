package org.example;

import org.example.leetcode.pagefour.*;
import org.example.models.ListNode;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PageFourTest {
    @Test
    public void reverseWordsInAStringTest() {
        ReverseWordsInAString151 reverseWordsInAString = new ReverseWordsInAString151();

        //System.out.println(reverseWordsInAString.reverseWords("  hello world!  "));

        System.out.println(reverseWordsInAString.reverseWords("  Bob    Loves  Alice   "));
    }

    @Test
    public void houseRobber198Test() {
        HouseRobber198 houseRobber = new HouseRobber198();
        int[] nums = {2, 7, 9, 3, 1, 5, 7, 8};
        System.out.println(houseRobber.rob(nums));
    }

    @Test
    public void bestTimeToBuyAndSellStockIV188Test() {
        BestTimeToBuyAndSellStockIV188 bestTimeToBuyAndSellStockIV = new BestTimeToBuyAndSellStockIV188();
        int[] prices = {3, 3, 5, 1, 0, 3, 4, 5, 2, 8};
        System.out.println(bestTimeToBuyAndSellStockIV.maxProfit(3, prices));
    }

    @Test
    public void binaryTreeRightSideView199Test() {
        TreeNode leftLeaf = new TreeNode(4);
        TreeNode right = new TreeNode(3, leftLeaf, null);

        TreeNode left = new TreeNode(2);

        TreeNode root = new TreeNode(1, left, right);

        BinaryTreeRightSideView199 binaryTreeRightSideView = new BinaryTreeRightSideView199();

        List<Integer> result = binaryTreeRightSideView.rightSideView(root);

        System.out.println(Arrays.toString(result.toArray()));
    }

    @Test
    public void maximumProductSubarray152Test() {
        MaximumProductSubarray152 maximumProductSubarray = new MaximumProductSubarray152();
        int[] nums = {2,3,-2,4, -5};

        System.out.println(maximumProductSubarray.maxProduct(nums));
    }

    @Test
    public void findMinimumInRotatedSortedArray153Test() {
        FindMinimumInRotatedSortedArray153 findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray153();
        int[] nums = {4,5,6,7,8, 9, 10, -5, -4, -3, -2, - 1, 0,1,2,3};
//        System.out.println(findMinimumInRotatedSortedArray.findMin(nums));
        nums = new int[]{3,4,5,1,2};
//        System.out.println(findMinimumInRotatedSortedArray.findMin(nums));
        nums = new int[]{11,13,15,17};

        System.out.println(findMinimumInRotatedSortedArray.findMin(nums));
    }

    @Test
    public void intersectionOfTwoLinkedLists160Test() {
        ListNode four = new ListNode(4);
        ListNode two = new ListNode(2, four);
        ListNode one = new ListNode(1, two);
        ListNode nine = new ListNode(9, one);
        ListNode zero = new ListNode(0, nine);

        ListNode three = new ListNode(3, two);


        IntersectionOfTwoLinkedLists160 intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists160();
        ListNode node = intersectionOfTwoLinkedLists.getIntersectionNode(zero, three);
        System.out.println(node.val);
    }

    @Test
    public void findPeakElement162Test() {
        FindPeakElement162 findPeakElement = new FindPeakElement162();
//        int[] nums = {1, 2, 3, 1};
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement.findPeakElement(nums));
    }

    @Test
    public void compareVersionNumbers165Test() {
        CompareVersionNumbers165 compareVersionNumbers = new CompareVersionNumbers165();

        System.out.println(compareVersionNumbers.compareVersion("1.01", "1.001"));
        System.out.println(compareVersionNumbers.compareVersion("1.0", "1.0.0"));
        System.out.println(compareVersionNumbers.compareVersion("0.1", "1.1"));
        System.out.println(compareVersionNumbers.compareVersion("1.0.1", "1"));
        System.out.println(compareVersionNumbers.compareVersion("7.5.2.4", "7.5.3"));
    }
}
