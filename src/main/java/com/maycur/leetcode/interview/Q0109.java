package com.maycur.leetcode.interview;

/**
 * 面试题 01.09. 字符串轮转
 *
 * @topic 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
 *
 * 链接：https://leetcode.cn/problems/string-rotation-lcci/
 */
public class Q0109 {

    public boolean isFlipedString(String s1, String s2) {
        int len = s1.length();
        if (s1.length() != s2.length()){
            return false;
        }
        if (s1.length() == 0){
            return true;
        }
        for (int i = 0 ; i < len; i++){
            boolean flag = true;
            for (int j = 0; j < len; j++){
                if (s1.charAt((i + j) % len) != s2.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return true;
            }
        }
        return false;
    }
}
