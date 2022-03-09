package com.maycur.leetcode.easy.algorithm;

/**
 * 1085. 最小元素各数位之和
 *
 * @topic 给你一个正整数的数组A。
 * 然后计算S，使其等于数组A当中最小的那个元素各个数位上数字之和。
 * 最后，假如S所得计算结果是奇数 ，返回 0 ；否则请返回 1。
 *
 * 链接：https://leetcode-cn.com/problems/sum-of-digits-in-the-minimum-number
 */
public class Q1085 {

    public int sumOfDigits(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for (int i : nums){
            if(min > i){
                min = i;
            }
        }
        while (min > 0){
            sum += min % 10;
            min /= 10;
        }
        if(sum % 2 == 1){
            return 0;
        }else {
            return 1;
        }
    }

}
