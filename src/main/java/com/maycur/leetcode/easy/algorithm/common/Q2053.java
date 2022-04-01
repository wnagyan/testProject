package com.maycur.leetcode.easy.algorithm.common;

import java.util.*;

/**
 * 2053. 数组中第 K 个独一无二的字符串
 *
 * @topic 独一无二的字符串指的是在一个数组中只出现过 一次的字符串。
 * 给你一个字符串数组arr和一个整数k，请你返回arr中第k个独一无二的字符串。如果少于k个独一无二的字符串，那么返回空字符串""。
 * 注意，按照字符串在原数组中的 顺序找到第 k个独一无二字符串。
 *
 * 链接：https://leetcode-cn.com/problems/kth-distinct-string-in-an-array
 */
public class Q2053 {

    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for (String s : map.keySet()){
            if(map.get(s) == 1){
                count++;
                if(count == k){
                    return s;
                }
            }
        }
        return "";
    }

    public String kthDistinct1(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : arr){
            if(map.get(s) == 1){
                k--;
                if(0 == k){
                    return s;
                }
            }
        }
        return "";
    }
}
