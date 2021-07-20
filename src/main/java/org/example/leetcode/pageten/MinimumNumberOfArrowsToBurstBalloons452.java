package org.example.leetcode.pageten;

//452. 用最少数量的箭引爆气球
//        在二维空间中有许多球形的气球。对于每个气球，提供的输入是水平方向上，气球直径的开始和结束坐标。由于它是水平的，所以纵坐标并不重要，因此只要知道开始和结束的横坐标就足够了。开始坐标总是小于结束坐标。
//
//        一支弓箭可以沿着 x 轴从不同点完全垂直地射出。在坐标 x 处射出一支箭，若有一个气球的直径的开始和结束坐标为 xstart，xend， 且满足  xstart ≤ x ≤ xend，则该气球会被引爆。可以射出的弓箭的数量没有限制。 弓箭一旦被射出之后，可以无限地前进。我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。
//
//        给你一个数组 points ，其中 points [i] = [xstart,xend] ，返回引爆所有气球所必须射出的最小弓箭数。
//
//
//        示例 1：
//
//        输入：points = [[10,16],[2,8],[1,6],[7,12]]
//        输出：2
//        解释：对于该样例，x = 6 可以射爆 [2,8],[1,6] 两个气球，以及 x = 11 射爆另外两个气球
//        示例 2：
//
//        输入：points = [[1,2],[3,4],[5,6],[7,8]]
//        输出：4
//        示例 3：
//
//        输入：points = [[1,2],[2,3],[3,4],[4,5]]
//        输出：2
//        示例 4：
//
//        输入：points = [[1,2]]
//        输出：1
//        示例 5：
//
//        输入：points = [[2,3],[2,3]]
//        输出：1


import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons452 {
    public int findMinArrowShots0(int[][] points) {
        if (points.length == 1) {
            return 1;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] != o2[0]) ? (o1[0] - o2[0]) : (o1[1] - o2[1]);
            }
        });

        int count = 0;
        int[] intersection = new int[2];
        intersection[0] = -1;
        intersection[1] = -1;
        for (int i = 1; i < points.length; i++) {
            if ((long)points[i][0] <= (long)points[i - 1][1]) {
                if (intersection[0] == -1) {
                    intersection[0] = points[i][0];
                    intersection[1] = points[i][1] < points[i - 1][1] ? points[i][1] : points[i - 1][1];
                    count++;
                }
                else if (points[i][0] <= intersection[1] && points[i][0] >= intersection[0]) {
                    intersection[0] = points[i][0];
                }
                else if (points[i][1] > intersection[0] && points[i][1] <= intersection[1]) {
                    intersection[1] = points[i][1];
                }
                else {
                    if (i == points.length - 1) count++;
                    intersection[0] = -1;
                    intersection[1] = -1;
                }
            }
            else {
                if (i == 1) count++;
                if (intersection[0] == -1) {
                    count++;
                }
                else {
                    intersection[0] = -1;
                    intersection[1] = -1;
                }
            }
        }

        return count;
    }

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
//        Arrays.sort(points, new Comparator<int[]>() {
//            public int compare(int[] point1, int[] point2) {
//                if (point1[1] > point2[1]) {
//                    return 1;
//                } else if (point1[1] < point2[1]) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
        Arrays.sort(points, (point1, point2) -> Integer.compare(point1[1], point2[1]));
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon: points) {
            if (balloon[0] > pos) {
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MinimumNumberOfArrowsToBurstBalloons452 minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons452();
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{1,2},{2,3},{3,4},{4,5}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{1,2},{3,4},{5,6},{7,8}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{-1,1},{0, 1},{2,3},{1,2}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{1,2}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{2,3}, {2, 3}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));

        points = new int[][]{{-2147483646,-2147483645}, {2147483646, 2147483647}};
        System.out.println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));
    }
}
