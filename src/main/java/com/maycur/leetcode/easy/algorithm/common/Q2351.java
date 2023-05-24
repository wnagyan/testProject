package com.maycur.leetcode.easy.algorithm.common;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2351. 第一个出现两次的字母
 *
 * @topic 给你一个由小写英文字母组成的字符串 s ，请你找出并返回第一个出现 两次 的字母。
 *
 * 注意：
 *      如果 a 的 第二次 出现比 b 的 第二次 出现在字符串中的位置更靠前，则认为字母 a 在字母 b 之前出现两次。
 *      s 包含至少一个出现两次的字母。
 *
 * 链接：https://leetcode.cn/problems/first-letter-to-appear-twice
 */
public class Q2351 {

    public static char repeatedCharacter(String s) {
        char minChar = s.charAt(0);
        Map<Character, List<Integer>> indexMap = new HashMap<>();
        int index = 0, min = s.length();
        for (char c : s.toCharArray()){
            List<Integer> list = indexMap.getOrDefault(c, new ArrayList<>());
            list.add(index++);
            indexMap.put(c, list);
        }
        for (char key : indexMap.keySet()){
            if (indexMap.get(key).size() > 1){
                if (min > indexMap.get(key).get(1)){
                    min = indexMap.get(key).get(1);
                    minChar = key;
                }
            }
        }
        return minChar;
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));;
    }
}
