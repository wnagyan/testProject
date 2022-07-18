package com.maycur.leetcode.medium.algorithm.common;

/**
 * 1689. 十-二进制数的最少数目
 *
 * @topic 如果一个十进制数字不含任何前导零，且每一位上的数字不是 0 就是 1 ，那么该数字就是一个 十-二进制数 。例如，101 和 1100 都是 十-二进制数，而 112 和 3001 不是。
 * 给你一个表示十进制整数的字符串 n ，返回和为 n 的 十-二进制数 的最少数目。
 *
 * 链接：https://leetcode.cn/problems/partitioning-into-minimum-number-of-deci-binary-numbers
 */
public class Q1689 {

    public static int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++){
            Integer num = Integer.parseInt(String.valueOf(n.charAt(i)));
            if (num > max){
                max = num;
            }else if (max == 9){
                break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        minPartitions("32");
    }

}
