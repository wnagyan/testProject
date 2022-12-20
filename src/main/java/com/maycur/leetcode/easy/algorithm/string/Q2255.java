package com.maycur.leetcode.easy.algorithm.string;

/**
 * 2255. 统计是给定字符串前缀的字符串数目
 *
 * @topic 给你一个字符串数组words和一个字符串s，其中words[i] 和s只包含 小写英文字母。
 * 请你返回 words中是字符串 s前缀的 字符串数目。
 * 一个字符串的 前缀是出现在字符串开头的子字符串。子字符串是一个字符串中的连续一段字符序列。
 *
 * 链接：https://leetcode.cn/problems/count-prefixes-of-a-given-string
 */
public class Q2255 {

    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String str : words){
            if (s.startsWith(str)){
                count++;
            }
        }
        return count;
    }
}
