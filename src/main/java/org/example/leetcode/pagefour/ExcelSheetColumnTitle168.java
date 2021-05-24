package org.example.leetcode.pagefour;

//168. Excel表列名称
//        给定一个正整数，返回它在 Excel 表中相对应的列名称。
//
//        例如，
//
//        1 -> A
//        2 -> B
//        3 -> C
//        ...
//        26 -> Z
//        27 -> AA
//        28 -> AB
//        ...
//        示例 1:
//
//        输入: 1
//        输出: "A"
//        示例 2:
//
//        输入: 28
//        输出: "AB"
//        示例 3:
//
//        输入: 701
//        输出: "ZY"

public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int columnNumber) {
        int quotient = columnNumber;
        int leftover = 0;
        StringBuilder builder = new StringBuilder();
        while (quotient > 26) {
            leftover = quotient % 26;
            if (leftover == 0) {
                quotient -= 26;
                leftover = 25;
            }
            else{
                leftover -= 1;
            }

            char letter = (char)(leftover + 'A');
            builder.insert(0, letter);
            quotient = quotient / 26;
        }

        char letter = (char)(quotient - 1 + 'A');
        builder.insert(0, letter);

        return builder.toString();
    }
}
