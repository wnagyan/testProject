package com.maycur.leetcode.easy.algorithm.common;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 1619. 删除某些元素后的数组均值
 *
 * @topic 给你一个整数数组 arr ，请你删除最小 5% 的数字和最大 5% 的数字后，剩余数字的平均值。
 * 与 标准答案 误差在 10-5 的结果都被视为正确结果。
 *
 * 链接：https://leetcode.cn/problems/mean-of-array-after-removing-some-elements/
 */
public class Q1619 {

    public double trimMean(int[] arr) {
        double sum = 0.0;
        int len = (int) (arr.length * 0.05);
        int lessLen = arr.length - (len * 2);
        Arrays.sort(arr);
        for (int i = len; i < arr.length-len; i++){
            sum += arr[i];
        }
        return sum / lessLen;
    }
}
