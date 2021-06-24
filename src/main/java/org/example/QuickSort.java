package org.example;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int index = partition(nums, left, right);

            quickSort(nums, left, index - 1);
            quickSort(nums, index + 1, right);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];

        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && nums[j] > pivot)
                j--;

            while (i < j && nums[i] <= pivot)
                i++;

            if (i < j) {
                swap(nums, i, j);
            }
        }

        nums[left] = nums[i];
        nums[i] = pivot;

        return i;

//  if put "while (i < j && nums[i] <= pivot) i++;" before "while (i < j && nums[j] > pivot) j--;
//  i will be larger than the last one. so the following code is necessary.
//        if (nums[i] > pivot) {
//            swap(nums, i - 1, left);
//            return i - 1;
//        }
//        else {
//            swap(nums, i, left);
//            return i;
//        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sort(int[] array, int left, int right) {
        if(left > right) {
            return;
        }
        // base中存放基准数
        int base = array[left];
        int i = left, j = right;
        while(i != j) {
            // 顺序很重要，先从右边开始往左找，直到找到比base值小的数
            while(array[j] >= base && i < j) {
                j--;
            }

            // 再从左往右边找，直到找到比base值大的数
            while(array[i] <= base && i < j) {
                i++;
            }

            // 上面的循环结束表示找到了位置或者(i>=j)了，交换两个数在数组中的位置
            if(i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }

        // 将基准数放到中间的位置（基准数归位）
        array[left] = array[i];
        array[i] = base;

        // 递归，继续向基准的左右两边执行和上面同样的操作
        // i的索引处为上面已确定好的基准值的位置，无需再处理
        sort(array, left, i - 1);
        sort(array, i + 1, right);
    }

    public static void main(String [] args) {
        QuickSort quickSort = new QuickSort();
        int[] nums = {5, 9, 2, 8, 10, 3, 4};
        quickSort.sort(nums);
//        quickSort.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
