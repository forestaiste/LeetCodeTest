package org.example.leetcode.pagefive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//210. 课程表 II
//        现在你总共有 n 门课需要选，记为 0 到 n-1。
//
//        在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]
//
//        给定课程总量以及它们的先决条件，返回你为了学完所有课程所安排的学习顺序。
//
//        可能会有多个正确的顺序，你只要返回一种就可以了。如果不可能完成所有课程，返回一个空数组。
//
//        示例 1:
//
//        输入: 2, [[1,0]]
//        输出: [0,1]
//        解释: 总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
//        示例 2:
//
//        输入: 4, [[1,0],[2,0],[3,1],[3,2]]
//        输出: [0,1,2,3] or [0,2,1,3]
//        解释: 总共有 4 门课程。要学习课程 3，你应该先完成课程 1 和课程 2。并且课程 1 和课程 2 都应该排在课程 0 之后。
//        因此，一个正确的课程顺序是 [0,1,2,3] 。另一个正确的排序是 [0,2,1,3] 。
//        说明:
//
//        输入的先决条件是由边缘列表表示的图形，而不是邻接矩阵。详情请参见图的表示法。
//        你可以假定输入的先决条件中没有重复的边。
//        提示:
//
//        这个问题相当于查找一个循环是否存在于有向图中。如果存在循环，则不存在拓扑排序，因此不可能选取所有课程进行学习。
//        通过 DFS 进行拓扑排序 - 一个关于Coursera的精彩视频教程（21分钟），介绍拓扑排序的基本概念。
//        拓扑排序也可以通过 BFS 完成。
public class CourseScheduleII210 {


    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] depends = new int[numCourses];
        int[] order = new int[numCourses];
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < prerequisites.length; i++) {
            depends[prerequisites[i][0]]++;
        }

        for (int i = 0; i < numCourses; i++) {
            if (depends[i] == 0) {
                queue.add(i);
                order[count++] = i;
            }
        }

        while (!queue.isEmpty()) {
            int course = queue.poll();

            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == course) {
                    depends[prerequisites[i][0]]--;

                    if (depends[prerequisites[i][0]] == 0) {
                        queue.add(prerequisites[i][0]);
                        order[count++] = prerequisites[i][0];
                    }
                }

            }
        }

            if (count == numCourses)
                return order;
            return new int[0];
    }

    // 存储有向图
    List<List<Integer>> edges;
    // 存储每个节点的入度
    int[] indeg;
    // 存储答案
    int[] result;
    // 答案下标
    int index;

    public int[] findOrder1(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<Integer>());
        }
        indeg = new int[numCourses];
        result = new int[numCourses];
        index = 0;
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
            ++indeg[info[0]];
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        // 将所有入度为 0 的节点放入队列中
        for (int i = 0; i < numCourses; ++i) {
            if (indeg[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            // 从队首取出一个节点
            int u = queue.poll();
            // 放入答案中
            result[index++] = u;
            for (int v: edges.get(u)) {
                --indeg[v];
                // 如果相邻节点 v 的入度为 0，就可以选 v 对应的课程了
                if (indeg[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        if (index != numCourses) {
            return new int[0];
        }
        return result;
    }

}
