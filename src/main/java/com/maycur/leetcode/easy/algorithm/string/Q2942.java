package com.maycur.leetcode.easy.algorithm.string;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

/**
 * 2942. 查找包含给定字符的单词
 *
 * @topic 给你一个下标从 0 开始的字符串数组 words 和一个字符 x 。
 * 请你返回一个 下标数组 ，表示下标在数组中对应的单词包含字符 x 。
 * 注意 ，返回的数组可以是 任意 顺序。
 *
 * 链接：https://leetcode.cn/problems/find-words-containing-character/description/
 */
public class Q2942 {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
    }
}
