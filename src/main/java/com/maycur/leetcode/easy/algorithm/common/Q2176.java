package com.maycur.leetcode.easy.algorithm.common;

/**
 * 2176. 统计数组中相等且可以被整除的数对
 *
 * @topic 给你一个下标从 0开始长度为 n的整数数组nums和一个整数k，请你返回满足0 <= i < j < n，nums[i] == nums[j] 且(i * j)能被k整除的数对(i, j)的数目。
 *
 * 链接：https://leetcode-cn.com/problems/count-equal-and-divisible-pairs-in-an-array
 */
public class Q2176 {

    public int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && (i * j) % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
