package org.example.leetcode.pageseven;

//310. 最小高度树
//        树是一个无向图，其中任何两个顶点只通过一条路径连接。 换句话说，一个任何没有简单环路的连通图都是一棵树。
//
//        给你一棵包含 n 个节点的树，标记为 0 到 n - 1 。给定数字 n 和一个有 n - 1 条无向边的 edges 列表（每一个边都是一对标签），其中 edges[i] = [ai, bi] 表示树中节点 ai 和 bi 之间存在一条无向边。
//
//        可选择树中任何一个节点作为根。当选择节点 x 作为根节点时，设结果树的高度为 h 。在所有可能的树中，具有最小高度的树（即，min(h)）被称为 最小高度树 。
//
//        请你找到所有的 最小高度树 并按 任意顺序 返回它们的根节点标签列表。
//
//        树的 高度 是指根节点和叶子节点之间最长向下路径上边的数量。
//
//
//        示例 1：
//
//
//        输入：n = 4, edges = [[1,0],[1,2],[1,3]]
//        输出：[1]
//        解释：如图所示，当根是标签为 1 的节点时，树的高度是 1 ，这是唯一的最小高度树。
//        示例 2：
//
//
//        输入：n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
//        输出：[3,4]
//        示例 3：
//
//        输入：n = 1, edges = []
//        输出：[0]
//        示例 4：
//
//        输入：n = 2, edges = [[0,1]]
//        输出：[0,1]

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumHeightTrees310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = null;
        if (n == 1) {
            res = new ArrayList<>();
            res.add(0);
            return res;
        }

        int[] degree = new int[n];

        List<List<Integer>> map = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            map.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (degree[i] == 1)
                queue.offer(i);
        }

        while (!queue.isEmpty()) {
            res = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();

                res.add(cur);

                List<Integer> neighbors = map.get(cur);

                for (int neighbor : neighbors) {
                    degree[neighbor]--;

                    if (degree[neighbor] == 1) {
                        queue.offer(neighbor);
                    }
                }
            }
        }

        return res;
    }
}
