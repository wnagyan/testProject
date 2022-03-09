package com.maycur.leetcode.easy.algorithm;

import org.apache.commons.lang3.StringUtils;

/**
 * 2108. 找出数组中的第一个回文字符串
 *
 * @topic 给你一个字符串数组 words ，找出并返回数组中的 第一个回文字符串 。如果不存在满足要求的字符串，返回一个 空字符串 "" 。
 * 回文字符串 的定义为：如果一个字符串正着读和反着读一样，那么该字符串就是一个 回文字符串 。
 *
 * 链接：https://leetcode-cn.com/problems/find-first-palindromic-string-in-the-array/
 */
public class Q2108 {

    public String firstPalindrome(String[] words) {
        String str = "";
        for (String s : words){
            int len = s.length() / 2;
            if(s.length() == 1){
                return s;
            }
            String begin = "";
            String end = "";
            if(s.length() % 2 == 1){
                begin = s.substring(0, len);
                end = s.substring(len + 1, s.length());
            }else {
                begin = s.substring(0, len);
                end = s.substring(len, s.length());
            }
            if(begin.equals(reverse(end))){
                return s;
            }
        }
        return str;
    }

    public String reverse(String string){
        String nstr = "";
        for (int i = string.toCharArray().length - 1; i >= 0; i--){
            nstr += string.charAt(i);
        }
        return nstr;
    }

}

