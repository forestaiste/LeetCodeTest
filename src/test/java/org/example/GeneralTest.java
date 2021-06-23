package org.example;

import org.junit.Test;

import java.util.Arrays;

public class GeneralTest {

    @Test
    public void quickSortTest() {
        QuickSort quickSort = new QuickSort();
        int[] nums = {5, 9, 2, 8, 10, 3, 4};
        quickSort.sort(nums);
//        quickSort.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));


    }
}
