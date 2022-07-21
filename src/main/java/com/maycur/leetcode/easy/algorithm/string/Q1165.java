package com.maycur.leetcode.easy.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 1165. 单行键盘
 *
 * @topic 我们定制了一款特殊的键盘，所有的键都 排列在一行上。
 *
 * 给定一个长度为 26 的字符串keyboard，来表示键盘的布局(索引从 0 到 25 )。一开始，你的手指在索引 0 处。要输入一个字符，你必须把你的手指移动到所需字符的索引处。
 * 手指从索引i移动到索引j所需要的时间是|i - j|。您需要输入一个字符串word。写一个函数来计算用一个手指输入需要多少时间。
 *
 * 链接：https://leetcode.cn/problems/single-row-keyboard
 */
public class Q1165 {

    public static int calculateTime(String keyboard, String word) {
        int sumStep = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keyboard.length(); i++){
            map.put(keyboard.charAt(i), i);
        }
        sumStep = map.get(word.charAt(0));
        for (int i = 1; i < word.length(); i++){
            sumStep += Math.abs(map.get(word.charAt(i)) - map.get(word.charAt(i-1)));
        }
        return sumStep;
    }

    public static void main(String[] args) {
        calculateTime("abcdefghijklmnopqrstuvwxyz", "cba");
    }
}
