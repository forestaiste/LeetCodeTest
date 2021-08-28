package org.example.leetcode.pageeight;

//390. 消除游戏
//        给定一个从1 到 n 排序的整数列表。
//        首先，从左到右，从第一个数字开始，每隔一个数字进行删除，直到列表的末尾。
//        第二步，在剩下的数字中，从右到左，从倒数第一个数字开始，每隔一个数字进行删除，直到列表开头。
//        我们不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。
//        返回长度为 n 的列表中，最后剩下的数字。
//
//        示例：
//
//        输入:
//        n = 9,
//        1 2 3 4 5 6 7 8 9
//        2 4 6 8
//        2 6
//        6
//
//        输出:
//        6

import java.util.ArrayList;
import java.util.List;

public class EliminationGame390 {
    private int cal(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        if(n%2!=0){
            return cal(n-1);
        }
        else{
            return 2*(n/2+1-cal(n/2));
        }
    }

    public int lastRemaining(int n) {
        return cal(n);
    }

    public int lastRemaining1(int n) {
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = 1;
        }

        int count = n;

        while (count > 1) {
            int skipCount = 1;
            for (int i = 0; i < n; i++) {
                if (list[i] == 1 && skipCount == 0) {
                    skipCount++;
                } else if (list[i] == 1 && skipCount == 1) {
                    list[i] = 0;
                    count--;
                    skipCount = 0;
                }
            }

            skipCount = 1;

            if (count == 1)
                break;

            for (int i = n - 1; i >= 0; i--) {
                if (list[i] == 1 && skipCount == 0) {
                    skipCount++;
                } else if (list[i] == 1 && skipCount == 1) {
                    list[i] = 0;
                    count--;
                    skipCount = 0;
                }
            }
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (list[i] == 1) {
                index = i + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        EliminationGame390 eliminationGame = new EliminationGame390();

        System.out.println("2 -" + eliminationGame.lastRemaining(2));
        System.out.println("3 -" + eliminationGame.lastRemaining(3));
        System.out.println("4 -" + eliminationGame.lastRemaining(4));
        System.out.println("5 -" + eliminationGame.lastRemaining(5));
        System.out.println("6 -" + eliminationGame.lastRemaining(6));
        System.out.println("7 -" + eliminationGame.lastRemaining(7));
        System.out.println("8 -" + eliminationGame.lastRemaining(8));
        System.out.println("9 -" + eliminationGame.lastRemaining(9));
        System.out.println("10 -" + eliminationGame.lastRemaining(10));
        System.out.println("11 -" + eliminationGame.lastRemaining(11));
        System.out.println("12 -" + eliminationGame.lastRemaining(12));
        System.out.println("13 -" + eliminationGame.lastRemaining(13));
        System.out.println("14 -" + eliminationGame.lastRemaining(14));
        System.out.println("15 -" + eliminationGame.lastRemaining(15));
        System.out.println("16 -" + eliminationGame.lastRemaining(16));
        System.out.println("17 -" + eliminationGame.lastRemaining(17));
        System.out.println("18 -" + eliminationGame.lastRemaining(18));
        System.out.println("19 -" + eliminationGame.lastRemaining(19));
        System.out.println("20 -" + eliminationGame.lastRemaining(20));
        System.out.println("21 -" + eliminationGame.lastRemaining(21));
        System.out.println("22 -" + eliminationGame.lastRemaining(22));
        System.out.println("23 -" + eliminationGame.lastRemaining(23));
        System.out.println("24 -" + eliminationGame.lastRemaining(24));
        System.out.println("25 -" + eliminationGame.lastRemaining(25));
        System.out.println("26 -" + eliminationGame.lastRemaining(26));
        System.out.println("27 -" + eliminationGame.lastRemaining(27));
        System.out.println("28 -" + eliminationGame.lastRemaining(28));
        System.out.println("29 -" + eliminationGame.lastRemaining(29));
    }
}
