package org.example.leetcode.pagefive;

//207. 课程表
//        你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
//
//        在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
//
//        例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
//        请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
//
//
//
//        示例 1：
//
//        输入：numCourses = 2, prerequisites = [[1,0]]
//        输出：true
//        解释：总共有 2 门课程。学习课程 1 之前，你需要完成课程 0 。这是可能的。
//        示例 2：
//
//        输入：numCourses = 2, prerequisites = [[1,0],[0,1]]
//        输出：false
//        解释：总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0 ；并且学习课程 0 之前，你还应先完成课程 1 。这是不可能的。

import java.util.*;

public class CourseSchedule207 {
    List<List<Integer>> edges;
    int[] visited;
    boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<Integer>());
        }
        visited = new int[numCourses];
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        for (int i = 0; i < numCourses && valid; ++i) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
        return valid;
    }

    public void dfs(int u) {
        visited[u] = 1;
        for (int v: edges.get(u)) {
            if (visited[v] == 0) {
                dfs(v);
                if (!valid) {
                    return;
                }
            } else if (visited[v] == 1) {
                valid = false;
                return;
            }
        }
        visited[u] = 2;
    }

    public boolean canFinish1(int numCourses, int[][] prerequisites) {
        int[] depends = new int[numCourses];
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < prerequisites.length; i++) {
            depends[prerequisites[i][0]]++;
        }

        for (int i = 0; i < numCourses; i++) {
            if (depends[i] == 0) {
                queue.add(i);
                count++;
            }
        }

        while (!queue.isEmpty()) {
            int course = queue.poll();

            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == course) {
                    depends[prerequisites[i][0]]--;

                    if (depends[prerequisites[i][0]] == 0) {
                        queue.add(prerequisites[i][0]);
                        count++;
                    }
                }

            }
        }

        if (count == numCourses)
            return true;
        return false;
    }

    int[] indeg;

    public boolean canFinish0(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<Integer>());
        }
        indeg = new int[numCourses];
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
            ++indeg[info[0]];
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; ++i) {
            if (indeg[i] == 0) {
                queue.offer(i);
            }
        }

        int visited = 0;
        while (!queue.isEmpty()) {
            ++visited;
            int u = queue.poll();
            for (int v: edges.get(u)) {
                --indeg[v];
                if (indeg[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        return visited == numCourses;
    }
}
