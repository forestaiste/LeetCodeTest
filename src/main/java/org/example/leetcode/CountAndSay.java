package org.example.leetcode;

import java.nio.charset.StandardCharsets;

public class CountAndSay {
//    public String countAndSay(int n) {
//        if (n == 1)
//            return "1";
//
//        String result = countAndSay(n - 1);
//
//        int i = 0;
//
//        Character last, current;
//
//        last = result.charAt(0);
//
//        Integer count = 0;
//
//        StringBuilder builder = new StringBuilder();
//
//        while (i < result.length()) {
//            current = result.charAt(i++);
//
//            if (current != last) {
//                builder.append(count.toString() + last);
//                count = 1;
//                last = current;
//            }
//            else {
//                count++;
//            }
//        }
//
//        builder.append(count.toString() + last);
//
//        return builder.toString();
//    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuffer res = new StringBuffer();
        String str = countAndSay(n - 1);
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
                res.append(count).append(str.charAt(i));
                count = 1;
            } else {
                count++;
            }
        }
        return res.toString();
    }
}
