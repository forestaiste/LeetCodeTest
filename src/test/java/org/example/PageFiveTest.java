package org.example;

import org.example.leetcode.pagefive.*;
import org.example.models.ListNode;
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
        MinimumSizeSubarraySum sum = new MinimumSizeSubarraySum();
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
}
