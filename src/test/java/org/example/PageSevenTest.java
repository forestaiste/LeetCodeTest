package org.example;

import org.example.leetcode.pageseven.IntersectionOfTwoArrays349;
import org.example.leetcode.pageseven.ReverseString344;
import org.example.leetcode.pageseven.TopKFrequentElements347;
import org.junit.Test;

import java.util.Arrays;

public class PageSevenTest {
    @Test
    public void reverseStringTest() {
        ReverseString344 reverseString = new ReverseString344();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(s);

        char[] s1 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString.reverseString(s1);
    }

    @Test
    public void intersectionOfTwoArrays349Test()  {
        IntersectionOfTwoArrays349 intersection = new IntersectionOfTwoArrays349();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2, 2};
        int[] result = intersection.intersection0(nums1, nums2);
        System.out.println(Arrays.toString(result));
        System.out.println("----------------");
        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9,4,9,8,4};
        result = intersection.intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }

    @Test
    public void topKFrequentElements347Test() {

        TopKFrequentElements347 topKFrequentElements = new TopKFrequentElements347();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(nums, 2)));
    }
}
