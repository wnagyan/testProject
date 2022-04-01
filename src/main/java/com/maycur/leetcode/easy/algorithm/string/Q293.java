package com.maycur.leetcode.easy.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 293. 翻转游戏
 *
 * @topic 你和朋友玩一个叫做「翻转游戏」的游戏。游戏规则如下：
 * 给你一个字符串 currentState ，其中只含 '+' 和 '-' 。你和朋友轮流将连续 的两个"++"反转成"--" 。当一方无法进行有效的翻转时便意味着游戏结束，则另一方获胜。
 * 计算并返回 一次有效操作 后，字符串currentState 所有的可能状态，返回结果可以按 任意顺序 排列。如果不存在可能的有效操作，请返回一个空列表[] 。
 *
 * 链接：https://leetcode-cn.com/problems/flip-game
 */
public class Q293 {

    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < currentState.length()-1; i++){
            if(currentState.charAt(i) == '+' && currentState.charAt(i+1) == '+'){
                list.add(currentState.substring(0, i) + "--" + currentState.substring(i+1));
            }
        }
        return list;
    }
}
