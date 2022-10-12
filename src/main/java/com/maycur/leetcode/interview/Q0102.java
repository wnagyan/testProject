package com.maycur.leetcode.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 01.02. 判定是否互为字符重排
 *
 * @topic 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 链接：https://leetcode.cn/problems/check-permutation-lcci/
 */
public class Q0102 {

    public boolean CheckPermutation(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap();
        Map<Character, Integer> map2 = new HashMap();
        if (s1.length() != s2.length()){
            return false;
        }
        for (char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (Character key : map1.keySet()){
            if (map1.get(key) != map2.get(key)){
                return false;
            }
        }
        return true;
    }
}
