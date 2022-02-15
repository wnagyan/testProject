package com.maycur.leetcode.offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 * @topic 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * 链接：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
 */
public class Offer50 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static char firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char singleChar = ' ';
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : map.keySet()){
            if(map.get(c) == 1){
                singleChar = c;
                break;
            }
        }
        return singleChar;
    }
}
