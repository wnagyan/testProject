package com.maycur.leetcode.easy.algorithm.string;

/**
 * 1758. 生成交替二进制字符串的最少操作数
 *
 * @topic 给你一个仅由字符 '0' 和 '1' 组成的字符串 s 。一步操作中，你可以将任一 '0' 变成 '1' ，或者将 '1' 变成 '0' 。
 * 交替字符串 定义为：如果字符串中不存在相邻两个字符相等的情况，那么该字符串就是交替字符串。例如，字符串 "010" 是交替字符串，而字符串 "0100" 不是。
 * 返回使 s 变成 交替字符串 所需的 最少 操作数。
 *
 * 链接：https://leetcode.cn/problems/minimum-changes-to-make-alternating-binary-string
 */
public class Q1758 {

    public static int minOperations(String s) {
        int count1 = 0, count2 = 0;
        //第一位是0
        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 0 && s.charAt(i) != '0'){
                count1++;
            }else if (i % 2 == 1 && s.charAt(i) != '1'){
                count1++;
            }
            if (i % 2 == 0 && s.charAt(i) != '1'){
                count2++;
            }else if (i % 2 == 1 && s.charAt(i) != '0'){
                count2++;
            }
        }
        return count1 > count2 ? count2 : count1;
    }

    public static void main(String[] args) {
        minOperations("0100");
    }
}
