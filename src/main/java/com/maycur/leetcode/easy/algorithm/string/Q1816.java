package com.maycur.leetcode.easy.algorithm.string;

/**
 * 1816. 截断句子
 *
 * @topic 句子 是一个单词列表，列表中的单词之间用单个空格隔开，且不存在前导或尾随空格。每个单词仅由大小写英文字母组成（不含标点符号）。
 *
 * 例如，"Hello World"、"HELLO" 和 "hello world hello world" 都是句子。
 * 给你一个句子 s 和一个整数 k ，请你将 s 截断，使截断后的句子仅含 前 k 个单词。返回 截断 s 后得到的句子。
 *
 * 链接：https://leetcode-cn.com/problems/truncate-sentence
 */
public class Q1816 {

    public String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < k; i++){
            str.append(strings[i] + " ");
        }
        return str.substring(0, str.length()-1).toString();
    }

    public String truncateSentence1(String s, int k) {
        int end = 0, count = 0;
        for (int i = 1; i <= s.length(); i++){
            if(i == s.length() || s.charAt(i) == ' '){
                count++;
                if(count == k){
                    end = i;
                }
            }
        }
        return s.substring(0, end);
    }
}
