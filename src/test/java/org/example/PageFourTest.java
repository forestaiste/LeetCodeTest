package org.example;

import org.example.leetcode.pagefour.BestTimeToBuyAndSellStockIV188;
import org.example.leetcode.pagefour.BinaryTreeRightSideView199;
import org.example.leetcode.pagefour.HouseRobber198;
import org.example.leetcode.pagefour.ReverseWordsInAString151;
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
}
