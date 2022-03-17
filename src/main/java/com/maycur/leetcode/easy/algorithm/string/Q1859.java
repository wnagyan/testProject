package com.maycur.leetcode.easy.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 1859. 将句子排序
 *
 * @topic 一个 句子指的是一个序列的单词用单个空格连接起来，且开头和结尾没有任何空格。每个单词都只包含小写或大写英文字母。
 * 我们可以给一个句子添加 从 1 开始的单词位置索引 ，并且将句子中所有单词打乱顺序。
 *
 * 比方说，句子"This is a sentence"可以被打乱顺序得到"sentence4 a3 is2 This1"或者"is2 sentence4 This1 a3"。
 * 给你一个 打乱顺序的句子s，它包含的单词不超过9个，请你重新构造并得到原本顺序的句子。
 *
 * 链接：https://leetcode-cn.com/problems/sorting-the-sentence
 */
public class Q1859 {

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3")); ;
    }

    public static String sortSentence(String s) {
        StringBuilder str = new StringBuilder("");
        String[] stringArray = s.split(" ");
        for (int i = 1; i <= stringArray.length; i++){
            for (String s1 : stringArray){
                StringBuilder newStr = new StringBuilder(s1);
                if(newStr.indexOf(i + "") != -1){
                    str.append(newStr.deleteCharAt(newStr.length()-1) + " ");
                }
            }
        }
        return str.deleteCharAt(str.length() - 1).toString();
    }

}
