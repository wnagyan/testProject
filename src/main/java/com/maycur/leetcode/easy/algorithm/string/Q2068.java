package com.maycur.leetcode.easy.algorithm.string;

/**
 * 2068. 检查两个字符串是否几乎相等
 *
 * @topic 如果两个字符串 word1和 word2中从 'a'到 'z'每一个字母出现频率之差都 不超过3，那么我们称这两个字符串word1 和word2 几乎相等。
 * 给你两个长度都为n的字符串word1 和word2，如果word1和word2几乎相等，请你返回true，否则返回false。
 * 一个字母 x的出现 频率指的是它在字符串中出现的次数。
 *
 * 链接：https://leetcode-cn.com/problems/check-whether-two-strings-are-almost-equivalent
 */
public class Q2068 {

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        for (int i = 0; i < fre1.length; i++){
            fre1[i] = 0;
            fre2[i] = 0;
        }
        for (char c : word1.toCharArray()){
            fre1[c - 'a']++;
        }
        for (char c : word2.toCharArray()){
            fre2[c - 'a']++;
        }
        for (int i = 0; i < 26; i++){
            if(Math.abs(fre1[i] - fre2[i]) > 3){
                return false;
            }
        }
        return true;
    }
}
