package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSorting {
    static int [] [] matrix = {
//            {1,1,1,1,0,0,0},
//            {0,1,0,1,1,0,0},
//            {0,0,1,0,0,1,0},
//            {0,0,1,1,0,1,1},
//            {0,0,0,1,1,0,1},
//            {0,0,0,0,0,1,0},
//            {0,0,0,0,0,1,1} };
            {0,1,1,1,0,0,0},
            {0,0,0,1,1,0,0},
            {0,0,0,0,0,1,0},
            {0,0,1,0,0,1,1},
            {0,0,0,1,0,0,1},
            {0,0,0,0,0,0,0},
            {0,0,0,0,0,1,0} };

    static int [] inDegree = new int [7];
    static int [] num = new int [7];
    static int[] sort = new int[7];

    static void topSort() {
        Queue<Integer> q = new LinkedList<>();
        int counter = 0;

        for(int i = 0; i < 7; i++)
            if (inDegree[i] == 0)
                q.add(i);

        while (!q.isEmpty()) {
            int v = q.poll();
            sort[counter] = v;
            num[v] = counter++;


            for(int i = 0; i < 7; i++)
                if(v != i && matrix[v][i] == 1 && --inDegree[i] == 0)
                    q.add(i);
        }
    }

    public static void main(String [] args) {
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++)
                if(matrix[j][i] == 1)
                    inDegree[i]++;
        }

        topSort();
        System.out.println("各点拓扑编号：" + Arrays.toString(num));
        System.out.println("各点拓扑编号：" + Arrays.toString(sort));
    }
}
