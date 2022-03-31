package com.maycur.leetcode.easy.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 1941. 检查是否所有字符出现次数相同
 *
 * @topic 给你一个字符串s，如果 s是一个 好字符串，请你返回 true，否则请返回 false。
 * 如果 s中出现过的所有 字符的出现次数 相同，那么我们称字符串 s是 好字符串。
 *
 * 链接：https://leetcode-cn.com/problems/check-if-all-characters-have-equal-number-of-occurrences
 */
public class Q1941 {

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int i = map.get(s.charAt(0));
        for (char c : map.keySet()){
            if(i != map.get(c)){
                return false;
            }
        }
        return true;
    }

}
