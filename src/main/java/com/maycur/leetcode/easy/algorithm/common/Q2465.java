package com.maycur.leetcode.easy.algorithm.common;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2465. 不同的平均值数目
 *
 * @topic 给你一个下标从 0开始长度为 偶数的整数数组nums。
 * 只要nums 不是空数组，你就重复执行以下步骤：
 *
 * 找到nums中的最小值，并删除它。
 * 找到nums中的最大值，并删除它。
 * 计算删除两数的平均值。
 * 两数 a和 b的 平均值为(a + b) / 2。
 *
 * 比方说，2和3的平均值是(2 + 3) / 2 = 2.5。
 * 返回上述过程能得到的 不同平均值的数目。
 *
 * 注意，如果最小值或者最大值有重复元素，可以删除任意一个。
 *
 * 链接：https://leetcode.cn/problems/number-of-distinct-averages
 */
public class Q2465 {

    public int distinctAverages(int[] nums) {
        int len = nums.length-1;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < nums.length / 2; i++){
            set.add(nums[i] + nums[len-i]);
        }
        return set.size();
    }
}
