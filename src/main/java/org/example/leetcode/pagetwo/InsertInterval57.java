package org.example.leetcode.pagetwo;

//57. 插入区间
//        给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
//
//        在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
//
//        示例 1：
//
//        输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
//        输出：[[1,5],[6,9]]
//        示例 2：
//
//        输入：intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
//        输出：[[1,2],[3,10],[12,16]]
//        解释：这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。
//        示例 3：
//
//        输入：intervals = [], newInterval = [5,7]
//        输出：[[5,7]]
//        示例 4：
//
//        输入：intervals = [[1,5]], newInterval = [2,3]
//        输出：[[1,5]]
//        示例 5：
//
//        输入：intervals = [[1,5]], newInterval = [2,7]
//        输出：[[1,7]]
//
//        提示：
//
//        0 <= intervals.length <= 104
//        intervals[i].length == 2
//        0 <= intervals[i][0] <= intervals[i][1] <= 105
//        intervals 根据 intervals[i][0] 按 升序 排列
//        newInterval.length == 2
//        0 <= newInterval[0] <= newInterval[1] <= 105


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<int[]>();

        int left = newInterval[0];
        int right = newInterval[1];

        for (int[] interval : intervals) {
            if (interval[1] < left || interval[0] > right) {
                merged.add(interval);
            }
            else {
                 left = Math.min(left, interval[0]);
                 right = Math.max(right, interval[1]);
            }
        }

        merged.add(new int[] {left, right});

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        InsertInterval57 insertInterval = new InsertInterval57();
        int[][] intervals = new int[][] {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

//        intervals = insertInterval.insert(intervals, newInterval);
//
//        for (int[] interval : intervals) {
//            System.out.println(Arrays.toString(interval));
//        }

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
}
