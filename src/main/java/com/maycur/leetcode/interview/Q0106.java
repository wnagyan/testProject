package com.maycur.leetcode.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 面试题 01.06. 字符串压缩
 *
 * @topic 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。
 * 若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 * 链接：https://leetcode.cn/problems/compress-string-lcci
 */
public class Q0106 {

    //"aabcccccaa"
    public static String compressString(String S) {
        StringBuilder stringBuilder = new StringBuilder("");
        int count = 1;
        for (int i = 0; i < S.toCharArray().length-1; i++){
            count++;
            if (S.charAt(i) != S.charAt(i+1) || i+1 == S.toCharArray().length-1){
                stringBuilder.append(S.charAt(i));
                stringBuilder.append(count);
                count = 1;
            }
        }
        if (stringBuilder.length() >= S.length() || S.length() == 1){
            return S;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressString("bbbac"));
    }
}
