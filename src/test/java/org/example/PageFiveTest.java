package org.example;

import org.example.leetcode.pagefive.*;
import org.example.models.ListNode;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PageFiveTest {
    @Test
    public void reverseLinkedListTest() {
        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        ReverseLinkedList206 reverseLinkedList = new ReverseLinkedList206();
        ListNode result = reverseLinkedList.reverseList(first);
        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);
    }

    @Test
    public void minimumSizSubarraySumTest() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        MinimumSizeSubarraySum209 sum = new MinimumSizeSubarraySum209();
        System.out.println(sum.minSubArrayLen(7, nums));

        System.out.println("-----------------------------");

        nums = new int[]{1, 4, 4};
        System.out.println(sum.minSubArrayLen(4, nums));

        System.out.println("-----------------------------");
        nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(sum.minSubArrayLen(11, nums));

        System.out.println("-----------------------------");
    }

    @Test
    public void removeLinkedListElements203Test() {
        ListNode seventh = new ListNode(6, null);
        ListNode sixth = new ListNode(5, seventh);
        ListNode fifth = new ListNode(4, sixth);
        ListNode fourth = new ListNode(3, fifth);
        ListNode third = new ListNode(6, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        RemoveLinkedListElements203 removeLinkedListElements203 = new RemoveLinkedListElements203();
        ListNode result = removeLinkedListElements203.removeElements(first, 6);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);

        System.out.println("----------------------------------------");

        ListNode second1 = new ListNode(1, null);
        ListNode first1 = new ListNode(1, second1);

        result = removeLinkedListElements203.removeElements(first1, 1);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void validAnagram242Test() {
        ValidAnagram242 validAnagram = new ValidAnagram242();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
        System.out.println(validAnagram.isAnagram("rat", "car"));
    }

    @Test
    public void happyNumber202Test() {
        HappyNumber202 happyNumber = new HappyNumber202();
        System.out.println(happyNumber.isHappy(19));

        System.out.println(happyNumber.isHappy(2));
    }

    @Test
    public void slidingWindowMaximum239Test() {
        int[] nums = {1,3,-1,-3,5,3,6,7};

        SlidingWindowMaximum239 slidingWindowMaximum = new SlidingWindowMaximum239();

        System.out.println(Arrays.toString(slidingWindowMaximum.maxSlidingWindow(nums, 3)));
    }

    @Test
    public void combinationSumIII216Test() {
        CombinationSumIII216 combinationSumIII = new CombinationSumIII216();
        List<List<Integer>> results = combinationSumIII.combinationSum3(3, 9);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void houseRobberII213Test() {
        HouseRobberII213 houseRobberII = new HouseRobberII213();

        int[] nums = {2, 7, 9, 3, 1, 5, 7, 8, 9};
        System.out.println(houseRobberII.rob(nums));

        nums = new int[]{1, 2};
        System.out.println(houseRobberII.rob(nums));

        nums = new int[]{2, 1, 1, 2};
        System.out.println(houseRobberII.rob(nums));
    }
    
    @Test
    public void invertBinaryTree226Test() {
        TreeNode leftLeaf = new TreeNode(6);
        TreeNode rightLeaf = new TreeNode(9);
        TreeNode right = new TreeNode(7, leftLeaf, rightLeaf);

        TreeNode leftLeftLeaf = new TreeNode(1);
        TreeNode leftRightLeaf = new TreeNode(3);
        TreeNode left = new TreeNode(2, leftLeftLeaf, leftRightLeaf);

        TreeNode root = new TreeNode(4, left, right);

        InvertBinaryTree226 invertBinaryTree = new InvertBinaryTree226();

        invertBinaryTree.invertTree(root);
    }

    @Test
    public void CountCompleteTreeNodes222Test() {
        TreeNode leftLeaf = new TreeNode(6);
        TreeNode rightLeaf = new TreeNode(9);
        TreeNode right = new TreeNode(7, leftLeaf, rightLeaf);

        TreeNode leftLeftLeaf = new TreeNode(1);
        TreeNode leftRightLeaf = new TreeNode(3);
        TreeNode left = new TreeNode(2, leftLeftLeaf, leftRightLeaf);

        TreeNode root = new TreeNode(4, left, right);

        CountCompleteTreeNodes222 countCompleteTreeNodes = new CountCompleteTreeNodes222();
        System.out.println(countCompleteTreeNodes.countNodes(root));
        System.out.println(countCompleteTreeNodes.countNodes1(root));
    }

    @Test
    public void lowestCommonAncestorOfABinaryTree236Test() {
        TreeNode zero = new TreeNode(0);
        TreeNode eight = new TreeNode(8);
        TreeNode one = new TreeNode(1, zero, eight);

        TreeNode severn = new TreeNode(7);
        TreeNode four = new TreeNode(4);

        TreeNode six = new TreeNode(6);
        TreeNode two = new TreeNode(2, severn, four);
        TreeNode five = new TreeNode(5, six, two);

        TreeNode root = new TreeNode(3, five, one);

        LowestCommonAncestorOfABinaryTree236 lowestCommonAncestorOfABinaryTree = new LowestCommonAncestorOfABinaryTree236();
        lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, five, four);
        TreeNode parent = lowestCommonAncestorOfABinaryTree.lowestCommonAncestor1(root, five, four);
    }

    @Test
    public void lowestCommonAncestorOfABinarySearchTree235Test() {
        TreeNode rightLeftLeaf1 = new TreeNode(49);
        TreeNode rightRightLeaf1 = new TreeNode(12);
        TreeNode right1 = new TreeNode(48, rightLeftLeaf1, rightRightLeaf1);
        TreeNode left1 = new TreeNode(0);

        TreeNode root1 = new TreeNode(1, left1, right1);

        LowestCommonAncestorOfABinarySearchTree235 lowestCommonAncestorOfABinarySearchTree
                = new LowestCommonAncestorOfABinarySearchTree235();

        lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root1, rightLeftLeaf1, right1);
    }

    @Test
    public void BitwiseANDOfNumbersRange201Test() {
        BitwiseANDOfNumbersRange201 bitwiseANDOfNumbersRange = new BitwiseANDOfNumbersRange201();
        System.out.println(bitwiseANDOfNumbersRange.rangeBitwiseAnd(5, 5));
        System.out.println(bitwiseANDOfNumbersRange.rangeBitwiseAnd(6, 7));
        System.out.println(bitwiseANDOfNumbersRange.rangeBitwiseAnd(1, 2147483647));
    }

    @Test
    public void IsomorphicStrings205Test() {
        IsomorphicStrings205 isomorphicStrings = new IsomorphicStrings205();
        System.out.println(isomorphicStrings.isIsomorphic("badc", "baba"));
        System.out.println(isomorphicStrings.isIsomorphic("egg", "add"));
        System.out.println(isomorphicStrings.isIsomorphic("foo", "bar"));
        System.out.println(isomorphicStrings.isIsomorphic("paper", "title"));
    }

    @Test
    public void ContainsDuplicate217Test() {
        ContainsDuplicate217 containsDuplicate = new ContainsDuplicate217();
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void ContainsDuplicateII219Test() {
        ContainsDuplicateII219 containsDuplicateII = new ContainsDuplicateII219();
        int[] nums = {1,2,3,1,2,3};
//        int[] nums = {99,99};
        System.out.println(containsDuplicateII.containsNearbyDuplicate(nums, 2));

        int[] nums2 = {1,0,1,1};
        System.out.println(containsDuplicateII.containsNearbyDuplicate(nums2, 1));

        int[] nums1 = {1,2,3,1};
        System.out.println(containsDuplicateII.containsNearbyDuplicate(nums1, 3));
    }
}
