package com.maycur.leetcode.easy.algorithm.common;

/**
 * 1323. 6 和 9 组成的最大数字
 *
 * @topic 给你一个仅由数字 6 和 9 组成的正整数 num。
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 * 请返回你可以得到的最大数字。
 *
 * 链接：https://leetcode-cn.com/problems/maximum-69-number/
 */
public class Q1323 {


    public int maximum69Number (int num) {
        StringBuilder str = new StringBuilder("");
        while (num > 0){
            str.append(num % 10);
            num /= 10;
        }
        int i = str.lastIndexOf("6");
        if(i != -1){
            str = str.replace(i, i+1, "9").reverse();
        }
        return Integer.parseInt(str.toString());
    }
}
