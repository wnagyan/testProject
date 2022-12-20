package com.maycur.leetcode.easy.algorithm.common;

/**
 * 2427. 公因子的数目
 *
 * @topic 给你两个正整数 a 和 b ，返回 a 和 b 的 公 因子的数目。
 * 如果 x 可以同时整除 a 和 b ，则认为 x 是 a 和 b 的一个 公因子 。
 *
 * 链接：https://leetcode.cn/problems/number-of-common-factors/
 */
public class Q2427 {

    public int commonFactors(int a, int b) {
        int num = a > b ? b : a;
        int count = 0;
        for (int i = 1; i <= num; i++){
            if (a % i == 0 && b % i == 0){
                count ++;
            }
        }
        return count;
    }
}
