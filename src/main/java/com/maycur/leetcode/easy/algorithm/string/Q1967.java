package com.maycur.leetcode.easy.algorithm.string;

/**
 * 1967. 作为子字符串出现在单词中的字符串数目
 *
 * @topic 给你一个字符串数组 patterns 和一个字符串 word ，统计 patterns 中有多少个字符串是 word 的子字符串。返回字符串数目。
 *
 * 子字符串 是字符串中的一个连续字符序列。
 *
 * 链接：https://leetcode-cn.com/problems/number-of-strings-that-appear-as-substrings-in-word
 */
public class Q1967 {

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns){
            if(word.indexOf(s) != -1){
                count++;
            }
        }
        return count;
    }
}
