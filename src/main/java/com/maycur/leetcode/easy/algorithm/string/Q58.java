package com.maycur.leetcode.easy.algorithm.string;

/**
 * 58. 最后一个单词的长度
 *
 * @topic: 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 * 链接：https://leetcode.cn/problems/length-of-last-word
 */
public class Q58 {

    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split[split.length-1].length();
    }
}
