package com.maycur.leetcode.easy.algorithm.common;

import lombok.Getter;

/**
 * 1725. 可以形成最大正方形的矩形数目
 *
 * @topic 一次 位翻转定义为将数字x二进制中的一个位进行 翻转操作，即将0变成1，或者将1变成0。
 *
 * 比方说，x = 7，二进制表示为111，我们可以选择任意一个位（包含没有显示的前导 0 ）并进行翻转。
 * 比方说我们可以翻转最右边一位得到110，或者翻转右边起第二位得到101，或者翻转右边起第五位（这一位是前导 0 ）得到10111等等。
 * 给你两个整数start 和goal，请你返回将start转变成goal的最少位翻转次数。
 *
 * 链接：https://leetcode.cn/problems/minimum-bit-flips-to-convert-number
 */
public class Q2220 {

    public static int minBitFlips(int start, int goal) {
        int count = 0;
        while (true){
            if (start <= 0 && goal <= 0){
                break;
            }
            if (start % 2 != goal % 2){
                count++;
            }
            start /= 2;
            goal /= 2;
        }
        return count;
    }

}
