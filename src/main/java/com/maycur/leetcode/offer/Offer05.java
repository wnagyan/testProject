package com.maycur.leetcode.offer;

import org.apache.commons.lang3.StringUtils;

/**
 * 剑指 Offer 05. 替换空格
 * @topic: 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
 */
public class Offer05 {

    public static String replaceSpace(String s) {
        String str = "";
        for (char c : s.toCharArray()){
            if(c == ' '){
                str += "%20";
            }else {
                str += c + "";
            }
        }
        return str;
    }
}
