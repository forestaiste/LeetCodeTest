package org.example.leetcode.pageeight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//387. 字符串中的第一个唯一字符
//        给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//
//
//
//        示例：
//
//        s = "leetcode"
//        返回 0
//
//        s = "loveleetcode"
//        返回 2
public class FirstUniqueCharacterInAString387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int length = s.length();
        for (int i = 0; i < length; i++) {
            Character c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < length; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString387 firstUniqueCharacterInAString = new FirstUniqueCharacterInAString387();

        System.out.println(firstUniqueCharacterInAString.firstUniqChar("dddccdbba"));
        System.out.println(firstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
    }
}
