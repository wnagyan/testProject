package com.maycur.leetcode.easy.algorithm.common;

/**
 * 2651. 计算列车到站时间
 *
 * @topic 给你一个正整数 arrivalTime 表示列车正点到站的时间（单位：小时），另给你一个正整数 delayedTime 表示列车延误的小时数。
 * 返回列车实际到站的时间。
 * 注意，该问题中的时间采用 24 小时制。
 *
 * 链接：https://leetcode.cn/problems/calculate-delayed-arrival-time/description/
 */
public class Q2651 {

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

}
