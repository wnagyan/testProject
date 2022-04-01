package com.maycur.leetcode.easy.algorithm.string;

/**
 * 1935. 可以输入的最大单词数
 *
 * @topic 键盘出现了一些故障，有些字母键无法正常工作。而键盘上所有其他键都能够正常工作。
 * 给你一个由若干单词组成的字符串 text ，单词间由单个空格组成（不含前导和尾随空格）；另有一个字符串 brokenLetters ，由所有已损坏的不同字母键组成，返回你可以使用此键盘完全输入的 text 中单词的数目。
 *
 * 链接：https://leetcode-cn.com/problems/maximum-number-of-words-you-can-type
 */
public class Q1935 {

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] strings = text.split(" ");
        int count = 0;
        for (String s : strings){
            for (char c : brokenLetters.toCharArray()){
                if(s.indexOf(c) != -1){
                    count++;
                    break;
                }
            }
        }
        return strings.length - count;
    }

}
