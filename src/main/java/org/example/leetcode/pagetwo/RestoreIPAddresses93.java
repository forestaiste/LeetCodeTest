package org.example.leetcode.pagetwo;

//93. 复原 IP 地址
//        给定一个只包含数字的字符串，用以表示一个 IP 地址，返回所有可能从 s 获得的 有效 IP 地址 。你可以按任何顺序返回答案。
//
//        有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
//
//        例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效 IP 地址。
//
//
//
//        示例 1：
//
//        输入：s = "25525511135"
//        输出：["255.255.11.135","255.255.111.35"]
//        示例 2：
//
//        输入：s = "0000"
//        输出：["0.0.0.0"]
//        示例 3：
//
//        输入：s = "1111"
//        输出：["1.1.1.1"]
//        示例 4：
//
//        输入：s = "010010"
//        输出：["0.10.0.10","0.100.1.0"]
//        示例 5：
//
//        输入：s = "101023"
//        输出：["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses93 {
    List<String> results;
    List<String> address;

    public List<String> restoreIpAddresses(String s) {
        results = new ArrayList<>();
        address = new ArrayList<>();
        if (s.length() > 12)
            return results;

        backTrack(s, 0);
        return results;
    }

    private void backTrack(String s, int start) {
        if (start >= s.length() || address.size() >= 4) {
            if (address.size() == 4 && start == s.length()) {
                results.add(String.join(".", address));
            }

            return;
        }

        for (int i = start; i < s.length(); i++) {

            String sub = s.substring(start, i + 1);

            if ((!sub.equals("0") && sub.startsWith("0")) || (!sub.equals("0") && Long.parseLong(sub) > 255)) {
                continue;
            }

            address.add(sub);
            backTrack(s, i + 1);
            address.remove(address.size() - 1);
        }
    }
}
