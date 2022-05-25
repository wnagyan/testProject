package com.maycur.leetcode.easy.algorithm.string;

/**
 * 2278. 字母在字符串中的百分比
 *
 * @topic 给你一个字符串 s 和一个字符 letter ，返回在 s 中等于 letter 字符所占的 百分比 ，向下取整到最接近的百分比。
 *
 * 链接：https://leetcode.cn/problems/percentage-of-letter-in-string/
 */
public class Q2278 {

    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()){
            if(c == letter){
                count++;
            }
        }
        return (count * 100) / s.length();
    }
}
