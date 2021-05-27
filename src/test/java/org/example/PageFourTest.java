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

    @Test
    public void twoSumIIInputArrayIsSorted167() {
        TwoSumIIInputArrayIsSorted167 twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted167();
        int[] numbers = {12,83,104,129,140,184,199,300,306,312,321,325,341,344,349,356,370,405,423,444,446,465,471,491,500,506,508,530,539,543,569,591,606,607,612,614,623,627,645,662,670,685,689,726,731,737,744,747,764,773,778,787,802,805,811,819,829,841,879,905,918,918,929,955,997};
        int[] result = twoSumIIInputArrayIsSorted.twoSum(numbers, 789);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void excelSheetColumnTitle168Test() {
        ExcelSheetColumnTitle168 excelSheetColumnTitle168 = new ExcelSheetColumnTitle168();
        System.out.println(excelSheetColumnTitle168.convertToTitle(52));
        System.out.println(excelSheetColumnTitle168.convertToTitle(701));
        System.out.println(excelSheetColumnTitle168.convertToTitle(28));
    }

    @Test
    public void majorityElement169Test() {
        MajorityElement169 majorityElement = new MajorityElement169();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement.majorityElement0(nums));
    }

    @Test
    public void fractionToRecurringDecimal166Test() {
        FractionToRecurringDecimal166 fractionToRecurringDecimal = new FractionToRecurringDecimal166();
        System.out.println(fractionToRecurringDecimal.fractionToDecimal(4, 333));
    }

    @Test
    public void excelSheetColumnNumber171Test() {
        ExcelSheetColumnNumber171 excelSheetColumnNumber = new ExcelSheetColumnNumber171();
        System.out.println(excelSheetColumnNumber.titleToNumber("ZY"));
    }

    @Test
    public void FactorialTrailingZeroes172Test() {
        FactorialTrailingZeroes172 factorialTrailingZeroes = new FactorialTrailingZeroes172();

        System.out.println(factorialTrailingZeroes.trailingZeroes(625));
        System.out.println(factorialTrailingZeroes.trailingZeroes(10));
        System.out.println(factorialTrailingZeroes.trailingZeroes(20));
        System.out.println(factorialTrailingZeroes.trailingZeroes(30));
    }

    @Test
    public void largestNumber179Test() {
        LargestNumber179 largestNumber = new LargestNumber179();
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber.largestNumber(nums));
    }

    @Test
    public void rotateArray189Test() {
        RotateArray189 rotateArray = new RotateArray189();
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums = {1, 2};

        rotateArray.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void reverseBits190Test() {
        ReverseBits190 reverseBits = new ReverseBits190();
        System.out.println(reverseBits.reverseBits(43261596 ));
    }

    @Test
    public void numberOf1Bits191Test() {
        NumberOf1Bits191 numberOf1Bits = new NumberOf1Bits191();
        System.out.println(numberOf1Bits.hammingWeight(19));
    }
}
