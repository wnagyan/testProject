package com.maycur.leetcode.easy.algorithm;

/**
 * 1119. 删去字符串中的元音
 *
 * @topic 给你一个字符串 S，请你删去其中的所有元音字母（ 'a'，'e'，'i'，'o'，'u'），并返回这个新字符串。
 *
 * 链接：https://leetcode-cn.com/problems/remove-vowels-from-a-string/
 */
public class Q1119 {

    public String removeVowels(String s) {

        char[] cArray = new char[]{'a', 'e', 'i', 'o', 'u'};
        StringBuilder newStr = new StringBuilder("");
        for (char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                continue;
            }else {
                newStr.append(c);
            }
        }
        return newStr.toString();
    }
}
