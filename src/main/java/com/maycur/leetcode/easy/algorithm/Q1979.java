package com.maycur.leetcode.easy.algorithm;

/**
 * 1979. 找出数组的最大公约数
 *
 * @topic: 给你一个整数数组 nums ，返回数组中最大数和最小数的 最大公约数 。
 * 两个数的 最大公约数 是能够被两个数整除的最大正整数。
 *
 * 链接：https://leetcode-cn.com/problems/find-greatest-common-divisor-of-array/
 */
public class Q1979 {

    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i : nums){
            if(max <= i){
                max = i;
            }
            if (min >= i){
                min = i;
            }
        }
        int commonFactor = 1;
        for (int i = 1; i <= min; i++){
            if(min % i == 0 && max % i == 0){
                commonFactor = i;
            }
        }
        return commonFactor;
    }
}
