package com.maycur.leetcode.interview;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 01.04. 回文排列
 *
 * @topic 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 * 回文串不一定是字典当中的单词。
 *
 * 链接：https://leetcode.cn/problems/palindrome-permutation-lcci
 */
public class Q0104 {

    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (Integer i : map.values()){
            if (i % 2 == 1){
                count++;
            }
            if (count > 1){
                return false;
            }
        }
        return true;
    }
}
