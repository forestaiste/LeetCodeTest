package org.example.leetcode.pagesixteen;

//763. 划分字母区间
//        字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表示每个字符串片段的长度的列表。
//
//        示例：
//
//        输入：S = "ababcbacadefegdehijhklij"
//        输出：[9,7,8]
//        解释：
//        划分结果为 "ababcbaca", "defegde", "hijhklij"。
//        每个字母最多出现在一个片段中。
//        像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels763 {
    public List<Integer> partitionLabels(String S) {
        int hash[] = new int[27];

        for (int i = 0; i < S.length(); i++) {
            hash[S.charAt(i) - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;

        for (int i = 0; i < S.length(); i++) {
            right = Math.max(right, hash[S.charAt(i) - 'a']);

            if (i == right) {
                result.add(right - left + 1);
                left = i + 1;
            }
        }

        return result;
    }
}
