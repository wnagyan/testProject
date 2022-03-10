package com.maycur.leetcode.easy.algorithm.string;

/**
 * 1332.删除回文子序列
 *
 * @topic 给你一个字符串s，它仅由字母'a' 和 'b'组成。每一次删除操作都可以从 s 中删除一个回文 子序列。
 * 返回删除给定字符串中所有字符（字符串为空）的最小删除次数。
 *
 * 链接：https://leetcode-cn.com/problems/remove-palindromic-subsequences
 */
public class Q1332 {

    public static int removePalindromeSub(String s) {
        if(isPalindromic(s)){
            return 1;
        }else {
            return 2;
        }
    }

    public static boolean isPalindromic(String s){
        for (int i = 0; i <= s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}



















