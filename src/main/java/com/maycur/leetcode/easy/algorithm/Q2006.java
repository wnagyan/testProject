package com.maycur.leetcode.easy.algorithm;

/**
 * 2006. 差的绝对值为 K 的数对数目
 *
 * @topic 给你一个整数数组nums和一个整数k，请你返回数对(i, j)的数目，满足i < j且|nums[i] - nums[j]| == k。
 * |x| 的值定义为：
 * 如果 x >= 0 ，那么值为x。
 * 如果 x < 0，那么值为-x。
 *
 * 链接：https://leetcode-cn.com/problems/count-number-of-pairs-with-absolute-difference-k
 */
public class Q2006 {

    public int countKDifference(int[] nums, int k) {
        int count = 0;
        int fk = k * -1;
        for (int i = 0 ; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] - nums[j] == k || nums[i] - nums[j] == fk){
                    count++;
                }
            }
        }
        return count;
    }
}
