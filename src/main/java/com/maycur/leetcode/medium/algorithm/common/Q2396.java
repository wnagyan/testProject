package com.maycur.leetcode.medium.algorithm.common;

/**
 * 2396. 严格回文的数字
 *
 * @topic 如果一个整数 n在 b进制下（b为 2到 n - 2之间的所有整数）对应的字符串全部都是 回文的，那么我们称这个数n是 严格回文的。
 * 给你一个整数n，如果 n是 严格回文的，请返回true ，否则返回false。
 * 如果一个字符串从前往后读和从后往前读完全相同，那么这个字符串是 回文的。
 *
 * 链接：https://leetcode.cn/problems/strictly-palindromic-number
 */
public class Q2396 {

    public static boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n-2; i++){
            if (!isPalindromic(getString(n, i))){
                return false;
            }
        }
        return true;
    }
//0010111
    public static boolean isPalindromic(String s){
        if (s.length() % 2 == 0){
            int mid = s.length()/2;
            for (int i = 0; i < s.length()/2; i++){
                if (s.charAt(mid-i-1) != s.charAt(mid+i)){
                    return false;
                }
            }
        }else {
            int mid = (s.length()/2);
            for (int i = 0; i < mid; i++){
                if (s.charAt(mid-i-1) != s.charAt(mid+i+1)){
                    return false;
                }
            }
        }
        return true;
    }

    public static String getString(int n, int k){
        StringBuilder stringBuilder = new StringBuilder("");
        while (n>0){
            stringBuilder.append(n%k);
            n/=k;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
//        isStrictlyPalindromic(60);
        System.out.println("1234".charAt(0));
    }
}
