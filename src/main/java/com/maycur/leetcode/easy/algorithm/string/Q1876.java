package com.maycur.leetcode.easy.algorithm.string;

/**
 * 1876. 长度为三且各字符不同的子字符串
 *
 * @topic 如果一个字符串不含有任何重复字符，我们称这个字符串为 好字符串。
 * 给你一个字符串 s，请你返回 s中长度为 3的 好子字符串 的数量。
 * 注意，如果相同的好子字符串出现多次，每一次都应该被记入答案之中。
 * 子字符串 是一个字符串中连续的字符序列。
 *
 * 链接：https://leetcode-cn.com/problems/substrings-of-size-three-with-distinct-characters
 */
public class Q1876 {

    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length()-3; i++){
            if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i+2) && s.charAt(i+1) != s.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
}
