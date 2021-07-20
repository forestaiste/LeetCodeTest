package org.example.leetcode.pagenine;

//406. 根据身高重建队列
//        假设有打乱顺序的一群人站成一个队列，数组 people 表示队列中一些人的属性（不一定按顺序）。每个 people[i] = [hi, ki] 表示第 i 个人的身高为 hi ，前面 正好 有 ki 个身高大于或等于 hi 的人。
//
//        请你重新构造并返回输入数组 people 所表示的队列。返回的队列应该格式化为数组 queue ，其中 queue[j] = [hj, kj] 是队列中第 j 个人的属性（queue[0] 是排在队列前面的人）。
//
//        示例 1：
//
//        输入：people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
//        输出：[[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]
//        解释：
//        编号为 0 的人身高为 5 ，没有身高更高或者相同的人排在他前面。
//        编号为 1 的人身高为 7 ，没有身高更高或者相同的人排在他前面。
//        编号为 2 的人身高为 5 ，有 2 个身高更高或者相同的人排在他前面，即编号为 0 和 1 的人。
//        编号为 3 的人身高为 6 ，有 1 个身高更高或者相同的人排在他前面，即编号为 1 的人。
//        编号为 4 的人身高为 4 ，有 4 个身高更高或者相同的人排在他前面，即编号为 0、1、2、3 的人。
//        编号为 5 的人身高为 7 ，有 1 个身高更高或者相同的人排在他前面，即编号为 1 的人。
//        因此 [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]] 是重新构造后的队列。
//        示例 2：
//
//        输入：people = [[6,0],[5,0],[4,0],[3,2],[2,2],[1,4]]
//        输出：[[4,0],[5,0],[2,2],[3,2],[1,4],[6,0]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionByHeight406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] person1, int[] person2) {
                if (person1[0] != person2[0]) {
                    return person2[0] - person1[0];
                } else {
                    return person1[1] - person2[1];
                }
            }
        });

        List<int[]> reordered = new ArrayList<>();

        for (int i = 0; i < people.length; i++) {
            int pos = people[i][1];

            reordered.add(pos, people[i]);
        }

//        int[][] ans = new int[reordered.size()][2];
//        for (int i = 0; i < reordered.size(); i++) {
//            ans[i][0] = reordered.get(i)[0];
//            ans[i][1] = reordered.get(i)[1];
//        }
        int[][] ans = reordered.toArray(new int[people.length][]);

        return ans;
    }

    public static void main(String[] args) {
        QueueReconstructionByHeight406 queueReconstructionByHeight = new QueueReconstructionByHeight406();
        int[][] people = {{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        people = queueReconstructionByHeight.reconstructQueue(people);

        for (int[] p : people) {
            System.out.println(Arrays.toString(p));
        }

        people = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        people = queueReconstructionByHeight.reconstructQueue(people);

        for (int[] p : people) {
            System.out.println(Arrays.toString(p));
        }
    }
}
