package com.maycur.leetcode.easy.algorithm.common;

/**
 * 1470. 重新排列数组
 *
 * @topic: 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 * 链接：https://leetcode.cn/problems/shuffle-the-array
 */
public class Q1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++){
            result[i*2] = nums[i];
            result[(i*2)+1] = nums[n+i];
        }
        return result;
    }
}
