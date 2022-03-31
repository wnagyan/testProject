package com.maycur.leetcode.easy.algorithm.string;

/**
 * 1374. 生成每种字符都是奇数个的字符串
 *
 * @topic 给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。
 * 返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可。
 *
 * 链接：https://leetcode-cn.com/problems/generate-a-string-with-characters-that-have-odd-counts
 */
public class Q1374 {

    public String generateTheString(int n) {
        StringBuilder result = new StringBuilder("");
        if(n % 2 == 0){
            for (int i = 1; i < n-1; i++){
                result.append("a");
            }
            return result.append("b").toString();
        }else {
            for (int i = 1; i <= n; i++){
                result.append("a");
            }
            return result.toString();
        }
    }
}
