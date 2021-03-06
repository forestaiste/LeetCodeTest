package org.example.leetcode.pageseven;

//347. 前 K 个高频元素
//        给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
//
//
//
//        示例 1:
//
//        输入: nums = [1,1,1,2,2,3], k = 2
//        输出: [1,2]
//        示例 2:
//
//        输入: nums = [1], k = 1
//        输出: [1]
//
//
//        提示：
//
//        你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
//        你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
//        题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的。
//        你可以按任意顺序返回答案。

import java.util.*;

public class TopKFrequentElements347 {

    public int[] topKFrequent(int[] nums, int k) {
        // 使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值
        HashMap<Integer,Integer> map = new HashMap();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 遍历map，用最小堆保存频率最大的k个元素
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        // 取出最小堆中的元素
        int[] res = new int[pq.size()];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i++] = pq.remove();
        }
        return res;
    }

}
