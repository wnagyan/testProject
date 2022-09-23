package com.maycur.leetcode.easy.algorithm.common;

/**
 * 2413. 最小偶倍数
 *
 * @topic 给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。
 *
 * 链接：https://leetcode.cn/problems/smallest-even-multiple/
 */
public class Q2413 {

    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n*2;
    }
}
