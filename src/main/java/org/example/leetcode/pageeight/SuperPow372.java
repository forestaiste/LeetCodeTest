package org.example.leetcode.pageeight;

//372. 超级次方
//        你的任务是计算 ab 对 1337 取模，a 是一个正整数，b 是一个非常大的正整数且会以数组形式给出。
//
//
//
//        示例 1：
//
//        输入：a = 2, b = [3]
//        输出：8
//        示例 2：
//
//        输入：a = 2, b = [1,0]
//        输出：1024
//        示例 3：
//
//        输入：a = 1, b = [4,3,3,8,5,2]
//        输出：1
//        示例 4：
//
//        输入：a = 2147483647, b = [2,0,0]
//        输出：1198

import java.util.Stack;

public class SuperPow372 {
    int base = 1337;
    public int superPow(int a, int[] b) {
        Stack<Integer> stack = new Stack<>();
        int n = b.length;
        for(int i = 0;i < n;i++){
            stack.push(b[i]);
        }
        return hpPow(a,stack);
    }
    //递归实现
    public int hpPow(int a, Stack<Integer> stack){
        if(stack.isEmpty()){
            return 1;
        }
        int last = stack.pop();
        int part1 = myPow(a,last);
        int part2 = myPow(hpPow(a,stack),10);
        return (part1 * part2) % base;
    }
    //取模防止溢出
//    public int myPow(int a,int k){
//        int res = 1;
//        a %= base;
//        for(int i = 0;i < k;i++){
//            res *= a;
//            res %= base;
//        }
//        return res;
//    }

    int myPow(int a, int k) {
        if (k == 0) return 1;
        a %= base;

        if (k % 2 == 1) {
            // k 是奇数
            return (a * myPow(a, k - 1)) % base;
        } else {
            // k 是偶数
            int sub = myPow(a, k / 2);
            return (sub * sub) % base;
        }
    }


    public static void main(String[] args) {
        SuperPow372 superPow = new SuperPow372();
        int[] b = {2, 0, 0};
        System.out.println(superPow.superPow(2147483647, b));
    }
}
