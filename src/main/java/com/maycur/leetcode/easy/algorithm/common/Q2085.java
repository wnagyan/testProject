package com.maycur.leetcode.easy.algorithm.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 2085. 统计出现过一次的公共字符串
 *
 * @topic: 给你两个字符串数组 words1 和 words2 ，请你返回在两个字符串数组中 都恰好出现一次 的字符串的数目。
 *
 * 链接：https://leetcode-cn.com/problems/count-common-words-with-one-occurrence/
 */
public class Q2085 {

    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String s : words1){
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : words2){
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        for (String s : map1.keySet()){
            if(map1.get(s) == map2.get(s) && map1.get(s) == 1){
                count++;
            }
        }
        return count;
    }

}
