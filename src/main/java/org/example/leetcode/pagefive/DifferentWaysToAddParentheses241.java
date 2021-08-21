package org.example.leetcode.pagefive;

//241. 为运算表达式设计优先级
//        给定一个含有数字和运算符的字符串，为表达式添加括号，改变其运算优先级以求出不同的结果。你需要给出所有可能的组合的结果。有效的运算符号包含 +, - 以及 * 。
//
//        示例 1:
//
//        输入: "2-1-1"
//        输出: [0, 2]
//        解释:
//        ((2-1)-1) = 0
//        (2-(1-1)) = 2
//        示例 2:
//
//        输入: "2*3-4*5"
//        输出: [-34, -14, -10, -10, 10]
//        解释:
//        (2*(3-(4*5))) = -34
//        ((2*3)-(4*5)) = -14
//        ((2*(3-4))*5) = -10
//        (2*((3-4)*5)) = -10
//        (((2*3)-4)*5) = 10

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferentWaysToAddParentheses241 {
    char[] cArr;
    int len;

    public List<Integer> diffWaysToCompute(String input) {
        this.cArr = input.toCharArray();
        this.len = input.length();
        return dfsHelper(0, len - 1);
    }
    private List<Integer> dfsHelper(int l, int r) {
        int idx = l, num = cArr[idx] - '0';
        List<Integer> nArr = new ArrayList<>();

        while ((idx + 1 <= r) && Character.isDigit(cArr[idx + 1])) {
            idx++;
            num = num * 10 + (cArr[idx] - '0');
        }

        if (idx == r) {
            nArr.add(num); return nArr;
        }

        for (int i = idx + 1; i <= r; i++) {
            if (Character.isDigit(cArr[i]))
                continue;
            List<Integer> left = this.dfsHelper(l, i - 1);
            List<Integer> right = this.dfsHelper(i + 1, r);
            for (int val_l : left) {
                for (int val_r : right) {
                    char opt = cArr[i];
                    int output = 0;

                    if (opt == '+')
                        output = val_l + val_r;
                    else if (opt == '-')
                        output = val_l - val_r;
                    else if (opt == '*')
                        output = val_l * val_r;

                    nArr.add(output);
                }
            }
        }
        return nArr;
    }

    public static void main(String[] args) {
        DifferentWaysToAddParentheses241 differentWaysToAddParentheses = new DifferentWaysToAddParentheses241();
        List<Integer> result = differentWaysToAddParentheses.diffWaysToCompute("2*3-4*5");
        System.out.println(Arrays.toString(result.toArray()));
    }
}
