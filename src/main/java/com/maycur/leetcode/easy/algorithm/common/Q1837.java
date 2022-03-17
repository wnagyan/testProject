package com.maycur.leetcode.easy.algorithm.common;

/**
 * 1837. K 进制表示下的各位数字总和
 *
 * @topic 给你一个整数 n（10 进制）和一个基数 k ，请你将 n 从 10 进制表示转换为 k 进制表示，计算并返回转换后各位数字的 总和 。
 * 转换后，各位数字应当视作是 10 进制数字，且它们的总和也应当按 10 进制表示返回。
 *
 * 链接：https://leetcode-cn.com/problems/sum-of-digits-in-base-k
 */
public class Q1837 {

    public int sumBase(int n, int k) {
        int sum = 0;
        while(n >= k){
            sum = (sum * 10) + (n / k);
            n = n % k;
        }
        sum = sum * 10 + n;
        return sum(sum);
    }

    public int sum(int num){
        int sum = 0;
        while(num >= 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}