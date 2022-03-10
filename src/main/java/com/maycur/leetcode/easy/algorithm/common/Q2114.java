package com.maycur.leetcode.easy.algorithm.common;

/**
 * 2114. 句子中的最多单词数
 *
 * @topic 一个 句子由一些 单词以及它们之间的单个空格组成，句子的开头和结尾不会有多余空格。
 * 给你一个字符串数组sentences，其中sentences[i]表示单个 句子。
 * 请你返回单个句子里 单词的最多数目。
 *
 * 链接：https://leetcode-cn.com/problems/maximum-number-of-words-found-in-sentences
 */
public class Q2114 {

    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (String s : sentences){
            String[] s1 = s.split(" ");
            if(maxCount < s1.length){
                maxCount = s1.length;
            }
        }
        return maxCount;
    }
}
