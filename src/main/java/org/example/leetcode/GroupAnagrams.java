package org.example.leetcode;

//49. 字母异位词分组
//        给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
//
//        示例:
//
//        输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//        输出:
//        [
//        ["ate","eat","tea"],
//        ["nat","tan"],
//        ["bat"]
//        ]
//        说明：
//
//        所有输入均为小写字母。
//        不考虑答案输出的顺序。

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> maps = new HashMap<String, List<String>>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> combination = maps.getOrDefault(key, new ArrayList<>());
            combination.add(str);
            maps.put(key, combination);
        }

        return new ArrayList<List<String>>(maps.values());
    }
}
