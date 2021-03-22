package org.example;

import org.example.leetcode.pagenine.QueueReconstructionByHeight406;
import org.junit.Test;

import java.util.Arrays;

public class PageNineTest {
    @Test
    public void queueReconstructionByHeight406Test() {
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
