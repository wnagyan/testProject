package com.maycur.leetcode.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 01.01. 判定字符是否唯一
 *
 * @topic 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 链接：https://leetcode.cn/problems/is-unique-lcci/
 */
public class Q0101 {

    public boolean isUnique(String astr) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : astr.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > 1){
                return false;
            }
        }
        return true;
    }
}
