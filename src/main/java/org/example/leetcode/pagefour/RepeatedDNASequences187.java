package org.example.leetcode.pagefour;

//187. 重复的DNA序列
//        所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
//
//        编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。
//
//
//
//        示例 1：
//
//        输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//        输出：["AAAAACCCCC","CCCCCAAAAA"]
//        示例 2：
//
//        输入：s = "AAAAAAAAAAAAA"
//        输出：["AAAAAAAAAA"]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences187 {
    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10, n = s.length();
        HashSet<String> seen = new HashSet(), output = new HashSet();

        // iterate over all sequences of length L
        for (int start = 0; start < n - L + 1; ++start) {
            String tmp = s.substring(start, start + L);
            if (seen.contains(tmp)) output.add(tmp);
            seen.add(tmp);
        }
        return new ArrayList<String>(output);
     }

    public static void main(String[] args) {
        RepeatedDNASequences187 repeatedDNASequences = new RepeatedDNASequences187();
        List<String> result = repeatedDNASequences.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        System.out.println(Arrays.toString(result.toArray()));
    }
}
