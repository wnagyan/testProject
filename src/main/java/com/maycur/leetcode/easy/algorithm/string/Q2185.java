package com.maycur.leetcode.easy.algorithm.string;

/**
 * 2185. 统计包含给定前缀的字符串
 *
 * @topic 给你一个字符串数组 words 和一个字符串 pref 。
 * 返回 words 中以 pref 作为 前缀 的字符串的数目。
 * 字符串 s 的 前缀 就是  s 的任一前导连续字符串。
 *
 * 链接：https://leetcode-cn.com/problems/counting-words-with-a-given-prefix
 */
public class Q2185 {

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String s : words){
            if (s.indexOf(pref) == 0){
                count++;
            }
        }
        return count;
    }

}
