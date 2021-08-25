package org.example.leetcode.pageseven;

//332. 重新安排行程
//        给定一个机票的字符串二维数组 [from, to]，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从 JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 开始。
//
//
//
//        提示：
//
//        如果存在多种有效的行程，请你按字符自然排序返回最小的行程组合。例如，行程 ["JFK", "LGA"] 与 ["JFK", "LGB"] 相比就更小，排序更靠前
//        所有的机场都用三个大写字母表示（机场代码）。
//        假定所有机票至少存在一种合理的行程。
//        所有的机票必须都用一次 且 只能用一次。
//
//
//        示例 1：
//
//        输入：[["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
//        输出：["JFK", "MUC", "LHR", "SFO", "SJC"]
//        示例 2：
//
//        输入：[["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
//        输出：["JFK","ATL","JFK","SFO","ATL","SFO"]
//        解释：另一种有效的行程是 ["JFK","SFO","ATL","JFK","ATL","SFO"]。但是它自然排序更大更靠后。

import java.util.*;

public class ReconstructItinerary332 {
    List<String> result;
    List<String> best;
    boolean[] used;

    public List<String> findItinerary0(List<List<String>> tickets) {
        result = new ArrayList<>();
        result.add("JFK");

        used = new boolean[tickets.size()];
        backTrack(tickets);
        return best;
    }

    private void backTrack(List<List<String>> tickets) {
        if (result.size() == tickets.size() + 1) {

            if (best == null) {
                best = new ArrayList<>(result);
            } else {
                for (int i = 0; i < result.size(); i++) {
                    int compare = best.get(i).compareTo(result.get(i));
                    if (compare != 0) {
                        if (compare > 0) {
                            best = new ArrayList<>(result);
                        }
                        break;
                    }
                }
            }
            return;
        }

        for (int i = 0; i < tickets.size(); i++) {
            if (used[i] == true) {
                continue;
            }

            List<String> ticket = tickets.get(i);

            if (ticket.get(0).equals(result.get(result.size() - 1))) {
                result.add(ticket.get(1));
                used[i] = true;
                backTrack(tickets);
                result.remove(result.size() - 1);
                used[i] = false;
            }
        }
    }

    Map<String, PriorityQueue<String>> map = new HashMap<>();
    List<String> itinerary = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0), dst = ticket.get(1);
            if (!map.containsKey(src)) {
                map.put(src, new PriorityQueue<String>());
            }
            map.get(src).offer(dst);
        }
        dfs("JFK");
        Collections.reverse(itinerary);
        return itinerary;
    }

    public void dfs(String curr) {
        while (map.containsKey(curr) && map.get(curr).size() > 0) {
            String tmp = map.get(curr).poll();
            dfs(tmp);
        }
        itinerary.add(curr);
    }

    public static void main(String[] args) {
        ReconstructItinerary332 reconstructItinerary = new ReconstructItinerary332();
        List<List<String>> tickets = new ArrayList<>();
//        List<String> t1 = new ArrayList<>() {
//            {
//                add("JFK");
//                add("SFO");
//            }
//        };
//        List<String> t2 = new ArrayList<>() {
//            {
//                add("JFK");
//                add("ATL");
//            }
//        };
//        List<String> t3 = new ArrayList<>() {
//            {
//                add("SFO");
//                add("ATL");
//            }
//        };
//        List<String> t4 = new ArrayList<>() {
//            {
//                add("ATL");
//                add("JFK");
//            }
//        };
//        List<String> t5 = new ArrayList<>() {
//            {
//                add("ATL");
//                add("SFO");
//            }
//        };
//        tickets.add(t1);
//        tickets.add(t2);
//        tickets.add(t3);
//        tickets.add(t4);
//        tickets.add(t5);
//
//        System.out.println(Arrays.toString(reconstructItinerary.findItinerary(tickets).toArray()));

        List<String> t1 = new ArrayList<>() {
            {
                add("JFK");
                add("KUL");
            }
        };
        List<String> t2 = new ArrayList<>() {
            {
                add("JFK");
                add("NRT");
            }
        };
        List<String> t3 = new ArrayList<String>() {
            {
                add("NRT");
                add("JFK");
            }
        };


        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);

        System.out.println(Arrays.toString(reconstructItinerary.findItinerary(tickets).toArray()));
    }
}
