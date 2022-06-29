package com.maycur.leetcode.easy.algorithm.common;


import java.util.Arrays;

/**
 * 1413. 逐步求和得到正数的最小值
 *
 * @topic 给你一个整数数组 nums。你可以选定任意的正数 startValue 作为初始值。
 * 你需要从左到右遍历 nums数组，并将 startValue 依次累加上nums数组中的值。
 * 请你在确保累加和始终大于等于 1 的前提下，选出一个最小的正数作为 startValue 。
 *
 * 链接：https://leetcode.cn/problems/minimum-value-to-get-positive-step-by-step-sum
 */
public class Q1413 {

    /**
     * 找到数组和的最低值，最小正数就等于1-最低值
     * @param nums
     * @return
     */
    public int minStartValue(int[] nums) {
        int minSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (minSum > sum){
                minSum = sum;
            }
        }
        if (minSum > 0){
            return 1;
        }else {
            return 1 - minSum;
        }
    }

}
